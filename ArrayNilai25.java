import java.util.Scanner;
public class ArrayNilai25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Masukan nilai akhir-"+i+" : ");
            nilaiAkhir[i] = sc.nextInt();
        }
        for(int i = 0; i < 10; i++){
            System.out.println("Nilai akhir ke-"+i+"adalah"+nilaiAkhir [i]);
        }
        sc.close();
    }
}
