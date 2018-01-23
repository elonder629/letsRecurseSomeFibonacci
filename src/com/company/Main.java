package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
public static ArrayList<Integer> fibo = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter to check if a number is a fibonacci number");
        int temp = input.nextInt();
        fibo.add(0);
        fibo.add(1);
        System.out.println(fibonacciChecker(temp) + "\n" + fibo);

    }

    public static boolean fibonacciChecker(int num){
        fibo.add(fibo.get(fibo.size()-1)+fibo.get(fibo.size()-2));
        if (fibo.get(fibo.size()-1) > num)
            return false;
        else if (fibo.contains(num))
            return true;
        else
            return fibonacciChecker(num);
    }
}
