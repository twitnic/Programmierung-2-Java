
public class Warenkorb {

	public int anzahl = 0;
	public Artikel artfeld[] = new Artikel[100];
	
	public double getSumme() {
		double summe = 0;
		
		int i = 0;
		while (artfeld[i] != null) {
			summe += artfeld[i].preis;
			i++;
		}
		
		return summe;
	}
	
	public void add(Artikel a) {
		anzahl++;
		
		int i = 0;
		while (artfeld[i] != null) {
			i++;
		}
		artfeld[i] = a;
	}

	public void list() {
		int i = 0;
		System.out.printf("Willkommen im Laden\n");
		System.out.printf("Anzahl: %d\n Artikel:    Preis:\n", anzahl);
		while (artfeld[i] != null) {
			System.out.printf("%d. %s   Euro %.2f\n", i, artfeld[i].name, artfeld[i].preis);
			i++;
		}
		System.out.printf("\n    Gesamt: %.2f Euro", this.getSumme());
		System.out.printf("\n Danke fuer den Einkauf\n");
		
	}
	
}
