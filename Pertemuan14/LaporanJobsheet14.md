<h4>Nama: Syahroni Nur'an Syafi'i<h4>
<h4>Kelas: TI-1E<h4>

## Praktikum 1
<img width="548" height="429" alt="image" src="https://github.com/user-attachments/assets/3e3379d3-d87f-499f-8f91-edb4590cad08" />

<img width="335" height="250" alt="image" src="https://github.com/user-attachments/assets/78d2f01d-7f4a-4d29-b3cf-445cf4b837e6" />

<img width="380" height="966" alt="image" src="https://github.com/user-attachments/assets/d58c7910-5f5c-4d8b-b6e4-4d56599162c8" />
<img width="368" height="600" alt="image" src="https://github.com/user-attachments/assets/abce937e-245e-4f95-88d9-e1544298318d" />
<img width="445" height="729" alt="image" src="https://github.com/user-attachments/assets/c9480e03-906c-4f17-9c40-43e03f4d30bd" />

<img width="672" height="563" alt="image" src="https://github.com/user-attachments/assets/b711b66d-31a8-4915-8a2f-9ca445849ac9" />

<img width="412" height="641" alt="image" src="https://github.com/user-attachments/assets/d65562cc-e9a1-43d0-a2f1-2a9bfc41a3d3" />

### Pertanyaan
1. nilai kiri < node < nilai kanan. Saat mencari, di setiap langkah kita langsung tahu harus ke kiri atau kanan, sehingga setengah cabang langsung dibuang. berbeda dengan binary tree biasa yang harus memeriksa semua node.

2. left adalah pointer ke node anak kiri (nilai IPK lebih kecil), dan right adalah pointer ke node anak kanan (nilai IPK lebih besar). Keduanya adalah yang membentuk struktur pohon dan menghubungkan antar node.

3a. untuk masuk ke seluruh tree

3b. root = null, karena di konstruktor BinaryTree30() nilainya diinisialisasi null, menandakan tree masih kosong.

4. Method add() memanggil isEmpty() yang mengembalikan true.

5. pertama parent menyimpan posisi node saat ini sebelum bergerak. Lalu dibandingkan IPK baru dengan IPK node saat ini. Jika lebih kecil, bergerak ke kiri (current = current.left); jika sudah null berarti posisi kosong ditemukan, maka parent.left = newNode dan langsung return. Hal serupa terjadi ke kanan.

6. Ketika node yang dihapus memiliki 2 anak, kita tidak bisa langsung menghapusnya karena akan memutus dua cabang. Strateginya adalah mencari in-order successor yaitu node terkecil di subtree kanan (paling kiri dari anak kanan). getSuccessor() bekerja dengan menelusuri del.right terus ke kiri sampai habis.

## Praktikum 2
<img width="388" height="345" alt="image" src="https://github.com/user-attachments/assets/579e4336-f987-4a11-9fba-6fd96cf71c1c" />

<img width="602" height="285" alt="image" src="https://github.com/user-attachments/assets/ecd2d0e7-50b4-4ffa-8b1d-ee1259c56e33" />

<img width="257" height="112" alt="image" src="https://github.com/user-attachments/assets/43666fe3-d71f-4d3b-9495-5ee645e14176" />

### Pertanyaan
1. dataMahasiswa adalah array yang menyimpan semua node tree secara datar. idxLast menyimpan indeks terakhir yang terisi, digunakan sebagai batas agar traversal tidak keluar dari batas array.

2. Menginisialisasi tree dengan data dari luar

3. Mengunjungi node secara rekursif dengan urutan: kiri -> tengah -> kanan, sehingga data tampil terurut dari IPK terkecil ke terbesar.

4. Left child ada di indeks 2x2+1 = 5, dan right child ada di indeks 2x2+2 = 6. Rumus umumnya: untuk node di indeks i, left child = 2i+1, right child = 2i+2.

5. Menandakan bahwa data valid hanya ada di indeks 0 sampai 6 (7 mahasiswa).

6. Karena hubungan parent-child dimodelkan secara matematis, jadi node di indeks i memiliki left child di 2i+1 dan right child di 2i+2.


## Tugas Praktikum 
1. <img width="468" height="206" alt="image" src="https://github.com/user-attachments/assets/18a0439c-a284-4714-8d79-5f2858192900" />

2. <img width="435" height="344" alt="image" src="https://github.com/user-attachments/assets/261f3805-7dc1-4d18-b845-b5ac6700592d" />

3. <img width="490" height="194" alt="image" src="https://github.com/user-attachments/assets/7cc8c2f8-7a16-4dc2-ba87-6fd7854ad538" />

4a. <img width="541" height="513" alt="image" src="https://github.com/user-attachments/assets/1123610b-89b2-4671-a3e9-72bcc8d625e6" />

4b. <img width="371" height="145" alt="image" src="https://github.com/user-attachments/assets/4637c996-5f14-4cb5-9c13-e04712e73bca" />
