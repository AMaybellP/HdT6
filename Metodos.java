/**
*Metodos; clase con los métodos para obtener crear la lista de desarrolladores y obtener estadísticas
*@version: 5.0
*@author: Steven Rubio, 15044 // Andrea Pena 15127
*@since 2016-08-28
*/

import java.util.*;

public class Metodos
{
	Factory factory;
	Set<Desarrollador> Lista;
	
	public Metodos()
	{
		factory= new Factory();
		Lista= factory.CrearObjeto();
	}
	
	/*sets y gets*/
	public Factory getFactory() {
		return factory;
	}

	public void setFactory(Factory factory) {
		this.factory = factory;
	}

	public Set<Desarrollador> getLista() {
		return Lista;
	}

	public void setLista(Set<Desarrollador> lista) {
		Lista = lista;
	}

	/*METODOS*/
	/**
 	 * Este metodo agrega un desarrollador a la lista con los datos ingresados por el usuario
 	 * @param ninguno
 	 * @return nada
 	 */
	public void agregarDesarrollador()
	{
		/*Escaneo de datos*/
		Scanner scan= new Scanner(System.in);
		System.out.println(" ");
		System.out.println("Ingrese datos del desarrollador:");
		System.out.println("Nombre: ");
		String n= scan.nextLine();
		System.out.println("Codigo: ");
		int c= scan.nextInt();
		/*Defensiva: en caso se ingrese un codigo no valido*/
		while (c<0 || c>7)
		{
			System.out.println("Codigo no valido, debe ser un numero entre 1 y 7");
			System.out.println("Codigo: ");
			c= scan.nextInt();
		}
		/*Se crea el desarrollador*/
		Desarrollador des= new Desarrollador(n,c);
		/*Muestra datos del desarrollador*/
		System.out.println(des.toString());
		/*Se agrega el desarrollador a la lista*/
		Lista.add(des);
	}
	
	/**
 	 * Este metodo muestra las estadisticas que responden a las primeras 5 preguntas
 	 * @param ninguno
 	 * @return string con los resultados de las estadisticas
 	 */
	public String estadisticas()
	{
		String e= "\nESTADISTICAS \n";
		/*Pregunta 1*/
		e=e+"\nLos desarrolladores con experiencia en Java, Web y Celulares son: \n";
		Iterator<Desarrollador> it= Lista.iterator();
		int a= 0;
		for (int i=0; i<Lista.size(); i++)
		{
			Desarrollador sig= it.next();
			if(sig.getCodigo()==7)
			{
				e=e+sig.toString()+"\n";
				a=a+1;
			}
		}
		if (a==0)
			e=e+"--NINGUNO--\n"; //en caso no haya nadie que cumpla con lo pedido
		/*Pregunta 2*/
		Iterator<Desarrollador> it1= Lista.iterator();
		e=e+"\nLos desarrolladores con experiencia en Java que no tienen experiencia en Web son: \n";
		int b=0;
		for (int i=0; i<Lista.size(); i++)
		{
			Desarrollador sig= it1.next();
			if(sig.getCodigo()==1||sig.getCodigo()==5)
			{
				e=e+sig.toString()+"\n";
				b=b+1;
			}
		}
		if (b==0)
			e=e+"--NINGUNO--\n"; //en caso no haya nadie que cumpla con lo pedido
		/*Pregunta 3*/
		Iterator<Desarrollador> it2= Lista.iterator();
		e=e+"\nLos desarrolladores con experiencia en Web y Celulares, pero no en Java son: \n";
		int c=0;
		for (int i=0; i<Lista.size(); i++)
		{
			Desarrollador sig= it2.next();
			if(sig.getCodigo()==6)
			{
				e=e+sig.toString()+"\n";
				c=c+1;
			}
		}
		if (c==0)
			e=e+"--NINGUNO--\n"; //en caso no haya nadie que cumpla con lo pedido
		/*Pregunta 4*/
		Iterator<Desarrollador> it3= Lista.iterator();
		e=e+"\nLos desarrolladores con experiencia en Web o Celulares, pero no en Java son: \n";
		int d=0;
		for (int i=0; i<Lista.size(); i++)
		{
			Desarrollador sig= it3.next();
			if(sig.getCodigo()==6||sig.getCodigo()==2||sig.getCodigo()==3)
			{
				e=e+sig.toString()+"\n";
				d=d+1;
			}
		}
		if (d==0)
			e=e+"--NINGUNO--\n"; //en caso no haya nadie que cumpla con lo pedido
		/*Pregunta 5*/
		Iterator<Desarrollador> it4= Lista.iterator();
		int Java=0;
		int WebJ=0;
		for (int i=0; i<Lista.size(); i++)
		{
			Desarrollador sig= it4.next();
			if(sig.getCodigo()==1)
			{
				Java=Java+1;
			}
			if(sig.getCodigo()==4)
			{
				WebJ=WebJ+1;
			}
		}
		if (Java==0 && WebJ>0)
		{
			e=e+"\nEl conjunto de desarrolladores Java ES SUBCONJUNTO de desarrolladores Web. \n";
		}
		else
		{
			e=e+"\nEl conjunto de desarrolladores Java NO es subconjunto de desarrolladores Web. \n";
		}
		return e; 
	}
	
	/**
 	 * Este metodo muestra las estadisticas que responden a las ultimas 2 preguntas
 	 * @param ninguno
 	 * @return nada
 	 */
	public void estadisticas2()
	{
		System.out.println("\nEl conjunto con mayor cantidad de desarrolladores es: ");
		/*Cantidad de desarrolladores Java*/
		int j=0;
		Iterator<Desarrollador> it= Lista.iterator();
		for(int i=0; i<Lista.size(); i++)
		{
			Desarrollador sig= it.next();
			if(sig.getCodigo()==1||sig.getCodigo()==4||sig.getCodigo()==5||sig.getCodigo()==7)
			{
				j=j+1;
			}
		}
		/*Cantidad de desarrolladores Web*/
		int w=0;
		Iterator<Desarrollador> it2= Lista.iterator();
		for(int i=0; i<Lista.size(); i++)
		{
			Desarrollador sig= it2.next();
			if(sig.getCodigo()==2||sig.getCodigo()==4||sig.getCodigo()==6||sig.getCodigo()==7)
			{
				w=w+1;
			}
		}
		/*Cantidad de desarrolladores Celulares*/
		int c=0;
		Iterator<Desarrollador> it3= Lista.iterator();
		for(int i=0; i<Lista.size(); i++)
		{
			Desarrollador sig= it3.next();
			if(sig.getCodigo()==3||sig.getCodigo()==4||sig.getCodigo()==5||sig.getCodigo()==7)
			{
				c=c+1;
			}
		}
		/*Si la cantidad de desarrolladores Java es mayor*/
		if (j>w && j>c)
		{
			System.out.println("Desarrolladores JAVA");
			/*Ingresamos los nombres de los desarrolladores en java a un vector para ordenarlos*/
			Vector<String> nombresJ = new Vector<String>();
			Iterator<Desarrollador> itJ= Lista.iterator();
			for(int i=0; i<Lista.size(); i++)
			{
				Desarrollador sig= itJ.next();
				if(sig.getCodigo()==1||sig.getCodigo()==4||sig.getCodigo()==5||sig.getCodigo()==7)
				{
					/*Ingresamos todos los nombres al vector*/
					nombresJ.add(sig.getNombre());
					}
				}
			/*Lo ordenamos e imprimimos*/
			Collections.sort(nombresJ);
			for(String unElemento: nombresJ){
				System.out.println(unElemento);
			}
			
		}
		/*Si la cantidad de desarrolladores Web es mayor*/
		if (w>j && w>c)
		{
			System.out.println("WEB ");
			/*Ingresamos los nombres de los desarrolladores Web a un vector para ordenarlos*/
			Vector<String> nombresW = new Vector<String>();
			Iterator<Desarrollador> itW= Lista.iterator();
			for(int i=0; i<Lista.size(); i++)
			{
				Desarrollador sig= itW.next();
				if(sig.getCodigo()==1||sig.getCodigo()==4||sig.getCodigo()==5||sig.getCodigo()==7)
				{
					/*Ingresamos todos los nombres al vector*/
					nombresW.add(sig.getNombre());
					}
				}
			/*Lo ordenamos e imprimimos*/
			Collections.sort(nombresW);
			for(String unElemento: nombresW){
				System.out.println(unElemento);
			}
			
		}
		/*Si la cantidad de desarrolladores para Celulares es mayor*/
		if(c>j && c>w)
		{
			System.out.println("CELULARES");
			/*Ingresamos los nombres de los desarrolladores en java a un vector para ordenarlos*/
			Vector<String> nombresC = new Vector<String>();
			Iterator<Desarrollador> itC= Lista.iterator();
			for(int i=0; i<Lista.size(); i++)
			{
				Desarrollador sig= itC.next();
				if(sig.getCodigo()==1||sig.getCodigo()==4||sig.getCodigo()==5||sig.getCodigo()==7)
				{
					/*Ingresamos todos los nombres al vector*/
					nombresC.add(sig.getNombre());
					}
				}
			/*Lo ordenamos e imprimimos*/
			Collections.sort(nombresC);
			
			for(String unElemento: nombresC){
				System.out.println(unElemento);
			}
			
		}
		
		/*Si la cantidad de desarrolladores Java y Web es igual*/
		if (j==w && j>c){
			System.out.println("JAVA y WEB tienen la misma cantidad de desarrolladores");
			/*Ingresamos los nombres de los desarrolladores en java y web a un vector para ordenarlos*/
			Vector<String> nombresJW = new Vector<String>();
			Iterator<Desarrollador> itJW= Lista.iterator();
			for(int i=0; i<Lista.size(); i++)
			{
				Desarrollador sig= itJW.next();
				if(sig.getCodigo()==1||sig.getCodigo()==4||sig.getCodigo()==5|| sig.getCodigo()==2||sig.getCodigo()==6||sig.getCodigo()==7)
				{
					/*Ingresamos todos los nombres al vector*/
					nombresJW.add(sig.getNombre());
					}
				}
			/*Los ordenamos e imprimimos*/
			Collections.sort(nombresJW);
			for(String unElemento: nombresJW){
				System.out.println(unElemento);
			}
			
		}
		/*Si la cantidad de desarrolladores Java y en celulares es igual*/
		if (j==c && j>w){
			System.out.println("JAVA Y CELULARES tienen la misma cantidad de desarrolladores");
			/*Ingresamos los nombres de los desarrolladores en java y celulares a un vector para ordenarlos*/
			Vector<String> nombresJC = new Vector<String>();
			Iterator<Desarrollador> itJC= Lista.iterator();
			for(int i=0; i<Lista.size(); i++)
			{
				Desarrollador sig= itJC.next();
				if(sig.getCodigo()==1||sig.getCodigo()==4||sig.getCodigo()==5|| sig.getCodigo()==3||sig.getCodigo()==6||sig.getCodigo()==7)
				{
					/*Ingresamos todos los nombres al vector*/
					nombresJC.add(sig.getNombre());
					}
				}
			/*Los ordenamos e imprimimos*/
			Collections.sort(nombresJC);
			for(String unElemento: nombresJC){
				System.out.println(unElemento);
			}
			
		}
		/*Si la cantidad de desarrolladores en celulares y Web es igual*/
		if (c==w && c>j){
			System.out.println("CELLULAR y WEB tienen la misma cantidad de desarrolladores");
			/*Ingresamos los nombres de los desarrolladores en celular y web a un vector para ordenarlos*/
			Vector<String> nombresCW = new Vector<String>();
			Iterator<Desarrollador> itCW= Lista.iterator();
			for(int i=0; i<Lista.size(); i++)
			{
				Desarrollador sig= itCW.next();
				if(sig.getCodigo()==3||sig.getCodigo()==4||sig.getCodigo()==5|| sig.getCodigo()==2||sig.getCodigo()==6||sig.getCodigo()==7)
				{
					/*Ingresamos todos los nombres al vector*/
					nombresCW.add(sig.getNombre());
					}
				}
			/*Los ordenamos e imprimimos*/
			Collections.sort(nombresCW);
			for(String unElemento: nombresCW){
				System.out.println(unElemento);
			}
			
		}
		/*Si la cantidad de desarrolladores Java, Web y celulares es igual*/
		if (j==w && j==c && c==w){
			System.out.println("JAVA, WEB y CELULARES tienen la misma cantidad de desarrolladores");
			/*Ingresamos los nombres de los desarrolladores en JAVA, celular y web a un vector para ordenarlos*/
			Vector<String> nombresJCW = new Vector<String>();
			Iterator<Desarrollador> itJCW= Lista.iterator();
			for(int i=0; i<Lista.size(); i++)
			{
				Desarrollador sig= itJCW.next();
				if(sig.getCodigo()==3||sig.getCodigo()==4||sig.getCodigo()==5|| sig.getCodigo()==2||sig.getCodigo()==6||sig.getCodigo()==7 ||sig.getCodigo()==1)
				{
					/*Ingresamos todos los nombres al vector*/
					nombresJCW.add(sig.getNombre());
					}
				}
			/*Los ordenamos e imprimimos*/
			Collections.sort(nombresJCW);
			for(String unElemento: nombresJCW){
				System.out.println(unElemento);
			}
			
		}
		
	}
	
}
