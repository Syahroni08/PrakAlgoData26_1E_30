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
                if (listMhs[j].ipk>listMhs[j-1].ipk){
                    Mahasiswa30 tmp = listMhs[j];
                    listMhs[j]=listMhs[j-1];
                    listMhs[j-1]=tmp;
                }
            }
        }
    }
    void selestionSort() {
        for (int i = 0; i < listMhs.length-1; i++) {
            int idxMin=i;
            for (int j = i+1; j < listMhs.length; j++) {
                if (listMhs[j].ipk<listMhs[idxMin].ipk){
                    idxMin=j;
                }
            }
            Mahasiswa30 tmp = listMhs[idxMin];
            listMhs[idxMin]=listMhs[i];
            listMhs[i]=tmp;
        }
    }
    void insertionSort(){
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa30 temp = listMhs[i];
            int j=i;
            while (j>0 && listMhs[j-1].ipk>temp.ipk){
                listMhs[j] = listMhs[j-1];
                j--;
            }
            listMhs[j]=temp;
        }
    }
}