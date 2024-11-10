public class Main{
    public static void main(String[] args) {
        System.out.println("Detail Hewan");
        System.out.println(" ");

        Kucing namaKucing = new Kucing("Momo", 2, "Persia"); //Panggil class Kucing
        
        //Hasil output
        namaKucing.infoHewan();
        namaKucing.suara();
        namaKucing.makan("Ikan");
        System.out.println(" ");

        Burung namaBurung = new Burung("Schlatt", 4, "Cyan"); //Panggil class Burung

        //Hasil output
        namaBurung.infoHewan();
        namaBurung.suara();
        namaBurung.makan("Biji - bijian");
        System.out.println(" ");

        // Menampilkan informasi hewan
        namaKucing.displayInfohewan();
        namaBurung.displayInfohewan();
    }
}
