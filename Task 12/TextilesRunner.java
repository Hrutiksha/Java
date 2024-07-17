class TextilesRunner{

public static void main(String[] cloth){

	boolean isAdded = Textiles.addTrendsBrandNames("Fabric Fusion");
	System.out.println("Added Brand Name is :" +isAdded);

 isAdded = Textiles.addTrendsBrandNames("Yarn Express");
System.out.println("Added Brand Name is :" +isAdded);

 isAdded = Textiles.addTrendsBrandNames("Thread Mecca");
System.out.println("Added Brand Name is :" +isAdded);

 isAdded = Textiles.addTrendsBrandNames("Cloth Crafters");
System.out.println("Added Brand Name is :" +isAdded);

 isAdded = Textiles.addTrendsBrandNames("Woven Wonders");
System.out.println("Added Brand Name is :" +isAdded);

 isAdded = Textiles.addTrendsBrandNames("Fiber Factory");
System.out.println("Added Brand Name is :" +isAdded);

 isAdded = Textiles.addTrendsBrandNames("Textile Traders");
System.out.println("Added Brand Name is :" +isAdded);

 isAdded = Textiles.addTrendsBrandNames("Stitch Station");
System.out.println("Added Brand Name is :" +isAdded);

 isAdded = Textiles.addTrendsBrandNames("Knit ‘n’ Knots");
System.out.println("Added Brand Name is :" +isAdded);

 isAdded = Textiles.addTrendsBrandNames("Weave World");
System.out.println("Added Brand Name is :" +isAdded);

 isAdded = Textiles.addTrendsBrandNames("Threads & Treads");
System.out.println("Added Brand Name is :" +isAdded);

 isAdded = Textiles.addTrendsBrandNames("Tapestry Town");
System.out.println("Added Brand Name is :" +isAdded);

 isAdded = Textiles.addTrendsBrandNames("Stitching Stars");
System.out.println("Added Brand Name is :" +isAdded);

 isAdded = Textiles.addTrendsBrandNames("Material Makers");
System.out.println("Added Brand Name is :" +isAdded);

 isAdded = Textiles.addTrendsBrandNames("Fiber Frenzy");
System.out.println("Added Brand Name is :" +isAdded);


      Textiles.getAllTrendsBrandName();
	   boolean isUpdated = Textiles.updateTrendsBrandName("Fiber Frenzy","Weaving Whizzes");
		  System.out.println("The Brand name is " +isUpdated); 
			Textiles.getAllTrendsBrandName();
			
			Textiles.deleteTrendBrandNames("Yarn Express");
			Textiles.getAllTrendsBrandName();
			
}
}