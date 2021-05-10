package Exe4_5;

public class GreenApple extends Apple {
	
	private int calorie;
	private double fiber;
	private double iron;
	private String type;
    
    
    public GreenApple(String name, String size, int price, int quantity, double mass, int calorie, double fiber, double iron, String type){ 		
       super(name,size, price, quantity, mass);  							
       this.calorie = calorie;
       this.fiber = fiber;
       this.iron = iron;
       this.type = type;
      
     }
    
    //Overriding method
    public void printData(){ 
    	System.out.println("Size \t\t\t= " + super.getSize());
    }
  	
  //Overloading without parameter
    public String Nutrients() {
    	return "\nGreen Apple contains 3 main nutrients.";
    }
    
    //Overloading with 1 parameter
    public String Nutrients(String c) {
    	return "\nGreen Apple contains " + c;
    }
    
    //Overloading with 2 parameters
    public String Nutrients(String f, String i) {
    	return "\nGreen Apple contains " + f + " and " + i;
    }
    
  	public int calorie(){
    	  return  this.calorie;
    	}
  	public double fiber(){
    	  return  this.fiber;
    	}
  	public double iron(){
    	  return  this.iron;
    	}
  	public String type(){
    	  return  this.type;
    	}
  	//method toString as an overriding method(Apple class)
  	public String toString() { 
  	  return super.toString() + 
  			  "\nType \t\t\t= " + type +
  			  Nutrients() +
  			  Nutrients("calorie") + "." +
  			  "\nCalorie \t\t= " + calorie + " kcal" +
  			  Nutrients("fiber","iron") + "." +
  			  "\nFiber \t\t\t= " + fiber + " g" +
  			  "\nIron \t\t\t= " + iron + " mg";

  	}
}
