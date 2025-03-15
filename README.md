# TP3DPBO2025C1

## Janji
Saya Nashwa Nadria Futi dengan NIM 2306026 mengerjakan soal Tes Praktikum 3 dalam mata kuliah Desain Pemrograman
Berbasis Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

## Desain Program
![Screenshot 2025-03-15 204023](https://github.com/user-attachments/assets/a3e6735e-4866-47b9-90bb-9b5c60d731ea)

## Alur Program
# Deskripsi Kode
Terdapat 1 class Komponen yang memiliki 2 atribut utama:
* nama (string)
* merk (string)
Class ini berfungsi sebagai blueprint untuk membuat objek komponen komputer dengan metode getter dan setter untuk mengakses dan memodifikasi atributnya.

# Alur Program
* Program dimulai dengan membuat objek dari class Komputer.
* Tidak ada batasan jumlah komponen yang bisa dimasukkan dalam sebuah komputer.
* Class Komponen memiliki 7 subclass turunan:
1. Casing → Memiliki atribut tipeCasing dan jumlahFan
2. Cpu → Memiliki atribut jumlahCore dan kecepatanGHz
3. Gpu → Memiliki atribut tipeGpu,kapasitasVRAM, dan kecepatanCoreMHz
4. Harddrive → Memiliki atribut kapasitasGB dan tipeDrive
5. Motherboard → Memiliki atribut chipset dan socketCpu, serta RAM list
6. Ram → Memiliki atribut kapasitasGB dan ddr
7. OS → Memiliki atribut namaOS dan versi
* Seluruhnya composite ke class Komputer.

# Aturan Program
* Setiap komponen mewarisi sifat dari class Komponen kecuali class OS karena OS bukan perangkat keras.
* Class Komputer memiliki atribut untuk setiap jenis komponen (casing, cpu, gpu, harddrive, motherboard, ram, os).
* Setiap class memiliki method getter dan setter untuk mengakses dan memodifikasi atribut.
* Class Komputer memiliki method untuk mengakses dan menetapkan setiap komponen yang menjadi bagiannya.
* Relasi antara Komputer dan komponen-komponennya menggunakan prinsip komposisi, dimana komputer terdiri dari komponen-komponen tersebut.

## Dokumentasi Jalannya Program
![Screenshot 2025-03-15 203729](https://github.com/user-attachments/assets/b4b7a31c-8f88-4345-9504-e0b59369f19a)

