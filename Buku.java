//Object Class

public class Buku {

    int id;
    String judul;
    int tahunterbit;
    String pengarang;

    //Constructor
    //method Buku
    public Buku() {
        id = 78436;
        judul = "Blue lock";
        tahunterbit = 2018;
        pengarang = "Muneyuki";
    }
    //Constructor Parameter

    public Buku(int id, String judul, int tahunterbit, String pengarang) {
        //variabel = parameter
        this.id = id;
        this.judul = judul;
        this.tahunterbit = tahunterbit;
        this.pengarang = pengarang;
        id = 20907;
        judul = "skibiditoilet";
        tahunterbit = 2020;
        pengarang = "dafuqboom";

        id = 76923;
        judul = "whatthesigma";
        tahunterbit = 2080;
        pengarang = "squidward";

        id = 99766;
        judul = "guardiantales";
        tahunterbit = 2017;
        pengarang = "kongstudio";

        id = 21910;
        judul = "miku";
        tahunterbit = 2012;
        pengarang = "vocaloid";
    }

}
