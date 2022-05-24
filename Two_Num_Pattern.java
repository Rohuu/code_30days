package code_30days;

import java.util.Scanner;

public class Two_Num_Pattern {
    public static void main(String[] args) {
            System.out.println("enter array");
            int[] arr=new int[5];
            Scanner sc=new Scanner(System.in);
            for(int i=0;i<5;i++)
            {
                arr[i]=sc.nextInt();
            }
            sum(arr);
        }
        static void sum(int[] arr)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter a no whose breakup numbers u want");
            int num=sc.nextInt();
            for(int i=0;i<5;i++)
            {
                for(int j=i+1;j<5;j++)
                {
                    if(arr[i]+arr[j]==num)
                    {
                        System.out.println(+num+" is the sum of numbers present at array index "+i+" and "+j);
                        return;
                    }
                }
            }
            System.out.println("no such pattern found");
        }
    }
