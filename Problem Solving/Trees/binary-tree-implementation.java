import java.util.*;

class Node{
    int value;
    String name;

    Node leftChild;
    Node rightChild;

    Node(int value, String name){
      this.value = value;
      this.name = name;
    }

    public String toString(){
      return name+" has a value "+ value;
    }
}

class BinaryTree{

  Node root;

  public void addNode(int value,String name){
    Node newNode = new Node(value,name);

    if(root == null){
      root = newNode;
    }
    else{
      Node focusNode = root;
      Node parent;
      while(true){
        parent = focusNode;
        if(value < focusNode.value){
          focusNode = focusNode.leftChild;

          if(focusNode == null){
            parent.leftChild = newNode;
            return;
          }
        }
        else{
          focusNode = focusNode.rightChild;

          if(focusNode == null){
            parent.rightChild = newNode;
            return;
          }
        }
      }
    }
  }

  static void preOrder(Node root){
    if(root != null){
      System.out.println(root.toString());
      preOrder(root.leftChild);
      preOrder(root.rightChild);
    }
  }

  static void inOrder(Node root){
    if(root != null){
      inOrder(root.leftChild);
      System.out.println(root.toString());
      inOrder(root.rightChild);
    }
  }

  public static void main(String ar[]){
    BinaryTree tree = new BinaryTree();
    tree.addNode(10,"A");
    tree.addNode(5,"B");
    tree.addNode(2,"C");
    tree.addNode(3,"D");
    tree.addNode(6,"E");
    tree.addNode(8,"F");

    System.out.println("PreOrder Traversal: ");
    preOrder(tree.root);

    System.out.println("\nInOrder Traversal: ");
    inOrder(tree.root);
  }


}
