public class GCD{

public static int GDC(int num1 , int num2){
	
	int result = 0;

        for (int count = 1; count <= num1 && count <= num2; count++) {
            if (num1 % count == 0 && num2 % count == 0) {
                result = count;
            }
        } 

	return result;


}





}