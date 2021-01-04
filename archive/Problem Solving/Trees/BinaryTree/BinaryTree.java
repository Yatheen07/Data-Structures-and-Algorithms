import java.util.*;

class Node{
  int value;
  Node leftChild;
  Node rightChild;

  Node(int value){
      this.value = value;
  }
}

public class BinaryTree{
  Node root;
  private static Stack<Integer> stack;

  public boolean rootToLeafSum(Node root,int value){
    if(root == null){
      return false;
    }

    if(root.leftChild == null && root.rightChild == null){
      if(root.value == value){
        stack.push(root.value);
        return true;
      }
    }
    if(rootToLeafSum(root.leftChild,value-root.value)){
      stack.push(root.value);
      return true;
    }
    if(rootToLeafSum(root.rightChild,value-root.value)){
      stack.push(root.value);
      return true;
    }
    return false;
  }

  public void getPath(){
    while(true){
      if(stack.isEmpty()) return;
      else{
        System.out.print(stack.pop()+"-->");
      }
    }
  }

  public static void main(String ar[]){
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(10);
        tree.root.leftChild = new Node(16);
        tree.root.rightChild = new Node(5);
        tree.root.leftChild.rightChild = new Node(-3);
        tree.root.rightChild.leftChild = new Node(6);
        tree.root.rightChild.rightChild = new Node(11);

        stack = new Stack<Integer>();

        tree.rootToLeafSum(tree.root,26);
        tree.getPath();
  }
}
