package com.horasan.cs_dojo.traversing;

import java.util.List;

import com.horasan.cs_dojo.trees.BinarySearchTree;

public class TraverseRunner {

public static void main(String[] args) {
		
		BinarySearchTree tr = createSampleTree();
		
		BreadthFirstSearch BFS = new BreadthFirstSearch();
		BFS.traverseTree(tr.root);
		System.out.println("BreadthFirstSearch");
		BFS.visitedNodes.stream().forEach(System.out::println);
		
		DepthFirstSearch FDS = new DepthFirstSearch();
		System.out.println("DepthFirstSearch");
		System.out.println("preOrder");
		FDS.preOrderTraverse(tr.root);
		FDS.visitedNodes.stream().forEach(System.out::println);
		
		System.out.println("inOrder");
		FDS.inOrderTraverse(tr.root);
		FDS.visitedNodes.stream().forEach(System.out::println);
		
		System.out.println("postOrder");
		FDS.postOrderTraverse(tr.root);
		FDS.visitedNodes.stream().forEach(System.out::println);
		
	}

	private static BinarySearchTree createSampleTree() {
		// https://visualgo.net/en/bst
		BinarySearchTree tr = new BinarySearchTree();
		tr.insert(9);
		tr.insert(4);
		tr.insert(6);
		tr.insert(20);
		tr.insert(99);
		tr.insert(15);
		tr.insert(1);
		return tr;
	}
	
}
