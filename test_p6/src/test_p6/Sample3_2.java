package test_p6;


public class Sample3_2 {
	public static void main(String[] args)
	{
		Car car1;
		car1=new Car();
		
		car1.num=1234;
		car1.gas=20.5;
		
		System.out.println("������"+car1.num);
		System.out.println("��������"+car1.gas);
		
	}
}
//Car���
class Car
{
	int num;
	double gas;

}