import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FindHighestNumberTest{

	@Test
	public void testThatFindHighestNumberCanFindTwoNumbers(){
		 FindHighestNumber myNewNumber = new FindHighestNumber ();
		 assertArrayEquals(new int[]{10,9} , myNewNumber.find[1,4,5,6,9,10,7]);


