package application;

public class GamePartPicker extends ChoosePriceController {

	GPUARRAY GPUARRAY = new GPUARRAY();
	CPUARRAY CPUARRAY = new CPUARRAY();
	String[][] cpuList = CPUARRAY.returnArray();
	String[][] gpuList = GPUARRAY.returnArray();
	public String[] getGPU(String game) {
		int gpuLevel = 0;
		switch (game) {
		case "Fortnite": gpuLevel = 0;
				break;
		case "Apex Legends": gpuLevel = 1;
				break;	
		case "Crysis 3": gpuLevel = 2;
				break;					
		}
		return gpuList[gpuLevel];
	}
	
	public String[] getCPU(String game) {
		int cpuLevel = 0;
		switch (game) {
		case "Fortnite": cpuLevel = 0;
				break;
		case "Apex Legends": cpuLevel = 1;
				break;	
		case "Crysis 3": cpuLevel = 2;
				break;					
		}
		return cpuList[cpuLevel];
	}
}
