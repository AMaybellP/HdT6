
/**
*Desarrollador; clase que define a los desarrolladores/programadores
*@version: 1.0
*@author: Steven Rubio, 15044 // Andrea Pena 15127
*@since 2016-08-28
*/
import java.lang.*;

public class Desarrollador implements Comparable<Desarrollador>{
	
	/*atributos*/
	private String nombre;
	private int codigo;
	/* 1: Java
	 * 2: Web
	 * 3: Movil
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
	
	public int hashCode()
	{
		return codigo*100+(nombre.hashCode());
	}
	
	public String toString()
	{
		String s= "Nombre: " + nombre + "\t\t\tDesarrollador: ";
		if (codigo==1)
			s=s+"Java";
		if (codigo==2)
			s=s+"Web";
		if (codigo==3)
			s=s+"Celular";
		if (codigo==4)
			s=s+"Java y Web";
		if (codigo==5)
			s=s+"Java y Celular";
		if (codigo==6)
			s=s+"Web y Celular";
		if (codigo==7)
			s=s+"Java, Web y Celular";
		return s;
	}

	@Override
	public int compareTo(Desarrollador o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.hashCode(), o.hashCode());
	}


	
}
