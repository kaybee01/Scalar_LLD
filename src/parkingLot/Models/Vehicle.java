package parkingLot.Models;

import parkingLot.Models.Enums.VehicleType;

public class Vehicle extends  BaseModel{
    String vehicleNamel;
    String ownerName;
    VehicleType vehicleType;

    public String getVehicleNamel() {
        return vehicleNamel;
    }

    public void setVehicleNamel(String vehicleNamel) {
        this.vehicleNamel = vehicleNamel;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
