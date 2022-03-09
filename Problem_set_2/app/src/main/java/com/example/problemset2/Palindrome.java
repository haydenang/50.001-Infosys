package com.example.problemset2;

public class Palindrome {
    public static boolean isPalindrome(char[] S) {
        //Base case: S contains 0/1 Characters
        if (S.length == (int) 0 || S.length == (int) 1) {
            return true;
        }
        //Else, Check first and last character
        else if (S[0] == S[S.length - 1]) {
            char[] newS = new char[S.length - 2];
            for (int i = 1; i < S.length - 1; i++) {
                newS[i - 1] = S[i];
            }

            return isPalindrome(newS);
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome(new char[]{'1', '2', '3', '2', '1'}));
    }
}
