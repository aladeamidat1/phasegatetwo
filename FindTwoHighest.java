 

public class FindTwoHighest {
	public static int[] FindTwoHighest(int[] numbers) {

	
	int first = 0;
        int second = 0;

	for (int number : numbers){
		if(number > first){
			second = first;
              		first = number;
            	 }else if (number > second && number != first) {
                	second = number;
            	 }

        }
        
        return new int[]{first, second};




}


















}