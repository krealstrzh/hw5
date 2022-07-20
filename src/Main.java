public class Main {
    public static void main(String[] args) {
        //задание 1
        int [] a = new int[] {1, 2, 3};
        double [] b = {1.57, 7.654, 9.986};
        int [] c = new int [5];
        //задание 2
        System.out.println(a[0] + "," + a[1] + "," + a[2]);
        System.out.println(b[0] + "," + b[1] + "," + b[2]);
        System.out.println(c[0] + "," + c[1] + "," + c[2] + "," + c[3] + "," + c[4]);
        //задание 3
        System.out.println(a[2] + "," + a[1] + "," + a[0]);
        System.out.println(b[2] + "," + b[1] + "," + b[0]);
        System.out.println(c[4] + "," + c[3] + "," + c[2] + "," + c[1] + "," + c[0]);
        //задание 4
        for (int i = 0; i < 3; i++) {
            if (a[i] % 2 != 0) {
                a[i]++;
            }
            System.out.print(a[i] + " ");
        }
    }
}