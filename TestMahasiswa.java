public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Ridwan Riswanto",20);
        mhs.tampilkanBiodata();
        System.out.println();
        
        mhs.setUmur(25);
        mhs.tampilkanBiodata();
    }
}