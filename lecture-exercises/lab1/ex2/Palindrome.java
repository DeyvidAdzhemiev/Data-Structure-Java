package ex2;

import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args)
    {
        int number;
        Scanner input = new Scanner(System.in);

        System.out.print("Write a five digit number: ");
        number = input.nextInt();

        if(number > 9999 && number <= 99999)
        {
            int originalNumber = number;
            int digit5 = number % 10;
            number = number / 10;
            int digit4 = number % 10;
            number = number / 100;
            int digit2 = number % 10;
            int digit1 = number /10;
            System.out.printf("Digits: first: %d, second: %d, fourth: %d, fifth: %d\n ", digit1, digit2, digit4, digit5);

            if(digit1 == digit5 && digit2 == digit4)
            {
                System.out.printf("Original number %d is a palindrome!", originalNumber);
            }
            else
            {
                System.out.printf("Original number %d is not a palindrome!", originalNumber);
            }
        }
        else
        {
            System.out.print("The number is not five digit! ");
        }
    }
}
