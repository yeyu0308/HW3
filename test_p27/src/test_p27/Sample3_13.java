package test_p27;

public class Sample3_13 {
	public static void main(String[] args) {
		
	Car car1;
	car1=new Car();
	car1.show();
	
	Car car2;
	car2=new Car(1234,25.0);
	car2.show();
}
}
//class���
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
	public Car(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("�����˳���Ϊ"+num+",������Ϊ"+gas+"�ĳ���");
	}
	public void show()
	{
		System.out.println("������"+num);
		System.out.println("��������"+gas);
	}
	}