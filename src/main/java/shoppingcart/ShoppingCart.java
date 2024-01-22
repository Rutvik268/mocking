package shoppingcart;

public class ShoppingCart {
	private PriceCalculator priceCalculator;

	public ShoppingCart(PriceCalculator priceCalculator) {
		this.priceCalculator = priceCalculator;
	}

	public double calculateTotalPrice(double unitPrice, int quantity) {
		return priceCalculator.calculatorPrice(unitPrice, quantity);
	}
}
