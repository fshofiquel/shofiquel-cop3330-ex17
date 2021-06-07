package base;/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Fazlur Shofiquel
 */

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        int A;
        int W;
        int r;
        double r_m = 0.73;
        double r_w = 0.66;
        int H;
        double BAC = 0;

        Scanner aIn = new Scanner(System.in);
        Scanner wIn = new Scanner(System.in);
        Scanner rIn = new Scanner(System.in);
        Scanner hIn = new Scanner(System.in);

        System.out.print("Enter a 1 is you are male or a 2 if you are female: ");
        r = rIn.nextInt();
        System.out.print("How many ounces of alcohol did you have? ");
        A = aIn.nextInt();
        System.out.print("What is your weight, in pounds? ");
        W = wIn.nextInt();
        System.out.print("How many hours has it been since your last drink? ");
        H = hIn.nextInt();


        if (r == 1) BAC = (A * 5.14 / W * 0.73) - 0.015 * H;
        else if (r == 2) BAC = (A * 5.14 / W * 0.66) - 0.015 * H;
        else System.out.print("INVALID INPUT FOR GENDER");

        if (BAC < .08) System.out.printf("Your BAC is %f\n" + "It is legal for you to drive.", BAC);
        else System.out.printf("Your BAC is %f\n" + "It is not legal for you to drive.", BAC);
    }
}
