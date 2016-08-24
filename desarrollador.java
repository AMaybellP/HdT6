
public class desarrollador {

	/**
	 * 1 = PROGRAMADOR JAVA
	 * 2 = PROGRAMADOR WEB
	 * 3 = PROGRAMADOR MOVIL 
	 * 4 = PROGRAMADOR JAVA Y WEB
	 * 5 = PROGRAMADOR JAVA Y MOVIL
	 * 6 = PROGRAMADOR WEB Y MOVIL
	 * 7 = PROGRAMADOR JAVA, WEB y MOVIL
	 */
	private String nombre;
	private int codigo;
	
	public desarrollador(String n, int c){
		this.setNombre(n);
		this.setCodigo(c);
	}

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
