# Algorithms and Data structures (ALG)

## Lecture 01: Algorithms, Correctness, and Efficiency

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

## Lecture 02: Insertion sort & Asymptotic notation

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
<span style="color:red">When analyzing an algorithm we want to measure computational time. Generally, by analyzing several candidate algorithms for a problem, we can identify a most efficient one. Such analysis may indicate more than one viable candidate, but we can often discard several inferior algorithms in the process.</span>

CLRS-3: Ch 2 (pp 16-29) and Ch3 (pp. 43-53, read by yourself small-omicron and small-omega notation)
Optional Readings: CLRS-3: Ch 3 (pp. 53-60) or CLRS-4: Ch 3 (pp. 63-70)

## Lecture 03: Divide-and-Conquer: Merge Sort

Lecture Outline:
Algorithm Design: Divide and Conquer 
Merge sort (Correctness & Runtime Analysis)
CLRS-3 Section 2.3

## Lecture 04: Recurrences & The Master Method

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