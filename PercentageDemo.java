package pack;

public class PercentageDemo {
	public static void main(String[]args) {
		int a=90;
		int b=82;
		int c=67;
		int d=a+b+c;
		int percentage=(d/3)*100;
		if(percentage>=85) 
		{
			System.out.println("Distinction");
		}
		else
		{
			System.out.println("Firstclass");
		}
	}

}
