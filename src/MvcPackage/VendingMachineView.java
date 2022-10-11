package MvcPackage;

public class VendingMachineView {
    public void printVendingMachineDetails(int machineID, String location, int productCapacity){
        System.out.println("Vending machine details: ");
        System.out.println("Vending machine ID: " + machineID);
        System.out.println("Vending machine location: " + location);
        System.out.println("Vending machine product capacity: " + productCapacity);
    }

    public void askID(){
        System.out.println("Insert Vending machine ID: ");
    }

    public void askLocation(){
        System.out.println("Insert Vending machine location: ");
    }

    public void askCapacity(){
        System.out.println("Insert Vending machine capacity: ");
    }
}
