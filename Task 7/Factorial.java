class Factorial{
 public static int toGetFact(int factNumber){
 System.out.println("Fact Method Started");
     int fact =1;
     for(int num=1;num<=factNumber;num++){
         fact=num*fact;
 
    }
         System.out.println(fact);
    System.out.println("Fact Method Ended");
 
    return fact;
  }
}  
 