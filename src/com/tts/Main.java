package com.tts;

public class Main {

    public static void main(String[] args) {
	CheckingAccount a = new CheckingAccount(101);

        System.out.println("Depositing $500...");
        a.deposit(500d);

        try {
            System.out.println("Withdrawing $100...");
            a.withdraw(100d);
            System.out.println("Withdrawing $600...");
            a.withdraw(600d);
        } catch (InsufficientFundsException e) {
            System.out.println("You are short $" + e.getAmount());

            //this tells me what exception is being thrown and
            //exactly where in the code it's being thrown
            e.printStackTrace();
        }
    }
}
