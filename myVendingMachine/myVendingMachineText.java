package myVendingMachine;

import javax.swing.*;

public class myVendingMachineText {
	public double coke,pepsi,soda;
	public String ckreceipt,psreceipt,sdreceipt;
	
	public void Coke() {
		if (coke == 25) {
			ckreceipt = "You bought a Coke";
		}
		if (coke == 30) {
			ckreceipt = "You bought a Coke \nChange: 5";
		}
		if (coke == 35) {
			ckreceipt = "You bought a Coke \nChange: 10";
		}
		if (coke == 40) {
			ckreceipt = "You bought a Coke \nChange: 15";
		}
		if (coke == 45) {
			ckreceipt = "You bought a Coke \nChange: 20";
		}
		if (coke == 50) {
			ckreceipt = "You bought a Coke \nChange: 25";
		}
		if (coke <= 24) {
			ckreceipt = "Please insert the \nright amount of coins";
		}
		
	}
	public void Pepsi() {
		if (pepsi == 35) {
			psreceipt = "You bought a Pepsi ";
		}
		if (pepsi == 40) {
			psreceipt = "You bought a Pepsi \nChange: 5";
		}
		if (pepsi == 45) {
			psreceipt = "You bought a Pepsi \nChange: 10";
		}
		if (pepsi == 50) {
			psreceipt = "You bought a Pepsi \nChange: 15";
		}
		if (pepsi <= 34) {
			psreceipt = "Please insert the \nright amount of coins";
		}
	}
	public void Soda() {
		if (soda == 45) {
			sdreceipt = "You bought a Soda";
		}
		if (soda == 50) {
			sdreceipt = "You bought a Soda \nChange: 5";
		}
		if (soda <= 44) {
			sdreceipt = "Please insert the \nright amount of coins";
		}
	}
}
