package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="contactos") // el nombre de la tabla de la bas de datos
public class Contacto {
	
	@Id // para decirle que es nuestra clave primaria en la tabla
	@GeneratedValue(strategy = GenerationType.IDENTITY) // para decirle que es autoincremental
	private int idContacto;
	private String nombre;
	private String email;
	private int edad;
	
	// si los atributos se llaman igual que en la tabla no hace falta anotarlos. sino @Column(name= "email")

}
