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
	
	public String estadisticas2()
	{
		String e="\nEl conjunto con mayor cantidad de desarrolladores es: \n";
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
		if (j>w && j>c)
		{
			e=e+"JAVA\n";
		}
		if (w>j && w>c)
		{
			e=e+"WEB\n";
		}
		if(c>j && c>w)
		{
			e=e+"CELULARES\n";
		}
		return e;
	}
	
	/*@Override
	public int compareTo(Desarrollador des) {
		// TODO Auto-generated method stub
		des.getCodigo();
		return 0;
	}*/
}
