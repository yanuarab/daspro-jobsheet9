import java.util.Scanner;

public class MenuKafe25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappuccino", "Chocolate Ice"};

        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String cariMakanan = sc.nextLine();
        boolean ditemukan = false;
        for (String item : menu) {
            if (item.equalsIgnoreCase(cariMakanan)) {
                ditemukan = true;
                break;
            }
        }
        if (ditemukan) {
            System.out.println(cariMakanan + " tersedia.");
        } else {
            System.out.println(cariMakanan + " tidak tersedia di menu.");
        }
    }
}
