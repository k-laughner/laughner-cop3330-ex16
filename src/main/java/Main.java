/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kaylee Laughner
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What is your age?");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();

        String output = (age>=16) ? "You are old enough to legally drive." : "You are not old enough to legally drive.";

        System.out.println(output);
    }
}