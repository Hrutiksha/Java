 class Agarbathi{

String name;
int numberOfSticks;
double price;
int id;

public Agarbathi(){

}

public Agarbathi(String name,int numberOfSticks,double price,int id){
     this.name=name;
	 this.numberOfSticks = numberOfSticks;
	 this.price=price;
	 this.id=id;
}

 public void fragrance(){
    System.out.println("Smells very good");
	}
	
public void getDetails(){
  System.out.println(name+numberOfSticks+price+id);
  }
	
}
