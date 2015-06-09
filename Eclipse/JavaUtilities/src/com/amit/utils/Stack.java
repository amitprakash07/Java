package com.amit.utils;

public class Stack <T> {
	
	public Stack()
	{
		array = (T[]) new Object[20];
		stackPointerIndex = -1;
	}
	
	public void push(T i_data)
	{
		array[++stackPointerIndex] = i_data;
	}
	
	public T pop()
	{
		if(stackPointerIndex > -1)
			return ((T) array[stackPointerIndex--]);
		else return null;			
	}
	
	public void reserve(int size)
	{
		if(size>20)
		{
			T[] temp = (T[]) new Object[stackPointerIndex];
			temp = array;
			array = (T[]) new Object[size+10];
			for(int i=0;i< stackPointerIndex+1; i++)
				array[i] = temp[i];
		}
	}
	
	private T [] array;
	private int  stackPointerIndex;
}


