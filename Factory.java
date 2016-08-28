/**
*Factory; clase que define y crea un objeto con la implementación a usar
*@version: 1.0
*@author: Steven Rubio, 15044 // Andrea Pena 15127
*@since 2016-08-28
*/
import java.util.*;

public class Factory {
	
	/**
 	 * Este metodo crea un objeto tipo Stack (para utilización diseño Factory)
 	 * @param ninguno
 	 * @return objeto tipo Stack
 	 */
	public Set<Desarrollador> CrearObjeto(){
		Scanner implementacion = new Scanner(System.in);
		int tipoImp = 0;
		int validador = 0;
		Object Imp;
		Imp = new Object();
		while(validador <= 3){
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Seleccione el numero del tipo de clase a Implementar ");
		System.out.println("1. HashSet	");
		System.out.println("2. TreeSet	");
		System.out.println("3. LinkedHashSet	");
		try{
			tipoImp = implementacion.nextInt();
			switch (tipoImp){
			case 1:
				System.out.println("HashSet");
				HashSet<Desarrollador> Objeto = new HashSet<Desarrollador>();
				Imp = Objeto;
				validador = 4;
				break;
			case 2:
				System.out.println("TreeSet");
				TreeSet<Desarrollador> Objeto1 = new TreeSet<Desarrollador>();
				Imp = Objeto1;
				validador = 4;
				break;
			case 3:
				System.out.println("LinkedHashSet");
				LinkedHashSet<Desarrollador> Objeto2= new LinkedHashSet<Desarrollador>();
				Imp = Objeto2;
				validador = 4;
				break;
			
			}
		}
		catch(Exception e){
			System.out.println("Seleccione una opcion correcta");
			System.out.println("");
			implementacion.nextLine();
		}	
		
	}
		return (Set<Desarrollador>) Imp;

	}
}
