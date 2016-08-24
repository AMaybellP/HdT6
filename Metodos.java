import java.util.*;

public class Metodos 
{
	Factory factory= new Factory();
	Set<Desarrollador> Lista= factory.CrearObjeto();
	
	public void agregarDesarrollador()
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Ingrese datos del desarrollador:");
		System.out.println("Nombre: ");
		String n= scan.nextLine();
		System.out.println("Codigo: ");
		int c= scan.nextInt();
		Desarrollador des= new Desarrollador(n,c);
		Lista.add(des);
	}
	public String estadisticas()
	{
		String e= "";
		return e; 
	}
}
