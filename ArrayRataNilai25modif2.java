import java.util.Scanner; 
public class ArrayRataNilai25modif2 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = sc.nextInt(); 
        int[] nilaiMhs = new int[jumlahMhs]; 
        double totalLulus = 0, totalTidakLulus = 0; 
        int jumlahLulus = 0, jumlahTidakLulus = 0; 

        
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jumlahLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                jumlahTidakLulus++;
            }
        }

        double rata2Lulus = jumlahLulus > 0 ? totalLulus / jumlahLulus : 0;
        double rata2TidakLulus = jumlahTidakLulus > 0 ? totalTidakLulus / jumlahTidakLulus : 0;
        System.out.println("Rata-rata nilai lulus = " + rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rata2TidakLulus);
    }
}
