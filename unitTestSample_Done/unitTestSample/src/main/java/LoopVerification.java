public class LoopVerification {

    public static int[] MyFunction() {
        int[] ar = new int[2];

        int y = 1;
        int k;
        for (k = 6; k >= 3; k--)
            y = y + k;
        ar[0] = y;
        ar[1] = k;
        System.out.println("y = " + y);
        System.out.println("k = " + k);
        return ar;
    }


    public static void main(String args[]) {
        MyFunction();

    }
}
