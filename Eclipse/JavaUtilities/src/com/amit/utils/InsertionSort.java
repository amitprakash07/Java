/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amit.utils;
import java.util.Scanner;

/**
 *
 * @author Amit
 */
public class InsertionSort{
    public static void sort(int [] i_inputList)
    {
        for(int i=1 , j; i < i_inputList.length;i++)
        {
            int temp = i_inputList[i];
            for(j =i; j>0 && temp < i_inputList[j-1];j--)
                i_inputList[j] = i_inputList[j-1];
            
            i_inputList[j] = temp;
        }
    }
    
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length of array");
        int length = s.nextInt();
        int [] a = new int[length];
        for(int i = 0;i<length;i++)
        {
            System.out.println("Enter velue of array[" + i + "] = ");
            a[i] = s.nextInt();
        }
        
        for(int temp:a)
            System.out.println(temp);
        sort(a);
        System.out.println("After sorting");
        for(int temp:a)
            System.out.println(temp);
        
        s.close();
    }
}
