<h4>Nama: Syahroni Nur'an Syafi'i<h4>
<h4>Kelas: TI-1E<h4>

## Praktikum 1
<img width="588" height="592" alt="image" src="https://github.com/user-attachments/assets/91fdf4bf-1b89-4d63-bc8e-be4503d1fc05" />

<img width="331" height="70" alt="image" src="https://github.com/user-attachments/assets/c9a41e2c-057f-4845-b489-4055777c5dd2" />

### Pertanyaan
1. Karena pembuatan objek List l = new ArrayList(); tidak menggunakan parameter generic.
2. <img width="533" height="595" alt="image" src="https://github.com/user-attachments/assets/53aa78f4-c30b-4935-b631-84a087767911" />

3. <img width="312" height="17" alt="image" src="https://github.com/user-attachments/assets/bd24c3d1-fd5c-45af-af36-c33fabf38034" />
4. Fungsi push() pada kelas LinkedList bekerja memasukkan data baru ke urutan paling depan (indeks 0). Oleh karena itu, saat "Mei-mei" dimasukkan menggunakan push(), posisinya langsung berada di awal list sehingga method getFirst() akan mencetak nama "Mei-mei".
5. Modifikasi ini membuktikan bahwa LinkedList sangat fleksibel. Kita bisa memanipulasinya seperti ArrayList menggunakan indeks biasa (melalui add() dan set()), namun di saat yang sama kita juga bisa melakukan operasi Stack (menggunakan push()) pada satu objek koleksi yang sama.


## Praktikum 2
<img width="517" height="747" alt="image" src="https://github.com/user-attachments/assets/fc2e9708-3a65-4fb6-aa8e-2e1ad2cae4e4" />

<img width="261" height="91" alt="image" src="https://github.com/user-attachments/assets/349d7977-36f9-4568-b273-e63474b36776" />

### Pertanyaan
1. Asal-usul fungsi, push() adalah fungsi asli bawaan khusus dari kelas Stack yang dirancang untuk operasi tumpukan. Sementara add() adalah fungsi warisan (inheritance) dari kelas Vector atau Collection yang sifatnya lebih umum untuk list biasa.
   Nilai kembalian, Fungsi push() akan mengembalikan objek data yang baru saja dimasukkan ke dalam tumpukan setelah berhasil diksekusi. Sebaliknya, fungsi add() akan mengembalikan nilai berupa boolean (true atau false) sebagai penanda apakah koleksi data tersebut berhasil mengalami perubahan tipe atau tidak.
2. Setelah loop while(!fruits.empty()), semua elemen sudah habis di-pop sehingga stack kosong. Maka iterasi Iterator, Stream, dan for-index di bawahnya tidak akan menampilkan apapun. Baris 43-44 wajib ada agar ada elemen untuk diiterasi.
3. Digunakan untuk menelusuri elemen satu per satu menggunakan objek Iterator. hasNext() mengecek apakah masih ada elemen, next() mengambilnya. Keunggulan Iterator: bisa melakukan it.remove() saat iterasi tanpa ConcurrentModificationException.
4. <img width="332" height="17" alt="image" src="https://github.com/user-attachments/assets/d92bc41a-99fa-4bd9-beaa-1a942b1f21be" />
Compile error karena push(), pop(), empty() adalah method milik class Stack, bukan interface List. Jika tipe variabel adalah List<String>, compiler tidak mengenali method tersebut meskipun objeknya tetap Stack.
5.<img width="527" height="787" alt="image" src="https://github.com/user-attachments/assets/f06be505-b77a-4614-9e34-5b63c9a36b98" />
6. <img width="537" height="890" alt="image" src="https://github.com/user-attachments/assets/16c8a286-8627-4207-a6ce-a2d9c519d885" />

## Praktikum 3
<img width="473" height="227" alt="image" src="https://github.com/user-attachments/assets/a40c3998-3817-4723-aff6-1344f0103ff9" />

<img width="481" height="595" alt="image" src="https://github.com/user-attachments/assets/c3481252-8aaa-43c8-aef4-658a9698b4bd" />

<img width="345" height="107" alt="image" src="https://github.com/user-attachments/assets/00586fec-bcf4-48f7-aae1-42ff6ef26447" />

### Pertanyaan
1. - Method bisa dipanggil dengan jumlah argumen berapa saja: lm.tambah(m), lm.tambah(m, m1), lm.tambah(m, m1, m2) — semuanya valid
   - Tidak perlu membuat overload method berbeda-beda
   - Di dalam method, parameter varargs diperlakukan sebagai array
2. <img width="318" height="92" alt="image" src="https://github.com/user-attachments/assets/e8a73113-fba0-4b37-8d33-466890547c52" />
3. <img width="335" height="85" alt="image" src="https://github.com/user-attachments/assets/49dff9ba-abde-4052-b2e5-32cf77585b2d" />

## Tugas Praktikum
<img width="420" height="252" alt="image" src="https://github.com/user-attachments/assets/c90771fd-d6d2-4c76-8734-dd24cbf5b137" />

<img width="376" height="256" alt="image" src="https://github.com/user-attachments/assets/608688e2-9632-4b3e-983f-bed8b01424b2" />

<img width="430" height="278" alt="image" src="https://github.com/user-attachments/assets/40121ef6-d1c6-4906-83f4-b2fbd9f69029" />

<img width="498" height="732" alt="image" src="https://github.com/user-attachments/assets/d1aed50a-64f9-4ebf-b581-6044c8ab4b22" />
<img width="745" height="785" alt="image" src="https://github.com/user-attachments/assets/fb450e51-87c2-42f3-be7c-68a05819d0dd" />
<img width="522" height="335" alt="image" src="https://github.com/user-attachments/assets/5e32b0f7-bb11-497a-a560-8352f2d4e7d8" />
