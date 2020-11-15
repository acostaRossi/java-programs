public class Docente extends Dipendente {

	private String ruolo;
	private String disciplina;

	public Docente(String nominativo, char sesso, String indirizzo, String ruolo, String disciplina) {
		super(nominativo, sesso, indirizzo);
		this.ruolo = ruolo;
		this.disciplina = disciplina;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}
}
