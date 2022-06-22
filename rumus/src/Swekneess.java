import java.util.Scanner;

class Swekneess {
    private double jum,vari,num,ex,sum;
    void swekneess() {
        Scanner put = new Scanner(System.in);
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
        put.close();
    }
}
