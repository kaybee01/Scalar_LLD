package parkingLot.Models;

import parkingLot.Models.Enums.ParkingFloorStatus;
import parkingLot.Models.Enums.VehicleType;

import java.util.List;

public class parkingFloor extends BaseModel {

    private List<ParkingSlots> parkingSlots;
    int floorNumber;

    ParkingFloorStatus floorStatus;
    List<VehicleType> allowedVehicles;

    public List<ParkingSlots> getParkingSlots() {
        return parkingSlots;
    }

    public void setParkingSlots(List<ParkingSlots> parkingSlots) {
        this.parkingSlots = parkingSlots;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public ParkingFloorStatus getFloorStatus() {
        return floorStatus;
    }

    public void setFloorStatus(ParkingFloorStatus floorStatus) {
        this.floorStatus = floorStatus;
    }

    public List<VehicleType> getAllowedVehicles() {
        return allowedVehicles;
    }

    public void setAllowedVehicles(List<VehicleType> allowedVehicles) {
        this.allowedVehicles = allowedVehicles;
    }
}
