// Don't delete any comments below!!!

public class Makanan {
    // Todo : Create private attribute of Makanan (nama, jumlah, and harga)
    private String namaMakanan;
    private int jumlah;
    private double harga;

    // Todo : Create Constructor of Makanan
    public Makanan (String namaMakanan, int jumlah, double harga){ 
        this.namaMakanan = namaMakanan;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    // Todo : Create Getter and Setter

    public String getNamaMakanan(){
        return namaMakanan;
    }

    public void setNamaMakanan(String namaMakanan){
        this.namaMakanan = namaMakanan; 
    }

    public int getJumlah(){
        return jumlah;
    }

    public void setJumlah(int jumlah){
        this.jumlah = jumlah; 
    }

    public double getHarga(){
        return harga;
    }

    public void setHarga(Double harga){
        this.harga = harga; 
    }
}
