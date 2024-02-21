package BusResv;

public class Bus {
	
	private int busNo;
	private boolean ac;
	private int capacity;
	
	
	Bus(int no, boolean ac, int cap	){
		this.busNo=no;
		this.ac=ac;
		this.capacity=cap;
	}
	
	public int getBusNo() {
		return busNo;
		
	}	
	
	public boolean isAc() {  // accesor method
		return ac;
	}
	
	public void setAc(boolean val) { // Mutator 
		ac=val;
	}
	
	
	public int getCapacity() {   // accessor method
		return capacity;
	}
	
	public void setCapacity(int cap) {  // Mutator 
		capacity=cap;
	}
	
	public void displayBusInfod() {
		System.out.println("Bus Number " +  busNo + " AC " + ac + " Total Capacity " + capacity);
	}

}
