import java.util.Scanner;

public class KelolaNilai25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Masukkan jumlah nilai mahasiswa: ");
        int jumlahNilai = sc.nextInt();
        int[] nilai = new int[jumlahNilai];

        System.out.println("Masukkan nilai-nilai:");
        for (int i = 0; i < jumlahNilai; i++) {
            nilai[i] = sc.nextInt();
        }

        int total = 0, tertinggi = nilai[0], terendah = nilai[0];
        for (int n : nilai) {
            total += n;
            if (n > tertinggi) tertinggi = n;
            if (n < terendah) terendah = n;
        }
        double rataRata = (double) total / jumlahNilai;

        System.out.println("Rata-rata nilai: " + rataRata);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.print("Semua nilai: ");
        for (int n : nilai) {
            System.out.print(n + " ");
        }
    }
}
