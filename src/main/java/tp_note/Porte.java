package tp_note;

public class Porte {
	int numeroDePorte;

	public int getNumeroDePorte() {
		return numeroDePorte;
	}

	public void setNumeroDePorte(int numeroDePorte) {
		this.numeroDePorte = numeroDePorte;
	}

	Porte(int a) {
		this.numeroDePorte = a;
	}

	public boolean equals(Porte a) {
		if (this.numeroDePorte == a.numeroDePorte)
		return true;
		else return false;
	}

	public int hashCode() {

		int a = 0;
		return a;
	}

	public String toString() {
		return null;
	}



}
