public class Dipendente {

	private String nominativo;
	private char sesso;
	private String indirizzo;

	public Dipendente(String nominativo, char sesso, String indirizzo) {
		this.nominativo = nominativo;
		this.sesso = sesso;
		this.indirizzo = indirizzo;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getNominativo() {
		return nominativo;
	}

	public char getSesso() {
		return sesso;
	}
}
