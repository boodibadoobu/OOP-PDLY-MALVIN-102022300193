public class Main {
    public static void main(String[] args) {

        // To do: Buatlah sebuah Objek baru dari class Komputer
        Komputer komputerBaru = new Komputer(5000, 20, "Warnet Gaming X");

        // To do: Panggillah Method Informasi dari class Komputer

        komputerBaru.Informasi();


        // To do: Buatlah sebuah Objek baru dari class KomputerVIP 
        KomputerVIP vipBaru = new KomputerVIP(true, 7000, 15, "Warnet Gaming X");

        // To do: Panggillah Method Informasi dari class KomputerVIP
        vipBaru.Informasi();

        // To do: Panggillah Method Login
        vipBaru.Login("Wahyudi");

        // To do: Panggillah Method Bermain 2x agar dapat melakukan polymorphism overloading
        vipBaru.Bermain(4);
        vipBaru.Bermain(1, 15);

        System.out.println("=================================");


        // To do: Buatlah sebuah Objek baru dari class KomputerPremium

        KomputerPremium ruangPremium = new KomputerPremium(true, 10000, 5, "Warnet Gaming X");

        // To do: Panggillah Method Informasi dari class KomputerPremium
        ruangPremium.Informasi();

        // To do: Panggillah Method Pesan\
        ruangPremium.Pesan(7);
        
        // To do: Panggillah Method TambahLayanan 2x agar dapat melakukan polymorphism overloading
        ruangPremium.TambahLayanan("Biji wijen");
        ruangPremium.TambahLayanan("Krabby Patty", "Minyak bumi");
    }
}