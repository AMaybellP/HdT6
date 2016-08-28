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

	/*MÉTODOS*/
	public void agregarDesarrollador()
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Ingrese datos del desarrollador:");
		System.out.println("Nombre: ");
		String n= scan.nextLine();
		System.out.println("Codigo: ");
		int c= scan.nextInt();
		while (c<0 || c>7)
		{
			System.out.println("Código no válido, debe ser un número entre 1 y 7");
			System.out.println("Codigo: ");
			c= scan.nextInt();
		}
		Desarrollador des= new Desarrollador(n,c);
		System.out.println(des.toString());
		Lista.add(des);
	}
	
	public String estadisticas()
	{
		String e= "ESTADISTICAS \n";
		e=e+"Los desarrolladores con experiencia en Java, Web y Celulares son: \n";
		Iterator<Desarrollador> it= Lista.iterator();
		for (int i=0; i<Lista.size(); i++)
		{
			Desarrollador sig= it.next();
			if(sig.getCodigo()==7)
			{
				e=e+sig.toString()+"\n";
			}
		}
		Iterator<Desarrollador> it1= Lista.iterator();
		e=e+"Los desarrolladores con experiencia en Java que no tienen experiencia en Web son: \n";
		for (int i=0; i<Lista.size(); i++)
		{
			Desarrollador sig= it1.next();
			if(sig.getCodigo()==1||sig.getCodigo()==5)
			{
				e=e+sig.toString()+"\n";
			}
		}
		Iterator<Desarrollador> it2= Lista.iterator();
		e=e+"Los desarrolladores con experiencia en Web y Celulares, pero no en Java son: \n";
		for (int i=0; i<Lista.size(); i++)
		{
			Desarrollador sig= it2.next();
			if(sig.getCodigo()==6)
			{
				e=e+sig.toString()+"\n";
			}
		}
		Iterator<Desarrollador> it3= Lista.iterator();
		e=e+"Los desarrolladores con experiencia en Web o Celulares, pero no en Java son: \n";
		for (int i=0; i<Lista.size(); i++)
		{
			Desarrollador sig= it3.next();
			if(sig.getCodigo()==6||sig.getCodigo()==2||sig.getCodigo()==3)
			{
				e=e+sig.toString()+"\n";
			}
		}
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
			e=e+"El conjunto de desarrolladores Java ES SUBCONJUNTO de desarrolladores Web. \n";
		}
		else
		{
			e=e+"El conjunto de desarrolladores Java NO es subconjunto de desarrolladores Web. \n";
		}
		return e; 
	}
	
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
			if(sig.getCodigo()==2||sig.getCodigo()==4||sig.getCodigo()==6||sig.getCodigo()==7)
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
			System.out.println("Desarrolladores JAVA y Web");
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
			System.out.println("Desarrolladores JAVA y en Celulares");
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
			System.out.println("Desarrolladores de Celular y Web");
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
			System.out.println("Desarrolladores de Java,Celular y Web");
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
	
	/*@Override
	public int compareTo(Desarrollador des) {
		// TODO Auto-generated method stub
		des.getCodigo();
		return 0;
	}*/
}
