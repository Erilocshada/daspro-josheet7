
import java.util.Scanner;

public class Percobaan2Pertanyaan4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jml, i;
        double nilai;

        i = 0;

        System.out.println("masukkan jumlah mahasiswa : ");
        jml = sc.nextInt();

        while (i < jml) {
            System.out.println("masukkan nilai mahasiswa : ");
            nilai = sc.nextInt();
        if (nilai < 0 || nilai >= 100) {
            System.out.println("Nilai tidak valid, masukkan nilai valid");
            continue;
            }
        if (nilai > 80 && nilai <= 100) {
            System.out.println("Nilai mahasiswa ke-" + (i+1) + " Adalah A");
            System.out.println("Bagus Pertahankan nilainya");
            }else if (nilai > 73  && nilai <= 80) {
                System.out.println("Nilai mahasiswa ke-" + (i+1) + " Adalah B+");
            }else if (nilai > 65  && nilai <= 73) {
                System.out.println("Nilai mahasiswa ke-" + (i+1) + " Adalah B");
            }else if (nilai > 60  && nilai <= 65) {
                System.out.println("Nilai mahasiswa ke-" + (i+1) + " Adalah C+");
            }else if (nilai > 50  && nilai <= 60) {
                System.out.println("Nilai mahasiswa ke-" + (i+1) + " Adalah C");
            }else if (nilai > 39  && nilai <= 50) {
                System.out.println("Nilai mahasiswa ke-" + (i+1) + " Adalah D");
            }else  {
                System.out.println("Nilai mahasiswa ke-" + (i+1) + " Adalah E");
            }
            i++;
        }
        sc.close();
    }
}