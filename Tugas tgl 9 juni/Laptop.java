/**
 * Created by rdp on 09/06/2015.
 */
public class Laptop {
    private String merkLaptop;
    private int processor;
    private double hargaLaptop;
    private Pemilik singDue;

    public Laptop(String merkLaptop, int processor, double hargaLaptop, Pemilik singDue) {
        this.merkLaptop = merkLaptop;
        this.processor = processor;
        this.hargaLaptop = hargaLaptop;
        this.singDue = singDue;
    }

    public String getMerkLaptop() {
        return merkLaptop;
    }

    public void setMerkLaptop(String merkLaptop) {
        this.merkLaptop = merkLaptop;
    }

    public int getProcessor() {
        return processor;
    }

    public void setProcessor(int processor) {
        this.processor = processor;
    }

    public double getHargaLaptop() {
        return hargaLaptop;
    }

    public void setHargaLaptop(double hargaLaptop) {
        this.hargaLaptop = hargaLaptop;
    }

    public Pemilik getSingDue() {
        return singDue;
    }

    public void setSingDue(Pemilik singDue) {
        this.singDue = singDue;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "merkLaptop='" + merkLaptop + '\'' +
                ", processor=" + processor +
                ", hargaLaptop=" + hargaLaptop +
                ", singDue=" + singDue +
                '}';
    }
}
