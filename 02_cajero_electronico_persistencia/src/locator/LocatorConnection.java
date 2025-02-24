package locator;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class LocatorConnection {
	
	//Singleton para entregar siempre el mimso obj, solo trabajar con la misma instancia.
	
	static EntityManager em;
	
	public static EntityManager getEntityManager() {
	if(em==null) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("02_cajero_electronico_persistencia");
		return factory.createEntityManager();
	}
	return em;
	
	}
		 
}
