class AtmMachine{

String name;
String type;
double amount;
int id;

public AtmMachine(){

}

public AtmMachine(String name,String type,double amount,int id){
     this.name=name;
	 this.type=type;
	 this.amount=amount;
	 this.id=id;
}

 public void money(){
    System.out.println("Transfers the amount");
	}
	
public void getDetails(){
  System.out.println(name+type+amount+id);
}
}