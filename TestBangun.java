public class TestBangun
{
	public static void main(String[] args)
	{
		Segitiga bangun_Segitiga = new Segitiga();
		Lingkaran bangun_Lingkaran = new Lingkaran();
		
		bangun_Segitiga.alas = 22;
		bangun_Segitiga.tinggi = 10;
		bangun_Segitiga.sisimiring = 40;
		bangun_Lingkaran.jari= 14;
		bangun_Lingkaran.diameter= 28;
				
		bangun_Lingkaran.CetakMonitor();
		System.out.println("Luas Lingkaran: " + bangun_Lingkaran.

		hitungLuasLingkaran());
		System.out.println("Keliling Lingkarang: " + bangun_Lingkaran.

		hitungKelilingLingkaran());

		bangun_Segitiga.CetakMonitor();
		System.out.println("Luas Segitiga: " + bangun_Segitiga.

		hitungLuasSegitiga());
		System.out.println("Keliling Segitiga: " + bangun_Segitiga.

		hitungKelilingSegitiga());
		}

}