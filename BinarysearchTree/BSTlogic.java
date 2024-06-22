package BinarysearchTree;

import java.util.Currency;

public class BSTlogic {
	BSTNode root;
	public BSTNode insert(int value) {
		if(root==null) {
			root = new BSTNode(value);
			return root;
		}
		else {
			return insert(root,value);
		}
	}
	public BSTNode insert(BSTNode currentRoot,int value) {
		
		if(currentRoot == null) {
			BSTNode newNode = new BSTNode(value);
			return newNode;
		}
		if(value<=currentRoot.value) {
			System.out.println("parent :"+currentRoot.value+" Left :"+value);
			currentRoot.left = insert(currentRoot.left,value); 
		}
		else if(value > currentRoot.value) {
			System.out.println("parent :"+currentRoot.value+" Right :"+value);
			currentRoot.right = insert(currentRoot.right,value);
		}
		return currentRoot;
	}
	
	public BSTNode search(int value) {
		if(search(root, value) != null) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		return root;
	}
	
	public BSTNode search(BSTNode currentRoot ,int value) {
		
		if(currentRoot == null)  {
			return null;
		}
		if(currentRoot.value == value) {
			
			return currentRoot;
		}
		
		if(value > currentRoot.value) {
			return search(currentRoot.right,value);
		}
		else if(value < currentRoot.value) {
			return search(currentRoot.left, value);
		}
		return currentRoot;
	}
	
	public BSTNode delete(int value) {
		root= delete(root, value);
		return root;
	}
	
	private BSTNode delete(BSTNode currentRoot, int value) {
		
		if(currentRoot == null)  {
			return null;
		}
		if(value > currentRoot.value) {
			return delete(currentRoot.right,value);
		}
		else if(value < currentRoot.value) {
			return delete(currentRoot.left, value);
		}
		else {
			if(currentRoot.left==null) {
				return currentRoot.right;
			}
			else if(currentRoot.right==null) {
				return currentRoot.left;
			}
			currentRoot.value = minValue(currentRoot.right);
			
			currentRoot.right=delete(currentRoot.right,currentRoot.value);
		}
		return currentRoot;
	}
	private int minValue(BSTNode node) {
		int minValue = node.value;
	    while (node.left != null) {
	    	minValue = node.left.value;
	    	node = node.left;
	    }
	    return minValue;
	}	
}