import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("<--------Main Menu--------->");
        System.out.println();
        System.out.println("FILL  Greadients PRESS : 1");
        System.out.println();
        System.out.println("SHOW  Remaining Gredients PRESS : 2");
        System.out.println();
        System.out.println("BUY    COFFEE PRESS : 3");
        System.out.println();
        System.out.println("Check Total Collection of Ruppess PRESS : 4");
        System.out.println();
        System.out.println("TAKE  Payment PRESS : 5");
        System.out.println();
        System.out.println("For  ANALYTICS  PRESS : 6");
        System.out.println();
        System.out.println("For  EXIT  PRESS : 7 ");



  
          
   Coffee cofee =new Coffee();
   
   
   // esp = new Cappuccino();
    while(true){

        int key =sc.nextInt();
        if(key==1){
        
        System.out.print("Plaese enter Milk Quantity in ML : "); 
        int milk = sc.nextInt();
         System.out.print("Plaese enter water Quantity in ML : "); 
        int water = sc.nextInt();
          System.out.print("Plaese enter Coffee Beans  : "); 
        int cofe = sc.nextInt();
      
        System.out.println(cofee.addIngredients(milk, water, cofe));
         System.out.print("Enter Key for Next Step : ");
        }
        else if(key==2){
        System.out.println(cofee.remainingIngredients());
      
         System.out.print("Enter Key for Next Step : ");
        }
        else if(key==3){
            while(true){
            System.out.println("SELECT COFEE ");
            System.out.println("For Espresso Coffee Press : E");
            System.out.println("For Lattie Coffee Press : L ");
            System.out.println("For Cappuccino Coffee Press : C");
            System.out.println("For EXIT  from this MENU PRESS : P");
            char press = sc.next().charAt(0);
           
            if(press=='E'){
             System.out.println("Please Enter number of cup");
             int cup =sc.nextInt();
            System.out.println(cofee.makeCoffeeEspresso(cup));
            break;
            }
            else if(press=='L'){
                 System.out.println("Please Enter number of cup");
             int cup =sc.nextInt();
                System.out.println(cofee.makeCoffeeLatte(cup));
                break;
            }
            else if(press =='C'){
                 System.out.println("Please Enter number of cup");
             int cup =sc.nextInt();
                System.out.println(cofee.makeCoffeeCappuccino(cup));
                break;
            }
            else if(press =='P'){
                break;
            }
            else {
                System.out.println("Wrong Input Please Select Valid Coffee ..");
            }
        }
          
           
            System.out.print("Enter Key for Next Step : ");
           
        }
        else if(key ==4){
            System.out.println(cofee.checkBalance());
             System.out.print("Enter Key for Next Step : ");
        }
        else if(key==5){
            System.out.println(cofee.withdraw());
             System.out.print("Enter Key for Next Step : ");
        }
        else if(key==6){
                System.out.println(cofee.analytics());
                 System.out.print("Enter Key for Next Step : ");
        }
        else if(key ==7){
            System.out.println("Thank YOU ");
            break;
        }
 }
    }
}
