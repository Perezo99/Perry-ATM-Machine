package com.perry;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AtmOperationInterface op = new AtmOp();
        int atmNo = 2023;
        int atmP =  2013;

        Scanner in = new Scanner(System.in);
        System.out.println("Welcome To Perry ATM Machine");
        System.out.println("Enter Atm Number : ");
        int atmNumber = in.nextInt();
        System.out.println("Enter Pin: ");
        int pin = in.nextInt();

        //validation
        if ((atmNo == atmNumber) && (atmP == pin)){
            while (true){

                System.out.println("1. View Available Balance\n2. Withdraw Amount\n3. Deposit Cash\n4. View Mini Statement\n5. Exit");
                System.out.println("Enter Choice : ");
                int ch = in.nextInt();

                if (ch == 1){
                     op.viewBalance();
                } else if (ch == 2){
                    System.out.println("Enter Amount To Withdraw");
                    double withdrawAmount = in.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                } else if (ch == 3){
                    System.out.println("Enter Amount To Deposit: ");
                    double depositAmount = in.nextDouble();
                    op.depositCash(depositAmount);
                } else if (ch == 4){

                } else if (ch == 5){
                    System.out.println("Collect your ATM card\n Thank you for using perry ATM machine.");
                    System.exit(0);
                } else {
                    System.out.println("Please pick a number between 1 - 5");
                }
            }

        } else {
            System.out.println("Incorrect atm number or pin");
            System.exit(0);
        }
    }
}