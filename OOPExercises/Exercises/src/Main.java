public class Main {
    public static void main(String[] args)
    {
        //1 exercise
        /*Consider the following two variable declarations:
         byte small = 10;
         int big = 99;
         How will you assign the value in the big variable to the small variable?*/
        byte small = 10;
        int big = 99;

        small = (byte)big;

        System.out.println(small);


        //2 Exercise
        /*Can you cast a boolean value to an int type, as shown in the following
        statement?
        boolean done = true;
        int x = (int) done;

        What happens when you compile this snippet of code?*/
        //boolean done = true;
        //int x = (int) done; // nothing, cause it can't compile (can't cast bool to int)
        //You could however do this:
        //int x = done ? 1 : 0; //where as always 1 is true, and 0 is false

        /*3 Exercise
        //Are the boolean literals true and false the same as integers 1 and 0?
        //No (java sucks i guess?)


        /*4 Exercise
        /*Consider the following snippet of code:
        int x = 23;
        x = x++ % x;
        What will be the value of x after this snippet of code is executed? Explain your
        answer with steps performed explaining how the value of x changes during the
        execution of the second statement*/

        //int x = 23;
        //x = x++ % x; //x++ = 24. 23 mod 24 (since we are post incrementing x) = 1 as it is the remainder
        //System.out.println(x);

        /*5 Exercise
        Explain why the following snippet of code does not compile:
        int x = 10;
        boolean yes = (x = 20);*///In java you can't cast ints to bools (even if we could, this would be an invalid number)

        /*6 Exercise
        What will be the value assigned to the variable named yes when the following
        snippet of code is executed?
        int x = 10;
        boolean yes = (x == 20); false?*/
        //int x = 10;
        //boolean yes = (x == 20);
        //System.out.println(yes); (I was right)

        /*7 Exercise
        What will be the output when the following snippet of code is executed?
        boolean b = true;
        String str = !b +" is not " + b; //false is not true
        System.out.println(str);*/
        //boolean b = true;
        //String str = !b +" is not " + b; //I was right
        //System.out.println(str);


        /*8 Exercise
        Complete the second statement using the ternary operator (? :) and the bitwise
        AND operator (&) that will make a message "x is odd". Your code must contain
        the following tokens in any order: x, &,==, ?, :, "odd", and "even". You may use
        additional tokens as needed:
        int x = 19;
        String msg = your-code-goes-here ;
        System.out.println("x is " + msg)*/
        //int x = 19;
        //String msg = ((x % 2 == 0) ? "x ("+x+") is even" : "x ("+x+") is odd")  ;
        //System.out.println("x is " + msg);

        /*9 Exercise*/
        /*Fix the compile-time errors in the following snippet of code. Make sure the fixed
          code prints the value of y:
          int x = 10;
          int y = 20;
          if (x = 10)
            y++;
            System.out.println("y = " + y);
          else
            y--;
            System.out.println("y = " + y)*/
        /*int x = 10;
        int y = 20;
        if (x == 10)
        {
            y++;
            System.out.println("y = " + y);
        }
        else
        {
            y--;
            System.out.println("y = " + y);
        }*/

        //10 Exercise
        /*Rewrite the following snippet of code using an if-else statement. Make sure
        that the switch and if-else statements both have the same output when you
        initialize the variable x to another value. (Hint: This is a tricky question because
        there are no break statements in any case labels.)
        int x = 50;
        switch (x) {
        case 10:
        System.out.println("Ten");
        default:
        System.out.println("No-match");
        case 20:
        System.out.println("Twenty");
        }*/
        /*int x = 20; //Is there a better solution? Probably, do I care? No
        if (x == 10)
        {
            System.out.println("Ten");
            System.out.println("No-match");
            System.out.println("Twenty");
        } else if (x == 20)
        {
            System.out.println("Twenty");
        } else
        {
            System.out.println("No-match");
            System.out.println("Twenty");
        }*/

        /*11 Exercise
        The intent of the following for statement is to print integers from 1 to 10 in reverse
        order. The code does not print the numbers as intended. Identify the logical error
        and fix the code, so it prints 10, 9, 8, …1:
        for(byte b = 10; b >= 1; b++)
            System.out.println(b);*/
        //for(byte b = 10; b >= 1; b--)
        //    System.out.println(b);

        //12 Exercise
        /*Write a snippet of code using a for statement that calculates the sum of all
        integers from 1 to 10 and prints it on the standard output. The template for your
        code is as follows:
        int sum = 0;
        for(<your-code>; <your-code>; <your-code>);
        System.out.println("Sum = " + sum);*/
        int sum = 0;
        for(;sum < 10; sum++);
        System.out.println("Sum = " + sum);
    }
}