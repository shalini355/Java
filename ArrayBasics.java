public class ArrayBasics {
    public static void main(String[]args){
    // array declaration
    int[] arr = new int[5];
    // initialization
    arr[0]=10;arr[1]=20;arr[2]=30;arr[3]=40;arr[4]=50;
    //Traversal (print all elements)
    for(int i = 0; i<arr.length ; i++)
    System.out.println("Index "+i +" Value is "+ arr[i]);
    }
}
