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

![How we formally define the sorting problem](TheSortingProblem.png)

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

![The sorting problem](TheSortingProblem.png)

<span style="color:red">The numbers that we wish to sort are also known as the <span style="font-weight:bold, font-style:italic">keys. Although conceptually we are sorting a sequence, the input comes to us in the form of an array with *n* elements.</span>
In this class, we will typically describe algorithms as programs written in a ***pseudocode***.




## Lecture 03: Divide-and-Conquer: Merge Sort
Lecture Outline:
Algorithm Design: Divide and Conquer 
Merge sort (Correctness & Runtime Analysis)


