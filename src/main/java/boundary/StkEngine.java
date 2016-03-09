package boundary;

import entity.Stk;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class StkEngine {

    @PersistenceContext
    EntityManager em;

    public List<Stk> getStk() {

        return em.createQuery("SELECT s FROM Stk s").getResultList();

    }
}
