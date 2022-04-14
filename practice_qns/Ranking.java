package practice_qns;



import java.util.*;
	/*
	 * 
	 * Create a user defined class which should have the structure 
	 * 1)id
	 * 2)name
	 * 3)percentage of 10th 
	 * 4)percentage of 12th.
	 * 
	 * take an average of 10th and 12th percentage 
	 * 90 80 : 85
	 * 
	 * sort the collection in descending order on the basis average percentage of 10th and 12th.
	 * can use comparable or comparator as your choice. 
	 */ 
	public class Ranking {

		public static void main(String[] args) {
			
			ArrayList<Learner1> al=new ArrayList<>();
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the details of the candidate : ");
			char ch='Y';
			int id;
			String name;
			double tenth,twelveth,avg;
			while(ch=='y' || ch=='Y')
			{
				System.out.println("Enter the id : ");
				id=scan.nextInt();
				System.out.println("Enter the name : ");
				name=scan.next();
				System.out.println("Enter the percentage of 10th standard : ");
				tenth=scan.nextDouble();
				System.out.println("Enter the percentage of 12th standard : ");
				twelveth=scan.nextDouble();
				avg=(tenth+twelveth)/2;
				
				Learner1 learner=new Learner1(id,name,tenth,twelveth,avg);
				al.add(learner);
				System.out.println("Do you want to add more candidates");
				System.out.println("Press Y for Yes and N for No");
				ch=scan.next().charAt(0);
			}
			System.out.println(al);
			Collections.sort(al);
			
			int pos=0;
			double max;
			
			
//			double rank=1;
//			double max=1;
//			al.get(0).getAverage();
//			for(int i=0;i<al.size()-1;i++)
//			{	
//				rank++;
//				if(al.get(i).getAverage()<al.get(i-1).getAverage())
//				{
////					max=al.get(j).getAverage();
////					pos=i;
//					max=rank;
//				}
//				al.get(i).setAverage(max);
//			
//			}
//			System.out.println("Highest average:"+al.get((int) max).getAverage());
			System.out.println(al);
			scan.close();
		}

	}
	class Learner1 implements Comparable<Learner1>
	{
		int id;
		String name;
		double tenth;
		double twelveth;
		double average;
		public Learner1(int id, String name, double tenth, double twelveth, double average) {
			super();
			this.id = id;
			this.name = name;
			this.tenth = tenth;
			this.twelveth = twelveth;
			this.average = average;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getTenth() {
			return tenth;
		}
		public void setTenth(double tenth) {
			this.tenth = tenth;
		}
		public double getTwelveth() {
			return twelveth;
		}
		public void setTwelveth(double twelveth) {
			this.twelveth = twelveth;
		}
		public double getAverage() {
			return average;
		}
		public void setAverage(double average) {
			this.average = average;
		}
		@Override
		public int compareTo(Learner1 learner) {
			// TODO Auto-generated method stub
			
			if(average==learner.average)
			{
				return 0;//no change in the index
			}
			else if(average<learner.average)
			{
				return 1;
			}
			else
			{
				return -1;
			}
		}
		
		public String toString()
		{
			return id+" "+name+" "+tenth+" "+twelveth+" "+average;
		}
	}



