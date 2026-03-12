Nama: Syahroni Nur'an Syafi'i
Kelas: 1E

##Percobaan 1
<img width="523" height="401" alt="image" src="https://github.com/user-attachments/assets/9268e631-9da3-4c4e-bd75-cac83a2f19a6" />
<img width="177" height="46" alt="image" src="https://github.com/user-attachments/assets/c8c7eb5e-2aae-4f6a-9f9e-f719b364e467" />

Pertanyaan 
1. bagian if digunakan sebagai kondisi dasar (base case) yang menentukan kapan rekursi berhenti, yaitu saat n = 1 sehingga nilai yang dikembalikan adalah 1. Sedangkan bagian else digunakan untuk proses rekursi, yaitu menghitung faktorial dengan cara mengalikan n dengan hasil pemanggilan fungsi faktorial dari n-1 hingga mencapai kondisi pada if.
2. iya, Perulangan pada method faktorialBF() tidak harus menggunakan for, tetapi juga bisa menggunakan while atau do-while karena keduanya sama sama digunakan untuk melakukan perulangan sampai kondisi tertentu terpenuhi.
   int faktorialBF(int n) {
    int fakto = 1;
    int i = 1;
    while (i <= n) {
        fakto = fakto * i;
        i++;
    }
    return fakto;
}
3. perbedaan nya terletak di cara menghitung nya,
   fakto *= i; digunakan untuk menghitung faktorial dengan perulangan. berarti nilai fakto dikalikan dengan i lalu hasilnya disimpan kembali ke dalam fakto.
   Sedangkan int fakto = n * faktorialDC(n-1) pernyataan ini menghitung faktorial dengan cara memanggil fungsi itu sendiri menggunakan nilai yang lebih kecil (n-1) sampai mencapai kondisi dasar. Jadi perbedaannya adalah yang pertama menggunakan perulangan, sedangkan yang kedua menggunakan rekursi.
4. Kesimpulannya, faktorialBF() menghitung faktorial menggunakan perulangan (loop) dengan mengalikan angka dari 1 sampai n secara langsung. Sedangkan faktorialDC() menghitung faktorial menggunakan rekursi, yaitu memanggil method yang sama dengan nilai n-1 hingga mencapai kondisi dasar (n = 1).

## Perocbaan 2
<img width="564" height="631" alt="image" src="https://github.com/user-attachments/assets/6a9a8da7-438d-4aef-82b1-456d522d605d" />
<img width="193" height="164" alt="Screenshot 2026-03-11 135423" src="https://github.com/user-attachments/assets/879ad1a8-ebbb-4afb-8a3f-f25e9aefe85a" />

Pertanyaan 
1.Perbedaan antara pangkatBF dan pangkatDC
pangkatBF():
- Menghitung pangkat menggunakan perulangan (loop).
- Nilai basis dikalikan dengan dirinya sendiri sebanyak n kali.
- Prosesnya dilakukan secara berurutan dari awal sampai akhir.

pangkatDC():
- Menghitung pangkat menggunakan rekursi dengan konsep Divide and Conquer.
- Nilai pangkat dipecah menjadi n/2 lalu memanggil method yang sama.
- Jika n ganjil dikalikan lagi dengan a, jika n genap cukup mengalikan hasil rekursi.

2. ada,
   return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2) * a);

3. Menurut saya, method pangkatBF() tidak harus memiliki parameter karena pada class Pangkat sudah terdapat atribut nilai dan pangkat yang menyimpan data basis dan pangkat.
   int pangkatBF() {
    int hasil = 1;
    for (int i = 0; i < pangkat; i++) {
        hasil = hasil * nilai;
    }
    return hasil;
   }
5. pangkatBF(), perhitungan dilakukan langsung dan berurutan dari awal sampai akhir.
   pangkatDC(), perhitungan dilakukan dengan membagi masalah lalu menggabungkan hasilnya.

 ## Percobaan 3
<img width="597" height="464" alt="image" src="https://github.com/user-attachments/assets/93986578-9f77-49e6-8ed2-e057b147d346" />
<img width="236" height="90" alt="image" src="https://github.com/user-attachments/assets/b9e905e2-4a3c-4b77-a990-5c3ee82d8600" />

Pertanyaan
1. Variabel mid digunakan untuk menentukan titik tengah array agar data dapat dibagi menjadi dua bagian dalam proses.
2. double lsum = totalDC(arr, l, mid); → menghitung jumlah elemen pada bagian kiri array dari indeks l sampai mid
   double rsum = totalDC(arr, mid+1, r); → menghitung jumlah elemen pada bagian kanan array dari indeks mid+1 sampai r.
3. Penjumlahan lsum + rsum diperlukan untuk menggabungkan hasil penjumlahan dari bagian kiri dan kanan array yang sebelumnya terbagi.
4. hanya ada satu elemen pada array tersebut, sehingga nilai elemen itu langsung dikembalikan tanpa pembagian lagi.
5. kesimpulanya, membagi array menjadi dua bagian menggunakan nilai tengah (mid), kemudian menghitung jumlah masing-masing bagian secara rekursif hingga mencapai base case (satu elemen). Setelah itu, hasil dari bagian kiri (lsum) dan kanan (rsum) dijumlahkan kembali untuk mendapatkan total keseluruhan elemen dalam array.


## Latihan Praktikum 1
<img width="474" height="940" alt="image" src="https://github.com/user-attachments/assets/dffeff19-8e7d-4946-832e-13f333569a07" />
<img width="194" height="109" alt="image" src="https://github.com/user-attachments/assets/7cb658c5-8561-497f-8f28-aeb7376d7296" />
