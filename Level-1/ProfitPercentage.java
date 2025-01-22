public class ProfitPercentage{
	public static void main(String args[]){
		int cost_price = 129;
		int selling_price = 191;
		int profit = selling_price - cost_price;
		double profit_percentage = (((double)profit/cost_price)*100);
		System.out.println("The Cost Price is INR " + cost_price + " and Selling Price is INR " + selling_price + "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profit_percentage);
	}
}
