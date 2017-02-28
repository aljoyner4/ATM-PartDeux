package com.theironyard.novauc;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    // write your code here


    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        HashMap<String, Double> names = new HashMap<>();
        names.put("Alice", 2738.00);
        names.put("Bob", 11624.00);
        names.put("Charlie", 4286.00);
        names.put("David", 7613.00);
        names.put("Earl", 3113.33);
        names.put("Felicia", 1261.14);

        System.out.println("What is your name?");

        String currentUser = scanner.nextLine();
        while (true) {

            if (names.containsKey(currentUser)) {
            System.out.println("would you like to check a balance,make a withdrawl,cancel, or remove account?");
            String makeSelection = scanner.nextLine();
            if(makeSelection.equalsIgnoreCase("checking a balance" )){
                double currentuserBalence= names.get(currentUser);
                System.out.println(" your current balance is     " + currentuserBalence);
            }
            if(makeSelection.equalsIgnoreCase("make a withdrawl")){
                System.out.println("How much would you like to withdraw");
                        double withdrawlAmount = scanner.nextDouble();
                        double currentuserBalence= names.get(currentUser);
                        double newBalence = currentuserBalence - withdrawlAmount;
                        names.put(currentUser,newBalence);
            }
            if(makeSelection.equalsIgnoreCase( "cancel")){

                System.exit(0);
            }
            if (makeSelection.equalsIgnoreCase("remove account")) {
                names.remove(currentUser);
            }
        } else {

            System.out.println("would you like to open an account?");
            String y = scanner.nextLine();
            if (y.equalsIgnoreCase("yes")) {
                System.out.println("your new account is...please include signature to complete transaction");
            } else {
                System.out.println("Thank you, and have a good day!");
            }
        }

            // let user say yes or no
            // write some code that makes a decision
            // if they said yes
            //write code to add new account
            // if they say noS
            // write code that says thanks hava a good day
        }
    }
}










                //
//                String[] names = new String[6];
//                names [0]= "Andrea";
//                names [1]= "Bob";
//                names [2]="Charlie";
//                names [3]="David";
//                names [4]="Earl";
//                names [5]="Felicia";
//
//                for (String name : names) {
//                    System.out.println(name);
//                }
//
// stem.out.println("would you like to check a balance, make a withdrawl or cancel?");
//                String prompt = scanner.nextLine();
//                if (prompt.equalsIgnoreCase("check a balance")) {
//                    System.out.println("your balance is " + balance);
//                }
//                else if (prompt.equalsIgnoreCase("cancel")) {
//                    System.out.println("thank you and come again ");
//                }
//                else {
//                    System.out.println("How much would like to withdraw?");
//                    String withdrawl = scanner.nextLine();
//                    int withdrawAmount = Integer.valueOf(withdrawl);
//                    if (balance< withdrawAmount){
//                        throw new Exception("balence exceeds amount available");
//                    }
//                    else {
//                        balance = balance - withdrawAmount;
//
//                        int
//
//
//
//
//
//
//
//
//                        System.out.println("please take your cash");
//                        System.out.println("your new balence is " + balance);
//                    }
//                }








