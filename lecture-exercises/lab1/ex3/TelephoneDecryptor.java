package ex3;

import java.util.Scanner;

public class TelephoneDecryptor
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter four-digit number: ");
        String userInput = input.nextLine();
        int number = Integer.parseInt(userInput);

        if (isNotFourDigitNumber(userInput))
        {
            System.err.println("Entered number is not five digits!");
        } else {
            System.out.println("Entered number is five digits!");

            int fourthDigit = number % 10;
            number /= 10;
            int thirdDigit = number % 10;
            number /= 10;
            int secondDigit = number % 10;
            number /= 10;
            int firstDigit = number % 10;

            firstDigit = (firstDigit + 3) % 10;
            secondDigit = (secondDigit + 3) % 10;
            thirdDigit = (thirdDigit + 3) % 10;
            fourthDigit = (fourthDigit + 3) % 10;

            int temp = firstDigit;
            firstDigit = thirdDigit;
            thirdDigit = temp;

            temp = secondDigit;
            secondDigit = fourthDigit;
            fourthDigit = temp;

            System.out.printf("Decrypted number: %d%d%d%d", firstDigit, secondDigit, thirdDigit, fourthDigit);
        }
    }

    private static boolean isNotFourDigitNumber(String number) {
        return (number.startsWith("-") && number.length() != 5)
                || (!number.startsWith("-") && number.length() != 4);
    }
}
