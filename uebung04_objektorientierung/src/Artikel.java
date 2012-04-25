
public class Artikel {

	String name;
	double preis;
	
	public Artikel(String n, double p) {
		this.setName(n);
		this.setPreis(p);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPreis() {
		return preis;
	}
	
	public void setPreis(double preis) {
		this.preis = preis;
	}
}
