package AdderSubtractorMutex;

public class Value {
    public  int val =0;

    public void inc(int i){
        this.val +=i;
    }
    public void dec(int v){
        this.val-=v;
    }
}
