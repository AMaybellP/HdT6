import java.util.*;

public class main {

	public static void main (String[]args)
	{
	
	/*Factory factory= new Factory();
	Set<Desarrollador> Lista= factory.CrearObjeto();*/
		
	Metodos metodos= new Metodos();
	
	Scanner scan= new Scanner(System.in);
	int opcion=0;
	int val=0;
	while (val<=3)
	{
		System.out.println("Seleccione la acci�n que desea realizar:");
		System.out.println("1. Agregar desarrollador");
		System.out.println("2. Mostrar estad�sticas");
		System.out.println("3. Salir");
		try
		{
			opcion= scan.nextInt();
			switch(opcion)
			{
			case 1:
				metodos.agregarDesarrollador();
				break;
			case 2:
				metodos.agregarTodos();
				metodos.estadisticas();
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

}
