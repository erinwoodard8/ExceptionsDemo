package com.tts;

import java.rmi.RemoteException;

public class className {

    // throws = postpones handling of a checked exception
    // a method can declare that it throws multiple exceptions
    // you would do this with a comma seperated list
    public void deposit(double amount) throws RemoteException, InsufficientFundsException
    {
    // throw = used to invoke the exception
        throw new RemoteException();
    }

}


