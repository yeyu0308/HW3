package tast_p40;

	import java.io.IOException;
	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	public class Sample3_20 
	{
	 public static void main(String[] args)throws IOException
	 {
	  System.out.println("�������ִ�");
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  String str1=br.readLine();
	  System.out.println("������Ҫ�������ִ�");
	  String str2=br.readLine();
	  StringBuffer sb=new StringBuffer(str1);
	  sb.append(str2);
	  System.out.println("�ڡ�"+str1+"����������"+str2+"���Ļ�,�ͻ��ɡ�"+sb+"��.");
	  
	 }
	}



