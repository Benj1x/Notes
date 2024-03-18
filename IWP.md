# Internetworking and Web-programming

## Lecture 1 - Introduction to web-programming

Reading guide:

These chapters introduce the basic programming concepts in JavaScript (JS): Types, Values, Expressions, Variables, Statements. There are quite many pages, but most concepts should be familiar from your experience with the C-language. Pay particular attention to how values and types works in JS; string processing plays an important role in web-programming, so pay attention to the JS string processing features. If you are struggling with programming, take extra time to get acquainted with the concepts. 
[DF] Chapters 1-5 (11+6+29+13+15=74 pages): SKIP the sections mentioned below

Chapter 1: but skip 1.4 for now
    Chapter 3: but skip
        3.2.5, BigInt: 
        3.6, Symbols: 2
        3.2.10 VAR: 1
        3.10.3 Destructuring assignment: 4
    Ch4: Expressions, but SKIP
        4.4.1 Conditional property access 2
        4.5.1 Conditional invoke 1 
        4.7 (operators and precedense. Serves as Reference manual) 4
        4.9.2 comparison 2
        4.9.3 in operator 4.9.4 instanceOf 1 4.10 logical expr 3
        4.12 EVAL 4 
        4.13 Other 5 statements
    Chapter 5, but SKIP
        “For of” with MAP, “async for/await”,p 110
        5.4.5 for /in 2
        5.5, but do read 5.5.4  about "return", and note the existence of "break" and "continue"; 8
        5.6, but read 5.6.3 “strict mode“. 2
        5.7.3, 5.7.4: 1 5.8  :1

## Lecture 2 - JavaScript Functions and Objects

Reading guide:

These chapters introduce the basics of objects, arrays, and functions JS. Objects are basic building blocks in JS; they can serve as 'structs', but may also contain user defined data what operates on the contained data. In contrast to C, arrays in JS are dynamic and flexible, and a rich set of notations for creating them, and operations on them is offered. Functions plays a crucial role in JS and in web-programming. We will need to be able to define functions, and define functions that uses functions as parameters (and produces them as return values): PAY PARTICULAR ATTENTION TO FUNCTIONS!
[DF] Chapters 6,7,8 (14+11+ 16 pages = 41 pages): SKIP the sections mentioned below

Chapter 6 (Objects), skip sections
        6.4 deleting properties
        6.5 testing props 1
        6.10 Litt syntax, gett/setters 7
    Chapter 7 (Arrays): skip sections
        7.1.2 spread op: 1 
        7.3 Sparse arrays 1
        7.7 multi-dim: 1
        7.8 Array metoder; read 7.8.1, skim the rest and use as reference and to lookup when needed (8) 
        7.9 Array-like 2
    Chapter 8 (Functions Important!): Skip sections 
        8.3 (pp 5) , but read 8.3.1-8.3.2
        8.5 namespaces 1
        8.6 closures 6
        8.7 func props 4
        8.8 Higherorder functions, but read 8.8.1: 5

## Lecture 3 - Web-sites med HTML5, Forms, HTTP basics

## Lecture 4 - Exercise session on JS+HTML

https://www.moodle.aau.dk/mod/page/view.php?id=1695534

## Lecture 5 - Client-side scripting: DOM, Events, fetch (basic use)

Reading material from [DF]

The chapters mainly concerns how JavaScript is handled at the client (browser) side and some important client-side programming interfaces. However, remember, it is not the intention that you memorize every single function and event mentioned here. But it is important that you get the idea of registering event handler functions, the idea of representing HTML as a tree of objects, and that JavaScript can change this (and by implication the page shown to the user).

11.6 JSON  (skip 11.6.1) 1 page

11.9 URL, 3 pages

11.10 Timers, 1 page

15.1   Client side programming (pp. 409-426)  = 17 pages

15.1.4, skip on first read-through

15.1.7 skip on first read-through

p 433 (about 3rd optional argument) skip on first read-through (not critical).

15.2.  Events: (pp. 427-437) = 10

15.3  DOM (pp 438-452) = 14

15.4  CSS Scripting 15.4.1-15.4.2 (453-455) = 3 pages

15.11 (fetch warm-up) 518-520: 3 pages

## Lecture 6 - Asynkronitet, Promises, Fetch

### throw

An *exception* is a signal that indicates that some sort of exceptional condition or error has occurred. To *throw* an exception is to signal such an error or exceptional condition. To *catch* an exception is to handle it—to take whatever actions are necessary or appropriate to recover from the exception. In JavaScript, exceptions are thrown whenever a runtime error occurs and whenever the program explicitly throws one using the throw statement. Exceptions are caught with the *try/catch/finally* statement, which is described in the next section.
The throw statement has the following syntax:
``throw expression;``
*expression* may evaluate to a value of any type. You might throw a number that represents an error code or a string that contains a human-readable error message. The Error class and its subclasses are used when the JavaScript interpreter itself throws an error, and you can use them as well. An Error object has a `name` property that specifies the type of error and a `message` property that holds the string passed to the constructor function. Here is an example function that throws an Error object when invokedwith an invalid argument:

```js
function factorial(x) {
// If the input argument is invalid, throw an exception!
if (x < 0) throw new Error("x must not be negative");
// Otherwise, compute a value and return normally
let f;
for(f = 1; x > 1; f *= x, x--) /* empty */ ;
return f;
}
factorial(4)
// => 24
```

When an exception is thrown, the JavaScript interpreter immediately stops normal program execution and jumps to the nearest exception handler. Exception handlers are written using the `catch` clause of the `try/catch/finally` statement, which is described in the next section. If the block of code in which the exception was thrown does not have an associated `catch` clause, the interpreter checks the next-highest enclosing block of code to see if it has an exception handler associated with it. This continues until a handler is found. If an exception is thrown in a function that does not contain a `try/catch/finally` statement to handle it, the exception propagates up to the code that invoked the function. In this way, exceptions propagate up through the lexical structure of JavaScript methods and up the call stack. If no exception handler is ever found, the exception is treated as an error and is reported to the user.

### try/catch/finally

The `try/catch/finally` statement is JavaScript’s exception handling mechanism. The `try` clause of this statement simply defines the block of code whose exceptions are to be handled. The `try` block is followed by a `catch` clause, which is a block of statements that are invoked when an exception occurs anywhere within the `try` block. The `catch` clause is followed by a finally block containing cleanup code that is guaranteed to be executed, regardless of what happens in the `try` block. Both the `catch` and `finally` blocks are optional, but a `try` block must be accompanied by at least one of these blocks. The `try`, `catch`, and `finally` blocks all begin and end with curly braces. These braces are a required part of the syntax and cannot be omitted, even if a clause contains only a single statement.
The following code illustrates the syntax and purpose of the `try/catch/finally` statement:

```js
try {
// Normally, this code runs from the top of the block to the bottom
// without problems. But it can sometimes throw an exception,
// either directly, with a throw statement, or indirectly, by calling
// a method that throws an exception.
}
catch(e) {
// The statements in this block are executed if, and only if, the try
// block throws an exception. These statements can use the local variable
// e to refer to the Error object or other value that was thrown.
// This block may handle the exception somehow, may ignore the
// exception by doing nothing, or may rethrow the exception with throw.
|
finally {
// This block contains statements that are always executed, regardless of
// what happens in the try block. They are executed whether the try
// block terminates:
// 1) normally, after reaching the bottom of the block
// 2) because of a break, continue, or return statement
// 3) with an exception that is handled by a catch clause above
// 4) with an uncaught exception that is still propagating
}
```

Note that the catch keyword is generally followed by an identifier in parentheses. This identifier is like a function parameter. When an exception is caught, the value associated with the exception (an Error object, for example) is assigned to this parameter. The identifier associated with a catch clause has block scope—it is only defined within the catch block.
Here is a realistic example of the try/catch statement. It uses the factorial() method defined in the previous section and the client-side JavaScript methods prompt() and alert() for input and output:

Reading material:
[DF] Exceptions: Sections 5.5.6, 5.5.7  (pages 117-120) =  4 pages

[DF] Promises: Chapter 13 (13.1- 13.4.1),  pp 341-371 = 30 pages

[DF] Fetch: Chapter 15.11.1 (pages 518-528)= 11 pages

## Lecture 7 - Server side programming with Node.JS (HTTP module, routing, decoding URL&Forms,sessions, cookies)

[DF] From section 15.11.1, more details on POST fetch requests (pages 521-525: 4 pages)

[DF] Client-side storage, focus on cookies, sections 15.12-15.12.2 (pages 536-543: 7 pages)

[DF] Chapter 16, sections 16-16.5.0 (pages 577-592: 15 pages), 16.7-16.8 (602-617: 15 pages)

## Lecture 8 - Web-services and Web-APIs (in Node.js)

Server-initiated communication (SSE and Websockets):

[DF] Sections 15.11.2 and 15.11.3 (pages 529-535: 8 pages)

https://materialplus.srijan.net/resources/blog/manual-api-testing-using-postman (5 pages)

https://support.smartbear.com/swaggerhub/docs/en/get-started/basics-of-swaggerhub.html (7 pages)

https://www.secc.org.eg/RECOCAPE/Documents/SECC_Tutorials_A%20Quick%20Introduction%20to%20SOA.pdf Service Oriented Applications: up to (excluding) section 4.2 (17 pages)

##  Lecture 9 - Introduction to networks and the Internet protocol stack

[KR] Chapter 1.1 - 1.6
        Intensively: 1.3.1, 1.4, 1.5
        The rest is to be read extensively
            Possibly skip the section on "home access networks" 1.2.1 and 1.2.2 physical media. Pages  p42-51.

## Lecture 10 - The application layer protocols

Readings

KR Chapter 2: Chapter introduction + Sections 2.1, 2.2, 2.4, 2.5

Read the following sections intensively: 2.1.4, 2.1.5, 2.2, 2.4, 2.5 (excl bit-torrent, which is extensive). 
    Parts of  chapter 2.2 (HTTP) should be recognizable from earlier lectures, but this section provides a network perspective to the protocol, and less "programming" perspective

## Lecture 11 - The transport layer protocols and reliable communication

[KR Chapter 3:] Sections 3.0-3.4 + 3.5.6

Section 3.4.3  and 3.4.4 er specially important

## Lecture 12 - TCP and Using the transport layer in programs: Sockets programming

##  Lecture 13 - Network security, TLS, HTTPS