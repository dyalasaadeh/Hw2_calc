package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculator.calculator;
import junit.framework.Assert;

class khara {

	
		@Test
		public void testSum_BothNumbersArePositive_ShouldReturnPositiveNumber() {
		// Arrange
		int a = 10;
		int b = 20;
		calculator calc = new calculator();
		// Act
		int result = calc.add(a, b);
		// Assert
		Assert.assertTrue(result > 0);}
}
