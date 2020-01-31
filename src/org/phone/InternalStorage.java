package org.phone;

public class InternalStorage {
public void proceesorName() {
System.out.println("System Processor name is QuadCore");

}
public void ramSize() {
	System.out.println("Internal Storage RAM Size is 4gb");
}
public static void main(String[] args) {
	InternalStorage Is = new InternalStorage();
	Is.proceesorName();
	Is.ramSize();
	ExternalStorage es = new ExternalStorage();
	es.sizeRAM();
}
}
