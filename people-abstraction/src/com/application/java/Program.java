package com.application.java;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.model.java.People;

public class Program {
	public static void main(String[] args) {
		//People pessoa1 = new People(null, "Guilherme", "guilherme@gmail.com");
		
		EntityManagerFactory emf  = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		//em.getTransaction().begin();
		//em.persist(pessoa1);
		//em.getTransaction().commit();
		//System.out.println("Saved!");
		
		//People p = em.find(People.class, 1);
		//System.out.println(p);
		
		People p2 = em.find(People.class, 1);
		em.getTransaction().begin();
		em.remove(p2);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
