/**
 * Created by rdp on 09/06/2015.
 */
public class TestLaptop {
    public static void main(String[] args) {

        Pemilik rifqi = new Pemilik ("rifqi dwi","lumajang","laki-laki","mahasiswa");
        System.out.println("semua data : "+ rifqi.toString());
        System.out.println("alamat pemilik :" + rifqi.getAlamatPemilik());
        System.out.println("jenis kelamin :" + rifqi.getJenisKelamin());
        System.out.println("pekerjaan :" + rifqi.getPekerjaan());



    }
}
