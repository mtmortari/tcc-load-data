package main.repository;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BaseRepository<BaseEntity> implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	public BaseRepository() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("puInsertData");
		this.entityManager = emf.createEntityManager();
	}
	
	protected EntityManager entityManager;
	
	public BaseEntity save(BaseEntity entity){
		entityManager.getTransaction().begin();
		entityManager.persist(entity);
		entityManager.getTransaction().commit();
		return entity;		
	}
	
	public BaseEntity findById(Class<BaseEntity> entityClass, Object primaryKey) {
		return entityManager.find(entityClass, primaryKey);
	}
	
	public void delete(BaseEntity entity) {
		entityManager.getTransaction().begin();
		entityManager.remove(entity);
		entityManager.getTransaction().commit();				
	}
	
}
