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
public class BST {
	
	public BST()
	{
		data = 0xFFFF;
		left = null;
		right = null;
			
	}
	
	public void add(int i_node_data)
	{
		if(!rootCreated)
		{
			data = i_node_data;
			rootCreated = true;
		}
		else
		{
			//boolean inserted = false;
			BST traverseToNode = this;
			BST insertingNode = new BST();
			insertingNode.data = i_node_data;
			//child childOrder = child.nothing;
			BST previous = this;
			
			while(traverseToNode != null)
			{
				previous = traverseToNode;
				if(i_node_data < traverseToNode.data)
					traverseToNode = traverseToNode.left;
				else
					traverseToNode = traverseToNode.right;
			}
			
			if(i_node_data < previous.data)
				previous.left = insertingNode;
			else
				previous.right = insertingNode;
			
		}
	}	
	
	
	private int data;
	private BST left;
	private BST right;
	private boolean rootCreated = false;
		
}

