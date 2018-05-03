class Context{
    int value;
    Strategy s;
    
    Context(int value,Strategy s){
        this.value=value;
        this.s=s;
    }
    
    void calculate(){
        s.compute(value);
    }
    
}

interface Strategy{
    public void compute(int value);
}

class Strategy1 implements Strategy{
    public void compute(int value){
        if(value<40)
            System.out.println("Slim");
        else
            System.out.println("Fat");
            
    }
}

class Strategy2 implements Strategy{
    public void compute(int value){
        if(value<60)
            System.out.println("Slim");
        else
            System.out.println("Fat");
            
    }
}

class Strategy3 implements Strategy{
    public void compute(int value){
        if(value<90)
            System.out.println("Slim");
        else
            System.out.println("Fat");
            
    }
}

public class ComputePhysique{

     public static void main(String []args){
     
     Strategy s1=new Strategy1();
     Strategy s2=new Strategy2();
     Strategy s3=new Strategy3();
     
     Context c1=new Context(60,s1);
     c1.calculate();
     
     Context c2=new Context(60,s2);
     c2.calculate();
     
     Context c3=new Context(60,s3);
     c3.calculate();
     
     }
     
}
