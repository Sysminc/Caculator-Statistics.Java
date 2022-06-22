import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner put = new Scanner(System.in);
        var runTabel = new tableStsk();
        var runPecahan = new Pecahan();
        var runRerata = new Rerata();
        var runMedian = new Median();
        var runMean = new Mean();
        var runSbaku = new Sbaku();
        var runVarian = new Varian();
        var runSwekneess = new Swekneess();
        var runKurtosis = new Kurtosis();

        int x;        
        do {
            System.out.println("============SYSMINC PROGRAM STATISTIK============");
            System.out.println("= 1. Hitung Pecahan                             =");
            System.out.println("= 2. Hitung Rerata                              =");
            System.out.println("= 3. Hitung Median                              =");
            System.out.println("= 4. Hitung Mean                                =");
            System.out.println("= 5. Hitung Sbaku                               =");
            System.out.println("= 6. Hitung Varian                              =");
            System.out.println("= 7. Hitung Sweekneess                          =");
            System.out.println("= 8. Hitung Kurtosis                            =");
            System.out.println("= 9. Tabel Distirbusi                           =");
            System.out.println("= 10. EXIT                                      =");
            System.out.println("=================================================");
            System.out.print("[*] Masukan pilihan anda : ");
            x = put.nextInt();
            switch (x) {
                case 1 : {
                    runPecahan.pecahan();
                    break;
                }
                case 2 :{
                    runRerata.rerata();
                    break;
                }
                case 3 : {
                    runMedian.median();
                    break;
                }
                case 4 : {
                    runMean.mean();
                    break;
                }
                case 5 : {
                    runSbaku.sbaku();
                    break;
                }
                case 6 : {
                    runVarian.varian();
                    break;
                }
                case 7 : {
                    runSwekneess.swekneess();
                    break;
                }
                case 8 : {
                    runKurtosis.kurtosis();
                    break;
                }
                case 9 : {
                    runTabel.stsk();
                    break;
                }
                case 10 : { 
                    System.out.println("Selesai"); 
                    System.exit(4);
                }
                break;
            }
            System.out.println();
        } while((x != 0) || (x > 10));
        put.close();
    }
}