import java.util.*;
class veichel{
    String model,manu,reg;

    veichel(String model){
        this.model= model;
    }
    veichel(String model,String manu){
        this(model);
        this.manu= manu;
    }
    veichel(String model,String manu,String reg){
        this(model,manu);
        this.reg= reg;
    }
    void display(){
        System.out.println("model:  "+model+" manufac : "+manu+" reg : "+reg);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        veichel v1=new veichel(" modelxxxx");
        veichel v2=new veichel(" modelyyy","tata");
        veichel v3=new veichel(" modelzzz","tvs","KA20HA");

        v1.display();
        v2.display();
        v3.display();
    }

}