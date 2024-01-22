package shoppingcart;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import mockit.Expectations;
import mockit.Mocked;


public class ShoppingCartTest {
	
	@Mocked
	PriceCalculator mockedPriceCalculator;

	@Test
	@DisplayName("PriceCalculator")
	public void testCalculateTotalPrice() {
		mockedPriceCalculator = new PriceCalculator();
		new Expectations(PriceCalculator.class) {
			{
				mockedPriceCalculator.calculatorPrice(anyDouble, anyInt);
				result = 42.0;
			}
		};

		ShoppingCart shoppingCart = new ShoppingCart(mockedPriceCalculator);
		double totalPrice = shoppingCart.calculateTotalPrice(10.0, 5);
		assertNotEquals(42.0,totalPrice);
	}
}