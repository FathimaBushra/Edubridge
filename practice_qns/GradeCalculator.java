package practice_qns;

public class GradeCalculator {
	public static void main(String args[])
	{
		GradeCal gc=(per)->{
			if((per>=85)&&(per<=100))
			{
				return "A";
			}
			else if((per>=70)&&(per<=85))
			{
				return "B";
			}
			else if((per>=55)&&(per<=70))
			{
				return "C";
			}
			else if((per>=40)&&(per<=55))
			{
				return "C";
			}
			else 
			{
				return "Fail";
			}
			
		};
		gc.grade(70);
	}

}
interface GradeCal
{
	String grade(double per);
}