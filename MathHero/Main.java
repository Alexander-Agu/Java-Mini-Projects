import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        ArrayList<String> operations = new ArrayList<String>(4);
        operations.add("+");
        operations.add("-");
        operations.add("*");
        operations.add("/");


        int points = 0;
        for (int x = 0; x <= 10; x++) {

            // 2 random numbers that will be used with a  random selected operation
            int firstNum = (int) (Math.random() * 100);
            int secondNum = (int) (Math.random() * 100);


            // choose operstion randomly
            int chooseOp = (int) (Math.random() * 4); // 0 -> 3
            String chosenOperation = operations.get(chooseOp);


            if (chosenOperation.equals("+")) {
                System.out.println("What is -> " + firstNum + " + " + secondNum + ": ");
                int sum = firstNum + secondNum;
                int answer = input.nextInt();

                if (sum == answer) {
                    System.out.println("You are correct");
                    points++;
                } else {
                    System.out.println("you are Wrong");
                }
            }
            if (chosenOperation.equals("-")) {
                System.out.println("What is -> " + firstNum + " - " + secondNum + ": ");
                int sum = firstNum - secondNum;
                int answer = input.nextInt();

                if (sum == answer) {
                    System.out.println("You are correct");
                    points++;
                } else {
                    System.out.println("You are wrong");
                }
            }
            if (chosenOperation.equals("*")) {
                System.out.println("What is -> " + firstNum + " * " + secondNum + ": ");
                int sum = firstNum * secondNum;
                int answer = input.nextInt();

                if (sum == answer) {
                    System.out.println("You are correct");
                    points++;
                } else {
                    System.out.println("You are Wrong");
                }
            }
            if (chosenOperation.equals("-")) {
                System.out.println("What is -> " + firstNum + " / " + secondNum + ": ");
                int sum = firstNum / secondNum;
                int answer = input.nextInt();

                if (sum == answer) {
                    System.out.println("You are correct");
                    points++;
                } else {
                    System.out.println("You are Wrong");
                }
            }
        }

        if (points >= 5){
            System.out.println("You Win!!!");
            System.out.println("You scored " + points + " points!");
        } else {
            System.out.println("You Lost!!!!!!");
            System.out.println("You scored " + points + " points!");
        }
    }
}
