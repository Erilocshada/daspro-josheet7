
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namaPelanggan;
        int totalTiket = 0;
        double tiket,totalDiskon= 0, hargaTiket = 50000, totalHarga, hargaAkhir, totalHargaAkhir = 0;
    do {
        System.out.println("Masukkan nama pelanggan");
        namaPelanggan = sc.nextLine();
        System.out.println("Masukkan total tiket (Ketik '0' untuk cancel): ");
        tiket = sc.nextDouble();
        if (namaPelanggan.equalsIgnoreCase("cancel")) {
            System.out.println("Transaksi dibatalkan");
            break;
        }
        if (tiket == 0 ) {
            System.out.println("Transaksi dibatalkan");
            break;
        }
        if (tiket < 0) {
            System.out.println("Total tiket tidak valid, Masukkan kembali");
            continue;
        }
        double diskon=0;

        if (tiket > 4) {
            diskon = 0.10;
        } else if (tiket > 10) {
            diskon = 0.15;
        }
        totalHarga = tiket*hargaTiket;
        hargaAkhir = totalHarga-(totalHarga*diskon);
        totalTiket+=tiket;
        totalHargaAkhir += hargaAkhir;
        totalDiskon += diskon;
        System.out.println("Total Harga : " + hargaAkhir);
        System.out.println("Total Diskon awal : "+ diskon);
        


        
    } while (true);
    System.out.println("Total Tiket : "+totalTiket);
    System.out.println("Total Diskon : " + totalDiskon);
    System.out.println("Total harga keseluruhan : RP"+ totalHargaAkhir);
       sc.close();
    }
}
