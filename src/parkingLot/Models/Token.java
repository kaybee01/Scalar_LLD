package parkingLot.Models;

import java.util.Date;

public class Token extends  BaseModel{

    String number;
    Date entryTime;

    Vehicle vehicle;
    ParkingSlots parkingSlots;
    Gate generatedGAte;
    Operator operator;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSlots getParkingSlots() {
        return parkingSlots;
    }

    public void setParkingSlots(ParkingSlots parkingSlots) {
        this.parkingSlots = parkingSlots;
    }

    public Gate getGeneratedGAte() {
        return generatedGAte;
    }

    public void setGeneratedGAte(Gate generatedGAte) {
        this.generatedGAte = generatedGAte;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}
