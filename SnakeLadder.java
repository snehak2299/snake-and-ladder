
public class SnakeLadder{
	public static void main (String args[]){
	  int position= 0;
	  int min = 1;
	  int max = 6;
	  int randomDiesNumber = (int)(Math.random() * ((max - min) + 1)) + min;
	  System.out.println("random value genrated for dies is:" + randomDiesNumber);
	  int lowerbound=1;
    int upperbound=3;
    while(position<=100){
    int option = (int)(Math.random() * ((upperbound - lowerbound) + 1)) + lowerbound;
    //System.out.println(option);
    switch(option){
  	  case 1:{
       System.out.println("no play");
       if(position<=0){
        position=0;
        System.out.println("restart your game");
	   }
       break;
	  }
      case 2:{
       System.out.println("Ladder");
       position = position+randomDiesNumber;
       break;
	  }
      case 3:{
       System.out.println("snake");
       position=position-randomDiesNumber;
       break;
	  }
    }
    }
  
   System.out.println(position);
    
      
	}
}