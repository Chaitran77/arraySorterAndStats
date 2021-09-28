package com.kiranthepro;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Scanner scanner = new Scanner(System.in);

        int numbers[] = new int[5];
        int sum = 0;
        int average = 0;
        // collect the numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Type the " + toOrdinal(i+1) + " number:");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }
        
        // calculate and present stats
        average = sum/numbers.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

//        for (int i = 0; i < 100; i++) {
//            System.out.println(toOrdinal(i));
//        }
        
        // sort the array
        Arrays.sort(numbers);

        System.out.println("Sorted: " + Arrays.toString(numbers));
    }

    public static String toOrdinal(int number) {
        String convertedNum = String.valueOf(number);
        if (number > 10 && number < 20) {
            convertedNum = String.valueOf(number) + "th";
        } else {

            switch (convertedNum.charAt(convertedNum.length()-1)) {
                case '1':
                    convertedNum = convertedNum + "st";
                    break;
                case '2':
                    convertedNum = convertedNum + "nd";
                    break;
                case '3':
                    convertedNum = convertedNum + "rd";
                    break;
                default:
                    convertedNum = convertedNum + "th";
            }
        }

        return convertedNum;
    }

}
