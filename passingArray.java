public class passingArray {
    static void addOne(int x){
        x =  x+1;
    }

    static void addOne(int atrr[]){
        for (int i = 0; i < atrr.length; i++) {
            atrr[i]++;
        }
    }
    public static void main(String[] args) {
        int x =10;
        addOne(x);
        System.out.println(x);

        int arr[]= {1,2,3,4,5};
        addOne(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
}
