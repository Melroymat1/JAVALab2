import java.util.*;
class traffic{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in); 
       System.out.println("Enter the color : ");

       String color=sc.next().toLowerCase();
    
      
       switch (color) {
        case "red":
        System.out.println("stop the traffic light is on red ");
            break;

            case "yellow":
            System.out.println("ready to move  the traffic light is on yellow ");
                break;
       
                case "green":
        System.out.println("you can move the vichel traffic light is on green ");
            break;
        default:
        System.out.println("invalid choice :");
            break;
       }
     
      
      
    }
}
    
