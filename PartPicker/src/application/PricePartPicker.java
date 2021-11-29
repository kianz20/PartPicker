package application;

public class PricePartPicker extends ChoosePriceController {

	GPUARRAY GPUARRAY = new GPUARRAY();
	CPUARRAY CPUARRAY = new CPUARRAY();
	String[][] cpuList = CPUARRAY.returnArray();
	String[][] gpuList = GPUARRAY.returnArray();
	public String[] getGPU(int price) {
		int gpuLevel;
		if (price <= 1000) {
			gpuLevel = 0;
		} else if (price <= 1500) {
			gpuLevel = 1;
		} else {
			gpuLevel = 2;
		}
		return gpuList[gpuLevel];
	}
	
	public String[] getCPU(int price) {
		int cpuLevel;
		if (price <= 1000) {
			cpuLevel = 0;
		} else if (price <= 1500) {
			cpuLevel = 1;
		} else {
			cpuLevel = 2;
		}
		return cpuList[cpuLevel];
	}
}
