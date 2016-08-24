
public class Desarrollador {
	
	/*atributos*/
	private String nombre;
	private int codigo;
	/* 1: Java
	 * 2: Web
	 * 3: Móvil
	 * 4: Java y Web
	 * 5: Java y Celulares
	 * 6: Web y Celulares
	 * 7: Java, Web y Celulares
	 */

	/*constructor*/
	public Desarrollador(String n, int c)
	{
		nombre= n;
		codigo= c;
	}
	
	/*sets y gets*/
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	
}
