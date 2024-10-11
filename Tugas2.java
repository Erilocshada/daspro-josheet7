
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi, harga;
        double total = 0, totalHarga =0;

do {
    System.out.println("Masukkan jenis kendaraan : 1.mobil 2.motor 0.keluar");
        jenis = sc.nextInt();
    if (jenis == 0) {
        System.out.println("Transaksi Dibatalkan");
        break;
    }

    System.out.println("Masukkan durasi parkir :");
    durasi = sc.nextInt();

    if (jenis == 1) {
        harga = 3000;
        total = harga * durasi;
        if (durasi >= 5) {
            total += 12500;
        }
    }else if (jenis == 2) {
        harga = 2000;
        total = harga *durasi;
        if (durasi >= 5) {
            total += 12500;
        }
    }

    System.out.println("Total harga : " + total);
    totalHarga += total;
    } while (true);
    System.out.println("Total harga akhir :" + totalHarga);
    }
}
