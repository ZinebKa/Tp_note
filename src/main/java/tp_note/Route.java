package tp_note;

import java.util.*;

public class Route {
	List<Porte> portes;

	public Route() {
		this.portes = new ArrayList<Porte>();
	}

	public String toString() {
		return null;

	}

	public void addPorte(Porte p) {
		portes.add(p);
	}
}
