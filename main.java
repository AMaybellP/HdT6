/**
*Main; clase main
*@version: 2.0
*@author: Steven Rubio, 15044 // Andrea Pena 15127
*@since 2016-08-28
*/
import java.util.*;

public class main {

	public static void main (String[]args)
	{
	//se crea objeto tipo Metodos	
	Metodos metodos= new Metodos();
	
	// MENU
	Scanner scan= new Scanner(System.in);
	int opcion=0;
	int val=0;
	while (val<=3)
	{
		System.out.println(" ");
		System.out.println("Seleccione la accion que desea realizar:");
		System.out.println("1. Agregar desarrollador");
		System.out.println("2. Mostrar estadasticas");
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
				/*Llamamos al primer método de estadisticas para responder las primer 5 preguntas*/
				System.out.println(metodos.estadisticas());
				/*Llamamos al segundo método de estadisticas para responder las últimas 2 preguntas*/
				metodos.estadisticas2();
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
