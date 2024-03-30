package parkingLot.dtos;

import parkingLot.Models.Enums.VehicleType;
import parkingLot.Models.Token;
import parkingLot.Models.Vehicle;

public class IssueTokenRequestDTO {

   // Token token;



    private  String vehicleNumber;
    String OwnerName;
    long GAteId;

    VehicleType vehicleType;

//    public Token getToken() {
//        return token;
//    }
//
//    public void setToken(Token token) {
//        this.token = token;
//    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }

    public long getGAteId() {
        return GAteId;
    }

    public void setGAteId(long GAteId) {
        this.GAteId = GAteId;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
