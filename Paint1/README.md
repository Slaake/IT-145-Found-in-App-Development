## Overview

<p>In this assignment, you will revisit the Paint program from Module Six. Your original program calculated the amount of paint needed, but depending on the height and width, that value could be a long decimal. Your program will better suit the user’s needs if it can calculate the number of cans needed as an integer value. For example, given that one gallon equals one can of paint, you might expect the Paint program from Module Six to output:</P>

<p>Paint needed: 2.142857142857143 gallons</p>
<p>Cans needed: 3.0 cans</p>

<p>You might think you can just cast the gallonsPaintNeeded variable from a double to an integer type. However, that action would only remove the decimal portion of the value. Removing the decimal portion would make the estimated number of cans needed too low. Rounding would also result in an underestimate. The computational problem you face is calculating the number of cans and then rounding up to the nearest whole number.</p>

<p>Instead of writing the code to do this from scratch, you will search through the Java API documentation to find an existing method that can take a double and round it up to the nearest whole number. This assignment will help you become more familiar with navigating the Java API documentation. Navigating Java API documentation is a useful skill for Java programmers. With over 4,000 Java classes, being able to navigate Java documentation will make your programming efforts more efficient. These Java classes contain pre-written code that provides functionality for free. As the developer, you can reference and tap into these classes. Knowing about these classes allows you to take advantage of their abilities and save time.</P>

## Directions

<p>For this assignment, you will complete the Paint program by adding code that calculates the number of cans of paint needed to paint a wall, given its height and width.</p>

<ol>
    <li>First, select a method that appropriately handles all the included test cases by consulting the official Java documentation for the Class Math link in the Supporting Materials section.</li>
        <ul>
            <li>Scroll to the Method Summary section and review the methods and their descriptions. Look for a method that will help you round a value up to the nearest integer.</li>
            <li>If a method looks promising, click its name for a more detailed description. Pay attention to the arguments and the data type of the return value.</li>
            <li>Based on your review, select one or more methods from the class Math to use in your program.</li>
            <li>You may be thrown off when attempting to implement methods from the Java API in your class. It may be easier to understand the chosen method’s functionality if you implement the method into a new empty class</li>
        </ul>
    <li>The program should perform the following actions:</li>
        <ul>
            <li>Calculate the number of paint cans needed to paint the wall.
            <li>Round up to the nearest integer. Use the test cases to check your work.
            <li>Output the number of cans needed for the user.
        </ul>
</ol>