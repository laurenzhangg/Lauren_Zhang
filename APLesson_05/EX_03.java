import java.util.Scanner;

public class EX_03
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your science grade.");
		String science = kb.nextLine();
		System.out.println("Please enter your math grade.");
		String math = kb.nextLine();
		System.out.println("Please enter your history grade.");
		String history = kb.nextLine();
		System.out.println("Please enter your english grade.");
		String english = kb.nextLine();
		System.out.println("Please enter your spanish grade.");
		String spanish = kb.nextLine();
		System.out.println("Please enter your PE grade.");
		String PE = kb.nextLine();
		System.out.println("Please enter your computer science grade.");
		String compsci = kb.nextLine();
		
		double gPoints = calcPoints(science) + calcPoints(math) + calcPoints(history) + calcPoints(english) + calcPoints(spanish) + calcPoints(PE) + calcPoints(compsci);
		System.out.println("Your GPA is equal to " + gPoints/7 + ".");
	}
	public static double calcPoints(String grade)
	{
		if(grade.equals("A"))
			return 4.0;
		if(grade.equals("B"))
			return 3.0;
		if(grade.equals("C"))
			return 2.0;
		if(grade.equals("D"))
			return 1.0;
		if(grade.equals("F"))
			return 0.0;
		return 0.0;
	}
}