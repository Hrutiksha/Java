class AmusementPark{

int id;
String name;
String address;
int noOfGames;

   public AmusementPark(){
   
   }
   
   public AmusementPark(int id,String name,String address,int noOfGames){
   this.id=id;
   this.name=name;
   this.address=address;
   this.noOfGames=noOfGames;
   }

public void play(){
    System.out.println("Used to play different kinds of games");
	}
	public void getDetails(){
	System.out.println(id+name+address+noOfGames);
	}
	
	}