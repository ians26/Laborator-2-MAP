package MvcPackage;

public class VendingMachineController {
    private VendingMachine model;
    private VendingMachineView view;

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
}
