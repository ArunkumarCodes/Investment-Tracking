import java.util.Scanner;
public class InvestmentTracker {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your buying price per share: ");
		double buyingPrice=sc.nextDouble();
		int day =1;
		double closingPrice;
		double[] weekly = new double[7];

		int i=0;
		while(i<weekly.length) {		// while Loop Begins - To get Closing Price each day

			System.out.println("Enter the closing price for the day"+ day);
			closingPrice = sc.nextDouble();
			double earnings = closingPrice-buyingPrice;
			weekly[i] = earnings;

			if(earnings > 0) {
				System.out.println("After day" + day + "you have lost $%.2f "+ "per share since yesterday."+ (-earnings));
				System.out.println(" ");

			}else {
				System.out.println("After day"+ day + ",you have no earnings per share.");

			}
			day = day+1;
			i=i+1;

		}	// While Loop Ends - To get Closing Price each day
		
		System.out.println("your weekly earings:");
		double totalWeeklyEarnings =0;
		
		for (int j=0;j<weekly.length; j++) {
			System.out.println("Your earning on day"+ j+ "is $%.2f " +weekly[j]);
			System.out.println(" ");
			
			totalWeeklyEarnings = totalWeeklyEarnings + weekly[j];
		}
		System.out.println("Total earnings:"+ "$%.2f "+ "per share"+ totalWeeklyEarnings);
		sc.close();
		
	}

}
