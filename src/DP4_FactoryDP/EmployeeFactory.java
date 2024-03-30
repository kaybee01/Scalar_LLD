package DP4_FactoryDP;

public class EmployeeFactory {
    public static Employee getEmp(String empType){
        if(empType.equals("Android Dev")){
            return new AndroidDev();
        } else if (empType.equals("Web Dev")) {
            return new WebDev();
        }
        else return null;
    }
}
