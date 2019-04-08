/* Sample Input
4  // nodes
5 //edges
1 2  //showing edge from node 1 to node 2
2 4  //showing edge from node 2 to node 4
3 1  //showing edge from node 3 to node 1
3 4  //showing edge from node 3 to node 4
4 2  //showing edge from node 4 to node 2
1    // Number of queries
3 4  // Testcase 1
1 3  // Testcase 2

Output:
YES
NO
*/

import java.util.*;

class TestClass {

    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner scan = new Scanner(System.in);
        int nodes = scan.nextInt();
        int edges = scan.nextInt();

        boolean[][] matrix = new boolean[nodes+1][nodes+1];

        for(int i=0;i<=nodes;i++){
            for(int j=0;j<=nodes;j++){
                if(i==0 || j==0){
                    matrix[i][j] = false;
                }
            }
        }

        for(int i=0;i<edges;i++){
            int src = scan.nextInt();
            int dest = scan.nextInt();
            matrix[src][dest] = true;
        }

        int q = scan.nextInt();

        for(int i=0;i<q;i++){
            int src = scan.nextInt();
            int dest = scan.nextInt();
            if(matrix[src][dest]){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }


    }
}
