package Jobsheet12;

public class DoubleLinkedList30 {
    Node30 head;
    Node30 tail;

    public DoubleLinkedList30() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa30 data) {
        Node30 newNode = new Node30(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa30 data) {
        Node30 newNode = new Node30(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNIM, Mahasiswa30 data) {
        Node30 current = head;
        while (current != null && !current.data.nim.equals(keyNIM)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNIM + " tidak ditemukan.");
            return;
        }

        Node30 newNode30 = new Node30(data);

        if(current == tail) {
            newNode30.prev = current;
            current.next = newNode30;
            tail = newNode30;
        } else {
            newNode30.prev = current;
            newNode30.next = current.next;
            current.next.prev = newNode30;
            current.next = newNode30;
        }
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNIM);
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong.");
            return;
        }

        Node30 current = head;
        while(current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong.");
            return;
        }

        Node30 current = tail;
        while (current != null) {
            current.data.tampil();
            current = current.prev;
        }
    }

    public void removeFIrst() {
        if (isEmpty()) {
            System.out.println("Linked masih kosong.");
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked masih kosong.");
            return;
        }
        System.out.println("Data berhasil dihapus.");
        tail.data.tampil();

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }
}
