package Repository;

import jakarta.annotation.PostConstruct;
import model.Expedition;

import java.util.Collection;
import java.util.HashMap;

public class ExpeditionRepositorylmpl implements IExpeditionRepository {
    private HashMap<Integer, Expedition> expedition;
    public ExpeditionRepositorylmpl() {
        expedition = new HashMap<>();
    }

    @Override
    public Collection<Expedition> findAll() {
        return expedition.values();
    }

    @Override
    public void save(Expedition expedition) {
        expedition.put(expedition.getId(), expedition);
    }

    @Override
    public boolean existById(int expeditionID) {
        return expedition.containsKey(expeditionID);
    }

    @PostConstruct
    private void initialize(){
        Expedition a = new Expedition();
        a.setId(1);
        a.setName("Exp1");
        a.setCode("1255");
        a.setRegion("Reg1");
        a.setBaseCamp("BC1");
        a.setLeader("Manuel");
        a.setStartDate("24-02-2025");
        a.setEndDate("29-02-2026");
        a.setEstate("México");
        expedition.put(a.getId(), a //a.getName(), a.getCode(), a.getRegion(), a.getBaseCamp(), a.getLeader(), a.getStartDate(), a.getEndDate(), a.getEstate()
                );


        Expedition t = new Expedition();
        t.setId(2);
        t.setName("Exp2");
        t.setCode("1256");
        t.setRegion("Reg2");
        t.setBaseCamp("BC2");
        t.setLeader("Xilena");
        t.setStartDate("05-10-2025");
        t.setEndDate("08-10-2026");
        t.setEstate("Noriega");
        expedition.put(a.getId(), t );
    }


}
