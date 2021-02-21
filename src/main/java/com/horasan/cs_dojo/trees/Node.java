package com.horasan.cs_dojo.trees;

import java.util.Objects;

public class Node {
	public Node left;
	public Node right;
	public int value;
	
	public Node(int value) {
		this.left = null;
		this.right = null;
		this.value = value;
	}
	
	public String print() {
		String result = "";
		result = result.concat(String.valueOf(value));
		result = result.concat("(");
		if (!Objects.isNull(left)) {
			result = result.concat(left.print());
		}
		if (!Objects.isNull(right)) {
			result = result.concat(right.print());
		}
		result = result.concat(")");
		return result;
	}
}
