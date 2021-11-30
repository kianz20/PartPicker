package application;

public class CPUARRAY extends Main{
	String[][] CPU = new String[3][2];
	// Array that contains the different CPUs
	public CPUARRAY() {
		
		// CPU name and power consumption
		String[] i3 = new String[2]; 
		i3[0] = "i3 10105F";
		i3[1] = "65";
		CPU[0] = i3; 

		String[] i5 = new String[2];
		i5[0] = "i5 10400F";
		i5[1] = "65";
		CPU[1] = i5; 

		String[] i7 = new String[2];
		i7[0] = "i7 10700F";
		i7[1] = "65";
		CPU[2] = i7; 
		
	}
	public String[][] returnArray() {
		return this.CPU;
	}
}
