

public class Budzdemo4 
{

		public static void main(String[] args) 
		{
			int grossSalary=100000;
			Budzdemo4 bd1=new Budzdemo4();
			int newCharges=bd1.houseCharges();
			int netSalary=grossSalary-newCharges;
			System.out.println(netSalary);
			
			int taxcal=30*newCharges;
			System.out.println(taxcal);
		}
		int houseCharges()
		{
		System.out.println("house charges is invoking");
		int rent=20000;
		int childFee=10000;
		int charges=rent+childFee;
		System.out.println(charges);
		return charges;
		}
}