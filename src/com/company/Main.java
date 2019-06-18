package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String text = "Hello world!";
        System.out.println(text);
        final String text1 = "Hello ";
        String text2 = " world!";
        System.out.println(text1+" "+text2);
        System.out.println(text1);
        System.out.println(" ");
        System.out.print(text1+" what's your name? ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println(text1+" "+name);


    }
}
