package test_p20;


public class Sample_9 {
public static void main(String[] args) {
	Car car1;
	car1=new Car();
	
	car1.num=1234;
	car1.gas=-10;
	
	car1.show();
}
}
//Car���
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

