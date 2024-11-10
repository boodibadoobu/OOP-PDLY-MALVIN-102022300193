public class Burung extends Hewan {
    private String warnaBulu;

    public Burung(String nama, int umur, String warnaBulu) {
        super(nama, umur); //Inheritance dari Hewan.java
        this.warnaBulu = warnaBulu;
    }

    @Override //Mengganti isi dari method suara di Hewan.java
    public void suara() {
        System.out.println(nama + " berkicau");
    }

    @Override //Mengganti isi dari method info hewan di Hewan.java
    public void infoHewan() {
        super.infoHewan();
        System.out.println(nama + " memiliki warna bulu " + warnaBulu);
    }

    @Override //Mengganti isi dari method display info hewan di Hewan.java
    public void displayInfohewan() {
        super.displayInfohewan();
        System.out.println("Warna bulu: " + warnaBulu );
    }

}
