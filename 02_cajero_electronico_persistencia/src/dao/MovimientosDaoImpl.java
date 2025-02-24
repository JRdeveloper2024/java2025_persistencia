package dao;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;
import locator.LocatorConnection;
import model.Movimiento;

class MovimientosDaoImpl implements MovimientosDao {

	@Override
	public List<Movimiento> findByCuenta(int idCuenta) {
		String jpql = "select c from Movimiento c where c.idCuenta=?1";
		TypedQuery<Movimiento> query= LocatorConnection.getEntityManager().createQuery(jpql,Movimiento.class);
		query.setParameter(1, idCuenta);
		
		return query.getResultList();
	} 

	@Override
	public void save(Movimiento movimiento) {
		EntityManager em = LocatorConnection.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(movimiento);
		tx.commit();
	} 

}
