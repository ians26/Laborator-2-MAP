package MvcPackage;

public class VendingMachineView {
    public void printVendingMachineDetails(int machineID, String location, int productCapacity){
        System.out.println("Vending machine details: ");
        System.out.println("Vending machine ID: " + machineID);
        System.out.println("Vending machine location: " + location);
        System.out.println("Vending machine product capacity: " + productCapacity);
    }
}
