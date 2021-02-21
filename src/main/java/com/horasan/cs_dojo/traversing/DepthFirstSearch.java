package com.horasan.cs_dojo.traversing;

import java.util.ArrayList;
import java.util.List;

import com.horasan.cs_dojo.trees.Node;

public class DepthFirstSearch {
	
	List<Integer> visitedNodes = null;
	
	public void preOrderTraverse(Node startingNode) {
		// parent first, left child, right child
		visitedNodes = new ArrayList<Integer>();
		preOrder(startingNode);
	}
	
	private void preOrder(Node startingNode) {
		visitedNodes.add(startingNode.value);
		if (startingNode.left != null) {
			preOrder(startingNode.left);
		}
		if (startingNode.right != null) {
			preOrder(startingNode.right);
		}
	}
	
	public void inOrderTraverse(Node startingNode) {
		// left child first, parent, right child
		visitedNodes = new ArrayList<Integer>();
		inOrder(startingNode);
	}
	
	private void inOrder(Node startingNode) {
		
		if (startingNode.left != null) {
			inOrder(startingNode.left);
		}
		
		visitedNodes.add(startingNode.value);
		
		if (startingNode.right != null) {
			inOrder(startingNode.right);
		}
		
	}
	public void postOrderTraverse(Node startingNode) {
		// left child, right child, parent
		visitedNodes = new ArrayList<Integer>();
		postOrder(startingNode);
	}
	private void postOrder(Node startingNode) {
		if (startingNode.left != null) {
			postOrder(startingNode.left);
		}
		
		if (startingNode.right != null) {
			postOrder(startingNode.right);
		}
		visitedNodes.add(startingNode.value);
	}
}
