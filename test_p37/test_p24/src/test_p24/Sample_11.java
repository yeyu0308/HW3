package test_p24;


public class Sample_11 {
public static void main(String[] args) {
	Car car1;
	car1=new Car();
	
	car1.setCar(1234,20.5);
	car1.show();
	
	System.out.println("ֻ�������");
	car1.setCar(2345);
	car1.show();
	
	System.out.println("ֻ���������");
	car1.setCar(30.5);
	car1.show();
	
}
}
//Car���
class Car
{
	private int num;
	private double gas;
	
	public void setCar(int n)
	{
		num=n;
		System.out.println("��������Ϊ"+num);
	}
	
	public void setCar(double g)
	{
		gas=g;
		System.out.println("����������Ϊ"+gas);
	}
	public void setCar(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("��������Ϊ"+num+",����������Ϊ"+gas);
	}
	public void show()
	{
		System.out.println("������"+this.num);
		System.out.println("��������"+this.gas);
	}
}