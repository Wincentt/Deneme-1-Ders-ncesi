package Alperenpack1;
import java.util.Scanner;
import java.lang.Math;
public class Alperenclass1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a De�i�kenini Girin");
		int a = sc.nextInt();
		System.out.println("b De�i�kenini Girin");
		int b = sc.nextInt();
		System.out.println("c De�i�kenini Girin");
		int c = sc.nextInt();
		double delta=(b*b)-4*a*c;
		
		double kok1=(((-b)+(Math.sqrt(delta)))/2*a);
		double kok2=(((-b)-(Math.sqrt(delta)))/2*a);
		double koklertoplami=(-b)/a;
		double koklercarpimi=c/a;
							
									    	    
	   if (delta<0)
	   {
		   System.out.println("Denklemin Sanal K�kleri Vard�r.Reel K�k� Yoktur");
	   }
	   
	   else if (delta==0)
	   {
		   System.out.println("�ak���k 2 K�k� Vard�r."+"Denklemin K�k�= "+kok1);
	   }
	   
	   else
	   {
		   
		   System.out.println("2 Farkl� K�k� Vard�r."+"Birinci K�k= "+kok1+"  "  +"�kinci K�k= "+kok2);
	   }
	   
	   if (delta<0)
	   {
		   System.out.println("Reel K�k� Olmad��� ��in K�kler Toplam� Ve K�kler �arp�m� Bulunamaz");
	   }
	   
	   else
	   {
		   System.out.println("K�kler Toplam�= "+ koklertoplami+" "+"K�kler �arp�m�= "+koklercarpimi);
	   }
	   
	  

	   
	   
		
		
		
		

		
		
	}

}

