package Praktikum5;

public class MahasiswaBerprestasi30 {

        Mahasiswa30 [] listMhs = new Mahasiswa30 [5];
        int idx;

    void tambah (Mahasiswa30 m){
        if (idx < listMhs.length){
            listMhs[idx]=m;
            idx++;
        }else {
            System.out.println("data sudah penuh");
        }
    }
    void tampil(){
        for (Mahasiswa30 m:listMhs){

            m.tampilInformasi();
            System.out.println("-----------------------");
        }
    }
    void bubbleSort(){
        for (int i = 0; i < listMhs.length-1; i++) {
            for (int j = 1; j < listMhs.length-i; j++) {
                
            }
        }
    }
}
