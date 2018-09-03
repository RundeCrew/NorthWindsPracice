package co.grandcircus.NorthWindsDemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.grandcircus.NorthWindsDemo.entity.Supplier;

@Repository
@Transactional
public class SupplierDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public List<Supplier> findAll() {
		
		return em.createQuery("FROM Supplier", Supplier.class).getResultList();
	}
}
