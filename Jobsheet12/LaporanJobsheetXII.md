<img width="416" height="786" alt="image" src="https://github.com/user-attachments/assets/0905ead4-0a20-4b34-935d-7afc64138523" /><h4>Nama: Syahroni Nur'an Syafi'i<h4>
<h4>Kelas: TI-1E<h4>

## Praktikum 1
<img width="550" height="400" alt="image" src="https://github.com/user-attachments/assets/ba64c93f-a064-4659-8dbb-e45116b8b4fa" />

<img width="334" height="215" alt="image" src="https://github.com/user-attachments/assets/553fdfbd-7447-4740-af9d-ee6670b91629" />

<img width="474" height="863" alt="image" src="https://github.com/user-attachments/assets/8b8a3c13-6c3f-4fb3-8fe7-516dd015a4f0" />

<img width="406" height="929" alt="image" src="https://github.com/user-attachments/assets/5f06c018-0dc4-447f-8dd0-4006769d2b40" />

<img width="278" height="791" alt="Screenshot 2026-05-12 182216" src="https://github.com/user-attachments/assets/c54c72fb-b743-462f-a2af-7986ee83a4f3" />

### Pertanyaan
1. Singl hanya ada pointer next (traversal satu arah),
   Double ada next dan prev (2 arah)

2. next, menunjukan node berikutnya. Jika nilai next adalah null, berarti node tersebut adalah node terakhir (tail).
   prev, menujukan node sebelumnya. Jika nilai prev adalah null, berarti node tersebut adalah node pertama (head).

3. Konstruktor pada class DoubleLinkedList berfungsi untuk menginisialisasi kondisi awal linked list dengan menetapkan head = null dan tail = null. Kondisi ini menandakan bahwa linked list masih kosong saat pertama kali dibuat.

4. Ketika linked list masih kosong dan node pertama baru saja ditambahkan, node tersebut sekaligus menjadi node pertama sekaligus node terakhir dalam linked list. Oleh karena itu head dan tail harus menunjuk ke node yang sama. Jika hanya head yang diset, maka tail tetap null sehingga operasi seperti addLast() akan gagal karena bergantung pada tail.

5. <img width="396" height="73" alt="image" src="https://github.com/user-attachments/assets/5402fd2b-30cc-450c-b6dd-3e8f516a5dd3" />

6. <img width="426" height="167" alt="image" src="https://github.com/user-attachments/assets/513b1850-7c3b-462d-a399-2703352adfd6" />

## Praktikum 2
<img width="422" height="389" alt="image" src="https://github.com/user-attachments/assets/3d7ffd06-d8f5-4d3e-9907-2bc5969074fb" />

<img width="334" height="104" alt="image" src="https://github.com/user-attachments/assets/d1f52f2b-7b84-4449-b3f4-3b6c76e8d08c" />

<img width="259" height="332" alt="image" src="https://github.com/user-attachments/assets/b7e7705f-c94b-4106-a24b-7f3d431a874d" />


### Pertanyaan
1. head = head.next;, berfungsi untuk memindahkan pointer head dari node pertama yang akan dihapus ke node berikutnya. Setelah statement ini dijalankan, node kedua menjadi node pertama yang baru dalam linked list. Node lama sudah tidak bisa diakses lagi karena head sudah tidak menunjuk ke sana.
   head.prev = null;, berfungsi untuk memutus pointer prev dari node kepala yang baru agar tidak lagi menunjuk ke node lama yang sudah dihapus. Jika statement ini tidak dilakukan, node kepala baru masih memiliki referensi ke node yang seharusnya sudah dihapus, sehingga dapat menyebabkan kesalahan data atau memory leak.

2. <img width="394" height="219" alt="image" src="https://github.com/user-attachments/assets/c4eb8419-c8ec-4f17-9c50-c7d53becc5dd" />


## Tugas
<img width="410" height="456" alt="image" src="https://github.com/user-attachments/assets/05747fc7-a210-45f9-9c44-29ffd5dde619" />

<img width="537" height="948" alt="image" src="https://github.com/user-attachments/assets/d21c83c4-7908-464f-9103-8027265b3e87" />

<img width="527" height="747" alt="image" src="https://github.com/user-attachments/assets/947c0f27-c795-4e1d-9dbf-e80e13b770ff" />

<img width="426" height="661" alt="image" src="https://github.com/user-attachments/assets/a9bd2533-083f-4d61-bad0-4d74a0d5820c" />

<img width="429" height="910" alt="image" src="https://github.com/user-attachments/assets/c77e105f-965c-46de-9b1b-d2019a0b5c14" />

<img width="422" height="70" alt="image" src="https://github.com/user-attachments/assets/a9564c2f-88a6-4f6a-97d4-85df561fac43" />

