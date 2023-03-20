
public class BubbleSort{
    public void sort(int[] inputArr){
        boolean isSorted;
        //pass
        for(int i=0; i<inputArr.length; i++){
            isSorted = true;
            //comparisons
            for(int j=0;j< inputArr.length-1-i;j++){
                //swap
                if(inputArr[j]>inputArr[j+1]){
                    int temp = inputArr[j];
                    inputArr[j] = inputArr[j+1];
                    inputArr[j+1] = temp;
                    isSorted = false;
                }
                if(isSorted) return;
            }
        }
    }

    public static void main(String[] args){
        var intArr = new int[]{8,7,6,5,3,2,1};
        var bubbleSort = new BubbleSort();
        bubbleSort.sort(intArr);
        for(int i: intArr){
            System.out.print(i);
        } 
    }
}