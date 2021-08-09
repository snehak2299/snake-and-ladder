
public class SnakeLadder{
	public static void main (String args[]){
	  int START_POSITION = 0;
	  int min = 1;
	  int max = 6;
	  int randomDiesNumber = (int)(Math.random() * ((max - min) + 1)) + min;
	  System.out.println("random value genrated for dies is:" + randomDiesNumber);
      
	}
}