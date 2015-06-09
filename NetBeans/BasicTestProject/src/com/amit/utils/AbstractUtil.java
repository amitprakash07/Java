/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amit.utils;

/**
 *
 * @author Amit
 */
public class AbstractUtil {
    public static void displayList(int [] i_list)
    {
        for(int i =0; i< i_list.length; i++)
        {
            System.out.println("List[" + i +"] = " + i_list[i]);
        }
    }
    
    public static void swap(int a, int b)
    {
        int temp = b;
        b = a;
        a = temp;
    }
}
