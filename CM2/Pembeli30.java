package CM2;

public class Pembeli30 {
    int noAntiran;
    String namaPembeli;
    String noHp;
    Pembeli30 prev, next;

    Pembeli30(int noAntrian, String namaPembeli, String noHp) {
        this.noAntiran = noAntrian;
        this.namaPembeli = namaPembeli;
        this.noHp = noHp;
        this.prev = null;
        this.next = null;
    }
}
