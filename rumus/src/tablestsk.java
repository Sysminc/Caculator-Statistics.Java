import java.util.*;

public class tablestsk {
    public void stsk() {
        Scanner in = new Scanner(System.in);
        int n = 0, sum1 = 0 ,sum2 = 0;
        try{
            System.out.println();
            System.out.print("Masukan banyak data : ");
            n = in.nextInt();
            System.out.println("-------------------------------------------");

            int arr [][] = new int[n][2];
            for (int i = 0; i < n; i++) {
                System.out.print("Masukan data-" + (i+1) + " : ");
                arr[i][0] = in.nextInt();
                System.out.println();
                System.out.print("Masukan ferkuensi-" + (i+1) + " : ");
                arr[i][1] = in.nextInt();
                System.out.println();
            }
            System.out.println("-------------------------------------------");

            Arrays.sort(arr, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o1[0] - o2[0];
                }
            });
            
            for (int i = 0; i < n; i++) {
                sum1 = arr[0][0];
                sum2 = arr[i][0];
            }

            double rentang = (sum2 - sum1);
            System.out.println("Rentang : " + sum2 + " - " + sum1 + " = " + rentang);
            double koma = 1 + 3.3 + Math.log(sum2);
            int jum = (int) koma;
            System.out.println("Banyak Kelas : 1 + 3.3 log(" + sum2 + ") = " + jum);
            double panjang = rentang / jum; 
            int pbulat = (int) panjang;
            System.out.println("Menentukan Panjang Kelas : " + rentang + " / " + jum + " = " + pbulat);
            System.out.println("-------------------------------------------");

            double datasum = 0;
            double fersum = 0;
            System.out.println("NO\tDATA\tFERKUENSI"); 
            for (int i = 0; i < n; i++) {
                System.out.println((i+1) + "\t" + arr[i][0] + "\t" + arr[i][1]);
                datasum = datasum + arr[i][0];
                fersum = fersum + arr[i][1];
            }
            System.out.println("-------------------------------------------");
            System.out.println("Total DATA : " + datasum);
            System.out.println("Total Ferkuensi : " + fersum);
            System.out.println("-------------------------------------------");
        }
        catch (Exception e) {
            System.out.println("Erorr!! : " + e.getMessage());
        }
    }
}
