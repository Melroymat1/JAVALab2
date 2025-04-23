import java.util.*;
public class trafic{
    String color;
    int duration;
void changecolor(String newcolor,int newduration){
    color=newcolor;
    duration=newduration;
}
boolean IsRed(){
    return color.equalsIgnoreCase("red");
}

boolean IsGreen(){
    return color.equalsIgnoreCase("green");
}
public static void main(String[] args){
    trafic light=new trafic();
    light.changecolor("red",30);

    System.out.println("color : "+light.color);
    System.out.println("IS red : "+light.IsRed());
    System.out.println("IS green : "+light.IsGreen());
}

}
