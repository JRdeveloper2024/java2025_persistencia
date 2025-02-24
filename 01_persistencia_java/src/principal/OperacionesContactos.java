package principal;

import java.util.List;
import java.util.Optional;

import model.Contacto;
import service.ContactosService;

public class OperacionesContactos {

	public static void main(String[] args) {
		
		ContactosService service = new ContactosService();
		//Contacto contacto= service.buscarContacto(5);
		//System.out.println(contacto);
		//System.out.println("Nombre: " + contacto.getNombre());
		
		//Contacto contacto=new Contacto(7, "contacto jpa", "jpa@gmail.com", 44);
		//service.altaContacto(contacto);
		//service.eliminarContacto(7);
		//System.out.println("Contacto eliminado");
		//Recuperar todos
		
		/*List<Contacto> contactos = service.recuperarTodos();
		contactos.forEach(c->System.out.println(c));
		Optional<Contacto> contacto = service.buscarContactoEmail("email45@gmail.com");
		contacto.ifPresentOrElse(c->System.out.println(c.getNombre()),
								()->System.out.println("Contacto no existente"));*/
		
		//Eliminar Por nombre
		service.eliminarContacto("Jose");

	}

}
