public class Kucing extends Hewan{
    private String ras;

    public Kucing(String nama, int umur, String ras) {
        super(nama, umur); //Inheritance dari Hewan.java
        this.ras = ras;
    }

    @Override //Mengganti isi dari method suara di Hewan.java
    public void suara() {
        System.out.println(nama + " mengeong");
    }

    @Override //Mengganti isi dari method info hewan di Hewan.java
    public void infoHewan() {
        super.infoHewan();
        System.out.println(nama + " adalah kucing " + ras);
    }

    @Override //Mengganti isi dari method display info hewan di Hewan.java
    public void displayInfohewan() {
        super.displayInfohewan();
        System.out.println("Ras: " + ras);
    }

}
