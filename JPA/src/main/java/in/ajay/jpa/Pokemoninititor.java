package in.ajay.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Pokemoninititor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {Pokemon p1=new Pokemon();
		p1.setName("pikachu");
		
		p1.setType("electrical");p1.setPower(100);
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ajay");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(p1);
		et.commit();
			
		}catch(Exception e) {
			throw e;
			
		}

	}

}
