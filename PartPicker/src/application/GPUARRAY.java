package application;

public class GPUARRAY extends Main{
	String[][] GPU = new String[3][2];
	// Array that contains the different GPUs
	public GPUARRAY() {
		
		// GPU name and power consumption
		String[] x1050 = new String[2]; 
		x1050[0] = "GTX 1050 ti";
		x1050[1] = "75";
		GPU[0] = x1050; 

		String[] x1060 = new String[2];
		x1060[0] = "GTX 1060";
		x1060[1] = "120";
		GPU[1] = x1060; 

		String[] x1070 = new String[2];
		x1070[0] = "GTX 1070";
		x1070[1] = "180";
		GPU[2] = x1070; 
		
	}
	public String[][] returnArray() {
		return this.GPU;
	}
}
