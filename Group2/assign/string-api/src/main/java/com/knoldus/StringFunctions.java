package com.knoldus;
import java.util.Scanner;
public class StringFunctions {
    public void reverseString() {
        System.out.println("Enter string to reverse:");

        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        String reverse = "";


        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        System.out.println("Reversed string is:");
        System.out.println(reverse);
    }

    public void getSize(){
        int i=0;
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        str=sc.nextLine();
        char ch[]=str.toCharArray();

        for(char c : ch)
        {
            i++;
        }
        System.out.println("Length of the string = "+i);
    }


    public static void main(String[] args) {
    }
}