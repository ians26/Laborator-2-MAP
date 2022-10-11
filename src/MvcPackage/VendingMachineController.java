package MvcPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachineController {
    private VendingMachine model;
    private VendingMachineView view;

    private final List<VendingMachine> records = new ArrayList<VendingMachine>();
    public VendingMachineController(VendingMachine model, VendingMachineView view){
        this.model = model;
        this.view = view;
    }

    public void setID(int ID){
        model.setMachineID(ID);
    }

    public int getID(){
        return model.getMachineID();
    }

    public void setLocation(String location){
        model.setLocation(location);
    }

    public String getLocation(){
        return model.getLocation();
    }

    public void setCapacity(int capacity){
        model.setProductCapacity(capacity);
    }

    public int getCapacity(){
        return model.getProductCapacity();
    }

    public void updateView(){
        view.printVendingMachineDetails(model.getMachineID(), model.getLocation(), model.getProductCapacity());
    }

    public void addVendingMachine(){
        Scanner in = new Scanner(System.in);
        VendingMachine machine = new VendingMachine();
        view.askID();
        int ID = in.nextInt();
        view.askLocation();
        String location = in.nextLine();
        view.askCapacity();
        int cap = in.nextInt();
        machine.setMachineID(ID);
        machine.setLocation(location);
        machine.setProductCapacity(cap);
        records.add(machine);
    }

    public void deleteVendingMachine(int ID){
        records.removeIf(record -> record.getMachineID() == ID);
    }




}
