package com.perry;

import java.util.HashMap;
import java.util.Map;

public class AtmOp implements AtmOperationInterface{
    ATM atm = new ATM();
    Map<Double, String> ministatement = new HashMap<>();
    @Override
    public void viewBalance() {
        System.out.println("Available Balance is: " + atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if (withdrawAmount <= atm.getBalance()){
            ministatement.put(withdrawAmount, "Amount Withdrawn");
            System.out.println( "Take your cash "  + withdrawAmount );
            atm.setBalance(atm.getBalance() - withdrawAmount);
            viewBalance();
        } else {
            System.out.println("Insufficient funds");
        }

    }

    @Override
    public void depositCash(double depositCash) {
        ministatement.put(depositCash, "Amount Deposited");
        System.out.println(depositCash + " Deposit Successful");
        atm.setBalance(atm.getBalance() + depositCash);
        viewBalance();
    }

    @Override
    public void viewMiniStatement() {
      for (Map.Entry<Double, String> m: ministatement.entrySet()){
          System.out.println(m.getKey() + " " + m.getValue());
      }
    }
}
