public class Kunde {

	String name;
	Warenkorb wkorb = new Warenkorb();

	public Kunde(String n) {
		this.setName(n);
	}
	
	public void kauft(Artikel a) {
		this.wkorb.add(a);				
	}
	
	public double bezahlt() {
		return this.wkorb.getSumme();
	}
		
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void Summe() {
		System.out.println(this.name + " bezahlt " + this.bezahlt() + " Euro fuer " + this.wkorb.anzahl + " Artikel.");
	}
	
	public void Rechnung() {
		System.out.println(this.name + " bezahlt " + this.bezahlt() + " Euro fuer folgende Artikel\n");
		this.wkorb.list();
	}
}
