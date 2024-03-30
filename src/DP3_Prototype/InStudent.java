package DP3_Prototype;

public class InStudent extends  Student  implements Prototype<Student>{

    int psp;
    int rank;

    InStudent(){

    }

    InStudent(InStudent is){
        super(is);
        this.psp=is.psp;
        this.rank=is.rank;
    }

    public InStudent copy(){
        InStudent i1 = new InStudent(this);
        return i1;
    }



}
