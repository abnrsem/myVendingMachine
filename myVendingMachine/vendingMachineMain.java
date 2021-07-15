package myVendingMachine;

public class vendingMachineMain {
	
	static vendingMachine_01 a = new vendingMachine_01();

	public static void main (String [] args) {
		a.setVisible(true);
		
		a.setTitle("Vending Machine");
		a.setSize(720,480);
		a.setLocationRelativeTo(null);
		a.setResizable(false);
	}
}
