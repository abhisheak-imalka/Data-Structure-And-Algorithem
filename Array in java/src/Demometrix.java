public class Demometrix {
    public static void printmetrix(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            if (m[i] == null) {
                System.out.println("(null)");
            } else {
                for (int j = 0; j < m[i].length; j++) {
                    System.out.print(m[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }

    public static void searchindex(int[][] n, int p) {
        int k;
        for (k = 0; k < n.length; k++) {
            for (int j = 0; j < n[k].length; j++) {
                if (n[k][j] == p) {
                    System.out.println("element is " + (k + 1) + "," + (j + 1));
                    break;
                }

            }
        }
        System.out.println("element not found");
    }

    public static void Addelement(int[] N, int L, int P) {
        for (int j = N.length - 1; j > L; j--) {
            N[j] = N[j - 1];
            //System.out.println(N[j]);
        }
        N[L] = P;
        //System.out.println(N[L]);
        for (int j = 0; j < 15; j++) {
            System.out.print(N[j] + " ");
        }
    }

    public static void deleteindex(int[] M, int T) {
        for (int j = M.length-1; j >= T; j--) {
            M[j] = M[j-1];

        }
        M[T]=0;
        for (int j = 0; j < 15; j++) {
            System.out.print(M[j] + " ");

        }
    }
}
