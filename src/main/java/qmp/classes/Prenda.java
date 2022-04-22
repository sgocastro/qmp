package qmp.classes;
import qmp.enums.*;

public class Prenda {
	TipoDePrenda tipoDePrenda;
	Color colorPrimario;
	Color colorSecundario;
	TipoDeMaterial material;
	
	public Prenda(TipoDePrenda tipoDePrenda, Color color, TipoDeMaterial material) {
		try	{
			if(tipoDePrenda == null || color == null || material == null) {
				throw new Exception("Los valores solicitados no pueden ser nulos.");
			}
			this.tipoDePrenda = tipoDePrenda;
			this.colorPrimario = color;
			this.material = material;
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public Prenda(TipoDePrenda tipoDePrenda, Color colorPrimario, Color colorSecundario, TipoDeMaterial material) {
		try	{
			if(tipoDePrenda == null || colorPrimario == null || colorSecundario == null || material == null) {
				throw new Exception("Los valores solicitados no pueden ser nulos.");
			}
			this.tipoDePrenda = tipoDePrenda;
			this.colorPrimario = colorPrimario;
			this.material = material;
			this.colorSecundario = colorSecundario;
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}

