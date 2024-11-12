class KomputerPremium extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    protected boolean ruangPrivat;
    
    // To do: Buatlah constructor pada class KomputerPremium
    
    public KomputerPremium(boolean ruangPrivat, float harga, int jumlahKomputer, String namaWarnet) {
        super(harga, jumlahKomputer, namaWarnet);
        this.ruangPrivat = ruangPrivat;
    }
    


    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    @Override
    public void Informasi() {
        
        System.out.println("INFORMASI KOMPUTER:");
        System.out.println("Jumlah komputer = " + jumlahKomputer);
        System.out.println("Nama Warnet = " + namaWarnet);
        System.out.println("Harga per jam = " + harga);


        if (ruangPrivat == true) {
            System.out.println("Status = Ruangan Premium");
            System.out.println(" ");
            System.out.println("Fasilitas ruang premium: ");
            System.out.println("- Ruangan ber AC pribadi");
            System.out.println("- Sofa gaming exclusive");
            System.out.println("- Komputer spesifikasi tinggi");
            System.out.println("- Koneksi internet dedicated 100Mbps");
            System.out.println(" ");
        }
        else {
            System.out.println("Fasilitas ruang standar");
            System.out.println("- Ruangan gerah");
            System.out.println("- Sofa Majapahit");
            System.out.println("- Komputer spesifikasi rendah");
            System.out.println("- Koneksi internet shared 100Mbps");
            System.out.println(" ");
        }
    }
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    
    // To do: Buatlah method Pesan sesuai dengan ketentuan
    public void Pesan(int nomorKomputer) {
        System.out.println("Memesan nomor komputer: " + nomorKomputer);
    }


    // To do: Buatlah method TambahLayanan sesuai dengan ketentuan

    public void TambahLayanan(String makanan) {
        System.out.println("Mesan makanan: " + makanan);
    }
    
    // To do: Buatlah method TambahLayanan memakai Polymorphism Overloading sesuai dengan ketentuan
    public void TambahLayanan(String makanan, String minuman) {
        System.out.println("Mesan lagi: " + makanan + " dan " + minuman);
        System.out.println(" ");
    }
    
}
