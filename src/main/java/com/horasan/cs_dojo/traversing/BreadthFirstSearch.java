package com.horasan.cs_dojo.traversing;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import com.horasan.cs_dojo.trees.Node;

public class BreadthFirstSearch {

	public Queue<Node> nodesToBeVisited = new ArrayDeque<>();
	public List<Integer> visitedNodes = new ArrayList<Integer>();

	public void traverseTree(Node startingNode) {
		nodesToBeVisited.add(startingNode);
		Node currentNode = null;
		while (!nodesToBeVisited.isEmpty()) {
			currentNode = nodesToBeVisited.poll();
			visitedNodes.add(currentNode.value);
			if (currentNode.left != null) {
				nodesToBeVisited.add(currentNode.left);
			}
			if (currentNode.right != null) {
				nodesToBeVisited.add(currentNode.right);
			}
		}
	}
}
