package Pertemuan12;

import org.w3c.dom.Node;

public class SingleLinkedList30 {
    NodeMahasiswa30 head;
    NodeMahasiswa30 tail;

    boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if(!isEmpty()) {
            NodeMahasiswa30 tmp = head;
            System.out.print("Isi Linked List:\t");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(Mahasiswa30 input) {
        NodeMahasiswa30 ndInput = new NodeMahasiswa30(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast (Mahasiswa30 input) {
        NodeMahasiswa30 ndInput = new NodeMahasiswa30(input, null);

        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, Mahasiswa30 input) {
        NodeMahasiswa30 ndInput = new NodeMahasiswa30 (input, null);
        NodeMahasiswa30 temp = head;
        do {
            if(temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index, Mahasiswa30 input) {
        if (index < 0) {
            System.out.println("indeks salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            NodeMahasiswa30 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new NodeMahasiswa30(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
}
