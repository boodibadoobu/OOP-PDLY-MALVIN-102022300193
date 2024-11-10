public class Hewan {    //Ini adalah class hewan
    protected String nama;  //Protected Variable sehingga perlu di extends di class lain
    protected int umur;

    public Hewan(String nama, int umur) { //Constructor hewan
        this.nama = nama;
        this.umur = umur;
    }

    public void suara() { //Public method suara
        System.out.println();
    }

    public void makan(String makanan) { //Public method makanan
        System.out.println(nama + " sedang makan ");
        System.out.println(nama + " sedang makan " + makanan);
    }

    public void infoHewan() { //Public method info hewan
        System.out.println("Ini adalah " + nama + " !");
    }

    public void displayInfohewan() { //Public method untuk display info hewan
        System.out.println("Nama: " + nama + ", Umur: " + umur + ".");
    }
}
