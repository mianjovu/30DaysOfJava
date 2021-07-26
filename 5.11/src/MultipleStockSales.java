import java.util.Scanner;

public class MultipleStockSales {
	
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
		int numberOfTracks;
		double total = 0;
		
		System.out.println( "Please enter the number of stock you want to keep track of: " );
		numberOfTracks = scanner.nextInt();
		
		for( int currentTrack = 1; currentTrack <= numberOfTracks; currentTrack++) {
			
			System.out.println( "Pleaase enter the number of shares for stock " + currentTrack + ": " );
			numberOfShares = scanner.nextDouble();

			System.out.println( "Pleaase enter the purchase price fro stock " + currentTrack + ": ");
			purchasePrice = scanner.nextDouble();

			System.out.println( "Pleaase enter the purchase commission for stock " + currentTrack + ": " );
			purchaseCommission = scanner.nextDouble();

			System.out.println( "Pleaase enter the sale price for stock " + currentTrack + ": " );
			salePrice = scanner.nextDouble();

			System.out.println( "Pleaase enter the sale commission for stock " + currentTrack + ": " );
			saleCommission = scanner.nextDouble();

			profit = profitCalculator( numberOfShares, purchasePrice, purchaseCommission, salePrice, saleCommission );
			total = total + profit;
			
			if( total < 0 ) {
				System.out.printf( "You made a total loss of £%,.2f", profit, total );
			} else {
				System.out.printf( "You made a total profit of £%,.2f", profit, total );
			}
				
		}
		
		
	}

}

