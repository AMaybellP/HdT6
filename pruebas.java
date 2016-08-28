import java.util.*;

public class pruebas {

	public static void main (String[]args)
	{
		HashSet<Desarrollador> lista= new HashSet<Desarrollador>();
		Desarrollador des0 = new Desarrollador("",0);
		System.out.println(des0.hashCode());
		Desarrollador des1 = new Desarrollador("Ricardo Montoya",1);
		System.out.println(des1.hashCode());
		Desarrollador des2 = new Desarrollador("Anita Juarez",1);
		System.out.println(des2.hashCode());
		Desarrollador des3 = new Desarrollador("Roberto Velazquez",3);
		System.out.println(des3.hashCode());
		Desarrollador des4 = new Desarrollador("Juanita Perez",1);
		System.out.println(des4.hashCode());
		lista.add(des0);
		lista.add(des1);
		lista.add(des2);
		lista.add(des3);
		lista.add(des4);
		Iterator<Desarrollador> it= lista.iterator();
		for(int i=0; i<lista.size(); i++)
		{
			System.out.println(it.next().hashCode());
		}
		/*for (int i=0; i<lista.size(); i++)
		{
			Desarrollador sig= it.next();
			if(sig.getCodigo()==1)
			{
				System.out.println(sig.toString());
			}
		}
		/*for (int i=0; i<lista.size(); i++)
		{
			System.out.println(lista.toArray()[i].toString());
		}*/
		
	}
}
