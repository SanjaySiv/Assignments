package com.assignments;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter word to check palindrome");
        String str=ob.nextLine();
        String rev="";
        int len=str.length();
        for(int i=len-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        if(rev.equals(str)){
            System.out.println(str+" is a palindrome");
        }
        else{
            System.out.println(str+" is not a palindrome");
        }
    }
}
