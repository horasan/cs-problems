package com.horasan.cs_dojo.searching;

import java.util.Objects;

import com.horasan.cs_dojo.trees.BinarySearchTree;
import com.horasan.cs_dojo.trees.Node;

public class BinarySearch {
	/*

		BinarySearchTree tr = new BinarySearchTree();
		tr.insert(9);
		tr.insert(4);
		tr.insert(6);
		tr.insert(20);
		tr.insert(99);
		tr.insert(15);
		tr.insert(1);
		tr.insert(5);
		tr.insert(8);
		tr.insert(10);
		
		BinarySearch bs = new BinarySearch();
		bs.findTheNode(tr.root, 8);
	 */
	public boolean findTheNodeRecursive(Node startingNode, int searchValue) {
		// O(log n)
		System.out.println(startingNode.value);
		if (startingNode.value == searchValue) {
			return true;
		}
		else if (startingNode.value > searchValue) {
			startingNode = startingNode.left;
		}
		else {
			startingNode = startingNode.right;
		}
		findTheNodeRecursive(startingNode, searchValue);
		return false;
	}
	
	public boolean findTheNodeLoop(Node startingNode, int searchValue) {
		// O(log n)
		
		while (!Objects.isNull(startingNode)) {
			System.out.println(startingNode.value);
			if (startingNode.value == searchValue) {
				return true;
			}
			else if (startingNode.value > searchValue) {
				startingNode = startingNode.left;
			}
			else {
				startingNode = startingNode.right;
			}
		}
		
		return false;
	}

}
