class Shampoo{

String name;
String type;
double price;
int id;

public Shampoo(){

}

public Shampoo(String name,String type,double price,int id){
     this.name=name;
	 this.type = type;
	 this.price=price;
	 this.id=id;
}

 public void hairWash(){
    System.out.println("Cleans very good");
	}
	
public void getDetails(){
  System.out.println(name+type+price+id);
  }
	
	}