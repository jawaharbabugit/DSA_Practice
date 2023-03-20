
public class SelectionSort{
    public void sort(int[] inputArr){
        //pass
        for(int i=0;i<inputArr.length;i++){
            int minIndex = i;
            //selection
            for(int j= i; j<inputArr.length;j++){
                //find min
                if(inputArr[j]<inputArr[minIndex]){
                    minIndex = j;
                }
            }
            //swap
            int temp = inputArr[i];
            inputArr[i] = inputArr[minIndex];
            inputArr[minIndex] = temp;
        }
    }

    public static void main(String[] args){
        var intArr = new int[]{1,10,2,15,3};
        var bubbleSort = new SelectionSort();
        bubbleSort.sort(intArr);
        for(int i: intArr){
            System.out.print(String.format("%d,",i));
        } 
    }
}