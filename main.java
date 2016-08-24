import java.util.*;

public class main {

	public static void main (String[]args)
	{
	
	Factory factory= new Factory();
	Set<Desarrollador> Lista= factory.CrearObjeto();
	
	Scanner scan= new Scanner(System.in);
	int opcion=0;
	int val=0;
	while (val<=3)
	{
		System.out.println("Seleccione la acción que desea realizar:");
		System.out.println("1. Agregar desarrollador");
		System.out.println("2. Mostrar estadísticas");
		System.out.println("3. Salir");
		try
		{
			opcion= scan.nextInt();
			switch(opcion)
			{
			case 1:
				System.out.println("Ingrese datos del desarrollador:");
				System.out.println("Nombre: ");
				String n= scan.nextLine();
				System.out.println("Codigo: ");
				int c= scan.nextInt();
				Desarrollador des= new Desarrollador(n,c);
				Lista.add(des);
				break;
			case 2:
				estadisticas();
				break;
			case 3:
				System.out.println("Gracias por usar el programa!");
				System.exit(0);
				break;
			}
		}
		catch(Exception e)
		{
			System.out.println("Seleccione una opcion correcta");
			System.out.println("");
			scan.nextLine();
		}
		}
	}
	
	public void agregarDesarrollador()
	{
		
	}
	public String estadisticas()
	{
		String estadisticas= "";
		return estadisticas;
	}

}
