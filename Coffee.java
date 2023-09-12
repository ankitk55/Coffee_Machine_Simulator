import java.util.ArrayList;

public class Coffee{
  protected  int milk;
   protected  int water;
   protected  int coffeeBeans;
   protected   int moneyBox ;
   protected  int coffeeCount ;
   protected  int consumeMilk;
   protected  int consumeWater;
   protected  int consumeCoffeeBeans;
   protected  int totalMoneyEaened;

 public String addIngredients(int milks,int waterr,int coffeeBeanss){
        milk+=milks;
        water+=waterr;
        coffeeBeans+=coffeeBeanss;
        return "Ingredients successfully  added.";
    }
    public String makeCoffeeEspresso(int cup){

        this.water =this.water-cup*250;
       this. milk =this.milk-cup*0;
        this.coffeeBeans =this.coffeeBeans-cup*16;

        if(this.water<0 ||this.coffeeBeans<0|| this.milk<0){
             this.water = this.water+cup*250;
        this.coffeeBeans =this.coffeeBeans+cup*16;
        this.milk =this.milk+cup*0;
       
             return "Error : Insuffecient Ingredients  ";
        }
        moneyBox+=4*cup;
        totalMoneyEaened+=4*cup;
        coffeeCount+=cup;
        consumeWater+=cup*250;
        consumeCoffeeBeans+=cup*16;
        consumeMilk+=cup*0;
        return "Success ";
    }
     public String makeCoffeeLatte(int cup){

        this.water =this.water-cup*350;
       this. milk =this.milk-cup*75;
        this.coffeeBeans =this.coffeeBeans-cup*20;

        if(this.water<0 ||this.coffeeBeans<0|| this.milk<0){
             this.water = this.water+cup*350;
        this.coffeeBeans =this.coffeeBeans+cup*20;
        this.milk =this.milk+cup*75;
       
             return "Error : Insuffecient Ingredients  ";
        }
        moneyBox+=7*cup;
        totalMoneyEaened+=7*cup;
        coffeeCount+=cup;
        consumeWater+=cup*350;
        consumeCoffeeBeans+=cup*20;
        consumeMilk+=cup*75;
        return "Success ";
    }

     public String makeCoffeeCappuccino(int cup){

        this.water =this.water-cup*200;
       this. milk =this.milk-cup*100;
        this.coffeeBeans =this.coffeeBeans-cup*12;

        if(this.water<0 ||this.coffeeBeans<0|| this.milk<0){
             this.water = this.water+cup*200;
        this.coffeeBeans =this.coffeeBeans+cup*12;
        this.milk =this.milk+cup*100;
       
             return "Error : Insuffecient Ingredients  ";
        }
        moneyBox+=6*cup;
        totalMoneyEaened+=6*cup;
        coffeeCount+=cup;
        consumeWater+=cup*200;
        consumeCoffeeBeans+=cup*12;
        consumeMilk+=cup*100;
        return "Success ";
    }
   

    public String remainingIngredients(){
        return "Remaing Ingredients : Milk : "+this.milk+" ml , Water : "+this.water+" ml , Coffee Beans : "+this.coffeeBeans;
    }

    public String checkBalance(){
        return "Total avialable Balance "+this.moneyBox+" $.";
    }
    public String withdraw(){
        if(this.moneyBox<=0){
            return "Insufficient Balance ..";
        }
        this.moneyBox=0;
        return "Payment Withdraw Successfully ..";
    }
    public String analytics(){
        return "Total Coffee Sold : "+this.coffeeCount
        +" cup \n Total Earning : "+this.totalMoneyEaened+
        " $ \n Total Ingrerdients Consumed : [MILK : "+this.consumeMilk
        +" ML , WATER : "+this.consumeWater+" ML , COFFEE_BEANS : "+this.consumeCoffeeBeans+"]";
    }
  

}