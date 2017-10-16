package virtualPetShelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
	private Map<String, VirtualPet> shelters = new HashMap<String, VirtualPet>();

	VirtualPet Timmy = new VirtualPet(100, 100, 100);

	public Collection<VirtualPet> accountValues() {
		return shelters.values();
	}

	public int getSize() {
		return shelters.size();
	}

	public void add(VirtualPet shelter) {
		shelters.put(shelter.getNamePet(), shelter);
	}

	public VirtualPet getNewPet(String petName) {
		return shelters.get(petName);
	}

	public VirtualPet sellPet(String petName) {
		return shelters.remove(petName);
	}

}
