package practice_qns;
import java.util.*;

public class Comparableqns0303 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scanner=new Scanner(System.in);
		ArrayList<Average> al=new ArrayList<>();
		
		
		System.out.println("Enter the number of students list to be added");
		int number=scanner.nextInt();
		
		for(int i=0;i<number;i++)
		{
			System.out.println("Enter Student id: ");
			int id=scanner.nextInt();
			
			System.out.println("Enter Student name: ");
			String name=scanner.nextLine();
			
			System.out.println("Enter Student tenth percentage: ");
			double tenperc=scanner.nextDouble();
			
			System.out.println("Enter Student twelveth percentage: ");
			double twelperc=scanner.nextDouble();
			
			double average=(tenperc+twelperc)/2;

			Average aaverage=new Average(id,name,tenperc,twelperc,average);
			al.add(aaverage);
			//Collections.sort(al);
			
		}
		scanner.close();
	}
}
class Average implements Comparator<Average>
{
	int id;
	String name;
	double tenperc;
	double twelperc;
	double average;


	
public Average(int id, String name, double tenperc, double twelperc, double average) {
	super();
	this.id = id;
	this.name = name;
	this.tenperc = tenperc;
	this.twelperc = twelperc;
	this.average = average;
}

	public String toString()
	{
		return id+" "+name+" "+tenperc+" "+twelperc+" "+average;
	}

@Override
public int compare(Average o1, Average o2) {
	// TODO Auto-generated method stub
	if(o1.average==o2.average)
	{
		return 0;
	}
	else if(o1.average<o2.average)
	{
		return 1;
	}
	else
	{
		return -1;
	}
}	
	
}
