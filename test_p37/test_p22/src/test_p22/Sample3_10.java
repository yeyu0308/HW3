package test_p22;


public class Sample3_10 {
public static void main(String[] args) {
	Car car1;
	car1=new Car();
	
	car1.setNumGas(1234,20.5);
	car1.show();
	
	System.out.println("ָ������ȷ����������-10.0)����");
	
	car1.setNumGas(1234,-10.0);
	car1.show();
	
}
}

//Car���
class Car
{
	private int num;
	private double gas;
	
	public void setNumGas(int n,double g)
	{
		if(g>0&&g<100)
		{
			num=n;
			gas=g;
			System.out.println("��������Ϊ"+num+",��������Ϊ"+gas);
		}
		else {
			System.out.println(g+"������ȷ��������");
			System.out.println("�޷����������");
		}
		}
public void show()
{
	System.out.println("������"+this.num);
	System.out.println("��������"+this.gas);
	

}
}