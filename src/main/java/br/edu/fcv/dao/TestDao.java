package br.edu.fcv.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.fcv.model.Lembrete;

public class TestDao {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("config-entidades");
		EntityManager em = factory.createEntityManager();
		Lembrete lembrete = new Lembrete();
		lembrete.setLembrete("aula sabado de manha");
		em.getTransaction().begin();
		em.persist(lembrete);
		em.getTransaction().commit();
	}

}
