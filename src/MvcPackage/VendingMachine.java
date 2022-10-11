package MvcPackage;

public class VendingMachine {
    private String location;
    private int productCapacity;
    private int machineID;

    @Override
    public String toString() {
        return "VendingMachine: " +
                "location='" + location + '\'' +
                ", productCapacity=" + productCapacity +
                ", machineID=" + machineID;
    }

    public VendingMachine(String location, int productCapacity, int machineID) {
        this.location = location;
        this.productCapacity = productCapacity;
        this.machineID = machineID;
    }

    public VendingMachine() {
        this.location = "default";
        this.productCapacity = -1;
        this.machineID = -1;
    };

    public int getMachineID() {
        return machineID;
    }

    public void setMachineID(int machineID) {
        this.machineID = machineID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getProductCapacity() {
        return productCapacity;
    }

    public void setProductCapacity(int productCapacity) {
        this.productCapacity = productCapacity;
    }
}
