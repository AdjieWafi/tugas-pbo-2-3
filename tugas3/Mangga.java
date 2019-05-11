public class Mangga extends Tumbuhan {
	String produksi;
	
	//overloading

	public void Show(String nama, String tempat, String produksi){
		System.out.println("nama tumbuhan : "+nama+"\t habitat : "+tempat+"\t menghasilkan : "+produksi);
	}
	//overriding
	public void Ciri(){
		System.out.println("mannga tanaman berbiji tertutup dan menghasilkan buah");
	}
}