/**
 * Created by rdp on 09/06/2015.
 */
public class Pemilik {

        private String namaPemilik;
        private String alamatPemilik;
        private String jenisKelamin;
        private String pekerjaan;

    public Pemilik(String namaPemilik, String alamatPemilik, String jenisKelamin, String pekerjaan) {
        this.namaPemilik = namaPemilik;
        this.alamatPemilik = alamatPemilik;
        this.jenisKelamin = jenisKelamin;
        this.pekerjaan = pekerjaan;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    public String getAlamatPemilik() {
        return alamatPemilik;
    }

    public void setAlamatPemilik(String alamatPemilik) {
        this.alamatPemilik = alamatPemilik;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    @Override
    public String toString() {
        return "Pemilik{" +
                "namaPemilik='" + namaPemilik + '\'' +
                ", alamatPemilik='" + alamatPemilik + '\'' +
                ", jenisKelamin='" + jenisKelamin + '\'' +
                ", pekerjaan='" + pekerjaan + '\'' +
                '}';
    }
}
