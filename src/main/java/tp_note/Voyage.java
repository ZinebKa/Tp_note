package tp_note;

import java.math.BigDecimal;

public class Voyage {

	Porte entree;
	Porte sortie;
	CompagnieAutoroute autoroute;

	public Voyage(Porte en, Porte so, CompagnieAutoroute au) {
		this.entree = en;
		this.sortie = so;
		this.autoroute = au;
	}

	public Porte getEntree() {
		return entree;
	}

	public void setEntree(Porte entree) {
		this.entree = entree;
	}

	public Porte getSortie() {
		return sortie;
	}

	public void setSortie(Porte sortie) {
		this.sortie = sortie;
	}

	public CompagnieAutoroute getAutoroute() {
		return autoroute;
	}

	public void setAutoroute(CompagnieAutoroute autoroute) {
		this.autoroute = autoroute;
	}

	public BigDecimal getTarif() {
		return null;
	}

}
