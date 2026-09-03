package Repository;

import jakarta.annotation.PostConstruct;
import model.Expedition;
import model.Sighting;

import java.util.Collection;
import java.util.HashMap;

public class SightingRepository {
    private HashMap<Integer, Sighting> sighting;
    public Collection<Sighting> findAll(){
        return sighting.values();
    }
    public void save(Sighting sighting) {
        sighting.put(sighting.getId(), sighting);
    }
    public boolean existById(int sighting) {
        return sighting;
    }


    public Sighting findById(int sightingId) {
        return sighting.get(sightingId);
    }

    public Sighting findByName(String sightingName) {
        for (Sighting sighting : sighting.values()) {
            if (Sighting.sightingCode().equals(sightingName)) {
                return sighting;
            }
        }
        return null;
    }

    public void deleteById(int sightingID) {
        sighting.remove(sightingID);
    }
    @PostConstruct
    private void initialize() {
        Sighting a = new Sighting();
        a.setId(1);
        a.setSightingCode("Exp1");
        a.setName("Star");
        a.setDescription("cool");
        a.setDescription("Divertido");
        a.setScientificName("Toledo");
        a.setSightedAt("11-02-2006");
        a.setLocation("Cali");
        a.setQuantity("12");
        a.setConfidenceLevel("5");
        a.setExpeditionId("10");
        sighting.put(a.getId(), a);

        Sighting b = new Sighting();a.setId(1);
        a.setSightingCode("Exp2");
        a.setName("Moon");
        a.setDescription("Entretenido");
        a.setDescription("Chido");
        a.setScientificName("Koong");
        a.setSightedAt("15-05-2005");
        a.setLocation("Pereira");
        a.setQuantity("8");
        a.setConfidenceLevel("1");
        a.setExpeditionId("0");
        sighting.put(b.getId(), b);
    }

}
