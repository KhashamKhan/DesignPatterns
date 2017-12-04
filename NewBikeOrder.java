package pattterns;

public class NewBikeOrder {
	   public static NewBike getBike(String choice){
		   
		      if(choice.equalsIgnoreCase("HorsePower")){
		    	  return new BikeNewEngine();
		         
		      }else if(choice.equalsIgnoreCase("COLOR")){
		         
		         return new BikeNewColor();
		      }
		      return null;
		   }	
}
