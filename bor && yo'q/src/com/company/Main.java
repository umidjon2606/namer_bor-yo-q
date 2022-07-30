package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("soni kriting : " );
        int n = scanner.nextInt(); ;
        int[] ar = {6, 25, 91, 23, 72, 9, 18, 65, 1, 91, 1, 59, 1, 45, 178};

        String f ;
        f = "yo'q";
        for (int i = 0; i < 15; i++) {
            if (ar[i] == n) {

                f = "bor";
                break;

            }}
        System.out.println(f);

    }
}
