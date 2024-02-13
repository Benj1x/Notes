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