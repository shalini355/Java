public class ArrayMax {
    public static void main(String [] args){
        int[] arr = {1,2,3,4,10,6,7,8,9};
        int max = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i]>max)
            max = arr[i];
        }
        System.out.println("Max element in array is:"+max);

    }
}
