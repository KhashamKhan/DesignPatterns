package pattterns;
import java.util.Scanner;
public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Select option");
		System.out.println("1) Buy new bike");
		System.out.println("2) Repair My bike");
		

		
		
		int option = sc.nextInt(); 
		if(option == 1)
		{
			System.out.println("Select horse power");
			System.out.println("1) 100 horse power");
			System.out.println("2) 200 horse power");
			int HpNum = sc.nextInt();
			System.out.println("Select color");
			System.out.println("1) red color");
			System.out.println("2) black color");
			int CoNum = sc.nextInt();
			NewBike nbe = NewBikeOrder.getBike("HorsePower");
			NewBike nbc = NewBikeOrder.getBike("COLOR");
			
			if(HpNum == 1)
			{
				Engine e1 = nbe.GetEngine("hundredHp");
				e1.HorsePower();
			}
			else
			{
				Engine e2 = nbe.GetEngine("OnefiftyHp");
				e2.HorsePower();
			}
			if(CoNum == 1)
			{
				Color c1 = nbc.GetColor("Red");
				c1.BikeColor();
			}
			else
			{

				Color c2 = nbc.GetColor("Black");
				c2.BikeColor();
				
			}
		}
		else if(option == 2)
		{
			RepairBike rb = new RepairBike();
			rb.RepairMyBike();
		}
		else
		{
			System.out.println("Please Select option ");
		}
	}
}
