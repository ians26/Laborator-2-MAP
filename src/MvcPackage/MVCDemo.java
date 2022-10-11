package MvcPackage;

public class MVCDemo {
    public static void main(String[] args) {
        VendingMachine model = newMachine();



    }
    private static VendingMachine newMachine(){
        VendingMachine machine = new VendingMachine();
        machine.setMachineID(1);
        machine.setLocation("Cluj, strada Constanta");
        machine.setProductCapacity(300);
        return machine;
    }
}
