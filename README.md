# Sistem Manajemen Persewaan Alat Outdoor

## Identitas Mahasiswa

**Nama:** [Nama Lengkap]  
**NIM:** [NIM]  
**Mata Kuliah:** Pemrograman Berorientasi Objek (PBO)

---

Sistem Manajemen Persewaan Alat Outdoor merupakan program berbasis Java yang dibuat untuk membantu proses pengelolaan alat-alat outdoor yang dapat disewakan. Sistem ini dibuat untuk mengelola data alat, data penyewa, serta data penyewaan secara sederhana melalui Command Line Interface (CLI).

Dalam sistem ini terdapat beberapa jenis alat outdoor, yaitu Tenda dan Sleeping Bag. Setiap alat memiliki informasi seperti kode alat, nama alat, harga sewa per hari, dan jumlah stok. Tenda memiliki informasi tambahan berupa kapasitas dan jenis tenda, sedangkan Sleeping Bag memiliki informasi bahan dan ukuran.

Selain mengelola data alat, sistem juga dapat menyimpan data penyewa yang terdiri dari ID penyewa, nama, nomor telepon, dan alamat. Data tersebut digunakan ketika penyewa melakukan proses penyewaan alat.

Pada proses penyewaan, pengguna memasukkan data penyewaan seperti ID penyewaan, ID penyewa, kode alat, dan jumlah hari penyewaan. Sistem kemudian menghitung total harga berdasarkan harga sewa alat dan jumlah hari. Stok alat juga akan berkurang ketika alat disewa.

Sistem menyediakan fitur pengembalian alat. Ketika alat dikembalikan, stok alat akan bertambah kembali dan status penyewaan akan berubah menjadi "Sudah Dikembalikan".

Program ini dibuat dengan menerapkan konsep Pemrograman Berorientasi Objek (PBO), terutama encapsulation, inheritance, dan polymorphism. Class AlatOutdoor digunakan sebagai superclass, sedangkan Tenda dan SleepingBag digunakan sebagai subclass. Dengan struktur tersebut, data dan perilaku yang memiliki kesamaan dapat dikelompokkan dan digunakan kembali oleh subclass.
Fitur yang tersedia dalam program:

- Menambahkan alat outdoor
- Melihat daftar alat outdoor
- Menambahkan data penyewa
- Melihat daftar penyewa
- Membuat penyewaan alat
- Melihat daftar penyewaan
- Melakukan pengembalian alat
- Mencari alat berdasarkan kode
- Menghitung total harga penyewaan berdasarkan jumlah hari

---

## 2. Struktur Class

Program memiliki beberapa class yang memiliki fungsi berbeda.
