<h4>Nama: Syahroni Nur'an Syafi'i<h4>
<h4>Kelas: TI 1E<h4>

##Peaktikum 1
A.

1.<img width="480" height="567" alt="image" src="https://github.com/user-attachments/assets/94c58ef4-8e82-4558-b058-6764ba6472f1" />

2.<img width="564" height="253" alt="image" src="https://github.com/user-attachments/assets/0476906a-7d58-43ee-ab94-c5dfab3ad466" />

3. <img width="282" height="63" alt="image" src="https://github.com/user-attachments/assets/8bc37d35-7e6d-4f47-882c-2519e05d4768" />

B.
1.<img width="512" height="201" alt="image" src="https://github.com/user-attachments/assets/c4e2e7a2-6fe8-4848-8d1f-4c576db18841" />

2.<img width="599" height="172" alt="image" src="https://github.com/user-attachments/assets/a8f319ed-6455-462a-bbf2-5d3cdf99dd1a" />

3.<img width="331" height="63" alt="image" src="https://github.com/user-attachments/assets/1c412758-57c4-4e90-9a5b-b7e9a2af4896" />

C. 
1.<img width="431" height="206" alt="Screenshot 2026-04-05 170536" src="https://github.com/user-attachments/assets/5f705900-53df-42d4-882d-52f3c86860f1" />

2.<img width="573" height="184" alt="Screenshot 2026-04-05 170549" src="https://github.com/user-attachments/assets/fd9ec6a9-da6a-444b-8025-d39b432c5b59" />

3.<img width="310" height="60" alt="image" src="https://github.com/user-attachments/assets/81dc76f9-ba00-4260-b3fc-b84031c71785" />

### Pertanyaan
1.data[j-1] > data[j]
- mengecek apakah elemen kiri lebih besar dari elemen kanan
  
- jika iya, berarti belum urut (ascending)
  
temp = data[j];

- menyimpan nilai sementara
  
data[j] = data[j-1];

- geser nilai kiri ke kanan
  
data[j-1] = temp;

- isi posisi kiri dengan nilai yang tadi disimpan
  
2. int min = i;
   
for (int j = i + 1; j < jumData; j++) {

    if (data[j] < data[min])
    
        min = j;
        
}

3.j >= 0, memastikan indeks tidak keluar dari array (tidak minus)
data[j] > temp, selama data sebelumnya lebih besar dari temp, maka harus digeser

4.menggeser elemen ke kanan



## Praktikum 2 (Bubble Sort)
1. <img width="672" height="412" alt="image" src="https://github.com/user-attachments/assets/2881bfa0-53a1-4e55-a3dc-eb1cee5c4685" />

2. <img width="357" height="779" alt="image" src="https://github.com/user-attachments/assets/0878305f-8b98-4479-8435-7739879f45d6" />

### Pertanyaan
1.Perulangan pada bubble sort digunakan untuk membandingkan elemen yang bersebelahan dan menukarnya jika tidak sesuai urutan.

a.Karena pada bubble sort, jumlah tahap pengurutan hanya sebanyak n-1

b.Karena setiap tahap (i), elemen terbesar sudah berada di posisi akhir, sehingga tidak perlu dibandingkan lagi.

c.49x, karena 50-1= 49

5.<img width="581" height="759" alt="image" src="https://github.com/user-attachments/assets/f6dd88ce-62d2-477f-ad31-657b86e5aba7" />



## Praktikum 2 (Selection Sort)
1. <img width="499" height="238" alt="image" src="https://github.com/user-attachments/assets/e9fe3f6a-065d-4536-954f-cf951f511108" />

2. <img width="549" height="70" alt="image" src="https://github.com/user-attachments/assets/dc2205d9-ccab-431a-84f9-a52d21f2864a" />

3. <img width="167" height="705" alt="image" src="https://github.com/user-attachments/assets/f0d15fe0-435d-4aff-a08b-e2eaa5fc550e" />
<img width="316" height="679" alt="image" src="https://github.com/user-attachments/assets/7e1c3dfd-5c03-449e-b2ff-31e1497eb9f7" />

### Pertanyaan
1. Kode tersebut berfungsi untuk mencari elemen dengan IPK terkecil pada bagian array yang belum terurut, lalu nantinya akan dipindahkan ke posisi yang seharusnya


## Praktikum 2 (Insertion Sort)
1.<img width="412" height="167" alt="image" src="https://github.com/user-attachments/assets/e759de80-0bbe-461a-81da-261875150ec4" />

2.<img width="569" height="70" alt="image" src="https://github.com/user-attachments/assets/a2f0a1fb-e7f4-40a3-80e6-0186999f702c" />

3.<img width="350" height="335" alt="image" src="https://github.com/user-attachments/assets/02993462-d972-4343-adee-ffd779452b72" />

### Pertanyaan
1. <img width="367" height="165" alt="image" src="https://github.com/user-attachments/assets/3ddb1338-c759-49f9-b03b-fc2f7d3a4134" />

while (j>0 && listMhs[j-1].ipk>temp.ipk) -> while (j>0 && listMhs[j-1].ipk<temp.ipk) 


## Latihan Praktikum
1. <img width="592" height="334" alt="image" src="https://github.com/user-attachments/assets/163e641d-612f-4519-87d1-08d49307b52a" />

2.<img width="514" height="847" alt="image" src="https://github.com/user-attachments/assets/e6051349-c444-44e5-b191-dfe337820105" />

3.<img width="612" height="899" alt="image" src="https://github.com/user-attachments/assets/b6ec4e90-82cf-4d08-adf7-7f009684e905" />

4. <img width="220" height="764" alt="image" src="https://github.com/user-attachments/assets/b0c7fa54-867f-4a2b-9206-b003c9e66c8d" />
<img width="287" height="537" alt="image" src="https://github.com/user-attachments/assets/1303e112-de49-4f49-b0b9-dfb1bcf8d92d" />
