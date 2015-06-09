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
public class SelectionSort {
    public static void selectionSort(int [] i_list)
    {
        for(int i=0, j;i<i_list.length;i++)
        {
            int least = i;
            for(j=i+1;j<i_list.length;j++)
            {
                if(i_list[j] < i_list[least])
                    least = j;
            }
            int temp = i_list[least];
            i_list[least] = i_list[i];
            i_list[i] = temp;
        }
    }
    
       
    public static void main(String args[])
    {
        int [] a={2,-5,9,-0,10};
        AbstractUtil.displayList(a);
        selectionSort(a);
        AbstractUtil.displayList(a);
        
    }
}
