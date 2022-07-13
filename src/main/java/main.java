import DesignPattern.AdapterPattern.AdapterPatternExample;
import DesignPattern.CompositePattern.CompositePattern;
import DesignPattern.ObserverPattern.ObserverPattern;
import DesignPattern.PluggableSelector.PluggableSelector;
import JPABook.JPAService.StarterService;
import org.hibernate.LockMode;
import org.hibernate.engine.spi.EntityEntry;
import org.hibernate.engine.spi.EntityEntryFactory;
import org.hibernate.engine.spi.PersistenceContext;
import org.hibernate.engine.spi.Status;
import org.hibernate.persister.entity.EntityPersister;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


public class main {
    static public void main(String[] args) {
        EntityManagerFactory entityEntryFactory = Persistence.createEntityManagerFactory("jpabook");

        EntityManager entityManager = entityEntryFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        try {
            entityTransaction.begin();

            StarterService starterService = new StarterService();
            starterService.logic(entityManager);
            entityTransaction.commit();
        } catch(Exception e) {
            entityTransaction.rollback();
        } finally {
            entityManager.close();
        }

        entityManager.close();
    }
}
