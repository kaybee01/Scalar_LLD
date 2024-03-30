package parkingLot.Models;

import parkingLot.Models.Enums.VehicleType;

import java.util.List;

public class ParkingLot extends BaseModel{

    private List<parkingFloor> parkingFloors;
    private  List<Gate> gates;
    private List<VehicleType> allowedVehicles;

    int capacity;
    private ParkingLot status;

    public List<parkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<parkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public List<VehicleType> getAllowedVehicles() {
        return allowedVehicles;
    }

    public void setAllowedVehicles(List<VehicleType> allowedVehicles) {
        this.allowedVehicles = allowedVehicles;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ParkingLot getStatus() {
        return status;
    }

    public void setStatus(ParkingLot status) {
        this.status = status;
    }
}
