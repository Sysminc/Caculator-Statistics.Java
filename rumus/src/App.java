import java.util.*;
import Syspack.*;

public class App {
    public static void main(String[] args)  {
        Scanner put = new Scanner(System.in);
        Syspack.tablestsk run = new Syspack.tablestsk();
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
                    pecahan();
                    break;
                }
                case 2 :{
                    rerata();
                    break;
                }
                case 3 : {
                    median();
                    break;
                }
                case 4 : {
                    mean();
                    break;
                }
                case 5 : {
                    sbaku();
                    break;
                }
                case 6 : {
                    varian();
                    break;
                }
                case 7 : {
                    swekneess();
                    break;
                }
                case 8 : {
                    kurtosis();
                    break;
                }
                case 9 : {
                    run.stsk();
                    break;
                }
                case 10 : { 
                    System.exit(4);
                    System.out.println("Selesai"); 
                }
                break;
            }
            System.out.println();
        } while((x != 0) || (x > 10));
        put.close();
    }

    static void pecahan() {
        double y, z;
        double  x = 0.5;
        Scanner put = new Scanner(System.in);

        System.out.print("[*] Masukan nilai depan : ");
        y = put.nextDouble();
        System.out.print("[*] Masukan nilai belakang : ");
        z = put.nextDouble();
        double sum = x * (y + z);
        System.out.println("Maka pecahannya adalah : "+sum);
    }

    static void rerata() {
        double a,b;
        Scanner put = new Scanner(System.in);

        System.out.print("[*] Masukan nilai a : ");
        a = put.nextDouble();
        System.out.print("[*] Masukan nilai b : ");
        b = put.nextDouble();

        double sum = a / b;
        System.out.println();
        System.out.println("Rata rata-nya adalah : "+sum);
    } 

    static void median() {
        Scanner put = new Scanner(System.in);
        double n,r;

        System.out.print("[*] Masukan N dari jumlah ferkuensi : ");
        n = put.nextDouble();
        r = (1 + n) / 2;
        System.out.println("Maka mediannya adalah : "+r);
    }

    static void mean() {
        Scanner put = new Scanner(System.in);
        double n1, n2, mean;
    
        System.out.print("[*] Masukan nilai 1 : ");
        n1 = put.nextInt();
        System.out.print("[*} Masukan nilai 2 : ");
        n2 = put.nextInt();
        mean = n1 / n2 ;
    
        System.out.println("Hasilnya adalah : " + mean);
        }

    static void sbaku() {
        Scanner put = new Scanner(System.in);
        double n1, n2, sbaku;
    
        System.out.print("[*] Masukan nilai 1 : ");
        n1 = put.nextInt();
        System.out.print("[*] Masukan nilai 2 : ");
        n2 = put.nextInt();
        sbaku = n1 / n2 ;
    
        System.out.println("Hasilnya adalah : " + sbaku);
    }

    static void varian() {
        Scanner put = new Scanner(System.in);
        double jum,tot,num,ex,nmin,sum,hasil;


        System.out.print("[*] Masukan Jumlah : ");
        jum = put.nextDouble();
        System.out.print("[*] Masukan Total : ");
        tot = put.nextDouble();
        System.out.print("[*] Masukan num : ");
        num = put.nextDouble();

        ex = Math.pow(tot, 2) / num;
        nmin = num - 1;
        hasil = jum - ex;
        sum = hasil / nmin;

        System.out.println("Pangkatnya adalah : " + ex);
        System.out.println("Hasilnya adalah : " + hasil);
        System.out.println("Variannya adalah : " + sum);
        System.out.println("Akarnya : " + Math.sqrt(sum));
    }

    static void swekneess() {
        Scanner put = new Scanner(System.in);
        double jum,vari,num,ex,sum;


        System.out.print("[*] Masukan Jumlah : ");
        jum = put.nextDouble();
        System.out.print("[*] Masukan Varian : ");
        vari = put.nextDouble();
        System.out.print("[*] Masukan num : ");
        num = put.nextDouble();

        ex = Math.pow(vari, 3) *  num;
        sum = jum / ex;

        System.out.println("Pangkatnya adalah : " + ex);
        System.out.println("Hasilnya adalah : " + sum);
    }

    static void kurtosis() {
        Scanner put = new Scanner(System.in);
        double jum,vari,num,ex,sum;


        System.out.print("[*] Masukan Jumlah : ");
        jum = put.nextDouble();
        System.out.print("[*] Masukan Varian : ");
        vari = put.nextDouble();
        System.out.print("[*] Masukan num : ");
        num = put.nextDouble();

        ex = Math.pow(vari, 4) *  num;
        sum = jum / ex;

        System.out.println("Pangkatnya adalah : " + ex);
        System.out.println("Hasilnya adalah : " + sum);
    }
}