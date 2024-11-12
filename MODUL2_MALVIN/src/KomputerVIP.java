class KomputerVIP extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    protected boolean vipCard;
    
    // To do: Buatlah constructor pada class KomputerVIP
    public KomputerVIP(boolean vipCard, float harga, int jumlahKomputer, String namaWarnet) {
        super(harga, jumlahKomputer, namaWarnet);
        this.vipCard = vipCard;
    }

    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 

    @Override
    public void Informasi() {
        System.out.println("INFORMASI KOMPUTER:");
        System.out.println("Jumlah komputer = " + jumlahKomputer);
        System.out.println("Nama Warnet = " + namaWarnet);
        System.out.println("Harga per jam = " + harga);

        if (vipCard == true)  {
            System.out.println("Status = Member VIP");
            System.out.println(" ");
            System.out.println("- Diskon 10% jika main di atas 5 jam");
            System.out.println("- Gratis Minuman untuk 4 jam bermain");
            System.out.println("- Prioritas komputer gaming");
            System.out.println(" ");
        }
        else {
            System.out.println("Status = Bukan VIP");
            System.out.println("Minimal VIP boss klo mau dpt benefit");
            System.out.println(" ");
        }
        
    }
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    
    // To do: Buatlah method Login sesuai dengan ketentuan

    public void Login(String username) {
        System.out.println("Login dengan username: " + username);
    }

    // To do: Buatlah method Bermain sesuai dengan ketentuan
    
    public void Bermain(int jam) {
        System.out.println("Bermain selama: " + jam + " jam");
    }

    // To do: Buatlah method Bermain memakai Polymorphism Overloading sesuai dengan ketentuan

    public void Bermain(int jam, int menitTambahan) {
        System.out.println("Nambah billing selama: " + jam + " jam " + menitTambahan + "Menit");
        System.out.println(" ");
    }
    

}