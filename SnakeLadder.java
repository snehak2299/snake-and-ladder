
public class SnakeLadder{
	public static void main (String args[]){
	  int position= 0;
	  int min = 1;
	  int max = 6;
      int count = 0;
	  int randomDiesNumber = (int)(Math.random() * ((max - min) + 1)) + min;
	  System.out.println("random value genrated for dies is:" + randomDiesNumber);
	  int lowerbound=1;
    int upperbound=3;
    while(position<=100){
    if(position==100){
     position= position;
     System.out.println("100 reached"+position);
     break;
	}
    else{
    int option = (int)(Math.random() * ((upperbound - lowerbound) + 1)) + lowerbound;
    //System.out.println(option);
    switch(option){
  	  case 1:{
       System.out.println("no play");
       if(position<=0){
        position=0;
        System.out.println("restart your game");
        System.out.println("position after this:"+ position);
	   }
       break;
	  }
      case 2:{
       System.out.println("Ladder");
       position = position+randomDiesNumber;
       System.out.println("position after this:"+ position);
       break;
	  }
      case 3:{
       System.out.println("snake");
       position=position-randomDiesNumber;
       System.out.println("position after this:"+ position);
       break;
	  }
    }
    }
    ++count;
    }
    System.out.println("total attempt needed to reach 100:" + count);
    System.out.println(position);
    
      
	}
}