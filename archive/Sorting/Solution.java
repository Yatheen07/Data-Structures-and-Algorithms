public class Solution{
    public static void main(String ar[]){
        int[] input = new int[]{8,7,6,5,4,3,2,1};
        int[] input2 = new int[]{1,2,3,4,5,6,7,8};
        InsertionSort object = new InsertionSort(input2);
        object.sortDesc();
        System.out.println(object.toString());
    }
}