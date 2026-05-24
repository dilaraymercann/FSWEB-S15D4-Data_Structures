package org.example;


import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }

    public static boolean checkForPalindrome(String input) {
        String cleaned = input.toLowerCase(java.util.Locale.ENGLISH)
                .replaceAll("[^a-z0-9]", "");

        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static String convertDecimalToBinary(int decimal) {
        if (decimal == 0) return "0";

        Stack<Integer> stack = new Stack<>();

        while (decimal > 0) {
            int remainder = decimal % 2;
            stack.push(remainder);
            decimal = decimal / 2;
        }

        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }

        return binary.toString();
    }

}