package avani;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int magicNumber = (int)(Math.random()*100);
        Scanner sc = new Scanner(System.in);
        int num;
        do
        {
            System.out.println("Please enter a number between 1 and 100guess  and we will try to guess it !!!");
             num = sc.nextInt();
            if (num == magicNumber) {
                System.out.println("You guessed it right");
                break;
            } else if (num < magicNumber) {
                System.out.println("Your guess is less than the magic number");
            } else if (num > magicNumber) {
                System.out.println("Your guess is greater than magic number");
            } else {
                System.out.println("Please guess a number between 1 and 100");
            }
        } while(num >= 0);

    }
}