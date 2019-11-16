import java.io.*;

/**
 * Simple Java program for Serializable
 * @author R.GOPALAKRISHNAN
 * @author gopalakrishnanr94@gmail.com
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

@SuppressWarnings("serial")
public class Ser implements Serializable
{
	int empno;
	String empname;
	public Ser(int e,String en)
	{
		empno=e;
		empname=en;
		
	}
	
	/*public static void main(String[] args) 
	{
		try
		{
			
		Ser s1=new Ser(1,"Gk");
		
		FileOutputStream fout=new FileOutputStream("d:bob.txt");	
		
		ObjectOutputStream ob=new ObjectOutputStream(fout);
		
		ob.writeObject(s1);
		
		ob.flush();
		
		ob.close();
		
		System.out.println("File Successfully created..");
		
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}*/
	

	public static void main(String[] args) 
	{
		try
		{
		
			ObjectInputStream ob=new ObjectInputStream(new FileInputStream("D:bob.txt"));
		
			Ser s=(Ser)ob.readObject();
		
			System.out.println(s.empno+""+s.empname);
		
			ob.close();
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}