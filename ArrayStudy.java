public class ArrayStudy{

    static void print(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
         }
         System.out.println();
    }

    public static void main(String[] args) {
        // 1. Array Creation Expression 
        int size = 5;
        int arr[]= new int[5];
        // int arr[] , int[] arr, int []arr -> all are same
        // int arr[] -> array declaration
        // arr = new int[size] -> creation of an object
         System.out.println(arr[0]);
         System.out.println(arr[1]);
         System.out.println(arr[2]);
         System.out.println(arr[3]);
         System.out.println(arr[4]);

        print(arr);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }

        print(arr);
         
        // 2. Array Initializiers list 
        int arr2[]=  {1,2,3};
        print(arr2);

        // if we want to increase the size of an array
        int copyArr[] = new int[2*size]; //create an array of double size
        for (int i = 0; i < size; i++) { // copy all elements from old to new array
            copyArr[i] = arr[i];
        }
        copyArr[5] = 6;
        copyArr[6] = 7;
        print(copyArr);
    }
}