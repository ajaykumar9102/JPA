package com.hibernate.FirstJpaProject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PokemonInitiator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pokemon p=new Pokemon();
		p.setName("pkachu");
		p.setType("electric");
		p.setPower(100);
EntityManagerFactory emf=Persistence.createEntityManagerFactory("ajay");
EntityManager em=emf.createEntityManager();
EntityTransaction et= em.getTransaction();
et.begin();
em.persist(p);
et.commit();
	}

}
