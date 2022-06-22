import java.util.Scanner;

class Pecahan {
    private double y, z, x = 0.5;
    void pecahan() {
        Scanner put = new Scanner(System.in);

        System.out.print("[*] Masukan nilai depan : ");
        y = put.nextDouble();
        System.out.print("[*] Masukan nilai belakang : ");
        z = put.nextDouble();
        double sum = x * (y + z);
        System.out.println("Maka pecahannya adalah : "+sum);
    }
}
