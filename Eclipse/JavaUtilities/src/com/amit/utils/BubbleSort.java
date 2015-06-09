/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amit.utils;
import java.util.Random;

/**
 *
 * @author Amit
 */
public class BubbleSort {
    public static void bubbleSort(int [] i_list)
    {
        for(int i=0;i< i_list.length; i++)
        {
            for(int j= i_list.length -1 ; j > i; j--)
            {
                if(i_list[j] < i_list[j-1])
                {
                    int temp = i_list[j-1];
                    i_list[j-1] = i_list[j];
                    i_list[j] = temp;
                }
            }
        }
    }
    
    public static void main(String [] args)
    {
        int [] a = new int[10];//{1,3,2,4,0, -90};
        Random r = new Random();
        for(int i=0;i<10;i++)
        {
            a[i] = r.nextInt();
        }
        AbstractUtil.displayList(a);
        bubbleSort(a);
        AbstractUtil.displayList(a);
    }
}
