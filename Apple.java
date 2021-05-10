package Exe4_5;

public class Apple extends Fruit implements DiscountRate {

	protected int price;
	protected int quantity;
	private double disRate, mass;
    
    public Apple(String name, String size, int price, int quantity, double mass){		
       super(name,size);  											
       this.price = price;											
       this.quantity = quantity;		
       this.mass = mass;
       
       if(this.quantity == 1) {
    	   	System.out.println("Total Amount(purchased) \t= RM" + total());
       	}else if(this.quantity == 12) {
       		System.out.println("Total Amount(1 packet(12 pcs)) \t= RM" + total(12));
       	}else if(this.quantity == 36) {
       		System.out.println("Total Amount(1 box(36 pcs)) \t= RM" + total(36,5));
       	}
       discountRate();
     }
    //Overriding method
    public void printData(){ 
        System.out.println("Size \t\t\t= " + super.getSize());
    }
      
    public void discountRate() {
    	if(this.quantity==1) {
    		System.out.println("\tNo discount for one purchase");
    		System.out.println("\tTotal price \tRM: " + total());
    		System.out.println("\tTotal mass \t: " + mass() + " kg");
    	}else if(this.quantity==12){
    		disRate = 0.05; //5% discount
    		System.out.println("\t5% discount for one packet");
    		System.out.println("\tTotal price \tRM: " + total(disRate));
    		System.out.println("\tTotal mass \t: " + mass(12)+ " kg");
    	}else if(this.quantity==36) {
    		disRate = 0.10; //10% discount
    		System.out.println("\t10% discount for one box");
    		System.out.println("\tTotal price \tRM: " + total(36,disRate));
    		System.out.println("\tTotal mass \t: " + mass(36,0.10)+ " kg");
    	}
    }
    
     public int getPrice(){
  	    return price;
  	}
     
     public int getQuantity(){
   	    return quantity;
   	} 	
     
    public double getMass(){
    	    return mass;
    } 
   //Overloading without parameter
   	public double mass(){
         return this.mass;
     }
   	
   	//overloading with 1 parameter
   	public double mass(int quantity){
 		   return this.mass*quantity;
 	}
   	
   	//overloading with 2 parameters
   	public double mass(int quantity, double mass){
 		   return mass*quantity;
 	}
     
     //Overloading (no parameter)
     public double total(){
 	    return this.price*this.quantity;
    }
     
     //Overloading (1 parameter)
     public double total(double disRate){
 	    return this.price*this.quantity*disRate;
    }
     
     //Overloading (2 parameters)
     public double total(int num, double disRate){
    	    return this.price*num*disRate;
    }
     
    //method toString as an overriding method(fruit class)
  	public String toString() { 
  	  return "\nPrice \t\t\t= RM" + price + 
  			 "\nQuantity \t\t= " + quantity +
  			 "\nMass \t\t\t= " + mass + " kg";
  	}
}
