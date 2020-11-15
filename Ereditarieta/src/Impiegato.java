public class Impiegato extends Dipendente {
	
	private String ufficio;

	public Impiegato(String nominativo, char sesso, String indirizzo, String ufficio) {
		super(nominativo, sesso, indirizzo);
		this.ufficio = ufficio;
	}

	public String getUfficio() {
		return ufficio;
	}

	public void setUfficio(String ufficio) {
		this.ufficio = ufficio;
	}
}