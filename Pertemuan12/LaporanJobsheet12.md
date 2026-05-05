<h4>Nama: Syahroni Nur'an Syafi'i<h4>
<h4>Kelas: TI-1E<h4>

## Praktikum 1
<img width="528" height="308" alt="image" src="https://github.com/user-attachments/assets/0eb565be-4e5e-43c4-9c84-c1461550e70b" />

<img width="401" height="921" alt="image" src="https://github.com/user-attachments/assets/7dbaf575-44ea-46c8-a9fc-50bd380633b2" />

<img width="408" height="944" alt="image" src="https://github.com/user-attachments/assets/57e315a7-ea59-4385-80c9-3815c2318219" />

<img width="487" height="292" alt="image" src="https://github.com/user-attachments/assets/800b6d99-f2ce-4b45-ad75-9ca75505e6b5" />

### Output
<img width="248" height="120" alt="image" src="https://github.com/user-attachments/assets/2cc1eca1-7f61-4d35-9f70-eae5dd8d76be" />

### Pertanyaan
1. Karena sll.print() dipanggil sebelum ada data yang ditambahkan. Saat itu head == null, sehingga isEmpty() mengembalikan true dan program masuk ke blok else yang mencetak "Linked list kosong".
   
2. temp adalah pointer traversal sementara yang menelusuri node satu per satu tanpa menggeser posisi head atau tail. Tanpa temp, jika head yang digerakkan maka data awal linked list akan hilang.
   
3. <img width="570" height="509" alt="image" src="https://github.com/user-attachments/assets/762fc7e0-8e26-4d8f-b226-bb44d990037e" />

## Praktikum 2
<img width="515" height="436" alt="image" src="https://github.com/user-attachments/assets/bceab83a-7d51-4c4d-8190-70863b143054" />

<img width="455" height="971" alt="image" src="https://github.com/user-attachments/assets/4d7c890b-10ec-442a-b84b-9ca766abd01f" />

### Output
<img width="246" height="98" alt="image" src="https://github.com/user-attachments/assets/2e12c755-91dc-4aaf-904e-cf584369add6" />

### Pertanyaan 
1. break menghentikan loop tepat setelah node ditemukan dan dihapus. Tanpa break, loop akan terus berjalan ke node berikutnya padahal penghapusan sudah selesai, membuang waktu dan berpotensi menyebabkan error.

2. temp.next = temp.next.next, memotong node target dari rantai. temp adalah node sebelum node yang dihapus, jadi dengan melompati node target langsung ke node sesudahnya, node target tidak lagi terhubung ke linked list.
   if (temp.next == null) tail = temp, jika setelah penghapusan temp.next menjadi null, berarti node yang dihapus adalah node terakhir, sehingga tail harus diperbarui ke temp agar tidak menunjuk ke node yang sudah dihapus

## Tugas
1. <img width="497" height="267" alt="image" src="https://github.com/user-attachments/assets/7082b346-b0d5-4bcf-8c83-e5d64df68798" />

2. <img width="335" height="151" alt="image" src="https://github.com/user-attachments/assets/a5548ab3-7513-472f-9125-a4ed84a77b75" />

3.<img width="582" height="843" alt="image" src="https://github.com/user-attachments/assets/6886ab92-f48d-4cac-ac07-6b727721ed80" />
<img width="415" height="457" alt="image" src="https://github.com/user-attachments/assets/704de3dd-62ba-4b4b-8b88-d0b2423c14ba" />

4. <img width="589" height="640" alt="image" src="https://github.com/user-attachments/assets/5f66ee77-645c-47c2-9402-bbba93acf0e0" />
