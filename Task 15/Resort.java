class Resort{

int id;
String name;
String address;
String owner;
int noOfRooms;

    public Resort(){

}

    public Resort(int id,String name,String address,String owner,int noOfRooms){
       this.id=id;
	   this.name=name;
	   this.address=address;
	   this.owner=owner;
	   this.noOfRooms=noOfRooms;
	   
	   }
	

public void enjoy(){
    System.out.println("Used to spend the time");
	}
	
public void getDetails(){
	System.out.println(id+name+address+owner+noOfRooms);
	
	}
}