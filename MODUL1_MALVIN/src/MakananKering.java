

public class MakananKering {
    // Todo : Create private attribute of MakananKering (nama, jumlah, harga, and brand)
    private String nama;
    private int jumlah;
    private double harga;
    private String namaBrand;
    

    // Todo : Create Constructor of MakananKering
    public MakananKering (String nama, int jumlah, double harga, String namaBrand){ 
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
        this.namaBrand = namaBrand;
    }

    // Todo : Create Getter and Setter
    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama; 
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

    public void setHarga(double harga){
        this.harga = harga; 
    }

    public String getNamaBrand(){
        return namaBrand;
    }

    public void setNamaBrand(String namaBrand){
        this.namaBrand = namaBrand; 
    }

    // Todo : Create Method ShowData

    public void ShowData (){
        System.out.println("Nama : " + this.nama);
        System.out.println("Harga : " + this.harga);
        System.out.println("Jumlah : " + this.jumlah);
        System.out.println("Brand : " + this.namaBrand);
    }

}
