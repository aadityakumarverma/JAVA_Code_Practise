public class HeterogeneousArray {
    public static void main(String[] args) {
        int [] num=new int[5];
        num[0]=1; // allowed
//        num[1]="Aadi"; // not allowed
        num[2]=3; // allowed
        num[3]='j'; // allowed
        num[4]=14; // allowed
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+", ");
        }
        System.out.println();
        Object[] arr=new Object[5];
        arr[0]=5;
        arr[1]="Aaditya";
        arr[2]='A';
        arr[3]=5.67;
        arr[4]=true;


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }


    }
}


/** OUTPUT=>

1, 0, 3, 106, 14,
5, Aaditya, A, 5.67, true,

*/