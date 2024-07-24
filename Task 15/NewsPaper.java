class NewsPaper{

String name;
String type;
double price;
int id;

public NewsPaper(){

}

public NewsPaper(String name,String type,double price,int id){
     this.name=name;
	 this.type=type;
	 this.price=price;
	 this.id=id;
}

 public void styling(){
    System.out.println("Looks very good");
	}
	
public void getDetails(){
  System.out.println(name+type+price+id);
}
}