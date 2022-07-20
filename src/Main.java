public class Main {
    public static void main(String[] args) {
        //задание 1
        int [] a = new int[] {1, 2, 3};
        double [] b = {1.57, 7.654, 9.986};
        int [] c = new int [5];
        //задание 2
        for (int k = 0; k < a.length; k++) {
            if (k < a.length-1) {
                System.out.print(a[k] + ",");
            } else
                System.out.print(a[k]);
        }
        System.out.println();
        for (int l = 0; l < b.length; l++) {
            if (l < b.length-1) {
                System.out.print(b[l] + ",");
            } else
                System.out.print(b[l]);
        }
        System.out.println( );
        for (int m = 0; m < c.length; m++) {
            if (m < c.length-1) {
                System.out.print(c[m] + ",");
            } else
                System.out.print(c[m]);
        }
        System.out.println( );
        //задание 3
        for (int n = a.length-1; n >= 0; n--) {
            if (n > 0) {
                System.out.print(a[n] + ",");
            } else
                System.out.print(a[n]);
        }
        System.out.println();
        for (int o = b.length-1; o >= 0; o--) {
            if (o > 0) {
                System.out.print(b[o] + ",");
            } else
                System.out.print(b[o]);
        }
        System.out.println();
        for (int p = c.length-1; p >= 0; p--) {
            if (p > 0) {
                System.out.print(c[p] + ",");
            } else
                System.out.print(c[p]);
        }
        System.out.println();
        //задание 4
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                a[i]++;
            }
            if (i < a.length-1) {
                System.out.print(a[i] + ",");
            } else
                System.out.print(a[i]);
        }
    }
}