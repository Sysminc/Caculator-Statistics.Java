import java.util.Scanner;

class Mean {
    private double n1, n2, mean;
    void mean() {
        Scanner put = new Scanner(System.in);
        System.out.print("[*] Masukan nilai 1 : ");
        n1 = put.nextInt();
        System.out.print("[*} Masukan nilai 2 : ");
        n2 = put.nextInt();
        mean = n1 / n2 ;
    
        System.out.println("Hasilnya adalah : " + mean);
        put.close();
    }
}
