package inherit;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Demo {
    public static void main(String[] args) {
        A a=new A();
        a.setId(1);
        a.setName("A");
        
        A a1=new A();
        a1.setId(2);
        a1.setName("A1");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("sampleapp");

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(a);
        tx.commit();
        em.close();
        emf.close();
    }
}
