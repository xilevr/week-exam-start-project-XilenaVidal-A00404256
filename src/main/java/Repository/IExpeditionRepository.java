package Repository;

import model.Expedition;

import java.util.Collection;

public interface IExpeditionRepository {

    Collection<Expedition> findAll();
    void save( Expedition expedition);
    boolean existiById(int expeditionID);
}
