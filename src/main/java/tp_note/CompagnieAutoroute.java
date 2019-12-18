package tp_note;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.*;

public class CompagnieAutoroute {
	List<Route> routes;
	List<Tarif> tarifs;

	public CompagnieAutoroute() {

		this.routes = new ArrayList<Route>();
		this.tarifs = new ArrayList<Tarif>();

	}

	public BigDecimal obtenirTarif(Porte en, Porte so) {
		Tarif t = getTarifExacte(en, so);
		if (t == null)
		{
			return getTarifCalculé(en, so).prix;
		}
		else return t.prix;
		
	}

	private Tarif getTarifCalculé(Porte en, Porte so) {
		BigDecimal sum = new BigDecimal(0);
		for (int i=0 ; i < tarifs.size(); i++)
		{
			if (tarifs.get(i).getEntree().getNumeroDePorte() >= en.getNumeroDePorte() && tarifs.get(i).getSortie().getNumeroDePorte() <= so.getNumeroDePorte())
				sum.add( tarifs.get(i).getPrix());
		}
		Tarif t = new Tarif(en, so, sum);
		return t;
	}

	private Tarif getTarifExacte(Porte en, Porte so) {
		for (int i=0 ; i < tarifs.size(); i++)
		{
			if (tarifs.get(i).getEntree().equals(en) && tarifs.get(i).getSortie().equals(so))
			
			return tarifs.get(i);
		}
		return null;
		
	}

	public void ajouterTarif(Tarif t) {
		tarifs.add(t);
	}

	public void ajouterRoute(Route r) {
		routes.add(r);
	}
}
