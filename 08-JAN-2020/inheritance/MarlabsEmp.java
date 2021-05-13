package inheritance;

class MarlabsStudent
{
	int Stipend=10000;
}
public class MarlabsEmp extends MarlabsStudent
{
    float salary=500000;
	public static void main(String[] args) 
	{
		
		MarlabsEmp ms=new MarlabsEmp(); // Single Instance
		System.out.println(ms.Stipend);
		System.out.println(ms.salary);
	}

}