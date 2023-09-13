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
Human jack = new Human();
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
Human john = null;
// The following statement throws a NullPointerException because john is null and you
// cannot use any operation on a null reference variable
String name = john.name;
```