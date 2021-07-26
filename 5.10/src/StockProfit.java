import java.util.Scanner;

public class StockProfit {
	
	public static double profitCalculator( double numberOfShares, double purchasePrice, double purchaseCommission, 
										   double salePrice, double saleCommission ) {
		double profit;
		profit = ( ( numberOfShares * salePrice ) - saleCommission ) - ( numberOfShares * purchasePrice ) + 
																		purchaseCommission;
		return profit;
	}
	
	public static void main( String [ ] args ) {
		Scanner scanner = new Scanner( System.in );
		double numberOfShares;
		double purchasePrice;
		double purchaseCommission;
		double salePrice;
		double saleCommission;
		double profit;
		
		System.out.println( "Pleaase enter the number of share: " );
		numberOfShares = scanner.nextDouble();
		
		System.out.println( "Pleaase enter the purchase price: " );
		purchasePrice = scanner.nextDouble();
		
		System.out.println( "Pleaase enter the purchase commission: " );
		purchaseCommission = scanner.nextDouble();
		
		System.out.println( "Pleaase enter the sale price: " );
		salePrice = scanner.nextDouble();
		
		System.out.println( "Pleaase enter the sale commission: " );
		saleCommission = scanner.nextDouble();
		
		profit = profitCalculator( numberOfShares, purchasePrice, purchaseCommission, salePrice, saleCommission );
		
		if( profit < 0 ) {
			System.out.printf( "You made a loss of £%,.2f", profit );
		} else {
			System.out.printf( "You made a profit of £%,.2f", profit );
		}
	}
	
}
