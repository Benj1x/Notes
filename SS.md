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