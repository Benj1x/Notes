# Languages and Compilers

## Lecture 2 - Lexical analysis: Regular expressions and automata

The learning goals are:

* To be able to explain the rôle of lexical analysis in the implementation of a programming language
* To be able to use the basic terminology for lexical analysis correctly
* To be able to write a correct regular expression that specifies a given language
* To be able to construct an equivalent NFA from a regular expression
* To be able to explain the method used for constructing an NFA from a regular expression

Reading: Introduction to Compiler Design:  Sections 1.1 to 1.3

### Regular Expressions (You probably know most of this)

The set of all integer constants or the set of all variable names are examples of sets of strings, where the individual digits or letters used to form these constants or names are taken from a particular alphabet, i.e., a set of characters. A set of strings is called a language. For integers, the alphabet consists of the digits 0–9 and for variable names, the alphabet contains both letters and digits (and perhaps a few other characters, such as hyphens and underscores).
Given an alphabet, we will describe sets of strings over this alphabet by regular expressions, an algebraic notation that is compact and relatively easy for humans to use and understand. The idea is that regular expressions that describe simple sets of strings can be combined to form bigger regular expressions that describe more complex sets of strings. Regular expressions are often called “regexps” or "Regex" for short.

When talking about regular expressions, we will use the letters *r*, *s* and *t* in italics to denote unspecified regular expressions. When letters stand for themselves (i.e., in 
regular expressions that describe strings that use these letters) we will use typewriter font, e.g., **a** or **b**. The letters *u*, *v* and *w* in italics will be used to denote unspecified single strings, i.e., members of some language. As an example, **abw** denotes any string starting with ab. When we say, e.g., “The regular expression **s**” (note the 
typewriter font) we mean the regular expression that describes a single one-letter string “**s**”, but when we say “The regular expression **s**” (note the italics), we mean a 
regular expression of any form which we just happen to call **s**. We use the notation L(**s**) to denote the language (i.e., set of strings) described by the regular expression 
**s**. For example, L(**a**) is the set {“**a**”}.

To find L(**s**) for a given regular expression *s* ,we use derivation: Rules that rewrite a regular expression into a string of letters. These rules allow a single regular expression to be rewritten into several different strings, so .L(s) is the set of strings that s can be rewritten to using these rules. L(s) is often an infinite set, but each string in the set is finite and can be obtained by a finite number of derivation steps. Figure 1.1 shows the different forms of regular expression, the derivation rules for these, and an informal description of what the regular expression forms mean. 
Note that we use a double arrow (⇒) to denote derivation. In addition to the specific derivation rules in Fig. 1.1, we also use some general rules to make derivation reflexive and transitive:

*s* ⇒ *s*                  Derivation is reflexive
*r* ⇒ *t* if *r* ⇒ *s* and *s* ⇒ *t*  Derivation is transitive

Note that, while we use the same notation for concrete strings and regular expressions denoting one-string languages, the context will make it clear which is meant. We will often show strings and sets of strings without using quotation marks, e.g., write {**a**, **bb**} instead of {“a”, “bb”}. When doing so, we sometimes use. ε to denote the empty string, so the derivation *s*∗ ⇒ shown in Fig. 1.1 can also be written as. *s*∗ ⇒ *ε*.
We can use the derivation rules to find the language for a regular expression. As an example, .*L*(**a**(**b**|**c**)) = {**ab**, **ac**} because **a**(**b**|**c**) ⇒ **a**(**b**) = **ab** and **a**(**b**|**c**) ⇒ **a**(**c**) = **ac**. **L**((**a**|**b**)∗)is infinite and contains any sequence of **a**s and **b**s, including the empty sequence. For example, the string **ab** is in *L*((**a**|**b**)∗) because (**a**|**b**)∗ ⇒ (**a**|**b**)(**a**|**b**)∗ ⇒ **a**(**a**|**b**)∗ ⇒ **a**(**a**|**b**)(**a**|**b**)∗ ⇒ **ab**(**a**|**b**)∗ ⇒ **ab**.

![Regular expressions and their derivation](/imgs/LC/RegExDerivation.png)

Parentheses and Precedence Rules

When we use the symbols above to construct composite regular expressions such as **a**|**ab**∗, it is not a priori clear how the different subexpressions are grouped. We 
will sometimes (like we did above) use parentheses to make the grouping of symbols explicit such as in (**a**|(**ab**))∗. Additionally, we use precedence rules, similar to the 
algebraic convention that multiplication binds stronger than additions, so. 3+4×5 is equivalent to 3+(4×5) and not (3+4)×5. For regular expressions, we use the following conventions: ∗ binds tighter than concatenation, which binds tighter than alternative (|). The example **a**|**ab**∗ from above is, hence, equivalent to **a**|(**a**(**b**∗)). The | operator is associative and commutative. Concatenation is associative (but obviously not commutative) and distributes over |. Figure 1.2 shows these and other algebraic properties of regular expressions, including properties of some of the shorthands introduced below.

![Fig. 1.2 Some algebraic properties of regular expressions](/imgs/LC/AlgebraicPropertiesRegEx.png)

#### Shorthands

While the constructions in Fig. 1.1 suffice to describe e.g., number strings and variable names, we will often use extra shorthands for convenience. For example, if we want 
to describe non-negative integer constants, we can do so by saying that a number constant is a sequence of one or more digits, which is expressed by the regular expression

(**0**|**1**|**2**|**3**|**4**|**5**|**6**|**7**|**8**|**9**)(**0**|**1**|**2**|**3**|**4**|**5**|**6**|**7**|**8**|**9**)∗
The large number of different digits makes this expression rather verbose. It gets even worse when we get to variable names, where we must enumerate all alphabetic letters (in both upper and lower case). 
Hence, we introduce a shorthand for sets of letters. A sequence of letters enclosed in square brackets represents the set of these letters. For example, we use [ab01] 
as a shorthand for. **a**|**b**|**0**|**1**. Additionally, we can use interval notation to abbreviate [**0123456789**] to [**0–9**]. We can combine several intervals within one bracket and for example write [**a–zA–Z**] to denote all alphabetic letters in both lower and upper case. 
When using intervals, we must be aware of the ordering for the symbols involved. For the digits and letters used above, there is usually no confusion. However, if we write, e.g., [**0–z**] it is not immediately clear what is meant. When using such notation in lexer generators, a character set encoding such as ASCII, ISO 8859-1, or UTF-8 is 
usually implied, so the symbols are ordered as defined by these encodings. To avoid confusion, we will in this book use the interval notation only for intervals of digits 
or alphabetic letters. 
Getting back to the example of integer constants above, we can now write this much shorter as [**0–9**][**0–9**]∗. 
Since s∗ denotes *zero or more* occurrences of s, we needed to write the set of digits twice to describe that *one or more* digits are required. Such non-zero repetition is quite 
common, so we introduce another shorthand,. s+, to denote one or more occurrences of. s. With this notation, we can abbreviate our description of integers to [0–9]+. 
On a similar note, it is common that we can have zero or one occurrence of something (e.g., an optional sign to a number). Hence we introduce the shorthand **s**? for **s**|**ε**. 
The shorthand symbols. + and. ? bind with the same precedence as∗.

Examples of this can be found in: "1.1.2 Examples" in the book "Introduction to Compiler Design"

### Nondeterministic Finite Automata

A finite automaton is, in the abstract sense, a machine that has a finite number of states and a finite number of transitions between pairs of states. A transition between 
two states is usually labelled by a character from the input alphabet, but we will also use transitions marked with. ε, the so-called epsilon transitions.
A finite automaton can be used to decide if an input string is a member in some particular set of strings. To do this, we select one of the states of the automaton as the starting state. We start in this state, and in each step we can do one of the following:

* Follow an epsilon transition to another state, or 
* Read a character from the input and follow a transition labelled by that character.

**Definition 1.1** A *nondeterministic finite automaton* consists of a set S of states. One of these states, *s_0 ∈ S*, is called the *starting state* of the automaton, and a subset 
*F ⊆ S* of the states are *accepting states*. Additionally, we have a set *T* of **transitions**. Each transition *t* connects a pair of states *s_1* and *s_2* and is labelled with a symbol, which is either a character *c* from an alphabet *Σ*, or the symbol *ε*, which indicates an *epsilon-transition*. A transition from state *s* to state *t* on the symbol *c* is written as *s^c_t*. 
Starting states are sometimes called *initial states* and accepting states can also be called *final states* (which is why we use the letter *F* to denote the set of accepting states)
We use the abbreviations FA for finite automaton, NFA for nondeterministic finite automaton and DFA for deterministic finite automaton.

### Converting a Regular Expression to an NFA

We will construct an NFA compositionally from a regular expression, i.e., we will construct the NFA for a composite regular expression from the NFAs constructed from its subexpressions. To be precise, we will from each subexpression construct an NFA fragment and then combine these fragments into bigger fragments. A fragment is not a complete 
NFA, so we complete the construction by adding the necessary components to make a complete NFA. 
An NFA fragment consists of a number of states with transitions between these and additionally two incomplete transitions: One pointing into the fragment and one pointing out of the fragment. The incoming half-transition is not labelled by a symbol, but the outgoing half-transition is labelled by either. ε or an alphabet symbol. These half-transitions are the entry and exit to the fragment and are used to connect it to other fragments or additional “glue” states.

Construction of NFA fragments for regular expressions is shown in Fig. 1.4. The construction follows the structure of the regular expression by first making NFA 
fragments for the subexpressions, and then joining these to form an NFA fragment for the whole regular expression. The NFA fragments for the subexpressions are shown as dotted ovals with the incoming half-transition on the left and the outgoing half-transition on the right. The symbol on the outgoing half-transition is not shown 
when an NFA fragment is shown as a dotted oval (it is “hidden” inside the oval). 
When an NFA fragment has been constructed for the whole regular expression, the construction is completed by connecting the outgoing half-transition to an accepting 
state. The incoming half-transition serves to identify the starting state of the completed NFA. Note that, even though we allow an NFA to have several accepting states, an NFA constructed using this method will have only one: the one added at the end of the construction. 
An NFA constructed this way for the regular expression (**a**|**b**)∗**ac** is shown in Fig. 1.5. The states are numbered for future reference.
![Fig. 1.4 Constructing NFA fragments from regular expressions](/imgs/LC/ConstructingNFAFragmentsRegex.png)

![Fig. 1.5 NFA for the regular expression (**a**|**b**)∗**ac**](/imgs/LC/NFAForRegex.png)