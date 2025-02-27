import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SimpleCalculatorTest{

	@Test
	public void testThatCalculatorCanAddTwoNumbers(){
		SimpleCalculator myCalculator = new SimpleCalculator();
		assertEquals(6 , myCalculator.add(2 , 4));

		//precondition
		//SimpleCalculator myCalculator = new SimpleCalculator();
		// Action
		//int sum = myCalculator.add(2 , 4);
		//Check / Assert
		//assertEquals(6 , sum); 
	}

	
	@Test
	public void testThatCalculatorCanSubtractTwoNumbers(){
		SimpleCalculator myCalculator = new SimpleCalculator();
		assertEquals(2 , myCalculator.subtract(4 , 2));

	}

	@Test
	public void testThatCalculatorCanMultiplyTwoNumbers(){
		SimpleCalculator myCalculator = new SimpleCalculator();
		assertEquals(8 , myCalculator.multiply(4 , 2));


	}



}


