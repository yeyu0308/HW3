package test_p9;


public class Sample3_4 {
public static void main(String[] args) {
	Car car1;
	car1=new Car();
	
	car1.num=1234;
	car1.gas=20.5;
	
}

}
//class���
class Car
{
	int num;
	double gas;
	
	void show()
	{
		System.out.println("������"+this.num);
		System.out.println("��������"+this.gas);
		
	}
}
