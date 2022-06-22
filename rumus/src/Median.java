import java.util.Scanner;

class Median {
    private double n, r;
    void median() {
        Scanner put = new Scanner(System.in);

        System.out.print("[*] Masukan N dari jumlah ferkuensi : ");
        n = put.nextDouble();
        r = (1 + n) / 2;
        System.out.println("Maka mediannya adalah : "+r);
    }
}
