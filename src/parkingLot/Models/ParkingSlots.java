package parkingLot.Models;

import parkingLot.Models.Enums.ParkingSlotStatus;
import parkingLot.Models.Enums.VehicleType;

public class ParkingSlots extends BaseModel{
    private int slotNumber;
    VehicleType vehicleType;

    ParkingSlotStatus parkingSlotStatus;

    parkingFloor parkingFloor;

    public int getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public ParkingSlotStatus getParkingSlotStatus() {
        return parkingSlotStatus;
    }

    public void setParkingSlotStatus(ParkingSlotStatus parkingSlotStatus) {
        this.parkingSlotStatus = parkingSlotStatus;
    }

    public parkingLot.Models.parkingFloor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(parkingLot.Models.parkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }
}
