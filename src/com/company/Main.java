package com.company;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here


        Scanner sc = new Scanner(System.in);
        boolean ask = true;
        while (ask) {
            System.out.println("Would you like to use the calculator?");

            String userAnswer = sc.nextLine();
            if (userAnswer.equals("Yes")); {


                        ask = true;
            String[] questions = {

                    "Please enter the first number: ",
                    "Please enter the operator you want to use(+, -, *, /): ",
                    "Please enter the second number: ",
            };

            List<String> answers = new ArrayList<>();

            for (int i = 0; i < questions.length; i++) {
                System.out.println(questions[i]);
                String userEntry = sc.nextLine();
                answers.add(userEntry);

            }
            String firstNum = answers.get(0);
            int fstNumber = Integer.parseInt(firstNum);

            String secondNum = answers.get(2);
            int scndNumber = Integer.parseInt(secondNum);

            String operator = answers.get(1);

            if (operator.equals("+")) {
                System.out.println("Your Answer is " + (fstNumber + scndNumber));
            } else if (operator.equals("-")) {
                System.out.println("Your Answer is " + (fstNumber - scndNumber));
            } else if (operator.equals("*")) {
                System.out.println("Your Answer is " + (fstNumber * scndNumber));
            } else if (operator.equals("/")) {
                System.out.println("Your Answer is " + (fstNumber / scndNumber));
            } else


                    ask = false;

                        System.out.println("Thank you for using the HR Salary Calculator");

                    }


        }
    }
}