class Komputer {
    // To do: Buatlah 3 variable sesuai ketentuan
    protected int jumlahKomputer;
    protected String namaWarnet;
    protected float harga;
    
    // To do: Buatlah constructor pada class Komputer
    public Komputer(float harga, int jumlahKomputer, String namaWarnet) {
        this.harga = harga;
        this.jumlahKomputer = jumlahKomputer;
        this.namaWarnet = namaWarnet;

    // To do: Buatlah Method Informasi dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    
    }

    public void Informasi () {
        System.out.println("INFORMASI KOMPUTER:");
        System.out.println("Jumlah komputer = " + jumlahKomputer);
        System.out.println("Nama Warnet = " + namaWarnet);
        System.out.println("Harga per jam = " + harga);
        System.out.println("");
        System.out.println("=======================================");
        System.out.println("");
    }

}