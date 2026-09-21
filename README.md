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

<img width="244" height="179" alt="image" src="https://github.com/user-attachments/assets/8fa0e2b7-11ae-4397-ae2a-a6e4f7ab9193" />
