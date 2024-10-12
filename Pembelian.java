import java.util.ArrayList;
import java.util.Scanner;

public class Pembelian {
    public static void main(String[] args) {
        ArrayList<Penerbangan> daftarPenerbangan = new ArrayList<>();
        ArrayList<Penumpang> daftarPenumpang = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        Penerbangan penerbanganDipilih = null;
        Penumpang penumpangDipilih = null;

        // Data penerbangan
        daftarPenerbangan.add(new Penerbangan("BZK902", "CGK, Jakarta", "DPS, Bali", "06:30", "08:15", 1200000));
        daftarPenerbangan.add(new Penerbangan("C5H245", "SUB, Surabaya", "KNO, Medan", "09:00", "11:45", 1350000));
        daftarPenerbangan.add(new Penerbangan("KPL544", "GGS, Bandung", "PPB, Malang", "03:00", "08:45", 6650000));
        daftarPenerbangan.add(new Penerbangan("29K23L", "PPL, Singaparna", "JPY, Palu", "02:00", "15:45", 2850000));
        daftarPenerbangan.add(new Penerbangan("P1PPL5", "SAP, Gombong", "XAU, Kalimaya", "19:00", "17:45", 9250000));
        int pilihanMenu = 0;

        while (pilihanMenu != 4) {
            System.out.println("\n======= EAD Ticket Booking System =======");
            System.out.println("1. Tampilkan Daftar Penerbangan");
            System.out.println("2. Beli Tiket");
            System.out.println("3. Tampilkan Pesanan Tiket");
            System.out.println("4. Exit");
            System.out.print("Silahkan pilih menu: ");
            pilihanMenu = input.nextInt();
            input.nextLine(); // Menangkap enter

            if (pilihanMenu == 1) {
                // Menampilkan Daftar Penerbangan
                System.out.println("\nDaftar Penerbangan:");
                for (int i = 0; i < daftarPenerbangan.size(); i++) {
                    System.out.print((i + 1) + ".");
                    daftarPenerbangan.get(i).tampilDaftarPenerbangan();
                    System.out.println(); // Membuat list terurut dimulai dari angka 1
                }
            } else if (pilihanMenu == 2) {
                if (penumpangDipilih == null) {
                    System.out.println("\n Isi data diri : ");
                    System.out.println("----------------------------");
                    System.out.print("Masukkan NIK: ");
                    String NIK = input.nextLine();
                    System.out.print("Masukkan Nama Depan: ");
                    String namaDepan = input.nextLine();
                    System.out.print("Masukkan Nama Belakang: ");
                    String namaBelakang = input.nextLine();
                    penumpangDipilih = new Penumpang(NIK, namaDepan, namaBelakang);
                    daftarPenumpang.add(penumpangDipilih);
                    System.out.println();
                    System.out.println("Silahkan pilih daftar penerbangan");

                }

                System.out.println("\nDaftar Penerbangan:");
                System.out.println();
                for (int i = 0; i < daftarPenerbangan.size(); i++) {
                    System.out.print((i + 1) + ".");
                    daftarPenerbangan.get(i).tampilDaftarPenerbangan();
                    System.out.println(); // Tambahkan baris kosong setelah setiap penerbangan
                }

                System.out.print("Pilih nomor penerbangan : ");
                int pilihanPenerbangan = input.nextInt();
                penerbanganDipilih = daftarPenerbangan.get(pilihanPenerbangan - 1);

                System.out.println("\nTiket berhasil dipesan! ");
            } else if (pilihanMenu == 3) {
                // Menampilkan Pesanan Tiket
                if (penerbanganDipilih != null && penumpangDipilih != null) {
                    System.out.println("\n======= Detail Tiket Penerbangan =======");
                    System.out.println("Nomor Induk Kependudukan: " + penumpangDipilih.getNIK());
                    System.out.println("Nama Depan: " + penumpangDipilih.getNamaDepan());
                    System.out.println("Nama Belakang: " + penumpangDipilih.getNamaBelakang());
                    System.out.println("========================================");
                    penerbanganDipilih.tampilDaftarPenerbangan();
                } else {
                    System.out.println("\nPesanan tiket tidak ada.");
                }
            } else if (pilihanMenu == 4) {
                // Keluar
                System.out.println("\nTerima kasih!");
            } else {
                System.out.println("Pilihan menu tidak valid.");
            }
        }

        input.close();
    }
}

// Ini adalah test commit untuk push github