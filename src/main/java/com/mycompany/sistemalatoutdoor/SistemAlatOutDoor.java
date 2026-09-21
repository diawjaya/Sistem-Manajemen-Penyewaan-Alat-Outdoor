/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemalatoutdoor;

/**
 *
 * @author ASUS TUF
 */
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class SistemAlatOutDoor {

    static Scanner input = new Scanner(System.in);

    static ArrayList<AlatOutdoor> daftarAlat = new ArrayList<>();
    static ArrayList<Penyewa> daftarPenyewa = new ArrayList<>();
    static ArrayList<Penyewaan> daftarPenyewaan = new ArrayList<>();

    public static void main(String[] args) {

        int pilihan;

        do {
            tampilkanMenu();

            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    tambahAlat();
                    break;

                case 2:
                    lihatAlat();
                    break;

                case 3:
                    tambahPenyewa();
                    break;

                case 4:
                    lihatPenyewa();
                    break;

                case 5:
                    tambahPenyewaan();
                    break;

                case 6:
                    lihatPenyewaan();
                    break;

                case 7:
                    pengembalianAlat();
                    break;

                case 8:
                    System.out.println();
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println();
                    System.out.println("Pilihan tidak tersedia.");
            }

        } while (pilihan != 8);
    }

    public static void tampilkanMenu() {

        System.out.println();
        System.out.println("========================================");
        System.out.println("   SISTEM MANAJEMEN ALAT OUTDOOR");
        System.out.println("========================================");
        System.out.println("1. Tambah Alat Outdoor");
        System.out.println("2. Lihat Daftar Alat");
        System.out.println("3. Tambah Penyewa");
        System.out.println("4. Lihat Daftar Penyewa");
        System.out.println("5. Tambah Penyewaan");
        System.out.println("6. Lihat Daftar Penyewaan");
        System.out.println("7. Pengembalian Alat");
        System.out.println("8. Keluar");
        System.out.println("========================================");
    }

    public static void tambahAlat() {

        System.out.println();
        System.out.println("=== TAMBAH ALAT OUTDOOR ===");

        System.out.print("Kode Alat       : ");
        String kode = input.nextLine();

        System.out.print("Nama Alat       : ");
        String nama = input.nextLine();

        System.out.print("Harga Sewa/Hari : ");
        double harga = input.nextDouble();

        System.out.print("Stok            : ");
        int stok = input.nextInt();
        input.nextLine();

        System.out.println();
        System.out.println("Jenis Alat:");
        System.out.println("1. Tenda");
        System.out.println("2. Sleeping Bag");

        System.out.print("Pilih jenis     : ");
        int jenis = input.nextInt();
        input.nextLine();

        AlatOutdoor alat;

        if (jenis == 1) {

            System.out.print("Kapasitas Orang : ");
            int kapasitas = input.nextInt();
            input.nextLine();

            System.out.print("Jenis Tenda     : ");
            String jenisTenda = input.nextLine();

            alat = new Tenda(
                    kode,
                    nama,
                    harga,
                    stok,
                    kapasitas,
                    jenisTenda
            );

        } else if (jenis == 2) {

            System.out.print("Bahan           : ");
            String bahan = input.nextLine();

            System.out.print("Ukuran          : ");
            String ukuran = input.nextLine();

            alat = new SleepingBag(
                    kode,
                    nama,
                    harga,
                    stok,
                    bahan,
                    ukuran
            );

        } else {

            System.out.println("Jenis alat tidak tersedia.");
            return;
        }

        daftarAlat.add(alat);

        System.out.println();
        System.out.println("Alat berhasil ditambahkan.");
    }

    public static void lihatAlat() {

        System.out.println();
        System.out.println("=== DAFTAR ALAT OUTDOOR ===");

        if (daftarAlat.isEmpty()) {
            System.out.println("Belum ada alat.");
            return;
        }

        for (AlatOutdoor alat : daftarAlat) {

            System.out.println("----------------------------------------");
            System.out.println("Kode Alat       : " + alat.getKodeAlat());
            System.out.println("Nama Alat       : " + alat.getNamaAlat());
            System.out.println("Jenis Alat      : " + alat.getJenisAlat());
            System.out.println("Harga Sewa/Hari : " + formatRupiah(alat.getHargaSewa()));
            System.out.println("Stok            : " + alat.getStok());

            if (alat instanceof Tenda) {

                Tenda tenda = (Tenda) alat;

                System.out.println("Kapasitas       : "
                        + tenda.getKapasitas() + " orang");

                System.out.println("Jenis Tenda     : "
                        + tenda.getJenisTenda());

            } else if (alat instanceof SleepingBag) {

                SleepingBag sleepingBag = (SleepingBag) alat;

                System.out.println("Bahan           : "
                        + sleepingBag.getBahan());

                System.out.println("Ukuran          : "
                        + sleepingBag.getUkuran());
            }
        }

        System.out.println("----------------------------------------");
    }

    public static void tambahPenyewa() {

        System.out.println();
        System.out.println("=== TAMBAH PENYEWA ===");

        System.out.print("ID Penyewa      : ");
        String id = input.nextLine();

        System.out.print("Nama            : ");
        String nama = input.nextLine();

        System.out.print("Nomor Telepon   : ");
        String nomorTelepon = input.nextLine();

        System.out.print("Alamat          : ");
        String alamat = input.nextLine();

        Penyewa penyewa = new Penyewa(
                id,
                nama,
                nomorTelepon,
                alamat
        );

        daftarPenyewa.add(penyewa);

        System.out.println();
        System.out.println("Data penyewa berhasil ditambahkan.");
    }

    public static void lihatPenyewa() {

        System.out.println();
        System.out.println("=== DAFTAR PENYEWA ===");

        if (daftarPenyewa.isEmpty()) {
            System.out.println("Belum ada data penyewa.");
            return;
        }

        for (Penyewa penyewa : daftarPenyewa) {

            System.out.println("----------------------------------------");
            System.out.println("ID Penyewa    : " + penyewa.getIdPenyewa());
            System.out.println("Nama          : " + penyewa.getNama());
            System.out.println("Nomor Telepon : " + penyewa.getNomorTelepon());
            System.out.println("Alamat        : " + penyewa.getAlamat());
        }

        System.out.println("----------------------------------------");
    }

    public static void tambahPenyewaan() {

        System.out.println();
        System.out.println("=== TAMBAH PENYEWAAN ===");

        System.out.print("ID Penyewaan   : ");
        String idPenyewaan = input.nextLine();

        System.out.print("ID Penyewa     : ");
        String idPenyewa = input.nextLine();

        Penyewa penyewa = cariPenyewaById(idPenyewa);

        if (penyewa == null) {
            System.out.println("Data penyewa tidak ditemukan.");
            return;
        }

        System.out.print("Kode Alat      : ");
        String kodeAlat = input.nextLine();

        AlatOutdoor alat = cariAlatByKode(kodeAlat);

        if (alat == null) {
            System.out.println("Alat tidak ditemukan.");
            return;
        }

        if (alat.getStok() <= 0) {
            System.out.println("Stok alat sedang habis.");
            return;
        }

        System.out.print("Jumlah Hari    : ");
        int jumlahHari = input.nextInt();
        input.nextLine();

        if (jumlahHari <= 0) {
            System.out.println("Jumlah hari harus lebih dari 0.");
            return;
        }

        double totalHarga = alat.hitungHargaSewa(jumlahHari);

        alat.setStok(alat.getStok() - 1);

        Penyewaan penyewaan = new Penyewaan(
                idPenyewaan,
                idPenyewa,
                kodeAlat,
                jumlahHari,
                totalHarga,
                "Sedang Disewa"
        );

        daftarPenyewaan.add(penyewaan);

        System.out.println();
        System.out.println("Penyewaan berhasil dibuat.");
        System.out.println("Nama Penyewa : " + penyewa.getNama());
        System.out.println("Nama Alat    : " + alat.getNamaAlat());
        System.out.println("Jumlah Hari  : " + jumlahHari);
        System.out.println("Total Harga  : " + formatRupiah(totalHarga));
        System.out.println("Status       : Sedang Disewa");
    }

    public static void lihatPenyewaan() {

        System.out.println();
        System.out.println("=== DAFTAR PENYEWAAN ===");

        if (daftarPenyewaan.isEmpty()) {
            System.out.println("Belum ada data penyewaan.");
            return;
        }

        for (Penyewaan penyewaan : daftarPenyewaan) {

            Penyewa penyewa =
                    cariPenyewaById(penyewaan.getIdPenyewa());

            AlatOutdoor alat =
                    cariAlatByKode(penyewaan.getKodeAlat());

            System.out.println("----------------------------------------");
            System.out.println("ID Penyewaan : "
                    + penyewaan.getIdPenyewaan());

            System.out.println("Penyewa       : "
                    + (penyewa != null
                    ? penyewa.getNama()
                    : penyewaan.getIdPenyewa()));

            System.out.println("Alat          : "
                    + (alat != null
                    ? alat.getNamaAlat()
                    : penyewaan.getKodeAlat()));

            System.out.println("Jumlah Hari   : "
                    + penyewaan.getJumlahHari());

            System.out.println("Total Harga   : "
                    + formatRupiah(penyewaan.getTotalHarga()));

            System.out.println("Status        : "
                    + penyewaan.getStatusPenyewaan());
        }

        System.out.println("----------------------------------------");
    }

    public static void pengembalianAlat() {

        System.out.println();
        System.out.println("=== PENGEMBALIAN ALAT ===");

        System.out.print("ID Penyewaan : ");
        String idPenyewaan = input.nextLine();

        Penyewaan penyewaan =
                cariPenyewaanById(idPenyewaan);

        if (penyewaan == null) {
            System.out.println("Data penyewaan tidak ditemukan.");
            return;
        }

        if (penyewaan.getStatusPenyewaan()
                .equalsIgnoreCase("Sudah Dikembalikan")) {

            System.out.println("Alat sudah dikembalikan.");
            return;
        }

        AlatOutdoor alat =
                cariAlatByKode(penyewaan.getKodeAlat());

        if (alat != null) {
            alat.setStok(alat.getStok() + 1);
        }

        penyewaan.setStatusPenyewaan(
                "Sudah Dikembalikan"
        );

        System.out.println();
        System.out.println("Alat berhasil dikembalikan.");
        System.out.println("Status penyewaan: Sudah Dikembalikan");
    }

    public static AlatOutdoor cariAlatByKode(String kode) {

        for (AlatOutdoor alat : daftarAlat) {

            if (alat.getKodeAlat()
                    .equalsIgnoreCase(kode)) {

                return alat;
            }
        }

        return null;
    }

    public static Penyewa cariPenyewaById(String id) {

        for (Penyewa penyewa : daftarPenyewa) {

            if (penyewa.getIdPenyewa()
                    .equalsIgnoreCase(id)) {

                return penyewa;
            }
        }

        return null;
    }

    public static Penyewaan cariPenyewaanById(String id) {

        for (Penyewaan penyewaan : daftarPenyewaan) {

            if (penyewaan.getIdPenyewaan()
                    .equalsIgnoreCase(id)) {

                return penyewaan;
            }
        }

        return null;
    }

    public static String formatRupiah(double angka) {

        NumberFormat format =
                NumberFormat.getCurrencyInstance(
                        new Locale("id", "ID")
                );

        return format.format(angka);
    }
}
// hmmmm
