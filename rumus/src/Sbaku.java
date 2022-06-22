import java.util.Scanner;

class Sbaku {
    private double n1, n2, sbaku;;
    void sbaku() {
        Scanner put = new Scanner(System.in);
        System.out.print("[*] Masukan nilai 1 : ");
        n1 = put.nextInt();
        System.out.print("[*] Masukan nilai 2 : ");
        n2 = put.nextInt();
        sbaku = n1 / n2 ;
    
        System.out.println("Hasilnya adalah : " + sbaku);
    }   
}
