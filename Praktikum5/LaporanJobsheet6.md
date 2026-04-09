## Praktikum 1
1. <img width="620" height="415" alt="image" src="https://github.com/user-attachments/assets/2542670b-e0b2-4dd6-9c45-0bddd7c3ac74" />

2. <img width="615" height="618" alt="image" src="https://github.com/user-attachments/assets/208bd6fa-7bf9-4fc0-8125-1f0b1f6e7493" />

3. <img width="451" height="546" alt="Screenshot 2026-04-09 075942" src="https://github.com/user-attachments/assets/92e23fce-36b6-44c4-a15d-4da664405763" />

### Pertanyaan
1. tampilPosisi, berfokus pada lokasi data yang berarti hanya menginformasikan apakah data ditemukan atau tidak
   tampilDataSearch, berfokus pada detail konten yang berarti jika data ditemukan akan menampilkan seluruh informasi atribut objek tersebut

2. untuk menghentikan paksa perulangan (looping) segera setelah data yang dicari ditemukan.

3. variabel pos berfungsi sebagai penanda sekaligus penyimpan lokasi

4. jika terdapat lebih dari satu data dengan nilai yang sama maka hasil pencarian akan menampilkan data yang ditemukan pertama kali, karena adanya perintah break ketika menemukan kecocokan pertama maka break akan langsung menghentikan proses pencarian dan mengembalikan indeks tersebut

5. jika ada data duplikat, variabel posisi akan terus diperbarui dan pada akhirnya hanya menyimpan indeks dari ata yang terakhir ditemukan


## Praktikum 2
1. <img width="468" height="210" alt="image" src="https://github.com/user-attachments/assets/15112276-702d-4b38-83d2-2b072e24ad23" />

2. <img width="635" height="193" alt="image" src="https://github.com/user-attachments/assets/e8b84ece-ae3c-41e6-82a8-58eb97b93522" />

3. <img width="387" height="820" alt="image" src="https://github.com/user-attachments/assets/982fbf93-c3d0-4aab-84f8-def6069e32d7" />

### Pertanyaan
1. mid = (left + right) / 2

2. return finBinarySearch(cari, left, mid - 1);
   return finBinarySearch(cari, mid + 1, right);

3. - left, menandai batas awal indeks terendah dari rentang pencarian yang masih aktif.
   - right, menandai batas akhir indeks tertinggi dari rentang pencarian yang masih aktif
   - mid, indeks tengah yang digunakan untuk pembanding utaman dengan data yang dicari

4. Tidak bisa, karena binary search bekerja dengan pemikiran bahwa data sudah terurut. jika data berantakan logika nya "kalau cari lebih kecil dari mid coba cari ke kiri" akan gagal karena data yang lebih kecil bisa saja justru ada di sebelah kanan.

5.  <img width="511" height="193" alt="image" src="https://github.com/user-attachments/assets/92f6c620-2488-4ad8-a757-ece67231ac69" />
dari  else if (listMhs[mid].ipk > cari) menjadi else if (listMhs[mid].ipk < cari)

6. menentukan data "tidak ada" ketika kondifi if (right >= left) sudah tidak terpenuhi lagi

7. <img width="438" height="927" alt="image" src="https://github.com/user-attachments/assets/94fbc49e-08cc-4bb0-9fe1-35faf970560e" />


