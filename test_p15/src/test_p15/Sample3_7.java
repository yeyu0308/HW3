package test_p15;


public class Sample3_7 {
public static void main(String[] args) {
	Car car1;
	car1=new Car();
	
	int number=1234;
	double gasoline=20.5;
	
	car1.setNumGas(number,gasoline);
}
}
//Car类别
class Car
{
	int num;
	double gas;
	
	void setNumGas(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("将车号设为"+num+",汽油量设为"+gas);
		

}
}
