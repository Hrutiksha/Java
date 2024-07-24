class Garden{

int id;
String name;
String address;
double entryPrice;

    public Garden(){
		

    }

    public Garden(int id,String name,String address,double entryPrice){
      this.id=id;
	  this.name=name;
	  this.address=address;
	  this.entryPrice=entryPrice;
	  
	 }

    public void gettingFreshAir(){
       System.out.println("Used to spend the time");
	}
	
	 public void getDetails(){
	    System.out.println(id+name+address+entryPrice);
	
	}
	
}