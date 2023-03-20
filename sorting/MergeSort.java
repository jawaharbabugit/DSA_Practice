
public class MergeSort{
    public void sort(int[] inputArr){
        divide(inputArr);
    }

    private void divide(int[] arr){
        if(arr.length > 1){
            int midpoint = arr.length/2;
            var left = new int[midpoint];
            var right = new int[arr.length - midpoint];
            for(int i=0;i<midpoint;i++) left[i]=arr[i];
            for(int i=midpoint;i<arr.length;i++) right[i-midpoint]=arr[i];
            divide(left);
            divide(right);
            merge(arr,left,right);
        }
    }

    private void merge(int[] arr, int[] left, int[] right){
        int l=0, r=0,i=0;
        while(l<left.length&&r<right.length){
            if(left[l]<right[r]) arr[i++] = left[l++];
            else arr[i++] = right[r++];
        }
        while(l<left.length) arr[i++] = left[l++];
        while(r<right.length) arr[i++] = right[r++];
    }


    public static void main(String[] args){
        var intArr = new int[]{8,2,10,4,17};
        var bubbleSort = new MergeSort();
        bubbleSort.sort(intArr);
        for(int i: intArr){
            System.out.print(String.format("%d,",i));
        } 
    }
}