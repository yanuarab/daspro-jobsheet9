import java.util.Scanner;

public class SearchNilai25modif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int jumlahNilai = sc.nextInt();
        int[] nilai = new int[jumlahNilai];

        for (int i = 0; i < jumlahNilai; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();
        int posisi = -1;

        for (int i = 0; i < jumlahNilai; i++) {
            if (nilai[i] == key) {
                posisi = i;
                break;
            }
        }

        if (posisi != -1) {
            System.out.println("Nilai ketemu " + key + ", merupakan nilai mahasiswa ke-" + (posisi + 1));
        } else { 
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
    }
}
