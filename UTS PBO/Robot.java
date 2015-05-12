public class Robot {
	public int Sensor;
	public int Servo;
	public int Power;

	public void Robot(){
		Sensor= 4;
		System.out.println("Jumlah Sensor Robot :"+ Sensor );
	}
}
	

		class Asimo25 extends Robot{
			public int Kamera;
			public Asimo25(int satu, int dua, int tiga, int empat){
				Sensor= satu;
				Servo= dua;
				Power= tiga;
				Kamera= empat;
			}
		public void CetakSpesifikasi(){
			System.out.println("Jumlah Sensor Asimo25 :" + Sensor);
			System.out.println("Jumlah Servo Asimo25 :" + Servo);
			System.out.println("Kapasitas Power Asimo25 :" + Power);
			System.out.println("Jumlah Kamera :" + Kamera + "\n");
		} 

		public void Upgrade(int satu){
			Sensor= satu;
			System.out.println("Asimo25 diupgrade dengan jumlah sensor :"+ Sensor);
		}
	}