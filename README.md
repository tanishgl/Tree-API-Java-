# Tree-API-Java-
Tree API

/***** A tree is fundamentally composed of nodes. Hence, node class is required *****/

Node class
  Instance variable:-
    1. Key :- type int
              It stores the integer value of a node.
    2. Left :- type Node
               It references the left child of the node.
    3. Right :- type Node
                It references the right child of the node.
   *4. Special :- type boolean
                  For postorder traversal (Ignore this for now...)
                  
                  
   Constructors:-
    1. Node() :- empty constructor
    2. Node(key) :- initialize the Node's key.
   Methods:- 
    1. void setKey(key) :- set the key value of a node
    2. void setLeft(l_node) :- set left child to l_node
    3. void setRight(r_node) :- set right child to r_node
    4. void setLeft(l) :- set left child's key to l
    5. void setRight(r) :- set right child's key to r
    6. Node getLeft() :- returns left child of calling node
    7. Node getRight() :- returns right child of calling node
    8. int getKey() :- returns key of calling node
    9. void setSpecial() :- set special variable to true
    10. boolean isSpecial() :- returns true if node is special, else false.

/***** After the constituent node class, we need a tree class *****/

Tree class 
  Instance variables:-
    1. root :- type Node
               stores the root node of the tree (topmost node of the tree)
               
  Constructors:-
    1. BT() :- empty constructor. initializes root with null.
    2. BT(node) :- initializes root with n
    3. BT(Key) :- creates a root node and initialize it with key.
   Methods:- 
    1. void setRoot(key) :- initializes the root with key
    2. Node getRoot() :- returns the root node of the calling tree.
    3. void getLeftBranch(node) :- prints the leftmost branch of the tree starting from passed-in node.

/***** For main function and manipulation, we need another class *****/

BinaryTree class
  Instance variables:-
    1. st :- type Stack<Integer>
             used for traversal and other operations.
  Methods:-
    1. public static void main(String[] args)
    2. void LeftBranch(node) :- similar to getLeftBranch. It fills the stack with the leftmost branch of the tree.
    3. void preorder(node) :- prints preorder traversal
    4. void inorder(node) :- prints inorder traversal
    5. void postorder(node) :- prints postorder traversal
    
