import java.util.Scanner;

class Varian {
    private double jum,tot,num,ex,nmin,sum,hasil;
    void varian() {
        Scanner put = new Scanner(System.in);
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
}
