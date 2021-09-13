/*
    UCF COP3330 Fall 2021 Assignment 13 Solution
    Copyright 2021 Luke Faulkner
 */

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        // Variables
        String pStr, rStr, tStr, nStr;
        int principal;
        double rate, years;
        Scanner interestScanner = new Scanner(System.in);

        // Prompt
        System.out.print("Enter the principal: ");
        pStr = interestScanner.nextLine();
        int p = Integer.parseInt(pStr);

        System.out.print("Enter the rate of interest: ");
        rStr = interestScanner.nextLine();
        double r = Double.parseDouble(rStr);

        System.out.print("Enter the number of years: ");
        tStr = interestScanner.nextLine();
        int t = Integer.parseInt(tStr);

        System.out.print("Enter the number of times the interest is compounded per year: ");
        nStr = interestScanner.nextLine();
        int n = Integer.parseInt(nStr);

        // Calc
        double interest = (double)p * Math.pow((1 + ((r/100)/((double)n))), (n * t));
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.HALF_UP);

        // Output
        System.out.print(p + " invested at " + r + "% for " + t + "years compunded " + n + " times per year is $"+ df.format(interest));
    }
}
