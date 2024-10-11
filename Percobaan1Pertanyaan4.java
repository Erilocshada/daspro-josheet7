
import java.util.Scanner;

public class Percobaan1Pertanyaan4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    double nilai, terendah = 100, tertinggi = 0;
    int lulus = 0, tidaklulus = 0;

    for (int i = 1; i < 10; i++) {
        System.out.println("Masukkan nilai mahasiswa-" + i+ ":");
        nilai = sc.nextDouble();
        if (nilai > tertinggi) {
            tertinggi = nilai;
        }
        if (nilai < terendah) {
            terendah = nilai;
        }
        if (nilai < 60) {
            tidaklulus++;
        } else if (nilai >= 60) {
            lulus++;
        }

    }
    System.out.println("banyaknya mahasiswa lulus : " + lulus);
    System.out.println("banyaknya mahasiswa tidak lulus : " + tidaklulus);
    System.out.println("nilai tertinggi :" + tertinggi);
    System.out.println("nilai terendah :" + terendah);
    sc.close();
    }
}