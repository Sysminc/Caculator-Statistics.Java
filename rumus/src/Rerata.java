import java.util.Scanner;

class Rerata {
    private double a,b;
    void rerata() {
        Scanner put = new Scanner(System.in);

        System.out.print("[*] Masukan nilai a : ");
        a = put.nextDouble();
        System.out.print("[*] Masukan nilai b : ");
        b = put.nextDouble();

        double sum = a / b;
        System.out.println();
        System.out.println("Rata rata-nya adalah : "+sum);
        put.close();
    } 
}
