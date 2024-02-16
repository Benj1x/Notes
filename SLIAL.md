# Probability Theory and Linear Algebra

## Lecture 1 - Introduction, vectors, linearity

### Vectors

<span style="color:red">Vector is an ordered, finite list of numbers. Vectors are usually written as vertical arrays, surrounded by square or curved brackets:</span>

![Written vector example](/imgs/SLIAL/WrittenVector.png)

<span style="color:red">They can also be written as numbers separated by commas and surrounded by parentheses. In this notation style, the vector above is written as: </span>

(−1.1, 0.0, 3.6, −7.2)

The elements (or entries, coefficients, components) of a vector are the values in the array. The size (also called dimension or length) of the vector is the number of
elements it contains. The vector above, for example, has size four; its third entry is 3.6. A vector of size *n* is called an *n-vector*. A 1-vector is considered to be the
same as a number, i.e., we do not distinguish between the 1-vector [ 1.3 ] and the number 1.3.
We often use symbols to denote vectors. If we denote an *n-vector* using the symbol *a*, the *i*th element of the vector *a* is denoted *a_i*, where the subscript *i* is an integer index that runs from 1 to *n*, the size of the vector.
Two vectors *a* and *b* are *equal*, which we denote *a* = *b*, if they have the same size, and each of the corresponding entries is the same. If *a* and *b* are *n*-vectors, then *a* = *b* means *a*_1 = *b*_1, . . . , *a_n* = *b_n*.

<span style="color:red">The numbers or values of the elements in a vector are called scalars</span>. We will focus on the case that arises in most applications, where the scalars are real numbers. In this case we refer to vectors as real vectors. (Occasionally other types of scalars arise, for example, complex numbers, in which case we refer to the vector as a complex vector.) <span style="color:red">The set of all real numbers is written as **R**, and the set of all real *n*-vectors is denoted **R**^*n*</span>, so *a* ∈ **R**^*n* is another way to say that *a* is an *n*-vector with real entries. Here we use set notation: *a* ∈ **R**^*n* means that *a* is an element of the set **R**^*n*; see appendix A.

**Block or stacked vectors.** It is sometimes useful to define vectors by *concatenating* or *stacking* two or more vectors, as in

![Block/Stacked bector example](StackedVectors.png)

where *a*, *b*, *c*, and *d* are vectors. If *b* is an *m*-vector, *c* is an *n*-vector, and *d* is a
*p*-vector, this defines the (*m* + *n* + *p*)-vector

*a* = (*b*_1, *b*_2, . . . , *b_m*, *c*_1, *c*_2, . . . , *c_n*, *d*_1, *d*_2, . . . , *d_p*).

<span style="color:red">The stacked vector *a* is also written as *a* = (*b*, *c*, *d*).
Stacked vectors can include scalars (numbers). For example if *a* is a 3-vector,
(1, *a*) is the 4-vector (1, *a*_1, *a*_2, *a*_3).</span>

**Subvectors.** In the equation above, we say that *b*, *c*, and *d* are *subvectors* or *slices* of *a*, with sizes *m*, *n*, and *p*, respectively. *Colon notation* is used to denote subvectors. If *a* is a vector, then the subvector *a_r:s* is a vector of size *s* − *r* + 1, with entries *a_r*, . . . , *a_s*:  <span style="color:red">

*a_r*:*s* = (*a_r*, . . . , *a_s*).


As a more concrete example, if <span style="color:red">*z* is the 4-vector (1, −1, 2, 0), the slice *z*_2:3 is *z*_2:3 = (−1, 2).</span> Colon notation is not completely standard, but is gaining traction.

<span style="color:red">In programming, arrays of length *n* are indexed from i = 0 to i = *n* − 1. In standard mathematical notation, *n*-vectors are indexed from i = 1 to i = *n*, so in this subject/class, vectors will be indexed from i = 1 to i = *n*</span>

**Zero vectors.** <span style="color:red">A *zero vector* is a vector with all elements equal to zero. Sometimes the zero vector of size *n* is written as 0_n, where the subscript denotes the size.But usually a zero vector is denoted just 0, the same symbol used to denote the number 0.</span> In this case you have to figure out the size of the zero vector from the context. As a simple example, if *a* is a 9-vector, and we are told that *a* = 0, the 0 vector on the right-hand side must be the one of size 9.
Even though zero vectors of different sizes are different vectors, we use the same symbol 0 to denote them. In computer programming this is called *overloading*: 
The symbol 0 is overloaded because it can mean different things depending on the context (e.g., the equation it appears in)

**Unit vectors.** <span style="color:red">A (standard) *unit vector* is a vector with all elements equal to zero, except one element which is equal to one. The *i*th unit vector (of size *n*) is the unit vector with *i*th element one, and denoted *e_i*.</span> For example, the vectors

![A standard unit vector](/imgs/SLIAL/StandardUnitvector.png)

are the three unit vectors of size 3. The notation for unit vectors is an example of the ambiguity in notation noted above. <span style="color:red">Here, *e_i* denotes the *i*th unit vector, and not the *i*th element of a vector *e*.</span> Thus we can describe the *i*th unit n-vector *e_i* as

![*i*th Unit Vector description](/imgs/SLIAL/ithUnitVectorDesc.png)

for *i,j* = 1, . . . , *n*. On the left-hand side *e_i* is an *n*-vector; (*e_i*)_*j* is a number, its *j*th entry. As with zero vectors, the size of *e_i* is usually determined from the context.

**Ones vector.** We use <span style="color:red">the notation **1**_*n* for the *n*-vector with all its elements equal to one. We also write **1** if the size of the vector can be determined from the context. (Some use *e* to denote a vector of all ones, but we will not use this notation.) The vector **1** is sometimes called the *ones vector*.</span>

**Sparsity.** <span style="color:red">A vector is said to be *sparse* if many of its entries are zero; its *sparsity pattern* is the set of indices of nonzero entries. The number of the nonzero entries of an *n*-vector *x* is denoted **nnz**(*x*). Unit vectors are sparse, since they have only one nonzero entry. The zero vector is the sparsest possible vector, since it has no nonzero entries.</span> Sparse vectors arise in many applications.

###


Literature: [VMLS], Chapter 1, Section 2.1 + slides
Exercises:

Basic vector notation and operations: 1.6, 1.7, 1.10, 1.11, 1.13
Block-vectors: 1.4
Linear combinations: 1.18
Linear functions: 2.1, 2.4
Affine functions: 2.2, 2.7
Regression models: 2.10, 2.12
Polynomials: 2.8

## Lecture 1.5 - norm, distance, angle

When: unscheduled!  Suggestion: 09.02.2004, afternoon.
Literature: [VMLS], Chapter 3

Exercises:
Properties of the norm: 3.3, 3.4, 3.18, 3.19
Nearest neighbour: 3.13
Angle: 3.22, 3.23
Chebyshev inequality: 3.7, 3.8
Block-vectors: 3.2

## Lecture 2 - Linear independence

Literature: [VMLS], Chapter 5 + Slides

Exercises:

Linear (in)dependence: 5.2, 5.1
Pythagoras theorem: 5.4
Orthognalization and Gram-Schmidt: 5.5-5.9
(facit -> moodle)

## Lecture 3 - Matrices

Literature: [VMLS], Chapters 6,7 + Slides

Exercises:
Dimensions: 6.1, 6.3
Matrix-vector multiplication: 6.6, 6.10, 6.11
Graph adjacency/incidence matrices: 6.4, 6.5, 7.7
Linear (in)dependence: 6.17, 7.6
Skew-symmetric matrices: 6.12
Various transformations: 6.13, 7.2, 7.3, 7.4, 7.8, 7.11
Complexity of matrix-vector product: 6.20
Norm of matrix-vector product: 6.14

## Lecture 4 - Linear equations. Gaussian elimination

Literature: [VMLS], Chapter 8 + slides. You may find a much more detailed explanation of row reduction with examples in Sections 1.1-1.2 of [Lay]="Linear Algebra and Its Applications" by Lay, Lay, McDonald (attached). Note: I only discuss the (non-unique) echelon form in my slides, after which we run a backward substitution algorithm, whereas Lay also talks about the reduced echelon form. Basically we do not explicitly perform "Step 5" of the reduction algorithm on p. 17 in Lay's book.

Exercises:

[VMLS]: 8.1, 8.3, 8.4, 8.6, 8.8, 8.9, 8.14, 8.16
[Lay]: 1.1.1, 1.1.6. Run backward substitution: 1.1.7, 1.1.9. Determine consistency: 1.1.15, 1.1.17. Find all solutions to the system: 1.2.7, 1.2.9, 1.2.11, 1.2.13. Existence/uniqueness: 1.2.15, 1.2.19

## Lecture 4.5 - matrix multiplication

Literature: [VMLS], Chapter 10

Exercises:

Matrix multiplication: 10.1, 10.2, 10.3, 10.4, 10.6, 10.8, 10.12, 10.14, 10.23, 10.25, 10.26, 10.33, 10.34
Orthogonal matrices: 10.35, 10.38, 10.40 (there is an obvious typo in the definition of Qi)
Computational complexity: 10.42, 10.43, 10.44

## Lecture 5 - Workshop 01

When: 27.02.2024, 12:30

## Lecture 6 - Matrix inverses

Literature: [VMLS], Chapter 11 + Slides

Exercises:

11.1, 11.2, 11.3, 11.4, 11.7, 11.12, 11.16, 11.17, 11.18, 11.22, 11.24
Block-matrices: 11.5 (hint: show that the inverse matrix is also symmetric; assume it has the same block-structure as A
), 11.6

## Lecture 7 - Least-squares problems

When: 08.03.2024, 12:30. This is a self-study with help.
Literature: [VMLS], Chapter 12 + slides

Exercises:

12.1, 12.2, 12.4, 12.9, 12.14, 12.16, 13.3

## Lecture 8 - Workshop 02

When: 12.03.2024, 12:30

## Lecture 9 - Introduction, optimality conditions

When: 18.03.2024, 10:15. Lecture followed up by exercises.
Literature: [AEP], from chapter 7 up to and including section 8.2.2 (pp 197-214) + section 10.2 (up and including Theorem 10.6 w/o proof, pp 243-248).

Exercises (from chapter9_exercises.pdf, see below). I recommend solving the practice problem, and at least a couple of exercises from each category besides "modelling". If you have time, please also look at the modelling exercises.

Solve the practice problems 1-4 on p.532
Solve graphically: exercises 9.2.7-9.2.10. I recommend trying to solve both the minimization and the maximization problem for each exercise.
Rewrite to standard, not canonical form: exercises 9.2.3-9.2.6. Randomize each problem by: randomly selecting minimize/maximize; then for each constraint randomly select from =
, ≤
, and ≥
; finally for each of the variables randomly select, whether it should be ≥0
, ≤0
, or "free"/no sign restrictied.
Duality: for each problem you stated in the standard form in the previous category, formulate the dual problem.
Modelling: exercises 9.2.1-9.2.2, 9.2.15.

## Lecture 10 - Duality in linear optimization

When: 22.03.2024, 12:30. This is a self-study with help.
Literature: [AEP], from chapter 7 up to and including section 8.2.2 (pp 197-214) + section 10.2 (up and including Theorem 10.6 w/o proof, pp 243-248).

Exercises (from chapter9_exercises.pdf, see below). I recommend solving the practice problem, and at least a couple of exercises from each category besides "modelling". If you have time, please also look at the modelling exercises.

Solve the practice problems 1-4 on p.532
Solve graphically: exercises 9.2.7-9.2.10. I recommend trying to solve both the minimization and the maximization problem for each exercise.
Rewrite to standard, not canonical form: exercises 9.2.3-9.2.6. Randomize each problem by: randomly selecting minimize/maximize; then for each constraint randomly select from =
, ≤
, and ≥
; finally for each of the variables randomly select, whether it should be ≥0
, ≤0
, or "free"/no sign restrictied.
Duality: for each problem you stated in the standard form in the previous category, formulate the dual problem.
Modelling: exercises 9.2.1-9.2.2, 9.2.15.

## Lecture 11 - Simplex algorithm

When: 26.03.2024, 12:30. This is a self-study with help.
Literature: [AEP]: Section 8.2.2 up to Theorem 8.7 (you do not have to read the proof)+Chapter 9.

Exercises:

Go through the full solutions of example1 (only Phase II) and example 2 (Phase I + II) on moodle
[AEP]: Exercises 9.1, 9.2(a)
Exercises from [chapter9_exercises], section 9.3: 9-14, 1-2.  Ignore everything about the "simplex tableau", just use simplex method to solve the problems (after reformulating them in standard form).
[AEP]: 8.6

## Lecture 12 - Workshop 03

When: 04.04.2024, 12:30.

## Lecture 13 - Introduction to probability theory

When: 09.04.2024, 12:30. Lecture followed up by exercises.
Literature: [Rosen] Sections 7.1-7.2

Exercises:

Compute the probabilities [7.1]: 3, 7, 9, 11
Compare the probabilities [7.1]: 37, 45
Probability distributions [7.2]: 1, 3, 5

## Lecture 13.5 - mean value, variance

When: unscheduled! Suggestion: 12.04.2024, afternoon
Literature: [Rosen] Section 7.4 + slides

Exercises:

Compute the expected value: [7.4] 3, 5, 7, 11
Independence: [7.4] 19, 21
Variance: [7.4] 27, 29

## Lecture 14 - Conditional probability. Bayes' theorem

When: 16.04.2024, 12:30. This is a self-study with help.
Literature: [Rosen], Sections 7.2-7.3 + slides

Exercises:

Compute the probabilities: [7.2] 7, 10, 29, 30
Conditional probabilities: [7.2] 23, 24, 25
Independent events: [7.2] 26, 27
Bernoulli trials: [7.2] 34, 35
Bayes' thm: [7.3]: 1, 3, 5, 9, 13, 15, 23

## Lecture 14.5 - eigenvalues and eigenvectors

When: unscheduled! Suggestion: 19.04.2024, afternoon
Literature: Section 5.1 of [Lay]="Linear Algebra and Its Applications" by Lay, Lay, McDonald (attached) + slides. Lay gives the definitions and explains the way of computing eigenvectors given the knowledge of an eigenvalue. QR (and other) algorithms are used in practice to compute eigenvalues.

Exercises:

[Lay]: 5.1.2, 5.1.5, 5.1.7, 5.1.17, 5.1.19, 5.1.21

## Lecture 15 - Linear dynamical systems, Markov chains

When: 23.04.2024, 12:30. This is a self-study with help.
Literature: [Lay], Section 4.9 + slides. Skim through [VMLS], Chapter 9 for some examples/applications

Exercises:

[Lay 4.9]: 1, 11, 7, 9, 10, 19, 20. Use QR algorithm to approximate the matrix eigenvalues in the exercise 7.
[VLMS]: 9.4, 9.3

## Lecture 16 - Workshop 04

When: 30.04.2024, 12:30.