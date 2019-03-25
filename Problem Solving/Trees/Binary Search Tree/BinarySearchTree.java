import java.util.*;

class Node{
  int value;
  Node leftChild;
  Node rightChild;

  Node(int value){
    this.value = value;
  }
}

public class BinarySearchTree{

  public Node root;

  public void addNode(int value){
    Node newNode = new Node(value);

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

  public int getSize(Node root){
    if(root == null)  return 0;
    else{
      int leftSize = getSize(root.leftChild);
      int rightSize = getSize(root.rightChild);
      return leftSize + rightSize + 1;
    }
  }

  public int getHeight(Node root){
    if(root == null)  return 0;
    else{
      int leftHeight = getHeight(root.leftChild);
      int rightHeight = getHeight(root.rightChild);

      return Math.max(leftHeight,rightHeight) + 1;
    }
  }
  public Node Search(Node root,int searchKey){
    if(root == null){
      return null;
    }
    if(root.value == searchKey) return root;
    else if(root.value < searchKey) return Search(root.rightChild,searchKey);
    else return Search(root.leftChild,searchKey);
  }

  public void preOrder(Node root){
    if(root != null){
      System.out.print(root.value+" ");
      preOrder(root.leftChild);
      preOrder(root.rightChild);
    }
  }

  public void inOrder(Node root){
    if(root != null){
      inOrder(root.leftChild);
      System.out.print(root.value+" ");
      inOrder(root.rightChild);
    }
  }

  public void postOrder(Node root){
    if(root != null){
      postOrder(root.leftChild);
      postOrder(root.rightChild);
      System.out.print(root.value+" ");
    }
  }

  public static void main(String ar[]){}
}
