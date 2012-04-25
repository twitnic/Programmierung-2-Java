
public class Main {

	public static void main(String[] args) {

		/* Kunde i wie Ina */
		Kunde i = new Kunde("Ina");
		
		i.kauft(new Artikel ("Kleid", 199.99));
		i.kauft(new Artikel ("Kette", 499.));

		String inasRechnungsText;
		double inasPreis = i.bezahlt();
		int inasAnzahl = i.wkorb.anzahl;
		
		inasRechnungsText = i.name + "bezahlt " + inasPreis + " Euro fuer " + inasAnzahl + "Artikel.";
		
		System.out.println(inasRechnungsText);
		
		/* Kunde p wie Peter */
		Kunde p = new Kunde("Peter");
		
		p.kauft(new Artikel ("Smartphone", 600.));
		Artikel d = new Artikel ("Deo", 46.0);
		p.kauft(d);
		
		String petersRechnungsText;
		double petersPreis = p.bezahlt();
		double petersAnzahl = p.wkorb.anzahl;
		
		petersRechnungsText = p.name + "bezahlt " + petersPreis + " Euro fuer " + petersAnzahl + "Artikel.";
		
		System.out.println(petersRechnungsText);
		
		/* Kunde a wie Andreas */
		
		Kunde a = new Kunde("Andreas");
		a.kauft(new Artikel("Laptop", 1299.));
		a.kauft(new Artikel("Dockingstation", 99.));
		a.kauft(new Artikel("Bildschirm", 399.));
		a.Summe();
		
		/* Kunde b wie Berta */
		Kunde b = new Kunde("Berta");
		b.kauft(new Artikel ("Rolex", 999.99));
		b.kauft(new Artikel ("Golfhandschuh", 59.99));
		b.kauft(new Artikel ("Golfschlaeger", 1299.99));
		b.kauft(new Artikel ("Mitgliedschaft", 299.99));
		b.Rechnung();
		
	}

}
