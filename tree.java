#save Trees
import java.util.*;

class Node{
	
	private int key;
	private Node left;
	private Node right;
	public boolean special; //for post-order traversal

	public Node(){
		
		this.key = -1;
		this.left = null;
		this.right = null;
	
	}

	public Node(int key){
		
		this.key = key;
		this.left = null;
		this.right = null;
	
	}

	public void setKey(int key){
			
		this.key = key;
	
	}

	public void setLeft(Node l){
		
		this.left = l;
	
	}

	public void setRight(Node r){
		
		this.right = r;

	}

	public void setLeft(int l){
	
		this.left = new Node(l);

	}

	public void setRight(int r){
			
		this.right = new Node(r);

	}

	public Node getLeft(){
		return this.left;
	}

	public Node getRight(){
		return this.right;
	}

	public int getKey(){
		return this.key;
	}

	public void setSpecial(){
		this.special = true;
	}

	public boolean isSpecial(){
		return this.special;
	}

}

class BT{

	private Node root;

	public BT(){
	
		this.root = null;

	}

	public BT(Node n){
			
		this.root = n;

	}

	public BT(int key){
			
		this.root = new Node(key);

	}

	public void setRoot(Node n){
			
		this.root = n;
	
	}

	public void setRoot(int key){
	
		this.root = new Node(key);

	}

	public Node getRoot(){
	
		return this.root;
  
  }
  
  public void getLeftBranch(Node n){
		
		Stack<Integer> st = new Stack<>();

		while(n!=null){
			
			st.push(n.getKey());
			System.out.println(st.peek());
			n = n.getLeft();

		}
    
	}
  
}

class BinaryTree{

	public static Stack<Node> st = new Stack<>(); //for manipulation, such as traversals, etc.

	public static void main(String[] args){
	
		BT tree = new BT(1);
		Node a = tree.getRoot();
		a.setLeft(2);
		a.setRight(3);
		Node b = a.getLeft();
		b.setLeft(4);
		Node c = b.getLeft();
		c.setRight(5);
		Node d = c.getRight();
		d.setLeft(6);
		d.setRight(7);
		Node e = a.getRight();
		e.setRight(9);
		e.getRight().setLeft(10);
		b.setRight(8);
    
    //Traversals...
    System.out.println("INordering...");
		LeftBranch(a);
		inorder(a);
		System.out.println();
		System.out.println("PREordering...");
		preorder(a);
		System.out.println();
		System.out.println("Postordering...");
		postorder(a);

	}
  
  public static void LeftBranch(Node n){
		while(n!=null){
			
			st.push(n);
			n = n.getLeft();
		}
	}
  
  public static void inorder(Node n){
		
		Node x = st.pop();
		System.out.print(x.getKey() + " ");
		if(x.getRight()!=null){
			LeftBranch(x.getRight());
			preorder(x.getRight());
		}
		
		if(!st.empty()) preorder(st.peek());
	}
  
  public static void preorder(Node n){
    
    System.out.print(n.getKey() + " ");
    if(n.getRight()!=null){
      st.push(n.getRight());
    } 
    
    if(n.getLeft()!=null){
      preorder(n.getLeft());
    } else {
      if(!st.empty()) 
        preorder(st.pop());
    }
    
  }
  
  public static void postorder(Node n){
    
    while(n!=null){
      n.special = false;
      st.push(n);
      if(n.getRight()!=null){
        n.setSpecial();
        st.push(n);
      }
      n = n.getLeft();
    }
    
    while(!st.empty()){
      
       Node x = st.pop();
      
       if(x.isSpecial()){
         postorder(x);
       } else {
         System.out.println(x.getKey());
       }
    }
    
  }
  
  //closing the class
}
    
  
  
