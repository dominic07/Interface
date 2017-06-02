public interface Interface {
	public String nama = "Jon";
	public String nim = "14111009";
	
/*Interface tidak dapat di inisiasi*/
	public static void main (String [] args) {
		Interface In = new Interface();
		
	}
	
}

/*class Abstract dapat mengimplement interface dengan bebas*/
public abstract class abstrak implements Interface {
	protected String getNama(){
		return this.nama;
	}
}
	
/*Implement variabel interface*/
public class imp implements Interface {
	public static void main (String[] args) {
		imp pg = new imp();
		ip.nama;
		ip.nim;
	}
}