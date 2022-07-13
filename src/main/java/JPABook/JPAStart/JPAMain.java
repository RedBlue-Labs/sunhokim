package JPABook.JPAStart;


import JPABook.JPAService.StarterService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPAMain {
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
