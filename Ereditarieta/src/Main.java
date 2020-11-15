/*
 * Up-casting: da una classe derivata (Impiegato o Docente) 
 * a una superclasse (Dipendente)
 * 
 * Down-casting: da una superclasse (Dipendente) 
 * a una classe derivata(Impiegato o Docente)
 * 
 */
public class Main {

	public static void main(String[] args) {
		Dipendente dipendente1, dipendente2;
		dipendente1 = new Dipendente("Carlo Carli", 'M', "Viale della Pace - Vicenza");
		
		Impiegato impiegato1, impiegato2;
		impiegato1 = new Impiegato("Rossi Mario", 'M', "Via del mare, 1– Livorno", "Segreteria");
		
		Docente docente1, docente2;
		docente1 = new Docente("Neri Maria", 'F', "Via del monte, 99 – Livorno", "Supplente", "Informatica");
		
		// se una variabile e' di tipo Dipendente
		// puo' contenere ogetti di tipo Docente o Impiegato
		
		// cast dalla classe derivata (Impiegato) alla superclasse (Dipendente)
		dipendente1 = (Dipendente)impiegato1; // up-casting
		
		// cast dalla classe derivata (Docente) alla superclasse (Dipendente)
		dipendente2 = (Dipendente)docente1; // up-casting
		
		// dipendente1 punta a impiegato1
		
		// dipendente2 punta a docente1
		
		// cast da Dipendente a Impiegato
		impiegato2 = (Impiegato)dipendente1; // down-casting legale
		
		// impiegato2 punta a dipendente1
		
		// cast da Dipendente a Docente
		docente2 = (Docente)dipendente2; // down-casting legale
		
		// docente2 punta a dipendente2
		
		// cast da Dipendente a Impiegato
		impiegato2 = (Impiegato)dipendente2; // down-casting illegale
		
		// fallisce perche' tentiamo un cast da Docente a Impiegato che non 
		// sono superclasse e classe derivata ma sono 2 classi che non derivano
		// lúna dalláltra
		
		// cast da Dipendente a Docente
		docente2 = (Docente)dipendente1; // down-casting illegale
	}
}
