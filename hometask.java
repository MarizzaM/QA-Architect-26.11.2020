package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String id = "33652798*";
        String full_name = "Marishka Pavlova";
        String address = "Meir Grossman 5, Be'er Sheva";
        String details = id + " " + full_name + " " + address + " I'm java programmer:)";
        System.out.println(details);
        System.out.println();

    //etgar
        Scanner str = new Scanner(System.in);
        System.out.println("Please enter your name");
        String first_name = str.nextLine();
        System.out.println("Please enter your last name");
        String last_name = str.nextLine();
        System.out.println("Hello, "+first_name+" "+last_name+"!");
    }
}
