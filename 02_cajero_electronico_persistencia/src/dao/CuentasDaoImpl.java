package dao;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;
import locator.LocatorConnection;
import model.Cuenta;

class CuentasDaoImpl implements CuentasDao {

	@Override
	public Cuenta findById(int idCuenta) {
		return LocatorConnection.getEntityManager().find(Cuenta.class, idCuenta);
	}

	@Override
	public void updateSaldo(int idCuenta, double nuevoSaldo) {
		
		EntityManager em = LocatorConnection.getEntityManager();
		
		String jpql = "update Cuenta e set e.saldo = ?2 where e.numeroCuenta = ?1";
				//"update Cuenta e where e.idCuenta=?1 set e.salario=?2";
		
		Query query =em.createQuery(jpql);
		query.setParameter(1, idCuenta);
		query.setParameter(2, nuevoSaldo);
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		query.executeUpdate();
		tx.commit();
		
		
	}

}
