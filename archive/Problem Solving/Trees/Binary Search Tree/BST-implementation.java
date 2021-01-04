import java.util.*;

class Solution{

  public static void main(String ar[]){
    Scanner scan = new Scanner(System.in);
    BinarySearchTree tree = new BinarySearchTree();
    System.out.println("Enter the number of nodes in the tree: ");
    int size = scan.nextInt();
    System.out.println("Enter Elements: ");
    for(int i=0;i<size;i++){
      tree.addNode(scan.nextInt());
    }
    System.out.println("Elements Inserted Successfully!");
    System.out.println("==================================================");
    System.out.println("General Info: ");
    System.out.println("\nSize of the Tree: "+tree.getSize(tree.root));
    System.out.println("Height of the Tree: "+tree.getHeight(tree.root));
    System.out.println("\n==================================================");
    System.out.println("Pre order traversal: ");
    tree.preOrder(tree.root);
    System.out.println("\nIn order traversal: ");
    tree.inOrder(tree.root);
    System.out.println("\nPost order traversal: ");
    tree.postOrder(tree.root);

    System.out.println("\n==================================================");

    System.out.println("Enter Search Key: ");
    int searchKey = scan.nextInt();
    Node result = tree.Search(tree.root,searchKey);
    if(result != null){
        System.out.println("Search Successsful: "+result.value);
    }
    else{
      System.out.println("Search unsuccessful!");
    }

    System.out.println("\n==================================================");
  }
}
