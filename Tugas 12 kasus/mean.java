class mean {
	public static void main(String[] args) {
	 int pertama = 1;
	 int terakhir = 10;
	 double jumlah = 0;
	 double mean = 0;
	 System.out.println("batas pertama=" +pertama);
	 System.out.println("batas terakhir=" +terakhir);
	 while (pertama<=terakhir) {
	 	jumlah=jumlah+pertama;
	 	pertama++;	
	 }
	 mean=jumlah/terakhir;
	 System.out.println("jumlah dari angka="+jumlah);
	 System.out.println("mean="+mean);	
	}
	
}