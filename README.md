# Sistem Manajemen Persewaan Alat Outdoor

## Identitas Mahasiswa

**Nama:** Dhiyya Rizky Akhmad Wijaya 

**NIM:** 2509116042

**Mata Kuliah:** Pemrograman Berorientasi Objek (PBO)

---

## Penjelasan Studi Kasus

Studi kasus yang digunakan adalah **Sistem Manajemen Penyewaan Alat Outdoor**. Sistem ini digunakan untuk membantu pengelolaan alat outdoor, data penyewa, serta transaksi
penyewaan alat.
1. **Pengelolaan Data Alat Outdoor**
   * Daftar alat.
   * Menampilkan informasi stok alat.
   * Mencari alat berdasarkan kode alat.

2. **Pengelolaan Data Penyewa**
   * Menambahkan data penyewa.
   * Menampilkan daftar penyewa.
   * Menyimpan informasi identitas penyewa.

3. **Transaksi Penyewaan**
   * Membuat transaksi penyewaan alat.
   * Memeriksa data penyewa dan alat.
   * Memeriksa ketersediaan stok.
   * Menghitung total harga berdasarkan jumlah hari penyewaan.
   * Mengurangi stok alat ketika terjadi penyewaan.

4. **Pengembalian Alat**
   * Melakukan pengembalian alat berdasarkan ID penyewaan.
   * Menambah kembali stok alat.
   * Mengubah status penyewaan menjadi `Sudah Dikembalikan`.

---

## 2. Penjelasan Hierarki Class

1. **Super-Class `AlatOutdoor`**:
   * Merupakan class utama yang menyimpan data umum dari alat outdoor.
   * Memiliki atribut seperti `kodeAlat`, `namaAlat`, `hargaSewa`, dan `stok`.
   * Class ini menjadi dasar bagi jenis alat outdoor yang lebih spesifik.

2. **Sub-Class `Tenda` dan `SleepingBag`**:
   * `Tenda` merupakan turunan dari `AlatOutdoor` dan memiliki atribut tambahan seperti `kapasitas` dan `jenisTenda`.
   * `SleepingBag` merupakan turunan dari `AlatOutdoor` dan memiliki atribut tambahan seperti `bahan` dan `ukuran`.
   * Kedua class tersebut mewarisi atribut dan method dari class `AlatOutdoor`.

3. **Class `Penyewa`**:
   * Digunakan untuk menyimpan data orang yang melakukan penyewaan alat outdoor.
   * Memiliki data seperti `idPenyewa`, `nama`, `nomorTelepon`, dan `alamat`.

4. **Class `Penyewaan`**:
   * Digunakan untuk menyimpan data transaksi penyewaan alat.
   * Memiliki data seperti `idPenyewaan`, `idPenyewa`, `kodeAlat`, `jumlahHari`, `totalHarga`, dan `statusPenyewaan`.
   * Class ini digunakan untuk mencatat proses penyewaan dan pengembalian alat.

5. **Class `SistemAlatOutDoor`**:
   * Merupakan class utama yang menjalankan program.
   * Mengatur menu program, input data, pengelolaan `ArrayList`, proses penyewaan,dan pengembalian alat.

## Penjelasan Bagian Kode Penerapan Inheritance

Penerapan konsep pewarisan (*Inheritance*) pada program dapat dilihat dari class `Tenda` dan `SleepingBag` yang mewarisi class `AlatOutdoor`.

### 1. Penggunaan Sintaks `extends`

Pewarisan class dilakukan menggunakan kata kunci `extends`. Pada program ini, class `Tenda` dan `SleepingBag` merupakan turunan dari class `AlatOutdoor`.

**`Tenda` mewarisi `AlatOutdoor`:**

```java
public class Tenda extends AlatOutdoor {
    ...
}
```

**`SleepingBag` mewarisi `AlatOutdoor`:**

```java
public class SleepingBag extends AlatOutdoor {
    ...
}
```

Dengan menggunakan `extends`, kedua class tersebut dapat menggunakan atribut dan method yang berasal dari class `AlatOutdoor`.

### 2. Penggunaan Kata Kunci `super()`

Konstruktor pada sub-class menggunakan `super()` untuk memanggil konstruktor milik super-class `AlatOutdoor`.

Contoh pada class `Tenda`:

```java
public Tenda(String kodeAlat, String namaAlat, double hargaSewa, int stok,
             int kapasitas, String jenisTenda) {
    super(kodeAlat, namaAlat, hargaSewa, stok);
    this.kapasitas = kapasitas;
    this.jenisTenda = jenisTenda;
}
```

Contoh pada class `SleepingBag`:

```java
public SleepingBag(String kodeAlat, String namaAlat, double hargaSewa, int stok,
                   String bahan, String ukuran) {
    super(kodeAlat, namaAlat, hargaSewa, stok);
    this.bahan = bahan;
    this.ukuran = ukuran;
}
```

`super()` digunakan untuk menginisialisasi atribut yang berasal dari class `AlatOutdoor`, sedangkan atribut khusus seperti `kapasitas`, `jenisTenda`, `bahan`, dan `ukuran`
diinisialisasi pada masing-masing sub-class.

## Screenshots

### Menu utama dan manajemen alat
<img width="170" height="257" alt="image" src="https://github.com/user-attachments/assets/b97dbde6-291b-4f55-a0c9-dec2ff5e476b" />

<img width="164" height="92" alt="image" src="https://github.com/user-attachments/assets/bd92c23b-a8d8-454e-b726-2554c1267f86" />


### Tambah dan Daftar Penyewa
<img width="139" height="83" alt="image" src="https://github.com/user-attachments/assets/04d344ba-435f-42f3-81c9-bf2123db6be9" />

<img width="164" height="82" alt="image" src="https://github.com/user-attachments/assets/b3a3c68d-657f-4ed9-a838-d0cd5cfd0780" />


### Fitur Penyewaan dan Pengembalian
<img width="141" height="131" alt="image" src="https://github.com/user-attachments/assets/3ed5cfce-ebe9-422b-ae4a-ff39bccd12df" />

<img width="158" height="70" alt="image" src="https://github.com/user-attachments/assets/0a28e430-1531-481f-9a8f-43ff3a18d474" />


## Alur Program

1. Jalankan program melalui class `SistemAlatOutDoor`.

2. Program menampilkan menu utama yang berisi beberapa pilihan, seperti:
   - Tambah Alat Outdoor
   - Tampilkan Daftar Alat
   - Tambah Penyewa
   - Tampilkan Daftar Penyewa
   - Penyewaan Alat
   - Pengembalian Alat
   - Tampilkan Daftar Penyewaan
   - Keluar

3. Pengguna memilih menu sesuai kebutuhan menggunakan nomor pilihan.

4. Pada menu **Tambah Alat Outdoor**, pengguna dapat memasukkan data alat seperti kode alat, nama alat, harga sewa, stok, dan jenis alat.

5. Program menyediakan dua jenis alat outdoor, yaitu **Tenda** dan **Sleeping Bag**. Kedua jenis tersebut merupakan turunan dari class `AlatOutdoor`.

6. Data alat yang berhasil ditambahkan akan disimpan ke dalam `ArrayList`.

7. Pada menu **Tambah Penyewa**, pengguna memasukkan data penyewa seperti ID penyewa dan nama penyewa. Data penyewa kemudian disimpan ke dalam `ArrayList`.

8. Pada menu **Penyewaan Alat**, pengguna memasukkan ID penyewa, kode alat, dan jumlah hari penyewaan.

9. Program memeriksa apakah data penyewa dan alat tersedia. Program juga memeriksa apakah stok alat masih tersedia.

10. Jika semua data valid dan stok tersedia, program menghitung total harga sewa berdasarkan harga alat dan jumlah hari penyewaan.

11. Setelah transaksi berhasil, stok alat akan berkurang sesuai jumlah alat yang disewa dan data transaksi disimpan ke dalam `ArrayList`.

12. Pada menu **Pengembalian Alat**, pengguna memasukkan data penyewaan yang akan dikembalikan.

13. Program memproses pengembalian alat, menambah kembali stok alat, dan mengubah status penyewaan menjadi **Sudah Dikembalikan**.

14. Pada menu **Daftar Alat**, pengguna dapat melihat seluruh alat outdoor yang telah tersimpan.

15. Pada menu **Daftar Penyewa**, pengguna dapat melihat seluruh data penyewa yang telah tersimpan.

16. Pada menu **Daftar Penyewaan**, pengguna dapat melihat data transaksi penyewaan yang telah dilakukan.

17. Program menggunakan `if-else` untuk melakukan pengecekan dan menentukan proses berdasarkan pilihan pengguna.

18. Program menggunakan looping untuk menampilkan data dan menjalankan menu utama secara berulang.

19. Program terus berjalan sampai pengguna memilih menu **Keluar**.

20. Setelah memilih menu **Keluar**, program berhenti dan menampilkan pesan bahwa program telah selesai.
