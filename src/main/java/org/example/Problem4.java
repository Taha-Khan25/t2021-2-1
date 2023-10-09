package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class Problem4 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int n=scanner.nextInt();

        int[] arr=new int[n];

        System.out.println("Enter the elements");
        for(int k=0;k<n;k++)
        {
            arr[k]= scanner.nextInt();
        }

        HashMap<Integer,Integer> dict=new HashMap<>();

        for(int i=1;i<=9;i++)
        {
            dict.put(i,0);
        }

        for(int i=0;i<arr.length;i++)
        {
            int val=arr[i];
            for(int j=1;j<=9;j++)
            {
                if(val%j==0)
                {
                    dict.put(j,dict.get(j)+1);
                }
            }
        }
        System.out.println("Output:");
        System.out.println(dict);
        scanner.close();
    }
}
