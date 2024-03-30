package parkingLot.Models;

public class Operator extends  BaseModel{
    String name;
    String emp_Id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmp_Id() {
        return emp_Id;
    }

    public void setEmp_Id(String emp_Id) {
        this.emp_Id = emp_Id;
    }
}
