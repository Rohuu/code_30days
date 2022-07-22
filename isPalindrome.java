package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
    String str= isPalindrome("aaaAAAaaa");
        System.out.println(str);
    }
    static String isPalindrome(String s){
        char[] ch=s.toCharArray();
        int start=0;
        int end=ch.length-1;
        char[] let=new char[ch.length];
        for(int i=0;i<ch.length;i++){
            let[i]=ch[i];
        }
        char temp;
        while(end>start){
            temp=ch[start];
            ch[start]=ch[end];
            ch[end]=temp;
            start++;
            end--;
        }

        boolean result = Arrays.equals(let, ch);
        if(result){
            return "palindrome";
        }
        return "not palindrome";
    }
}
