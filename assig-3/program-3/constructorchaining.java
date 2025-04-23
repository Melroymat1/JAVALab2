import java.util.*;
class demo{
    demo(){
        this(10);
        System.out.println("default constructor");
    }
    demo(int x){
        System.out.println("paramiterized  constructor value : "+x);
    }
    public static void main(String[] args) {
        demo d=new demo();
        
    }

}