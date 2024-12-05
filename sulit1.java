import java.util.Scanner;
public class sulit1 {
    // Fungsi untuk menginput nilai siswa
    public static int[] inputNilai(Scanner s, int jumlahSiswa) {
        int[] nilaiUjian = new int[jumlahSiswa];
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan nilai ujian siswa ke-" + (i + 1) + ": ");
            nilaiUjian[i] = s.nextInt();
        }
        return nilaiUjian;
    }

    // Fungsi untuk menghitung total nilai
    public static int hitungTotalNilai(int[] nilaiUjian) {
        int totalNilai = 0;
        for (int nilai : nilaiUjian) {
            totalNilai += nilai;
        }
        return totalNilai;
    }

    // Fungsi untuk menghitung rata-rata nilai
    public static double hitungRataRata(int totalNilai, int jumlahSiswa) {
        return (double) totalNilai / jumlahSiswa;
    }

    // Fungsi untuk menampilkan rekapitulasi nilai
    public static void tampilkanRekapitulasi(int[] nilaiUjian) {
        System.out.println("\nRekapitulasi Nilai Ujian:");
        for (int i = 0; i < nilaiUjian.length; i++) {
            System.out.println("Siswa ke-" + (i + 1) + ": " + nilaiUjian[i]);
        }
    }
    // Main method
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Input jumlah siswa
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = s.nextInt();

        // Input nilai siswa
        int[] nilaiUjian = inputNilai(s, jumlahSiswa);

        // Hitung total nilai
        int totalNilai = hitungTotalNilai(nilaiUjian);

        // Hitung rata-rata nilai
        double nilaiRataRata = hitungRataRata(totalNilai, jumlahSiswa);

        // Tampilkan rekapitulasi nilai
        tampilkanRekapitulasi(nilaiUjian);

        // Tampilkan nilai rata-rata
        System.out.println("\nNilai Rata-Rata: " + nilaiRataRata);
    }
}

