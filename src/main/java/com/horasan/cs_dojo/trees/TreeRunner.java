package com.horasan.cs_dojo.trees;

import java.util.ArrayList;
import java.util.Objects;

public class TreeRunner {

	public static void main(String[] args) {
		
		BinarySearchTree tr = createSampleTree();
		System.out.println(tr.print());
		
		int searchValue = 10;
		
		Node foundNode = tr.lookUp(searchValue); 
		if (!Objects.isNull(foundNode)) {
			System.out.println("Found: " + foundNode.value);
		}
		else {
			System.out.println("Not found!");
		}
		
		ArrayList<Node> nodePath = tr.traversePath(searchValue);
		String traversedNodes = "";

		for (Node n: nodePath) {
			traversedNodes = traversedNodes.concat(n.value + "-");
		}
		System.out.println("Traversed nodes:" + traversedNodes);
		
	}

	private static BinarySearchTree createSampleTree() {
		// https://visualgo.net/en/bst
		BinarySearchTree tr = new BinarySearchTree();
		tr.insert(9);
		tr.insert(4);
		tr.insert(6);
		tr.insert(20);
		tr.insert(170);
		tr.insert(15);
		tr.insert(1);
		tr.insert(5);
		tr.insert(8);
		tr.insert(10);
		return tr;
	}
	
	

}
