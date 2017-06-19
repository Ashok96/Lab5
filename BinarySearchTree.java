package lab5;

public class BinarySearchTree {

    private class Node {
	// The value stored in this tree node.
	private int value;

	// The left child of this node. Can be null if there is none.
	private Node leftChild;

	// The right child of this node. Can be null if there is none.
	private Node rightChild;

	// Create a node with given value and no children.
	private Node(int value) {
	    this.value = value;
	    this.leftChild = null;
	    this.rightChild = null;
	}

	private int getValue() {
	    return this.value;
	}

	private void setValue(int value) {
	    this.value = value;
	}

	private Node getLeftChild() {
	    return this.leftChild;
	}

	private Node getRightChild() {
	    return this.rightChild;
	}

	private void setLeftChild(Node child) {
	    this.leftChild = child;
	}

	private void setRightChild(Node child) {
	    this.rightChild = child;
	}

	private void insertNode(Node node) {
	    if (node.value < this.value) {
		// Node value is less than this, so insert
		// the node in the left subtree.
		if (this.leftChild == null) {
		    // No left child, so make node left child.
		    this.leftChild = node;
		} else {
		    // Recurse into left subtree.
		    this.leftChild.insertNode(node);
		}
	    } else if (node.value > this.value) {
		// Node value is greater than this, so insert
		// the node in the right subtree.
		if (this.rightChild == null) {
		    // No right child, so make node right child.
		    this.rightChild = node;
		} else {
		    // Recurse into right subtree.
		    this.rightChild.insertNode(node);
		}
	    }
	}
    }

    private Node root;

    // Constructor for an empty tree.
    public BinarySearchTree() {
	this.root = null;
    }

    // Inserts the given value in this tree.
    // Inserting a value more than once is treated as a no-op.
    public void insert(int value) {
	Node newNode = new Node(value);
	if (this.root == null) {
	    // BinarySearchTree empty, so set the new node as root node.
	    this.root = newNode;
	} else {
	    this.root.insertNode(newNode);
	}

    }


    // Checks if this BinarySearchTree contains the given value.
    // Returns true iff the value is present in this BinarySearchTree.
    public boolean find(int value) {
    	Node temp =root;
    	while(temp!=null) {
    		if (value<this.root.value){
    			temp = this.root.leftChild;
    			    			


    		}
    		else if (value>this.root.value){
    			temp=this.root.rightChild;

    		}

    		else if(value ==this.root.value){
    			return true;
    		
    	}
    		}

    return false;
    }

    // Returns the number of entries in this BinarySearchTree that are
    // less than value.
//    public int numLessThan(int value) {
	// TODO: You should implement numLessThan() here.
	// Note that you will likely want to implement a helper
	// method in the Node class above.
    	/*int counter = 0; 
    	Node current = root;
    	if (value < root.value){
    		while(current!=null){
    			current=this.root.leftChild;
    			if (current.value <value){
    				counter++;
    			}
    		}
    	}

    	else if(value > this.root.value){

    	public	int inorder(Node ){
    		while(node!=null){

			Arraylist<int> my_arr= new Arraylist<int>();
			inorder(node.leftChild){
			my_arr.add(this.node.value);
			inorder(node.rightChild);
			
			
		}
			
				return my_arr1;
			}
			for (int i:my_arr){
				if (i<value){
					counter++;
				}
			return counter;
			}
	
    	}

    		
    	

    	}
    	
	return 0;*/
}

    // Delete the given value in this tree if present
    // Returns true if the item was present and deleted.
//     public Node delete(int value) {
// // TODO: Implement delete here.
//     	if(root==null){
//     		return root;
//     	}
//     	if(value <this.root.value){
//     		return delete(root.leftChild.value);
//     	}
//     	else if(value >this.root.value){
//     		return delete(root.rightChild.value);
//     	}
//     	else{
//     		Node minTemp = root;
//     		if(this.root.leftChild !=null && this.root.rightChild!=null){
//     			root.value=this.minRightTree(root);
//     			minTemp.value = this.root.value;
//     			return delete(this.root.value);
//     		}
//     		if(this.root.leftChild==null){
//     				return this.root.rightChild;
//     		}
//     		if(this.root.rightChild==null){
//     			return this.root.leftChild;
//     		}
//     	}
// // }

// public int minRightTree(Node minTemp){
// 	if(root.leftChild==null){
// 		return this.root.leftChild.value;
// 	}
// 	else{
// 		minRightTree(root.leftChild);
// 	}
//  }
}
