package test_p26;


public class Sample3_12 {
	public static void main(String[] args) {
		Car car1;
		car1=new Car();
		
		car1.show();
	}	
}
//Car���
class Car
{
	private int num;
	private double gas;
	
	public Car()
	{
		num=0;
		gas=0.0;
		System.out.println("�����˳���");
	}
	public void show()
	{
		System.out.println("������"+num);
		System.out.println("��������"+gas);
	}

	
	}
