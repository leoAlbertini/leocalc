package br.edu.fcv.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.edu.fcv.model.Produto;

public class ProdutoDao extends DAO{

	public void save(Produto produto){
		EntityManager manager = getEntityManager();

		manager.getTransaction().begin();    
		manager.persist(produto);
		manager.getTransaction().commit();  
	}
	
	public List<Produto> list(){
		EntityManager manager = getEntityManager();

		return manager.createQuery("from Produto").getResultList();
	}
} 
