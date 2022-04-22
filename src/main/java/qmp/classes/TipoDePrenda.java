package qmp.classes;
import qmp.enums.Categoria;

public class TipoDePrenda {
	private String nombre;
	private Categoria categoria;
	
	public TipoDePrenda(String nombreDeTipoDePrenda, Categoria categoria) {
		try {
			if(nombreDeTipoDePrenda == null || categoria == null) {
				throw new Exception("Los valores solicitados no pueden ser nulos.");
			}
			
			this.setNombre(nombreDeTipoDePrenda);
			this.categoria = categoria;
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public String getNombre() {
		return nombre;
	}

	public Categoria getCategoria() {
		return categoria;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
