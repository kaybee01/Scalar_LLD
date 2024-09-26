package PracticeCodePkg_3;

import java.util.Comparator;

public class Logic implements Comparator<Integer> {


    public int countFactor(int a){
        int count =0;
        for(int i=1;i*i<=a;i++){
            if(a%i==0){
                if(i == a/i){
                    count+=1;
                }else{
                    count+=2;
                }
            }
        }
        return count;
    }


    @Override
    public int compare(Integer o1, Integer o2) {
        int A = countFactor(o1);
        int B = countFactor(o2);
        if(A<B){
            return -1;
        } else if (A>B) {
            return  1;
        }else {
            return o1.compareTo(o2);
        }
    }
}

class SortUsingComparator implements Comparable<SortUsingComparator>{
    private int n;
    SortUsingComparator(int n){
        this.n=n;
    }

    public void setN(int n){
        this.n=n;
    }
    public int getN(){
        return  this.n;
    }

    public int countFactor(int a){
        int count =0;
        for(int i=1;i*i<=a;i++){
            if(a%i==0){
                if(i == a/i){
                    count+=1;
                }else{
                    count+=2;
                }
            }
        }
        return count;
    }



//    @Override
//    public int compare(Integer A, Integer B) {
//        int a = countFactor(A);
//        int b = countFactor(B);
//
//        if(a<b){
//            return -1;
//        } else if (a>b) {
//            return 1;
//        }else {
//           return A.compareTo(B);
//        }
//    }

    @Override
    public int compareTo(SortUsingComparator o) {
        int a = countFactor(o.getN());
        int b = countFactor(this.n);
        if (a < b) {
            return -1;
        } else if (a > b) {
            return 1;
        } else {
            return Integer.compare(o.getN(), this.n);
        }
    }

    public String toString() {
        return "SortUsingComparator{n=" + n + "}";
    }
}
