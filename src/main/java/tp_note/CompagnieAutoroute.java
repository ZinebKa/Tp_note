package tp_note;

import java.math.BigDecimal;
import java.util.*;

public class CompagnieAutoroute {
	List<Route> routes;
	List<Tarif> tarifs;

	public CompagnieAutoroute() {

		this.routes = new ArrayList<Route>();
		this.tarifs = new ArrayList<Tarif>();

	}

	public BigDecimal obtenirTarif(Porte en, Porte so) {
		return null;
	}

	private Tarif getTarifCalculé(Porte en, Porte so) {
		
		return null;
	}

	private Tarif getTarifExacte(Porte en, Porte so) {
		return null;
	}

	public void ajouterTarif(Tarif t) {
		tarifs.add(t);
	}

	public void ajouterRoute(Route r) {
		routes.add(r);
	}
}
