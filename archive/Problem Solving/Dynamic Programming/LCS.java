class Solution{
    private static void displayMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void displaySubstring(int[][] matrix,char[] word1,int substrLength){
        StringBuffer result = new StringBuffer();
        int row = 0,col = 0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==substrLength){
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println(row+" "+col);
        while(true){
            if(row==1 && col==1)   break;
            if( (matrix[row - 1][col] == matrix[row][col - 1]) && (matrix[row - 1][col - 1] == matrix[row][col] - 1) ){
                result.append(word1[col]);
                row--;
                col--;
            }
            else{
                if(matrix[row - 1][col - 1] == 0) break;
                else row--;
            }
        }
        System.out.println(result.reverse().toString());
    }

    private static void displaySubsequence(int[][] matrix,char[] word1){
        StringBuffer result = new StringBuffer();
        int row = matrix.length - 1,col = matrix[matrix.length-1].length - 1;
        System.out.println(row+" "+col);
        while(true){
            if(row==1 && col==1)   break;
            if( (matrix[row - 1][col] == matrix[row][col - 1]) && (matrix[row - 1][col - 1] == matrix[row][col] - 1) ){
                result.append(word1[col]);
                row--;
                col--;
            }
            else{
                row--;
            }
        }
        System.out.println(result.reverse().toString());
    }

    private static int getLongestCommonSubstringLength(String str1,String str2){
        char[] word1 = str1.toLowerCase().toCharArray();
        char[] word2 = str2.toLowerCase().toCharArray();

        int result = 0;
        int[][] matrix = new int[word1.length + 1][word2.length + 1];
        for(int i=1;i<=word1.length;i++){
            for(int j=1;j<=word2.length;j++){
                if(word1[i-1] == word2[j-1]){
                    matrix[i][j] = 1 + matrix[i-1][j-1];
                }
                else{
                    matrix[i][j] = 0;
                }
                result = Math.max(result,matrix[i][j]);
            }
        }
        //displayMatrix(matrix);
        displaySubstring(matrix,word1,result);
        return result;
    }

    private static int getLongestCommonSubsequenceLength(String str1,String str2){
        char[] word1 = str1.toLowerCase().toCharArray();
        char[] word2 = str2.toLowerCase().toCharArray();

        int result = 0;
        int[][] matrix = new int[word1.length + 1][word2.length + 1];
        for(int i=1;i<=word1.length;i++){
            for(int j=1;j<=word2.length;j++){
                if(word1[i-1] == word2[j-1]){
                    matrix[i][j] = 1 + matrix[i-1][j-1];
                }
                else{
                    matrix[i][j] = Math.max(matrix[i-1][j],matrix[i][j-1]);
                }
                result = Math.max(result,matrix[i][j]);
            }
        }
        //displayMatrix(matrix);
        displaySubsequence(matrix,word1);
        return result;
    }

    public static void main(String ar[]){
        String str1 = "Apple";
        String str2 = "Pale";

        int lcSubseqence_Length = getLongestCommonSubsequenceLength(str1,str2);
        int lcSubstring_Length = getLongestCommonSubstringLength(str1,str2);

        System.out.println("Longest Common Subsequence: "+lcSubseqence_Length);
        System.out.println("Longest Common Substring: "+lcSubstring_Length);
    }
}