# Syntax and Semantics

## Lecture 0: Introduction and Preliminaries

###  Mathematical notions and terminology

This section, has a lot in common with DTG in regards to notation, but, we will still go through it
**Sets**
A set is a group of objects represented as a unit. Sets may contain any type of object, including numbers, symbols, and even other sets. The objects in a set arecalled its elements or members. Sets may be described formally in several ways.
One way is by listing a set’s elements inside braces. Thus the set
 S ={7,21,57}
contains the elements 7, 21, and 57. The symbols '∈' and ' ̸∈ ' denote set membership and nonmembership. We write '7 ∈ {7,21,57}' and '8 ̸∈ {7,21,57}'. For two sets A and B, we say that A is a ***subset*** of B, written 'A ⊆ B', if every member of A also is a member of B. We say that A is a ***proper subset*** of B, written A ⊆ B, if A is a subset of B and not equal to B.
The order of describing a set doesn’t matter, nor does repetition of its members. We get the same set *S* by writing {57,7,7,7,21}. If we do want to take the number of occurrences of members into account, we call the group a ***multiset*** instead of a set. Thus {7} and {7,7} are different as multisets but identical as sets. An ***infinite set*** contains infinitely many elements. We cannot write a list of all the elements of an infinite set, so we sometimes usethe“...”notationtomean “continue the sequence forever.” Thus we write the set of ***natural numbers*** *N* as
 {1,2,3,...}.

The set of ***integers*** *Z* is written as
 {...,−2,−1,0,1,2,...}

The set with zero members is called the ***empty set***  and is written ∅. A set with one member is sometimes called a ***singleton set***, and a set with two members is called an ***unordered pair***.
When we want to describe a set containing elements according to some rule, we write {*n*|rule about *n*}. Thus {*n*|*n* = m^2 for some *m* ∈ *N* } means the set of perfect squares.
If we have two sets *A* and *B*, the union of *A* and *B*, written *A* ∪ *B*, is the set we get by combining all the elements in *A* and *B* into a single set. The ***intersection*** of *A* and *B*, written *A* ∩ *B*, is the set of elements that are in both *A* and *B*. The ***complement*** of *A*, written *A*, is the set of all elements under consideration that are not in *A*.

As is often the case in mathematics, a picture helps clarify a concept. For sets, we use a type of picture called a ***Venn diagram***. It represents sets as regions enclosed by circular lines. Let the set ´START-t´ be the set of all English words that start with the letter “t”. For example, in the figure, the circle represents the set ´START-t´. Several members of this set are represented as points inside the circle.
![Venn diagram for the set of English words starting with “t”](/imgs/SS/VennDiagramForEnglishWordsT.png)
Similarly, we represent the set END-z of English words that end with “z” in the following figure.
![Venn diagram for the set of English words ending with “z”](/imgs/SS/VennDiagramForEnglishWordsZ.png)
To represent both sets in the same Venn diagram, we must draw them so that they overlap, indicating that they share some elements, as shown in the following figure. For example, the word topaz is in both sets. The figure also contains a circle for the set ´START-j´. It doesn’t overlap the circle for ´START-t´ because no word lies in both sets.
![Overlapping circles indicate common elements](/imgs/SS/OverlappingCircles.png)

The next two Venn diagrams depict the union and intersection of sets *A* and *B*.
![Diagrams for (a) *A* ∪ *B* and (b) *A* ∩ *B*](/imgs/SS/UnionIntersectionOfAAndB.png)

#### Sequences and tuples

A sequence of objects is a list of these objects in some order. We usually designate a sequence by writing the list within parentheses. For example, the sequence 7, 21, 57 would be written
(7, 21, 57)
The order doesn’t matter in a set, but in a sequence it does. Hence (7,21,57) is not the same as (57,7,21). Similarly, repetition does matter in a sequence, but it doesn’t matter in a set. Thus (7,7,21,57) is different from both of the other sequences, whereas the set {7,21,57} is identical to the set {7,7,21,57}. 
As with sets, sequences may be finite or infinite. Finite sequences often are called ***tuples***. A sequence with *k* elements is a ***k-tuple***. Thus(7,21,57) is a 3-tuple. A 2-tuple is also called an ***ordered pair.***
Sets and sequences may appear as elements of other sets and sequences. For example, the ***power set*** of *A* is the set of all subsets of A. If *A* is the set {0,1}, the power set of *A* is the set {∅, {0}, {1}, {0,1}}. The set of all ordered pairs whose elements are 0s and 1s is {(0,0), (0,1), (1,0), (1,1)}.
If *A* and *B* are two sets, the ***Cartesian product*** or ***cross product*** of *A* and *B*, written *A* × *B*, is the set of all ordered pairs wherein the first element is a member of *A* and the second element is a member of *B*.

![Example 0.5 - Cartesian product](/imgs/SS/Example0.5.png)

![Example 0.6 - Cartesian product](/imgs/SS/Example0.6.png)
(this one i do not understand)

#### Functions and relations

A function is also called a mapping, and, if *f(a)=b*, we say that *f* maps *a* to *b*.
The set of possible inputs to the function is called its ***domain***. The outputs of a function come from a set called its ***range***.The notation for saying that *f* is
a function with domain *D* and range *R* is
*f : D−→R*.

In the case of the function *abs*, if we are working with integers, the domain and the range are Z, so we write *abs*: Z−→Z. In the case of the addition function for integers, the domain is the set of pairs of integers Z×Zand the range is Z, so we write add : Z×Z−→Z.Note that a function may not necessarily use all the elements of the specified range. The function abs never takes on the value −1 even though −1 ∈ Z. A function that does use all the elements of the range is said to be ***onto*** the range.

We may describe a specific function in several ways. One way is with a procedure for computing an output from a specified input. Another way is with a table that lists all possible inputs and gives the output for each input.

![Example 0.8 - Function table](/imgs/SS/Example0.8.png)

![Example 0.9 - Function table](/imgs/SS/Example0.9.png)

A ***predicate*** or ***property*** is a function whose range is ´{TRUE,FALSE}´. For example, let even be a property that is TRUE if its input is an even number and FALSE if its input is an odd number. Thus ´even´(4) = TRUE and ´even´(5) = FALSE. A property whose domain is a set of k-tuples A ×···×A is called a relation, a k-ary relation,or a k-ary relation on A. Acommoncaseisa2-aryrelation,
 called a binary relation.Whenwritinganexpressioninvolvingabinaryrela
tion, we customarily use infix notation. For example, “less than” is a relation
 usually written with the infix operation symbol <. “Equality”,writtenwiththe
 = symbol, is another familiar relation. If R is a binary relation, the statement
 aRb means that aRb = TRUE. Similarly, ifR is a k-ary relation, the statement
 R(a1,...,ak) means that R(a1,...,ak)=TRUE.

## Lecture 2: Nondeterministic Finite Automata

Topics: Nondeterminism (informally); nondeterministic finite automata (formal definition and examples); equivalence of DFAs and NFAs;  closure under regular operations.
Introduction to the Theory of Computation (Chapter 1 (Section 1.2): pages 47-63);

### Nondeterminism

So far in our discussion, every step of a computation follows in a unique way from the preceding step. When the machine is in a given state and reads the next input symbol, we know what the next state will be—it is determined. We call this **deterministic** computation. In a **nondeterministic** machine, several choices may exist for the next state at any point.
Nondeterminism is a generalization of determinism, so every deterministic finite automaton is automatically a nondeterministic finite automaton. As Figure 1.27 shows, nondeterministic finite automata may have additional features.

![Figure 1.27 The nondeterministic finite automaton N_1](/imgs/SS/NondeterministicFiniteAutomaton.png)
The difference between a deterministic finite automaton, abbreviated DFA, and a nondeterministic finite automaton, abbreviated NFA, is immediately apparent. First, every state of a DFA always has exactly one exiting transition arrow for each symbol in the alphabet. The NFA shown in Figure 1.27 violates that rule.

State q1 has one exiting arrow for 0, but it has two for 1; q2 has one arrow for 0, but it has none for 1. In an NFA, a state may have zero, one, or many exiting arrows for each alphabet symbol. Second, in a DFA, labels on the transition arrows are symbols from the alphabet. This NFA has an arrow with the label ε. In general, an NFA may have arrows labeled with members of the alphabet or ε. Zero, one, or many arrows may exit from each state with the label ε.

How does an NFA compute? Suppose that we are running an NFA on an input string and come to a state with multiple ways to proceed. For example, say that we are in state q1 in NFA N1 and that the next input symbol is a 1. After reading that symbol, the machine splits into multiple copies of itself and follows all the possibilities in parallel. Each copy of the machine takes one of the possible ways to proceed and continues as before. If there are subsequent choices, the machine splits again. If the next input symbol doesn’t appear on any of the arrows exiting the state occupied by a copy of the machine, that copy of the machine dies, along with the branch of the computation associated with it. Finally, if any one of these copies of the machine is in anaccept state at the end of the input, the NFA accepts the input string.

If a state with an ε symbol on an exiting arrow is encountered, something similar happens. Without reading any input, the machine splits into multiple copies, one following each of the exiting ε-labeled arrows and one staying at the current state. Then the machine proceeds nondeterministically as before.
Nondeterminism may be viewed as a kind of parallel computation wherein multiple independent “processes” or “threads” can be running concurrently.
When the NFA splits to follow several choices, that corresponds to a process “forking” into several children, each proceeding separately. If at least one of these processes accepts, then the entire computation accepts.
Another way to think of a nondeterministic computation is as a tree of possibilities. The root of the tree corresponds to the start of the computation. Every branching point in the tree corresponds to a point in the computation at which the machine has multiple choices. The machine accepts if at least one of the computation branches ends in an accept state, as shown in Figure 1.28

![Figure 1.28 Deterministic and nondeterministic computations with an accepting branch](/imgs/SS/DeterministicNondeterministic.png)

Let’s consider some sample runs of the NFA N1 shown in Figure 1.27. The computation of N_1 on input 010110 is depicted in the following figure.

![Figure 1.29 The computation of N_11 on input 010110](/imgs/SS/ComputationOfN1.png)
On input 010110, start in the start state q1 and read the first symbol 0. From q1 there is only one place to go on a 0—namely, back to q1—so remain there.
Next, read the second symbol 1. In q1 on a 1 there are two choices: either stay in q1 or move to q2. Nondeterministically, the machine splits in two to follow each choice. Keep track of the possibilities by placing a finger on each state where a machine could be. So you now have fingers on states q1 and q2.An ε arrow exits state q2 so the machine splits again; keep one finger on q2,and move the other o q3. You now have fingers on q1, q2, and q3.
When the third symbol 0 is read, take each finger in turn. Keep the finger on q1 in place, move the finger on q2 to q3, and remove the finger that has been on q3. That last finger had no 0 arrow to follow and corresponds to a process that simply “dies.” At this point, you have fingers on states q1 and q3.
When the fourth symbol 1 is read, split the finger on q1 into fingers on states q1 and q2, then further split the finger on q2 to follow the ε arrow to q3, and move the finger that was on q3 to q4. You now have a finger on each of the four states.
When the fifth symbol 1 is read, the fingers on q1 and q3 result in fingers on states q1, q2, q3,and q4, as you saw with the fourth symbol. The finger on state q2 is removed. The finger that was on q4 stays on q4. Now you have two fingers on q4, so remove one because you only need to remember that q4 is a possible state at this point, not that it is possible for multiple reasons.
When the sixth and final symbol 0 is read, keep the finger on q1 in place, move the one on q2 to q3, remove the one that was on q3, and leave the one on q4 in place. You are now at the end of the string, and you accept if some finger is on an accept state. You have fingers on states q1, q3, and q4; and as q4 is an accept state, N1 accepts this string.

What does N_1 do on input 010? Start with a finger on q1. After reading the 0, you still have a finger only on q1; but after the 1 there are fingers on q1, q2, and q3 (don’t forget the ε arrow). After the third symbol 0, remove the finger on q3, move the finger on q2 to q3, and leave the finger on q1 where it is. At this point you are at the end of the input; and as no finger is on an accept state, N1 rejects this input.
By continuing to experiment in this way, you will see that N1 accepts all strings that contain either 101 or 11 as a substring.
Nondeterministic finite automata are useful in several respects. As we will show, every NFA can be converted into an equivalent DFA, and constructing NFAs is sometimes easier than directly constructing DFAs. An NFA may be much smaller than its deterministic counterpart, or its functioning may be easier to understand. Nondeterminism in finite automata is also a good introduction to nondeterminism in more powerful computational models because finite automata are especially easy to understand. Now we turn to several examples of NFAs.

####  FORMAL DEFINITION OF A NONDETERMINISTIC FINITE AUTOMATON

The formal definition of a nondeterministic finite automaton is similar to that of a deterministic finite automaton. Both have states, an input alphabet, a transition function, a start state, and a collection of accept states. However, they differ in one essential way: in the type of transition function. In a DFA, the transition function takes a state and an input symbol and produces the next state. In an NFA, the transition function takes a state and an input symbol or the empty string and produces the set of possible next states. In order to write the formal definition, we need to set up some additional notation. For any set Q we write P(Q) to be the collection of all subsets of Q. HereP(Q) is called the power set of Q. For any alphabet Σ we write Σ_ε to be Σ∪{ε}. Now we can write the formal description of the type of the transition function in an NFA as δ: Q × Σε−→ P (Q).

![A nondeterministic finite automaton definition](/imgs/SS/NondeterministicFiniteAutomatonDefinition.png)

### EQUIVALENCE OF NFAS AND DFAS

Deterministic and nondeterministic finite automata recognize the same class of languages. Such equivalence is both surprising and useful. It is surprising because NFAs appear to have more power than DFAs, so we might expect that NFAs recognize more languages. It is useful because describing an NFA for a given language sometimes is much easier than describing a DFA for that language.
Say that two machines are equivalent if they recognize the same language. Every nondeterministic finite automaton has an equivalent deterministic finite automaton.

**PROOF IDEA** If a language is recognized by an NFA, then we must show the existence of a DFA that also recognizes it. The idea is to convert the NFA into an equivalent DFA that simulates the NFA. Recall the “reader as automaton” strategy for designing finite automata. How would you simulate the NFA if you were pretending to be a DFA? What do you need to keep track of as the input string is processed? In the examples of NFAs, you kept track of the various branches of the computation by placing a finger on each state that could be active at given points in the input. You updated the simulation by moving, adding, and removing fingers according to the way the NFA operates. All you needed to keep track of was the set of states having fingers on them. If *k* is the number of states of the NFA, it has 2^k subsets of states. Each subset corresponds to one of the possibilities that the DFA must remember, so the DFA simulating the NFA will have 2^k states. Now we need to figure out which will be the start state and accept states of the DFA, and what will be its transition function. We can discuss this more easily after setting up some formal notation.

![NFA proof](/imgs/SS/NFAProof1.png)
![NFA proof part two](/imgs/SS/NFAProof2.png)

Theorem 1.39 states that every NFA can be converted into an equivalent DFA. Thus nondeterministic finite automata give an alternative way of characterizing the regular languages. We state this fact as a corollary of Theorem 1.39.

### Corollary

A language is regular if and only if some non deterministic finite automaton recognizes it.

One direction of the “if and only if” condition states that a language is regular if some NFA recognizes it. Theorem 1.39 shows that any NFA can be converted into an equivalent DFA. Consequently, if an NFA recognizes some language, so does some DFA, and hence the language is regular. The other direction of the “if and only if” condition states that a language is regular only if some NFA recognizes it. That is, if a language is regular, some NFA must be recognizing it.
Obviously, this condition is true because a regular language has a DFA recognizing it and any DFA is also an NFA

## Lecture 3: Regular Expressions

Topics: Regular expressions (formal definition and examples); equivalence with finite automata (with proof step-by-step).

In arithmetic, we can use the operations `+` and `x` to build up expressions such as
`(5+3)x4`.

Similary we can use the regular operations to build up expressions describing languages, which are called **regular expressions**. An example is:

`(0 \cup 1)0*`

The value of the arithmetic expression is the number `32`. The value of a regular expression is a language. In this case, the value is the language consisting of all strings starting with a `0` or a `1` followed by any number of `0`s. We get this result by dissecting the expression into its parts. First, the symbols `0` and `1` are shorthand for the sets {0} and {1}. So `(0 \cup 1)` means `({0} \cup {1})`. The value of this part is the language `{0,1}`. The part `0*` means `{0}*`, and its value is the language consisting of all strings containing any number of `0`s Second, like the `x` symbol in algebra, the concatenation symbol ◦ is often implicit in regular expressions. Therefore `(0 \cup 1)0*` is actually short for `(0 \cup 1) ◦ 0*`. The concatenation attaches the strings from the two parts to obtain the value of the entire expression.

Another example of a regular expression is `(0 \cup 1)*`

It starts with the language `(0 \cup 1)` and applies the `*` operation. The value of this expression is the lnaguage consisting of all possible strings of `0`s and `1`s. If `\Sigma = {0,1}`, we can write Σ as shorthand for the regular expression `(0 \cup 1)`. More generally, if Σ is any alphabet, the regular expression Σ, describes the language consisting of all strings of length 1 over this alphabet, and `Σ*` describes the language consisting of all strings over that alphabet. Similarly, `Σ*1` is the language that contains all strings that end in a 1. The language `(0Σ∗) ∪ (Σ∗1)` consists of all strings that start with a `0` or end with a `1`.

In arithmetic, we say that `x` has precedence over `+` to mean that when there is a choice, we do the `x` operationfirst. Thus in `2 + 3 x 4`,the `3 x 4` is done before the addition. To have the addition done first, we must add parentheses to obtain `(2 + 3) X 4`. In regular expressions, the star operation is done first, followed by concatenation, and finally union, unless parentheses change the usual order.

Don’t confuse the regular expressions `ε` and `∅`.The expression `ε` represents the language containing a single string—namely, the empty string—whereas `∅` represents the language that doesn’t contain any strings.

Seemingly, we are in danger of defining the notion of a regular expression in terms of itself. If true, we would have a **circular definition**, which would be invalid. However, `R_1` and `R_2` always are smaller than `R`. Thus we actually are defining regular expressions in terms of smaller regular expressions and thereby avoiding circularity. A definition of this type is called an **inductive definition**.
<span style="color:red">Parentheses in an expression may be omitted. If they are, evaluation is done in the precedence order: star, then concatenation, then union.</span>
For convenience, we let ``R^+`` be shorthand for `RR^∗`. In other words, whereas `R^∗` has all strings that are 0 or more concatenations of strings from R, the language `R^+` has all strings that are 1 or more concatenations of strings from `R`. So `R^+ \cup ε =R^∗`. In addition, we let `R^k` be shorthand for the concatenation of *k* `R`’s with each other.
When we want to distinguish between a regular expression `R` and the language that it describes, we write `L(R)` to be the language of `R`.

If we let *R* be any regular expression, we have the following identities. They
 are good tests of whether you understand the definition.
`R \cup ∅ = R`.
Adding the empty language to any other language will not change it.

`R ◦ ε = R`.
Joining the empty string to any string will not change it.
 However, exchanging *∅* and *ε* in the preceding identities may cause the equalities to fail.

`R \cup ε` may not equal *R*.
For example, if `R = 0`, then `L(R) = {0}` but `L(R \cup ε) = {0, ε}`.

`R ◦ ∅` may not equal *R*.
For example, if `R = 0`, then `L(R) = {0}` but `L(R ◦ ∅) = ∅`.
Regular expressions are useful tools in the design of compilers for programming languages. Elemental objects in a programming language, called ***tokens***, such as the variable names and constants, may be described with regular expressions. For example, a numerical constant that may include a fractional part and/or a sign may be described as a member of the language
`(+∪ - ∪ε)(D^+∪D^+.D^∗∪D^∗.D^+)`
where `D = {0,1,2,3,4,5,6,7,8,9}` is the alphabet of decimal digits. Examples of generated strings are: `72, 3.14159, +7.,and -.01`.
Once the syntax of a programming language has been described with a regular expression in terms of its tokens, automatic systems can generate the ***lexical analyzer***,the part of a compiler that initially processes the input program.

### Equivalence with finite automata

This last part can be found in **Introduction to the Theory of Computation (Chapter 1 (Section 1.3): pages 66-76);**

## Lecture 4: Pumping Lemma for Regular Languages

Topics:  Limitations of finite automata and nonregular languages; the pumping lemma for regular languages (proof in details); game interpretation; using the pumping lemma (examples + tricks).

###  Nonregular Languages

To understand the power of finite automata, you must also understand their limitations. In this section, we show how to prove that certain languages cannot be recognized by any finite automaton. 
Let’s take the language *B* = {0^*n* 1^*n* | *n* ≥ 0}. If we attempt to find a DFA that recognizes *B*, we discover that the machine seems to need to remember how many 0s have been seen so far as it reads the input. Because the number of 0s isn’t limited, the machine will have to keep track of an unlimited number of possibilities. But it cannot do so with any finite number of states.
Next, we present a method for proving that languages such as B are not regular. Doesn’t the argument already given prove nonregularity because the number of 0s is unlimited?It does not. Just because the language appears to require unbounded memory doesn’t mean that it is necessarily so. It does happen to be true for the language *B* but other languages seem to require an unlimited number of possibilities, yet actually they are regular. For example, consider two languages over the alphabet Σ={0,1}:
`*C* ={*w* | *w* has an equal number of 0s and 1s}`, and
`*D* ={*w* | *w* has an equal number of occurrences of 01 and 10 as substrings}`

At first glance, a recognizing machine appears to need to count in each case, and therefore neither language appears to be regular. As expected, C is not regular, but surprisingly D is regular! Thus our intuition can sometimes lead us astray, which is why we need mathematical proofs for certainty. In this section, we show how to prove that certain languages are not regular.

### The pumping lemma for regular languages

Our technique for proving nonregularity stems from a theorem about regular languages, traditionally called the ***pumping lemma***. This theorem states that all regular languages have a special property. If we can show that a language does not have this property, we are guaranteed that it is not regular. The property states that all strings in the language can be “pumped” if they are at least as long as a certain special value, called the ***pumping length***. That means each such string contains a section that can be repeated any number of times with the resulting string remaining in the language.

Introduction to the Theory of Computation (Chapter 1 (Section 1.4): pages 77-82);

## Lecture 5: Context-free Grammars

Topics:  Context-free grammars (informally); formal definition; designing context-free grammars; ambiguity; Chomsky normal form.
Literature: 
Introduction to the Theory of Computation (Chapter 2 (Section 2.1): pages 102-111);

## Lecture 6: Pushdown Automata

Highlighted
Topics:  Pushdown automata (informally); formal definition; examples of pushdown automata; equivalence with context-free grammars.
Literature: 
Introduction to the Theory of Computation (Chapter 2 (Section 2.2): pages 111-125);

## Lecture 7: Pumping Lemma for Context-free Languages

Topics:  Non-context-free languages; the pumping lemma for context-free languages (proof step-by-step); using the pumping lemma (examples); about (non) closure properties for CFLs.
Literature: 
Introduction to the Theory of Computation (Chapter 2 (Section 2.3): pages 125-129);

## Lecture 8: Basic principles of Operational Semantics

Topics: Abstract syntax (motivation + examples); transition systems; operational semantics (big-step vs small-step); derivation rules and trees; proving properties (a structural approach).
Literature: 
Transitions and Trees (Chapter 1: pages 3-15; Chapter 3: pages 27-42);

## Lecture 9: Basic Imperative Statements

Topics: Program states; a big-step semantics for Bims; a small-step semantics for Bims; non-termination of programs; equivalence of big- and small-step semantics for Bims.
Literature: 
Transitions and Trees (Chapter 4: pages 43-61);

## Lecture 10: Type Systems

Topics: Motivations; typed declarations and expressions; type environments and judgments; a type system for Bims; type safety; limitations of type systems.
Literature: 
Transitions and Trees (Chapter 13 (Section 1-3.2): pages 185-199);
Luca Cardelli. Type systems. Handbook of Computer Science and Engineering. 1997.  (optional reading)

## Lecture 11: Control Structures

Topics: Loop constructs (Repeat-loops and For-loops); Semantic equivalence; Abnormal termination; Nondeterminism; Concurrency.
Literature: 
Transitions and Trees (Chapter 5: pages 65-78)

## Lecture 12: Blocks and Procedures

Topics: Bims with variable scopes; the environment-store model; updating the big-step semantics; Bip (Bims with procedure declarations and procedure calls); scope rules; big-step semantics of Bip (for each scope rule)
Literature: 
Transitions and Trees (Chapter 6: pages 79-93)

## Lecture 13: Parameter Passing Mechanism

Topics: Procedures with parameters; Call-by-reference; Call-by-value; Call-by-name (informally and formal big-step semantics); Capture-avoiding substituiton
Literature: 
Transitions and Trees (Chapter 7: pages 94-112)