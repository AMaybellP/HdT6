import java.util.*;

public class Metodos
{
	Factory factory;
	Set<Desarrollador> Lista;
	Collection<Desarrollador> d1;
	Collection<Desarrollador> d2;
	Collection<Desarrollador> d3;
	Collection<Desarrollador> d4;
	Collection<Desarrollador> d5;
	Collection<Desarrollador> d6;
	Collection<Desarrollador> d7;
	
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
		if (c==1)
		{
			d1.add(des);
		}
		if (c==2)
		{
			d2.add(des);
		}
		if (c==3)
		{
			d3.add(des);
		}
		if (c==4)
		{
			d4.add(des);
		}
		if (c==5)
		{
			d5.add(des);
		}
		if (c==6)
		{
			d6.add(des);
		}
		if (c==7)
		{
			d7.add(des);
		}
	}
	
	public void agregarTodos()
	{
		Lista.addAll(d1);
		Lista.addAll(d2);
		Lista.addAll(d3);
		Lista.addAll(d4);
		Lista.addAll(d5);
		Lista.addAll(d6);
		Lista.addAll(d7);
	}
	
	public String estadisticas()
	{
		String e= "";
		return e; 
	}
	
	/*@Override
	public int compareTo(Desarrollador des) {
		// TODO Auto-generated method stub
		des.getCodigo();
		return 0;
	}*/
}
