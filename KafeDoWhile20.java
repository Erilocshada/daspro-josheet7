
import java.util.Scanner;

public class KafeDoWhile20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kopi, teh, roti;
        String namaPelanggan;
        double totalHarga, hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;

        do {
            System.out.println("Masukkan nama pelanggan(ketik 'batal' untuk keluar) : ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan ");
                break;
            }
            System.out.println("Jumlah kopi :");
            kopi = sc.nextInt();
            System.out.println("Jumlah Teh : ");
            teh = sc.nextInt();
            System.out.println("Jumlah Roti : ");
            roti = sc.nextInt();

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total harus dibayar : " + totalHarga);
            sc.nextLine();
        } while (true);

        System.out.println("Transaksi selesai");
        sc.close();
    }
}
