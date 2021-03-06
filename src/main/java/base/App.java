/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Douglas Glover
 */
package base;
import java.util.Scanner;
/*
Comparing one input to a known value is common enough, but you’ll often need to process a collection of inputs.

Write a program that asks for three numbers. Check first to see that all numbers are different. If they’re not different, then exit the program.
Otherwise, display the largest number of the three.

Example Output

Enter the first number: 1
Enter the second number: 51
Enter the third number: 2
The largest number is 51.

Constraint

Write the algorithm manually. Don’t use a built-in function for finding the largest number in a list.

Challenges

Modify the program so that all entered values are tracked and the user is prevented from entering a number that’s already been entered.
Modify the program so that it asks for ten numbers instead of three.
Modify the program so that it asks for an unlimited number of numbers.
 */
public class App {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        App myApp = new App();
        int[] values = new int[3];
        values[0] = myApp.getFirst();
        values[1] = myApp.getSecond();
        values[2] = myApp.getThird();
        myApp.findLargest(values);
    }
    int getFirst()
    {
        System.out.print("Enter the first number: ");
        return in.nextInt();
    }
    int getSecond()
    {
        System.out.print("Enter the second number: ");
        return in.nextInt();
    }
    int getThird()
    {
        System.out.print("Enter the third number: ");
        return in.nextInt();
    }
    void findLargest(int[] values)
    {
        int largest = 0;
        for (int i = 0; i < 3; i++)
        {
            if (largest < values[i])
                largest = values[i];
        }
        System.out.print("The largest number is " + largest + ".");
    }
}
