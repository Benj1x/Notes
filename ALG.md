# Algorithms and Data structures (ALG)

## Lecture 01 - Algorithms, Correctness, and Efficiency

Lecture Outline:

Algorithms & pseudocode
The correctness of an algorithm
Efficiency & order of growth
Case Study: find an element in a sequence of numbers

### Algorithms

Informally, an ***algorithm*** is any well-defined computational procedure that takes some value, or set of values, as ***input*** and produces some value, or set of values, as ***output***. <span style="color:red">An algorithm is thus a sequence of computational steps that transform the input into the output.</span>
We can also view an algorithm as a tool for solving a well-specified ***computational problem***. The statement of the problem specifies in general terms the desired input/output relationship. The algorithm describes a specific computational procedure for achieving that input/output relationship.
For example, we might need to sort a sequence of numbers into nondecreasing order. This problem arises frequently in practice and provides fertile ground for introducing many standard design techniques and analysis tools. Here is how we formally define the ***sorting problem***:

![How we formally define the sorting problem](/imgs/ALG/TheSortingProblem.png)

For example, given the input sequence <(31, 41, 59, 26, 41, 58)> a sorting algorithm returns as output the sequence <(26, 31, 41, 41, 58, 59)>. Such an input sequence is called an ***instance*** of the sorting problem. In general, an ***instance of a problem*** consists of the input (satisfying whatever constraints are imposed in the problem statement) needed to compute a solution to the problem.

Because many programs use it as an intermediate step, <span style="color:red">sorting is a fundamental operation in computer science. As a result, we have a large number of good sorting algorithms at our disposal. Which algorithm is best for a given application depends on—among other factors—the number of items to be sorted, the extent to which the items are already somewhat sorted, possible restrictions on the item values, the architecture of the computer, and the kind of storage devices to be used:</span> main memory, disks, or even tapes.

<span style="color:red">An algorithm is said to be ***correct*** if, for every input instance, it halts with the correct output. We say that a correct algorithm solves the given computational problem.</span> An incorrect algorithm might not halt at all on some input instances, or it might halt with an incorrect answer. Contrary to what you might expect, incorrect algorithms can sometimes be useful, if we can control their error rate. 
An algorithm can be specified in English, as a computer program, or even as a hardware design. The only requirement is that the specification must provide a precise description of the computational procedure to be followed.

**Data structures**
This course also contains several data structures. A data structure is a way to store and organize data in order to facilitate access and modifications. No single data structure works well for all purposes, and so it is important to know the strengths and limitations of several of them.

### Algorithms as a technology

Computers may be fast, but they are not infinitely fast. And memory may be inexpensive, but it is not free. Computing time is therefore a bounded resource, and so is space in memory. You should use these resources wisely, and algorithms that are efficient in terms of time or space will help you do so.

**Efficiency**
Different algorithms devised to solve the same problem often differ dramatically in their efficiency. These differences can be much more significant than differences due to hardware and software.

As an example, in Lecture two and three, we will see two algorithms for sorting. The first, known as ***insertion sort***, takes time roughly equal to *c*_1*n*^2 to sort *n* items, where *c*_1 is a constant that does not depend on *n*. That is, it takes time roughly proportional to *n*^2. The second, ***merge sort***, takes time roughly equal to *c*_2*n*lg *n*, where lg *n* stands for log_2 *n* and *c*_2 is another constant that also does not depend on *n*. Insertion sort typically has a smaller constant factor than merge sort, so that   *c*_1 < *c*_2.

We shall see that the constant factors can have far less of an impact on the running time than the dependence on the input size *n*. Let’s write insertion sort’s running time as *c*_1*n** *n* and merge sort’s running time as *c*_2*n**lg*n*. Then we see that where insertion sort has a factor of *n* in its running time, merge sort has a factor of lg *n*, which is much smaller. (For example, when *n* = 1000, lg *n* is approximately 10, and when *n* equals one million, lg *n* is approximately only 20.)
<span style="color:red">Although insertion sort usually runs faster than merge sort for small input sizes, once the input size *n* becomes large enough, merge sort’s advantage of lg*n* vs. *n* will more than compensate for the difference in constant factors. No matter how much smaller *c*_1 is than *c*_2, there will always be a crossover point beyond which merge sort is faster.</span>

The book from this course has an example, but TL;DR is: 
<span style="color:red">If a computer "A" (using insertion sort) is 1000 times faster than computer "B" (using merge sort), computer B would be 17 times faster than computer A at sorting 10 milion numbers. In the example it took computer A 20000 seconds to sort them, and computer B 1163 seconds. The advantage of merge sort only grows, with highter numbers. (REMEMBER THAT INSERTION SORT CAN STILL BE FASTER WITH SMALLER ARRAYS)</span>

## Lecture 02 - Insertion sort & Asymptotic notation

Lecture Outline:
Insertion sort
Loop invariants for proving correctness
Asymptotic notation & Asymptotic analysis

### Insertion sort

Insertion sort, solves the sorting problem introduced in Lecture 1:

![The sorting problem](/imgs/ALG/TheSortingProblem.png)

<span style="color:red">The numbers that we wish to sort are also known as the ***keys***. Although conceptually we are sorting a sequence, the input comes to us in the form of an array with *n* elements.</span>
In this class, we will typically describe algorithms as programs written in a ***pseudocode***. What separates pseudocode from “real” code is that in pseudocode, we employ whatever expressive method is most clear and concise to specify a given algorithm. Sometimes, the clearest method is English, so do not be surprised if you come across an English phrase or sentence embedded within a section of “real” code. Another difference between pseudocode and real code is that pseudocode is not typically concerned with issues of software engineering. Issues of data abstraction, modularity, and error handling are often ignored in order to convey the essence of the algorithm more concisely.

Now, let us describe ***insertion sort***, which is an efficient algorithm for sorting a small number of elements. Insertion sort works the way many people sort a hand of playing cards. We start with an empty left hand and the cards in a pile with their face down on the table. We then remove one card at a time from the table and insert it into the correct position in the left hand. To find the correct position for a card, we compare it with each of the cards already in the hand, from right to left. At all times, the cards held in the left hand are sorted, and these cards were originally the top cards of the pile on the table.

We present our pseudocode for insertion sort as a procedure called `INSERTION-SORT`, which takes as a parameter an array *A*[1..*n*] containing a sequence of length *n* that is to be sorted. (In the code, the number *n* of elements in *A* is denoted by *A.length*.) The algorithm sorts the input numbers ***in place***: it rearranges the numbers within the array **A**, with at most a constant number of them stored outside the array at any time. The input array *A* contains the sorted output sequence when the `INSERTION-SORT` procedure is finished.

![The operation of `INSERTION-SORT` on the array A= <(5, 2, 4, 6, 1, 3)>. Array indices appear above the rectangles, and values stored in the array positions appear within the rectangles. (a)–(e) The iterations of the **for** loop of lines 1–8. In each iteration, the black rectangle holds the key taken from A[j], which is compared with the values in shaded rectangles to its left in the test of line 5. Shaded arrows show array values moved one position to the right in line 6, and black arrows indicate where the key moves to in line 8. **(f)** The final sorted array.](/imgs/ALG/InsertionSort.png)

```
INSERTION-SORT(A)
 1 for j = 2 to A.length
 2      key = A[j]
 3      //Insert A[j] into the sorted sequence A[1..j-1].
 4      i = j - 1
 5      while i > 0 and A[i] > key
 6          A[i+1] = A[i]
 7          i = i - 1
 8      A[i+1] = key
 ```

**Loop invariants and the correctness of insertion sort**
The above figure shows how this algorithm works for *A*=<(5, 2, 4, 6, 1, 3)>. The index *j* indicates the “current card” being inserted into the hand. At the beginning of each iteration of the **for** loop, which is indexed by *j*, the subarray consisting of elements *A*[1...j-1] constitutes the currently sorted hand, and the remaining subarray *A*[1...j-n] corresponds to the pile of cards still on the table. In fact, elements *A*[1...j-1] are the elements *originally* in positions 1 through *j*-1, but now in sorted order. We state these properties of *A*[1...j-1] formally as a **loop invariant**:

At the start of each iteration of the for loop of lines 1–8, the subarray *A*[Œ1::j 1] consists of the elements originally in *A*[1..j-1], but in sorted order.

<span style="color:red">We use loop invariants to help us understand why an algorithm is correct. We must show three things about a loop invariant:</span>
in insertion sort the 'loop invariant' is the array of elements, since we are just moving the elements around, and therefore not adding or removing elements

**Initialization:** It is true prior to the first iteration of the loop.
**Maintenance:** If it is true before an iteration of the loop, it remains true before the next iteration.
**Termination:** When the loop terminates, the invariant gives us a useful property that helps show that the algorithm is correct

When the first two properties hold, the loop invariant is true prior to every iteration of the loop. (Of course, we are free to use established facts other than the loop invariant itself to prove that the loop invariant remains true before each iteration.) Note the similarity to mathematical induction, where to prove that a property holds, you prove a base case and an inductive step. Here, showing that the invariant holds before the first iteration corresponds to the base case, and showing that the invariant holds from iteration to iteration corresponds to the inductive step.
The third property is perhaps the most important one, since we are using the loop invariant to show correctness. Typically, we use the loop invariant along with the condition that caused the loop to terminate. The termination property differs from how we usually use mathematical induction, in which we apply the inductive step infinitely; here, we stop the “induction” when the loop terminates. 
Let us see how these properties hold for insertion sort.

**Initialization:** We start by showing that the loop invariant holds before the first loop iteration, when *j*=2 (When the loop is a **for** loop, the moment at which we check the loop invariant just prior to the first iteration is immediately after the initial assignment to the loop-counter variable and just before the first test in the loop header. In the case of `INSERTION-SORT`, this time is after assigning 2 to the variable *j* but before the first test of whether *j* <= *A*.length.). The subarray *A*[1..*j*-1], therefore, consists of just the single element *A*[1], which is in fact the original element in *A*[1]. Moreover, this subarray is sorted (trivially, of course), which shows that the loop invariant holds prior to the first iteration of the loop. 
**Maintenance:** Next, we tackle the second property: showing that each iteration maintains the loop invariant. Informally, the body of the **for** loop works by moving AŒj 1, AŒj 2, AŒj 3, and so on by one position to the right until it finds the proper position for AŒj (lines 4–7), at which point it inserts the value of A[j] (line 8). The subarray A[1..j] then consists of the elements originally in AŒ1::j , but in sorted order. Incrementing j for the next iteration of the for loop then preserves the loop invariant. 
A more formal treatment of the second property would require us to state and show a loop invariant for the while loop of lines 5–7. At this point, however, we prefer not to get bogged down in such formalism, and so we rely on our informal analysis to show that the second property holds for the outer loop.
**Termination:** Finally, we examine what happens when the loop terminates. The condition causing the **for** loop to terminate is that `*j* > *A.length* = *n*`. Because each loop iteration increases *j* by 1, we must have `*j = n + 1*` at that time. Substituting *n + 1* for *j* in the wording of loop invariant, we have that the subarray *A[1..n]* consists of the elements originally in `*A*[1..*n*]`, but in sorted order. Observing that the subarray `*A*[1..n]` is the entire array, we conclude that the entire array is sorted. Hence, the algorithm is correct.
We shall use this method of loop invariants to show correctness later in this chapter and in other chapters as well.

<span style="color:red">**Pseudocode conventions for the class/subject can be found on page 20-22** in Introduction to Algorithms Third Edition</span>

### 2.2 Analyzing algorithms

<span style="color:red">Analyzing an algorithm has come to mean predicting the resources that the algorithm requires. Occasionally, resources such as memory, communication band-
width, or computer hardware are of primary concern, but most often it is computational time that we want to measure.</span> Generally, by analyzing several candidate
algorithms for a problem, we can identify a most efﬁcient one. Such analysis may indicate more than one viable candidate, but we can often discard several inferior
algorithms in the process.
Before we can analyze an algorithm, we must have a model of the implementation technology that we will use, including a model for the resources of that technology and their costs. For most of this book, we shall assume a generic one-processor, ***random-access machine (RAM)*** model of computation as our implementation technology and understand that our algorithms will be implemented as computer programs. In the RAM model, instructions are executed one after another, with no concurrent operations.
Strictly speaking, <span style="color:red">we should precisely deﬁne the instructions of the RAM model and their costs.</span> To do so, however, would be tedious and would yield little insight into algorithm design and analysis. Yet we must be careful not to abuse the RAM model. For example, what if a RAM had an instruction that sorts? Then we could sort in just one instruction. Such a RAM would be unrealistic, since real computers do not have such instructions. Our guide, therefore, is how real computers are designed. <span style="color:red">The RAM model contains instructions commonly found in real computers: arithmetic (such as add, subtract, multiply, divide, remainder, ﬂoor, ceiling), data movement (load, store, copy), and control (conditional and unconditional branch, subroutine call and return)</span>. Each such instruction takes a constant amount of time.
The data types in the RAM model are integer and ﬂoating point (for storing real numbers). Although we typically do not concern ourselves with precision in this book, in some applications precision is crucial. We also assume a limit on the size of each word of data. For example, when working with inputs of size *n*, we typically assume that integers are represented by c lg n bits for some constant => 1. We require c => 1 so that each word can hold the value of n, enabling us to index the individual input elements, and we restrict c to be a constant so that the word size does not grow arbitrarily. (If the word size could grow arbitrarily, we could store huge amounts of data in one word and operate on it all in constant time—clearly an unrealistic scenario.)

## Growth of functions
The order of growth of the running time of an algorithm, deﬁned in Chapter 2, gives a <span style="color:red">simple characterization of the algorithm’s efﬁciency and also allows us to compare the relative performance of alternative algorithms </span> Once the input size n becomes large enough, merge sort, with its \theta (*n* lg *n*) worst-case running time, beats insertion sort, whose worst-case running time is \theta (*n*^2). Although we can sometimes determine the exact running time of an algorithm, as we did for insertion sort in Chapter 2, the extra precision is not usually worth the effort of computing it. For large enough inputs, the multiplicative constants and lower-order terms of an exact running time are dominated by the effects of the input size itself.
When we look at input sizes large enough to make only the order of growth of the running time relevant, we are studying the ***asymptotic*** efﬁciency of algorithms. That is, we are concerned with how the running time of an algorithm increases with the size of the input in the limit, as the size of the input increases without bound. Usually, an algorithm that is asymptotically more efﬁcient will be the best choice for all but very small inputs.
This chapter gives several standard methods for simplifying the asymptotic analysis of algorithms. The next section begins by deﬁning several types of “asymptotic notation,” of which we have already seen an example in \theta-notation. We then present several notational conventions used throughout this book, and ﬁnally we review the behavior of functions that commonly arise in the analysis of algorithms.

### Asymptotic notation
The notations we use to describe the asymptotic running time of an algorithm are deﬁned in terms of functions whose domains are the set of natural numbers N = {0, 1, 2, ...}. Such notations are convenient for describing the worst-case running-time function T(*n*), which usually is deﬁned only on integer input sizes. We sometimes ﬁnd it convenient, however, to *abuse* asymptotic notation in a variety of ways. For example, we might extend the notation to the domain of real numbers or, alternatively, restrict it to a subset of the natural numbers. We should make sure, however, to understand the precise meaning of the notation so that when we abuse, we do not *misuse* it. This section deﬁnes the basic asymptotic notations and also introduces some common abuses.

**Asymptotic notation, functions, and running times**
We will use asymptotic notation primarily to describe the running times of algorithms, as when we wrote that insertion sort’s worst-case running time is \theta(*n*^2) Asymptotic notation actually applies to functions, however. Recall that we characterized insertion sort’s worst-case running time as an^2 + *bn* + *c*, for some constants *a*, *b*, and *c*. By writing that insertion sort’s running time is \theta (*n*^2), we abstracted away some details of this function. Because asymptotic notation applies to functions, what we were writing as \theta (n^2) was the function an^2 + *bn* + *c*, which in that case happened to characterize the worst-case running time of insertion sort.
In this book, the functions to which we apply asymptotic notation will usually characterize the running times of algorithms. But asymptotic notation can apply to functions that characterize some other aspect of algorithms (the amount of space they use, for example), or even to functions that have nothing whatsoever to do with algorithms.
Even when we use asymptotic notation to apply to the running time of an algorithm, we need to understand *which* running time we mean. Sometimes we are interested in the worst-case running time. Often, however, we wish to characterize the running time no matter what the input. In other words, we often wish to make a blanket statement that covers all inputs, not just the worst case. We shall see asymptotic notations that are well suited to characterizing running times no matter what the input.

**\theta-notation**
In Chapter 2, we found that the worst-case running time of insertion sort is T(*n*) = \theta (*n*^2). Let us deﬁne what this notation means. For a given function g(n), we denote by \theta (g(n)) *the set of functions* 
\theta (g(n)) = {f(n): there exist positive constants c_1 , c_2 , and n_0 such that
0 <= c_1 g(n) <= f(n) <= c_2 g(n) for all *n* => n_0}

A function f(n) belongs to the set \theta (g(n)) if there exist positive constants c_1 and c_2 such that it can be “sandwiched” between c_1(g(n)) and c_2(g(n)), for sufﬁciently large *n*. Because \theta (g(n)) is a set, we could write `“f(n) = \theta (g(n))”` to indicate that f(n) is a member of \theta (g(n)), Instead, we will usually write `“f(n) = \theta (g(n))”` to express the same notion. You might be confused because we abuse equality in this way, but we shall see later in this section that doing so has its advantages.

![Figure 3.1 Graphic examples of the \theta , *O*, and \Omega notations. In each part, the value of n_0 shown is the minimum possible value; any greater value would also work. **(a)** \theta-notation bounds a function to within constant factors. We write f(n) = \theta(g(n/))if there exist positive constants n_0, c_1, and c_2 such that at and to the right of n_0, the value of f(n) always lies between c_1 g(n)/ and c_2 g(n) inclusive. **(b)** O-notation gives an upper bound for a function to within a constant factor. We write f(n) = O(g(n)) if there are positive constants n_0 and c such that at and to the right of n_0, the value of f(n) always lies on or below *cg*(n). **(c)** \Omega-notation gives a lower bound for a function to within a constant factor. We write f(n) = \Omega (g(n)) if there are positive constants n_0 and c such that at and to the right of n_0, the value of f(n) always lies on or above cg(n)](/imgs/ALG/AsymptoticNotation.png)

CLRS-3: Ch 2 (pp 16-29) and Ch3 (pp. 43-53, read by yourself small-omicron and small-omega notation)
Optional Readings: CLRS-3: Ch 3 (pp. 53-60) or CLRS-4: Ch 3 (pp. 63-70)

## Lecture 03 - Divide-and-Conquer: Merge Sort

Lecture Outline:
Algorithm Design: Divide and Conquer 
Merge sort (Correctness & Runtime Analysis)

### Designing algorithms
We can choose from a wide range of algorithm design techniques. For insertion sort, we used an **incremental** approach: having sorted the subarray *A[1.. j-1]*, we inserted the single element A[j] into its proper place, yielding the sorted subarray A[1..j].
In this section, we examine an alternative design approach, known as “divide-and-conquer,” which we shall explore in more detail in Chapter 4. We’ll use divide-and-conquer to design a sorting algorithm whose worst-case running time is much less than that of insertion sort. One advantage of divide-and-conquer algorithms is that their running times are often easily determined using techniques that we will see in Chapter 4.

### The divide-and-conquer approach
Many useful algorithms are recursive in structure: to solve a given problem, they call themselves **recursively** one or more times to deal with closely related sub-problems. These algorithms typically follow a ***divide-and-conquer*** approach: theybreak the problem into several subproblems that are similar to the original problem but smaller in size, solve the subproblems recursively, and then combine thesesolutions to create a solution to the original problem.
The divide-and-conquer paradigm involves three steps at each level of the recursion:
**Divide** the problem into a number of subproblems that are smaller instances of the same problem.
**Conquer** the subproblems by solving them recursively. If the subproblem sizes are
small enough, however, just solve the subproblems in a straightforward manner.
**Combine** the solutions to the subproblems into the solution for the original problem.

The ***merge sort*** algorithm closely follows the divide-and-conquer paradigm. Intuitively, it operates as follows.
**Divide:** Divide the n-element sequence to be sorted into two subsequences of *n*/2 elements each.
**Conquer:** Sort the two subsequences recursively using merge sort.
**Combine:** Merge the two sorted subsequences to produce the sorted answer.
The recursion “bottoms out” when the sequence to be sorted has length 1, in which case there is no work to be done, since every sequence of length 1 is already in sorted order.
The key operation of the merge sort algorithm is the merging of two sorted sequences in the “combine” step. We merge by calling an auxiliary procedure `MERGE(A, p, q, r)`, where *A* is an array and *p*, *q*, and *r* are indices into the array
such that *p* <= *q* < *r*. The procedure assumes that the subarrays *A[p..q]* and *A[q + 1..r]* are in sorted order. It merges them to form a single sorted subarray that replaces the current subarray *A[p..r]*.
Our `MERGE` procedure takes time \theta (n), where *n* = *r* - *p* + 1 is the total number of elements being merged, and it works as follows. Returning to our card-playing motif, suppose we have two piles of cards face up on a table. Each pile is sorted, with the smallest cards on top. We wish to merge the two piles into a single sorted output pile, which is to be face down on the table. Our basic step consists of choosing the smaller of the two cards on top of the face-up piles,removing it from its pile (which exposes a new top card), and placing this card face down onto the output pile. We repeat this step until one input pile is empty, at which time we just take the remaining input pile and place it face down onto the output pile. Computationally, each basic step takes constant time, since we are comparing just the two top cards. Since we perform at most *n* basic steps, merging takes \theta (n) time.
The following pseudocode implements the above idea, but with an additional twist that avoids having to check whether either pile is empty in each basic step. We place on the bottom of each pile a ***sentinel*** card, which contains a special value that we use to simplify our code. Here, we use \infinity as the sentinel value, so that whenever a card with \infinity is exposed, it cannot be the smaller card unless both piles have their sentinel cards exposed. But once that happens, all the nonsentinel cards have already been placed onto the output pile. Since we know in advance that exactly *r* - *p* + 1 cards will be placed onto the output pile, we can stop once we have performed that many basic steps.

CLRS-3 Section 2.3

## Lecture 04 - Recurrences & The Master Method

Lecture Outline:
We present three useful techniques to perform asymptotic running time analysis of recursive algorithms

the substitution method
the recursion-tree method
the master method
Readings
CLRS-3 Ch4 excluding Sec. 4.1, 4.2, and 4.6

CLRS-4 Ch4 excluding Sec. 4.1, 4.2, and 4.6

Optional readings
CLRS-3 Ch4 - Sec. 4.6

CLRS-4 Ch4 - Sec. 4.6

## Lecture 05 - Sorting

Lecture Outline
Heapsort  
Quicksort
Counting Sort
Radix Sort
Readings:
In this lecture, we introduce another sorting algorithm: heapsort. Like merge sort, but unlike insertion sort, heapsort’s running time is O(n lg n) Like insertion sort, but unlike merge sort, heapsort sorts in place: only a constant number of array elements are stored outside the input array at any time. Thus, heapsort combines the better attributes of the two sorting algorithms we have already discussed.
Heapsort also introduces another algorithm design technique: using a data structure, in this case one we call a “heap,” to manage information. Not only is the heap data structure useful for heapsort, but it also makes an efficient priority queue. The heap data structure will reappear in algorithms in later chapters.
The term “heap” was originally coined in the context of heapsort, but it has since come to refer to “garbage-collected storage,” such as the programming languages Java and Lisp provide. Our heap data structure is not garbage-collected storage, and whenever we refer to heaps in this book, we shall mean a data structure rather than an aspect of garbage collection

### Heaps

The (binary) heap data structure is an array object that we can view as a nearly complete binary tree, as shown in Figure 6.1. Each node of the tree corresponds to an element of the array. The tree is completely filled on all levels except possibly the lowest, which is filled from the left up to a point. An array *A* that represents a heap is an object with two attributes: *A.length*, which (as usual) gives the number of elements in the array, and *A.heap-size*, which represents how many elements in the heap are stored within
array *A*. That is, although A[1..A.length] may contain numbers, only the elements in A[1..A.*heap-size*], where 0 <= *A.heap-size* <= *A.length*, are valid elements of the heap. The root of the tree is A[1], and given the index *i* of a node, we can easily compute the indices of its parent, left child, and right child: 
![Figure 6.1 A max-heap viewed as (a) a binary tree and (b) an array. The number within the circle at each node in the tree is the value stored at that node. The number above a node is the corresponding index in the array. Above and below the array are lines showing parent-child relationships; parents are always to the left of their children. The tree has height three; the node at index 4 (with value 8) has height one.](/imgs/ALG/MaxHeap.png)

![Computing the index of parent, left or right node](/imgs/ALG/ComputeIndex.png)

There are two kinds of binary heaps: `max-heaps` and `min-heaps`. In both kinds, the values in the nodes satisfy a **heap property**, the specifics of which depend on the kind of heap. In a **max-heap**, the **max-heap property** is that for every node *i* other than the root,
*A*[PARENT(*i*)] <= *A*[*i*].

The smallest element in a min-heap is at the root.
For the heapsort algorithm, we use max-heaps. Min-heaps commonly implement priority queues, which we discuss in Section 6.5. We shall be precise in specifying whether we need a max-heap or a min-heap for any particular application, and when properties apply to either max-heaps or min-heaps, we just use the term “heap.”

Viewing a heap as a tree, we define the **height** of a node in a heap to be the number of edges on the longest simple downward path from the node to a leaf, and we define the height of the heap to be the height of its root. Since a heap of *n* elements is based on a complete binary tree, its height is \theta(lg *n*) (see Exercise 6.1-2). We shall see that the basic operations on heaps run in time at most proportional to the height of the tree and thus take O(lg *n*) time. The remainder of this lecture presents some basic procedures and shows how they are used in a sorting algorithm and a priority-queue data structure.

* The `MAX-HEAPIFY` procedure, which runs in O.lg n/ time, is the key to maintaining the max-heap property.
* The `BUILD-MAX-HEAP` procedure, which runs in linear time, produces a max-heap from an unordered input array.
* The `HEAPSORT` procedure, which runs in O.n lg n/ time, sorts an array in place.
* The `MAX-HEAP-INSERT`, `HEAP-EXTRACT-MAX`, `HEAP-INCREASE-KEY`, and `HEAP-MAXIMUM` procedures, which run in *O*(lg n) time, allow the heap data structure to implement a priority queue.

### Maintaining the heap property

In order to maintain the max-heap property, we call the procedure MAX-HEAPIFY. Its inputs are an array *A* and an index *i* into the array. When it is called, MAX-HEAPIFY assumes that the binary trees rooted at LEFT(*i*) and RIGHT(*i*) are max-heaps, but that A[*i*] might be smaller than its children, thus violating the max-heap property. MAX-HEAPIFY lets the value at A[*i*] “float down” in the max-heap so that the subtree rooted at index *i* obeys the max-heap property.

``
MAX-HEAPIFY(A, i)
 *l* = LEFT(*i*)
 *r* = RIGHT(*i*)
 if *l* <= *A.heap-size* and *A*[*l*] > *A*[*i*]
   largest = *l*
 else largest = *i*
 if *r* <= *A.heap-size* and A[r] > *A*[largest]
    largest = *r*
 if largest != *i*
    exchange A[i] with *A*[largest]
    MAX-HEAPIFY(*A*, *largest*)``

![The action of MAX-HEAPIFY(A, 2), where *A.heap-size* = 10. **(a)** The initial configuration, with *A*[2] at node *i* = 2 violating the max-heap property since it is not larger than both children. The max-heap property is restored for node 2 in **(b)** by exchanging *A*[2] with *A*[4], which destroys the max-heap property for node 4. The recursive call MAX-HEAPIFY(*A*, 4) now has *i* = 4. After swapping A[4] with A[9], as shown in **(c)**, node 4 is fixed up, and the recursive call MAX-HEAPIFY(A, 9) yields no further change to the data structure.](/imgs/ALG/MaxHeapifyIllustration.png)

The figure above illustrates the action of MAX-HEAPIFY. At each step, the largest of the elements A[i], A[LEFT(i)], and A[RIGHT(i)] is determined, and its index is
stored in largest. If A[i] is largest, then the subtree rooted at node i is already a max-heap and the procedure terminates. Otherwise, one of the two children has the largest element, and *A[i]* is swapped with *A[largest]*, which causes node *i* and its children to children to satisfy the max-heap property. The node indexed by largest, however, now has the original value A[i], and thus the subtree rooted at largest might violate the max-heap property. Consequently, we call MAX-HEAPIFY recursively on that subtree.
The running time of MAX-HEAPIFY on a subtree of size *n rooted at a given node *i* is the \theta(1) time to fix up the relationships among the elements A[i], A[LEFT(i)], and A[RIGHT(i)], plus the time to run MAX-HEAPIFY on a subtree rooted at one of the children of node *i* (assuming that the recursive call occurs). The children’s subtrees each have size at most 2*n*/3 — the worst case occurs when the bottom level of the tree is exactly half full—and therefore we can describe the running time of MAX-HEAPIFY by the recurrence

T(n)<= T(2*n*/3)+\theta(1)

The solution to this recurrence, by case 2 of the master theorem (Theorem 4.1), is T .n/ D O.lg n/. Alternatively, we can characterize the running time of MAX-HEAPIFY on a node of height h as O.h/

<span style="color:red">Max-Heapify is basically just sorting the tree from low to high, where the loweste value is the lowest element in the tree, from the figure above, the value 16 would be index 1, and the value 1 would be index 10.</span>

Readings:
CLRS-3 (same for CLRS-4) Ch6 until 6.4 (included), Ch7 sections 7.1 and 7.2, Ch8 sections 8.2 and 8.3

Optional Readings: 
CLRS-3 (same for CLRS-4) Section 8.1

## Lecture 06 - Elementary Data Structures

Lecture Outline
Stacks and Queues
Linked Lists
Rooted Trees

### Stacks and queues

Stacks and queues are dynamic sets in which the element removed from the set by the `DELETE` operation is prespecified. In a ***stack***, the element deleted from the set is the one most recently inserted: the stack implements a ***last-in, first-out*** or **LIFO**, policy. Similarly, in a ***queue***, the element deleted is always the one that has been in the set for the longest time: the queue implements a ***first-in, first-out*** or ***FIFO*** policy. There are several efficient ways to implement stacks and queues on a computer. In this section we show how to use a simple array to implement each

**Stacks**
The ``INSERT`` operation on a stack is often called ``PUSH``, andthe ``DELETE`` operation, which does not take an element argument, is often called ``POP``. These names are allusions to physical stacks, such as the spring-loaded stacks of plates used in cafeterias. The order in which plates are popped from the stack is the reverse of the order in which they were pushed onto the stack, since only the top plate is accessible.
As Figure 10.1 shows, we can implement a stack of at most *n* elements with an array `S[1..n]`. The array has an attribute `S.top` that indexes the most recently inserted element. The stack consists of elements `S[1.. S.top]`, where `S[1]` is the element at the bottom of the stack and S[S:top] is the element at the top.
When *S.top* = 0, the stack contains no elements and is empty. We can test to see whether the stack is empty by query operation `STACK-EMPTY`. If we attempt to pop an empty stack,we say the stack ***underflows***, which is normally an error. If *S.top* exceeds *n*, the stack ***overflows***. (In our pseudo code implementation, we don’t worry about stack overflow.)
We can implement each of the stack operations with just a few lines of code:

`STACK-EMPTY(S)`
 `if S.top == 0`
    `return TRUE`
 `else return FALSE`

`PUSH(S, x)`
 `S.top = S.top + 1`
 `S[S.top] = x`

`POP(S)`
 `if STACK-EMPTY(S)`
    `error “underflow”`
 `else S.top = S.top - 1`
`   return S[S.top + 1]`
Figure 10.1 shows the effects of the modifying operations PUSH and POP. Each of the three stack operations takes O(1) time.

### Queues
We call the `INSERT` operation on a queue `ENQUEUE`, and we call the `DELETE` operation `DEQUEUE`; like the stack operation `POP`, `DEQUEUE` takes no element argument. The FIFO property of a queue causes it to operate like a line of customers waiting to pay a cashier. The queue has a ***head*** and a ***tail***. When an element is enqueued, it takes its place at the tail of the queue, just as a newly arriving customer takes a place at the end of the line. The element dequeued is always the one at the head of the queue, like the customer at the head of the line who has waited the longest.
Figure 10.2 shows one way to implement a queue of at most n 1 elements
using an array Q[1..*n*]. The queue has an attribute *Q.head* that indexes, or points to, its head. The attribute *Q.tail* indexes the next location at which a newly arriving element will be inserted into the queue. The elements in the queue reside in locations *Q.head*, *Q.head* + 1, ..., *Q.tail* - 1, where we “wrap around” in the sense that location 1 immediately follows location *n* in a circular order. When Q.head = *Q.tail*, the queue is empty. Initially, we have *Q.head* = *Q.tail* = 1. If we attempt to dequeue an element from an empty queue, the queue underflows.

When *Q.head* = *Q.tail* + 1, the queue is full, and if we attempt to enqueue an element, then the queue overflows.
In our procedures `ENQUEUE` and `DEQUEUE`, we have omitted the error checking for underflow and overflow. The pseudocode assumes that *n* = *Q.length*.
```python 
ENQUEUE(Q, x)
 Q[Q:tail] = x
 if Q.tail == Q.length
   Q:tail = 1
 else Q.tail = Q.tail + 1
```
```python
DEQUEUE(Q)
 x = Q[Q.head]
 if Q.head == Q.length
   Q=head D 1
 else Q.head = Q.head + 1
   return x
```
![Figure 10.2 A queue implemented using an array Q[1...12]. Queue elements appear only in the lightly shaded positions. **(a)** The queue has 5 elements, in locations Q[7..11]. **(b)** The configuration of the queue after the calls ENQUEUE(Q, 17), ENQUEUE(Q, 3), and ENQUEUE(Q, 5). **(c)** The configuration of the queue after the call DEQUEUE(Q) returns the key value 15 formerly at the head of the queue. The new head has key 6.](/imgs/ALG/QueueImplementedInArray.png)
Figure 10.2 shows the effects of the ENQUEUE and DEQUEUE operations. Each operation takes O(1) time.

## Linked lists
A ***linked list*** is a data structure in which the objects are arranged in a linear order. Unlike an array, however, in which the linear order is determined by the array indices, the order in a linked list is determined by a pointer in each object. Linked lists provide a simple, flexible representation for dynamic sets, supporting (though not necessarily efficiently) all the operations listed on page 230 of Introduction to Algorithms Third Edition.
As shown in Figure 10.3, each element of a ***doubly linked list*** *L* is an object with an attribute `key` and two other pointer attributes: `next` and `prev`. The object may also contain other satellite data. Given an element *x* in the list, *x.next* points to its successor in the linked list, and *x.prev* points to its predecessor. If `x.prev = NIL`, the element *x* has no predecessor and is therefore the first element, or ***head***, of the list. If `x.next = NIL`, the element *x* has no successor and is therefore the last element, or ***tail***, of the list. An attribute `L.head` points to the first element of the list. If `L.head = NIL`, the list is empty.
A list may have one of several forms. It may be either singly linked or doubly linked, it may be sorted or not, and it may be circular or not. If a list is ***singly linked***,weomitthepre pointer in each element. If a list is ***sorted***, the linear order of the list corresponds to the linear order of keys stored in elements of the list; the minimum element is then the head of the list, and the maximum element is the tail. If the list is ***unsorted***, the elements can appear in any order. In a ***circular*** list, the prev pointer of the head of the list points to the tail, and the next pointer of the tail of the list points to the head. We can think of a circular list as a ring of elements. In the remainder of this section, we assume that the lists with which we are working are unsorted and doubly linked.

### Searching a linked list

```python
LIST-SEARCH.L;k/
 1 x DL:head
 2 while x ¤ NILand x:key ¤ k
 3
 x D x:next
 4 return x
```

```python
 LIST-INSERT.L;x/
 1 x:next D L:head
 2 ifL:head ¤ NIL
 3
 L:head:pre D x
 4 L:head D x
 5 x:pre D NIL
```

```python
  LIST-DELETE.L;x/
 1 ifx:pre ¤ NIL
 2
 x:pre :next D x:next
 3 else L:head D x:next
 4 ifx:next ¤ NIL
 5
 x:next:pre D x:prev
```
### Sentinels
The code for `LIST-DELETE` would be simpler if we could ignore the boundary conditions at the head and tail of the list:
```python
LIST-DELETE0.L;x/
 x.prev.next = x.next
 x.next.prev = x.prev
```
A ***sentinel*** is a dummy object that allows us to simplify boundary conditions. For example, suppose that we provide with list *L* an object *L.nil* that represents NIL but has all the attributes of the other objects in the list. Wherever we have a reference to NIL in list code, we replace it by a reference to the sentinel *L.nil*. As shown in Figure 10.4, this change turns a regular doubly linked list into a ***circular, doubly linked list with a sentinel***, in which the sentinel *L.nil* lies between the head and tail. The attribute *L.nil.next* points to the head of the list, and *L.nil.prev* points to the tail. Similarly, both the `next` attribute of the tail and the `prev` attribute of the head point to *L.nil*. Since *L.nil.next* points to the head, we can eliminate the attribute *L.head* altogether, replacing references to it by references to *L.nil.nex*t. Figure 10.4(a) shows that an empty list consists of just the sentinel, and both *L.nil.next* and *L.nil.pre* point to *L.nil*.
The code for `LIST-SEARCH` remains the same as before, but with the references to `NIL` and `L.head` changed as specified above:
```python
LIST-SEARCH'(L, k)
   x = L.nil.next
   while x != L.nil and x.key != k
      x = x.next
   return x
```
We use the two-line procedure LIST-DELETE' from before to delete an element from the list. The following procedure inserts an element into the list:

```python
 LIST-INSERT'(L, x)
  x.next = L.nil.next
  L.nil.next.pre = x
  L.nil.next = x
  x.pre = L.nil
```
Sentinels rarely reduce the asymptotic time bounds of data structure operations, but they can reduce constant factors. The gain from using sentinels within loops is usually a matter of clarity of code rather than speed; the linked list code, for example, becomes simpler when we use sentinels, but we save only O(1) time in the LIST-INSERT' and LIST-DELETE' procedures. In other situations, however, the use of sentinels helps to tighten the code in a loop, thus reducing the coefficient of, say, *n* or *n^2* in the running time.
We should use sentinels judiciously. When there are many small lists, the extra storage used by their sentinels can represent significant wasted 
Readings: 
CLRS-3 Sections and 10.4

## Proof by induction - ALG

When providing a proof (by induction) in relation to an algorithm the steps in plain english are:
The **Base case:** (Basis step:) give a case we know is true.
The **Inductive step:** Write down an assumption (hypothisis). Then describe how the algorithm works (in plain english, nothing fancy), after doing so introduce an example. Now continue to go through all the different cases of what the algorithm might encounter, and what will happen when it does. If the algorithm is dependent on a subroutine, like radix-sort is, point out what might happen, if the subroutine fails (like if the subroutine isn't stable, like radix-sort would require).

<span style="color:red">Since the description here, might be a bit.. counfusing, here are two examples of proof by induction for two different algorithms. Notice the patterns/similarities
![Proof by induction done on a sorting algorithm, in this case, radix-sort](/imgs/ALG/ProofByInductionRadix.png)

![Proof by induction done on a binary tree algorithm](imgs/ALG/ProofByInductionBinaryTree.png)