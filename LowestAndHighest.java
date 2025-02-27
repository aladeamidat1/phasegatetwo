public class lowestHighest
public static int[] lowestHighest(int[] nums){

	int highest = 0;
        int lowest = 0;
        
	for (int count : nums){
		if(count > highest){
			highest = count;
		} 
		if(count < lowest){
			lowest = count;
		}
		}


	return new int[] {highest, lowest};

}
}