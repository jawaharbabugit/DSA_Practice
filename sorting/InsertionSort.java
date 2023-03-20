
public class InsertionSort{
    public void sort(int[] inputArr){
        //pass
        for(int i=1;i<inputArr.length;i++){
            //shifts
            for(int j=i-1;j>=0;j--){
                if(inputArr[j+1]>inputArr[j]) break;
                int temp = inputArr[j];
                inputArr[j] = inputArr[j+1];
                inputArr[j+1] = temp;
            }
        }
    }

    public static void main(String[] args){
        var intArr = new int[]{1,40,20,50,20};
        var bubbleSort = new InsertionSort();
        bubbleSort.sort(intArr);
        for(int i: intArr){
            System.out.print(String.format("%d,",i));
        } 
    }
}