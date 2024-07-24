class Sim{

String name;
int plan;
double price;
int id;

public Sim(){

}

public Sim(String name,int plan  ,double price,int id){
     this.name=name;
	 this.plan = plan;
	 this.price=price;
	 this.id=id;
}

 public void interaction(){
    System.out.println("provides very good Network");
	}
	
public void getDetails(){
  System.out.println(name+plan+price+id);
  }
	
	}