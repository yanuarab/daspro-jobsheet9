import java.util.Scanner;

public class PemesananKafe25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jumlah pesanan: ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine(); 

        String[] namaPesanan = new String[jumlahPesanan];
        double[] hargaPesanan = new double[jumlahPesanan];

        double totalBiaya = 0;
        
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("Masukkan nama pesanan ke-" + (i + 1) + ": ");
            namaPesanan[i] = sc.nextLine(); 

            System.out.println("Masukkan harga pesanan ke-" + (i + 1) + ": ");
            hargaPesanan[i] = sc.nextDouble();
            sc.nextLine();  
            totalBiaya += hargaPesanan[i];
        }

        System.out.println("\nDaftar Pesanan:");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println(namaPesanan[i] + " - Rp" + hargaPesanan[i]);
        }
        System.out.println("Total biaya: Rp" + totalBiaya);
    }
}
