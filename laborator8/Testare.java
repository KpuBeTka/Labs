package laborator8;

interface Programator{
	void programeaza();
}

class TehnicianProgramator implements Programator{
	public void programeaza() {
		System.out.println("Tehnicienii care au absolvit Centrul de Excelență în Informatică sunt\r\n" + 
				"buni programatori!");
	}
	
	public static void main(String[] args) {
		TehnicianProgramator tp1 = new TehnicianProgramator();
		
		tp1.programeaza();
	}
}
