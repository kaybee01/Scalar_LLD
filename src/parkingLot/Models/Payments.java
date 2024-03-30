package parkingLot.Models;

import parkingLot.Models.Enums.PaymentMode;
import parkingLot.Models.Enums.PaymentStatus;

import java.util.Date;

public class Payments extends  BaseModel{

    int Amount;
    PaymentMode paymentMode;

    String ref_ID;
    Bill bill;
    PaymentStatus paymentStatus;

    Date paidAt;

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int amount) {
        Amount = amount;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getRef_ID() {
        return ref_ID;
    }

    public void setRef_ID(String ref_ID) {
        this.ref_ID = ref_ID;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Date getPaidAt() {
        return paidAt;
    }

    public void setPaidAt(Date paidAt) {
        this.paidAt = paidAt;
    }
}
