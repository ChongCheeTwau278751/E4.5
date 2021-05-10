package Exe4_5;

public class RedApple extends Apple {

	private int calcium;
	private double carbohydrate;
	private double vitaminE;
	private String type;
    
    public RedApple(String name, String size, int price, int quantity, double mass, int calcium, double carbohydrate, double vitaminE, String type){ 		
       super(name, size, price, quantity, mass);  							
       this.calcium = calcium;
       this.carbohydrate = carbohydrate;
       this.vitaminE = vitaminE;
       this.type = type;
        							
     }
    //Overriding method
    public void printData(){ 
    	System.out.println("Size \t\t\t= " + super.getSize());
    	}
  	
    //Overloading without parameter
    public String Nutrients() {
    	return "\nRed Apple contains 3 main nutrients.";
    }
    
    //Overloading with 1 parameter
    public String Nutrients(String v) {
    	return "\nRed Apple contains " + v;
    }
    
    //Overloading with 2 parameters
    public String Nutrients(String ca, String cb) {
    	return "\nRed Apple also contains " + ca + " and " + cb;
    }
    
  	public int calcium(){
    	  return  this.calcium;
    	}
  	public double carbohydrate(){
    	  return  this.carbohydrate;
    	}
  	public double vitaminE(){
    	  return  this.vitaminE;
    	}
  	public String type(){
    	  return  this.type;
    	}
  	//method toString as an overriding method(Apple class)
  	public String toString() { 
  	  return super.toString() + 
  			"\nType \t\t\t= " + type +
  			  Nutrients() +
  			  Nutrients("Vitamin E") + "." +
  			  "\nVitamin E \t\t= " + vitaminE + " mg" +
  			  Nutrients("clacium,carbohydrate") + "." +
  			  "\nCalcium \t\t= " + calcium + " mg" + 
  			  "\nCarbohydrate \t\t= " + carbohydrate + " g";

  	}
}
