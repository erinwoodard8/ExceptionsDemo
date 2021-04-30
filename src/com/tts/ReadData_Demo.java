package com.tts;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadData_Demo {
    public static void main(String args[]) {

//        You can declare more than one class in try-with-resources statement.
//        While you declare multiple classes in the try block of try-with-resources
//        statement these classes are closed in reverse order.
        try (FileReader fr = new FileReader("E://file.txt")){
            char [] a = new char[50];
            fr.read(a);   // reads the content to the array
            for(char c : a)
                System.out.print(c);   // prints the characters one by one
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
