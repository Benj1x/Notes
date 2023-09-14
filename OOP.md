# Object-Oriented Programming

## What Is a Class?

Ask yourself a simple question, “Who am I?” Your obvious answer would be: I am a human. What do you mean by saying that you are a human? You mean that a human class exists in the world and you are one of the instances (“being”) of that class. You also understand that other humans (other instances of the human class) also exist, who are similar, but not the same, to you. Both you and your friend, being instances of the same human class, have the same properties, such as name, gender, height, weight, and behaviors, such as the ability to think, talk, walk, etc. However, the properties and behaviors differ for you and your friend in value, quality, or both. For example, both have a name and the ability to talk. However, your name may be Richard, and your friend’s name may be Greg. You may talk slowly, whereas your friend may talk fast

* You can list all properties and behaviors for you and your friend separately and examine them separately as if there was no connection between you and your friend.* You can list the properties and behaviors for you and your friend that are in common and then examine them as properties and behaviors for an entity without naming you and your friend. This model assumes that all listed properties and behaviors will be present in an entity (without naming it), though they may vary from entity to entity. You may want to list all properties and behaviors for you and your friends properties and behaviors of a class, say human, and treat you and your friend as two different instances of that human class. Essentially, you have grouped together entities (e.g., you and your friend) with similar properties and behaviors and called that group a class. Then you will treat all objects (again, you and your friend) as instances of that class.

Classes are essential, and they are basic parts of programs in object-oriented programming. They are used as templates to create objects. How do you define a class in Java? A class in Java may consist of five components:

* Fields
* Methods
* Constructors
* Static initializers
* Instance initializers

Fields and methods are also known as members of the class. Classes and interfaces can also be members of a class.

## Declaring a Class in Java

```Java
[modifiers] class <class-name> {
 // Body of the class goes here
}
```

* Modifiers are optional; they are keywords that associate special meanings to the 
class declaration. A class declaration may have zero or more modifiers.
* The keyword class is used to declare a class.
* The class-name is a user-defined name of the class, which should be a valid Java identifier.
* Each class has a body, which is specified inside a pair of braces ({}). The body of a 
class contains its different components, for example, fields, methods, etc.

The following snippet of code defines a class named Human with an empty body. Note that the Human
class does not use any modifiers:

```Java
// Human.java
class Human {
 // An empty body for now
}
```

The following snippet of code defines a public class named Human with an empty body. Note that this 
declaration uses a public modifier:

```Java
// Human.java
public class Human {
 // An empty body for now
}
```

## Declaring Fields in a Class

Fields of a class represent properties (also called attributes) of objects of that class. Suppose every object of a Human class has two properties: a name and a gender. The Human class should include declarations of two fields: one to represent the name and one to represent the gender.

```Java
[modifiers] class <class-name> {
 // A field declaration
 [modifiers] <data-type> <field-name> [= <initial-value>];
}
```

With two fields, name and gender (Where both are uninitialized), the declaration of the Human class will look as shown

```Java
// Human.java
class Human {
 String name;
 String gender;
 Static long count
}
```

## Creating Instances of a Class

The following is the general syntax to create an instance of a class:

```Java 
new <Call-to-Class-Constructor>;

//For the class "Human", it would be 
new Human();
```

When wanting to store a specific instance of the class 'Human', we would do something like this:

```Java
Human Jack;
```

This will create a variable called "Jack" of the type 'Human'. After which, we can do this:

```Java
Jack = new Human();
```

However, the way you'd probably do this 90% of the time, would be:

```Java
Human Jack = new Human();
```

## Null reference

`null`  is a valid value for ALL non-primitive types, `null` simply... nothing. An example of valid use of `null`  would be:

```Java
// Assign null to john
Human john = null; // john is not referring to any object
john = new Human(); // Now, john is referring to a valid Human object
```

`null` is of course a valid thing to use in comparisons, so we could do something like this:

```Java
if (john == null) {
 // john is referring to null. Cannot use john for anything
} else {
 // Do something with john
}
```

If you try to perform an operation on `null` it Java will throw a 'NullPointerException'. An example of this would be

```Java
Human john = null;// The following statement throws a NullPointerException because john is null and you// cannot use any operation on a null reference variableString name = john.name;
```

Trying to assign `null` to a primitive type or compare a primitive type to `null`, would give us the following errors:

```Java
// A compile-time error. A reference type value, null, cannot be assigned to
// a primitive type variable num
int num = null;

int num = 0;
// A compile-time error. Cannot compare a primitive type to a reference type
if (num == null) {
}
```

## Accessing fields of a class

When reading or writing to instances of a class, we use the dot notation. The general form of the dot notation syntax is as follows:

```
<reference-variable-name>.<instance-variable-name>
````

For example, if we want to write to the name of 'Jack' from earlier, it would look like this:

```Java
Jack.name = "Jack Parker";
```

And if we want to read from the name field, it would look like this:

```Java
String aName = jack.name;
```

You can also use the dot notation to read or write to/from static class variables, this can both be on instance like 'Jack' or directly on the class, this would look something like:

```Java
Human.count = 101;
long population = Human.count;

jack.count = 101;
long population = jack.count;
```

Both of these statements assume that jack is a reference variable of Human type and that it refers to a valid Human instance.

## Default Initialization of Fields

All fields of a class, static as well as non-static, are initialized to a default value. The default value of a field depends on its data type:* A numeric field (`byte`, `short`, `char`, `int`, `long`, `float`, and `double`) is initialized to zero.* A boolean field is initialized to `false`.* A reference-type field is initialized to `null`.

## Single-Type Import Declaration

A single-type import declaration is used to import a single type (e.g., one class) from a package. It takes the following form:

```Java
import <fully-qualified-name-of-a-type>;
```

The following import declaration imports the Human class from the com.jdojo.cls package:

```Java
import com.jdojo.cls.Human;
```

A single-type import declaration imports only one type from a package. If you want to import more than one type (e.g., three classes) from a package, you need to use a separate import declaration for each type. The following import declarations import Class11 from the pkg1 package, Class21 and Class22 from the pkg2 package, and Class33 from the pkg3 package:

```Java
import pkg1.Class11;
import pkg2.Class21;
import pkg2.Class22;
import pkg3.Class33;
```

## Import-on-Demand Declaration

Sometimes you may need to import multiple types from the same package. You need to use as many single-type import declarations as the number of types you need to import from the package. An importon-demand declaration is used to import multiple types from a package using one import declaration. The syntax for an import-on-demand declaration is

```Java
import <package-name>.*;
```

Here, the package name is followed by a dot and an asterisk (*). For example, the following import-ondemand declaration imports all types from the com.jdojo.cls package:

```Java
import com.jdojo.cls.*;
```

## Declaring records

A Record in Java is a special type of class that has immutable fields (meaning they cannot be changed), 
has multiple methods automatically generated for it by the compiler, and extends java.lang.Record. It was 
introduced in Java 14 as a preview feature and finalized in Java 16.
The Record type allows the Java compiler and runtime to make large performance improvements that 
could not be done otherwise. The main characteristics of Java Records are they are immutable—once an 
instance is created, its field values can’t be changed—and they have accessor methods that match the names 
of the fields defined in the Record’s definition.
The general syntax for declaring a Record in Java is as follows:

```Java
[modifiers] record <record-name>( <field-definitions> ) {
 // Body of the record class goes here
}
```

* modifiers are optional; they are keywords that associate special meanings to the 
Record declaration. A Record declaration may have zero or more modifiers much 
like a class declaration.
* The word record is used to declare a Record. It is not a keyword and can still be used 
as a variable name.
* The record-name is a user-defined name of the Record, which should be a valid Java 
identifier.
* Each Record has a body, which is specified inside a pair of braces ({}). The body of a 
Record can contain different components, for example, fields, methods, etc., or it can 
be empty.
* The field definitions is a comma-separated list of <data-type> <field-name>
declarations, which define the immutable fields of the Record.

For example, let’s recreate the Human class as a Record

```Java
// Human.java
package com.jdojo.cls;
public record Human (String name, String gender) {
 static long count; // Class variable
}
```

Now when creating an instance of a Human, the “name” and “gender” fields must be provided and cannot change for that instance. Unlike for a class, there is no default initialization of fields
To create a Record, you use the constructor like the following, for example:

```Java
Human bob = new Human("Bob", "male")
```

You access the values using method calls like so

```Java
String name = bob.name() //Bob
```

## Declaring Methods of a Class

The general syntax for a method declaration is of the form

```Java
[modifiers] <return-type> <method-name> (<parameters-list>) [throws-clause] {
 // Body of the method goes here
}
```

* modifiers is an optional list of modifiers for the method.
* return-type is the data type of the value returned by the method.
* method-name is the name of the method.
* parameters-list is the list of parameters that the method accepts. This is optional. 
Multiple parameters are separated by a comma. Parameters are always enclosed in 
an opening and closing parenthesis. If a method takes no parameters, an empty pair 
of parentheses is used.
* The list of parameters may optionally be followed by a throws clause that declares 
the types of exceptions that the method may throw.
* Finally, you specify the code for the method, also known as the body of the method, 
inside an opening brace and a closing brace
Note that four parts in a method declaration are mandatory: the return type, method name, a pair of opening and closing parentheses, and a pair of opening and closing braces.

The following is an example of a method:

```Java
int add(int n1, int n2) {
 int sum = n1 + n2;
 return sum;
}
```

The method’s name is add. It takes two parameters. Both parameters are of type int. The parameters are named `n1` and `n2`. The method returns an int value, which is indicated in its return type. The body of the method computes the sum of two parameters and returns the sum

A method has a signature, which uniquely identifies the method in a particular context. The signature of a method is the combination of the following four parts:

* Name of the method
* Number of parameters
* Types of parameters
* Order of parameters
Modifiers, return types, parameter names, and the throws clause are not part of the signature of a method. The following table lists some examples of method declarations and their signatures.

| Method Declaration             	| Method signature 	|
|--------------------------------	|------------------	|
| int add(int n1, int n2)        	|   add(int, int)  	|
| int add(int n3, int n4)        	|   add(int, int)  	|
| public int add(int n1, int n2) 	|   add(int, int)  	|
| public int add(int n1, int n2) 	|   add(int, int)  	|
| void process(int n)            	|   process(int)   	|
| double add(int n1, double d1)  	| add(int, double) 	|
| double add(double d1, int n1)  	| add(double, int) 	|

## Access Levels for Class Members

One of the following four access 
level modifiers can be used for a class member:

* public
* private
* protected
* Default or package-level access

**TL:DR; in the table below:** <br>
Three out of the four types of access levels for a class member are specified using one of the three keywords: `public`, `private`, or `protected`. The fourth type is called the `default access level` (or `package-level access`), and it is specified by using no access modifiers. That is, the absence of any of the three access level modifiers, `public`, `private`, or `protected`, specifies package-level access. <br>
If a class member is declared as public using the `public` keyword, it can be **accessed from anywhere, provided the class itself is accessible**.<br>
If a class member is declared as private using the `private` keyword, it can be **accessed only within the body of the declaring class** and nowhere else.<br>
If a class member is declared as protected using the `protected` keyword, it can be **accessed from the same package or from descendants of the class**, even if the descendants are in a different package. We discuss the protected access level in detail in Chapter 20.<br>
**If you do not use any access level modifier for a class member, it has package-level access. A class member with a package-level access can be accessed from the same package.**
| Access Level for Class Member 	|               Accessibility               	|
|-------------------------------	|:-----------------------------------------:	|
| private                       	|         Only within the same class        	|
| package-level                 	|            In the same package            	|
| protected                     	| Same package or descendant in any package 	|
| public                        	|                 Everywhere                	|

# Constructors

Unlike a method, a constructor does not have a return type. You cannot even specify void as a return type for a constructor. You can however still use `return` inside the constructor, to exit it earlier. Consider the following declaration of a class Test2:

```Java
public class Test2 {
 // Below is a method, not a constructor.
 public void Test2() {
 // Code goes here
 }
}
```

This however, is a constructor:

```Java
// Cat.java
package com.jdojo.cls;
public class Cat {
 public Cat() {
 System.out.println("Meow...");
 }
}
```

The purpose of a constructor is to initialize the instance variables of the newly created object. 
Inside a constructor, you should restrict yourself only to writing code that initializes instance variables of the object. An object is not fully created when a constructor is called. The object is still in the process of creation.