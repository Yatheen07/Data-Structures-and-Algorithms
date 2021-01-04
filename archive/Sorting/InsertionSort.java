import java.util.Arrays;

public class InsertionSort{
    private int[] inputArray;

    InsertionSort(int[] input){
        this.inputArray = input;
    }

    public void sort(){
        //InsertionSort Algorithm
        for(int i=1;i<inputArray.length;i++){
            int key = inputArray[i],j=i-1;
            while(j >= 0  && inputArray[j] < key){
                inputArray[j+1] = inputArray[j];
                j--;
            }
            inputArray[j+1]=key;
        }
    }

    public void sortDesc(){
        for(int i = 1;i<inputArray.length;i++){
            int key = inputArray[i],j=i-1;
            while(j>=0 && inputArray[j] < key){
                inputArray[j+1] = inputArray[j];
                j--;
            }
            inputArray[j+1] = key;
        }
    }
    
    public String toString(){
        return Arrays.toString(inputArray);
    }


}