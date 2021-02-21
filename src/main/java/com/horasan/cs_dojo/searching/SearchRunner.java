package com.horasan.cs_dojo.searching;

import com.horasan.cs_dojo.trees.BinarySearchTree;

public class SearchRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		bs.findTheNodeLoop(tr.root, 8);
	}

}
