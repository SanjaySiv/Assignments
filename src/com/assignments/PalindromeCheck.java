package com.assignments;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);

        System.out.println("Enter word to check palindrome : ");
        String str=ob.nextLine();
        str=str.toLowerCase();
        /*String rev="";    //using string
        int len=str.length();
        for(int i=len-1;i>=0;i--){
            rev+=str.charAt(i);
        }*/
        StringBuilder str1=new StringBuilder(str.toLowerCase());  //using StringBuilder
        str1.reverse();
        String rev=str1.toString();

        if(rev.equals(str)){
            System.out.println(str+" is a palindrome");
        }
        else{
            System.out.println(str+" is not a palindrome");
        }
    }
}
