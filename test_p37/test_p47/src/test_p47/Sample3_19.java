package test_p47;

public class Sample3_19 {
public static void main(String[] args) {
	System.out.println("����car1");
	Car car1;
	car1=new Car();
	car1.setCar(1234,20.5);
	
	System.out.println("����car2");
	Car car2;
	
	System.out.println("��car1ָ����car2");
	car2=car1;
	
	car1=null;
	System.out.println("car2��");
	car2.show();
}
