package inherit_Table_Per_subClass;
import inherit.A;
import inherit.B;
import inherit.C;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Demo {
    public static void main(String[] args) {
        A1 a=new A1();
        a.setId(1);
        a.setName("A");

        B1 b=new B1();
        b.setId(2);
        b.setName("B");
        b.setValueOne("b");

        C1 c=new C1();
        c.setId(3);
        c.setName("C");
        c.setValueTwo("c");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("sampleapp");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(a);
        em.persist(b);
        em.persist(c);
        tx.commit();
        em.close();
        emf.close();
    }
}
