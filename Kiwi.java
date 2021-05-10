package Exe4_5;

public class Kiwi extends Fruit implements DiscountRate {

	private String brand;
	private double mass, disRate;
	private String packet;
	protected int price;
	protected int quantity;
    
    public Kiwi(String name, String size, String brand, double mass, String packet, int price, int quantity){ 			
       super(name,size);  										
       this.brand = brand;
       this.mass = mass;
       this.packet = packet;
       this.price = price;
       this.quantity = quantity;
       
       switch(packet) {
       case "Piece" :
    	   System.out.println("One " + packet + " of kiwi have a mass of " + mass() + " kg.");
    	   break;
       case "Packet" :
    	   System.out.println("One " + packet + " of kiwi have a mass of " + mass(12) + " kg.");
    	   break;
       case "Box" :
    	   System.out.println("One " + packet + " of kiwi have a mass of " + mass(36,0.10) + " kg.");
    	   break;
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
    		System.out.println("\tTotal mass \t: " + mass(12) + " kg");
    	}else if(this.quantity==36) {
    		disRate = 0.10; //10% discount
    		System.out.println("\t10% discount for one box");
    		System.out.println("\tTotal price \tRM: " + total(36,disRate));
    		System.out.println("\tTotal mass \t: " + mass(36,0.10) + " kg");
    	}
    }
  	
  	public String brand(){
      return this.brand;
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
  	
  	//method toString as an overriding method(Fruit class)
  	public String toString() {									
  	  return "\nBrand \t\t\t= " + brand() +
  			 "\nMass \t\t=" + mass + " kg" +
  			 "\nPrice \t\t\t= RM" + price +
  			 "\nQuantity \t\t= " + quantity;
  	}
}
