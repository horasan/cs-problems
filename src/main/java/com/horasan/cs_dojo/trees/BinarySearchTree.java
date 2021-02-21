package com.horasan.cs_dojo.trees;

import java.util.ArrayList;
import java.util.Objects;

public class BinarySearchTree {
	public Node root;

	public BinarySearchTree() {
		this.root = null;
	}

	public String print() {
		if (Objects.isNull(this.root)) {
			return "()";
		} else {
			return this.root.print();
		}
	}

	public Node remove(int removeValue) {
		return null;
	}
	
	public Node insert(Integer value) {
		if (Objects.isNull(this.root)) {
			this.root = new Node(value);
			return this.root;
		}
		// root is not null
		Node currentNode = this.root;
		while (true) {
			if (currentNode.value > value) {
				if (currentNode.left == null) {
					currentNode.left = new Node(value);
					return currentNode.left;
				} else {
					currentNode = currentNode.left;
				}
			} else { // bigger or same

				if (currentNode.right == null) {
					currentNode.right = new Node(value);
					return currentNode.right;
				} else {
					currentNode = currentNode.right;
				}
			}
		}
	}

	public Node lookUp(int searchValue) {
		
		if (Objects.isNull(this.root)) {
			return null;
		}

		Node currentNode = this.root;
		
		while (true) {
			
			if (currentNode.value == searchValue) {
				return currentNode;
			} // searchValue is bigger than the current node. Continue on the left side.
			else if (currentNode.value > searchValue) {
				if (currentNode.left == null) {
					return null;
				} else {
					currentNode = currentNode.left;
				}
			} else { // searchValue is bigger than the current node. Continue on the right side.
				if (currentNode.right == null) {
					return null;
				} else {
					currentNode = currentNode.right;
				}
			}
		}
		
	}
	
	public ArrayList<Node> traversePath(int searchValue) {
		ArrayList<Node> traversedNodes = new ArrayList<>();
		if (Objects.isNull(this.root)) {
			return null;
		}

		Node currentNode = this.root;
		while (true) {
			traversedNodes.add(currentNode);
			if (currentNode.value == searchValue) {
				break;
			} // searchValue is bigger than the current node. Continue on the left side.
			else if (currentNode.value > searchValue) {
				if (currentNode.left == null) {
					//return null;
					break;
				} else {
					currentNode = currentNode.left;
				}
			} else { // searchValue is bigger than the current node. Continue on the right side.
				if (currentNode.right == null) {
					//return null;
					break;
				} else {
					currentNode = currentNode.right;
				}
			}
		}
		return traversedNodes;
	}

}
