class More{
 static String chocolates[] = {"Kit Kat","Dairy Milk","Milky Bar","Eclairs","Safari","Tempation","silk"};
 static String iceCreams[] = {"Butter scotch","Vanilla","Pista","Kesar Pista","Strawberry","Black Current"};
 static String perfumeNames[] = {"Denver","Yardley","Engage","Deo","Fogg","Eva"};
 static String soaps[] = {"Santoor","Medimix","Dove","Pears","Lux","Mysore Sandal"};
 static String fruits[] = {"Strawberry","Mango","Peach","Cherry","Banana","Chikoo"};
 static String vegetables[] = {"Chilli","Carrot","Beans","Cucumber","Beetroot","Onion"};
 static String handWashes[] = {"Dettol","Santoor","Solimo","Wander Lust","Spencer","Fiama"};
 static String spices[] = {"Cumin","Turmeric","Cloves","Black Pepper","Cardamom","Coriander"};
 static String juices[] = {"Maaza","Frooti","Thumps Up","Coco Cola","Pepsi","Mirinda"};
 static String alcohols[] = {"Black and White","Red Bull","Kingfisher","Imperial Blues","Bag Piper","Smirnoff"};
 static String utensils[] = {"Spoon","Bowl","Plate","Fork","Pan","Glass"};
 static String stationaries[] = {"Pen","Book","Pencil","Eraser","Gum","Sharpner"};
 static String sauces[] = {"Chilli Sauce","Soya Sauce","Mayo","Tandoori Sauce","Tomato Sauce","Pizza Sauce"};
 static String biscuits[] = {"Oreo","Hide and Seek","Dark Fantasy","Good Day","Parle","Maari"};
 static String milkProducts[] = {"Cheese","Paneer","Condensed Milk","Milk","Curd","Butter Milk"};
public static void main(String[] newCollection){
 System.out.println("The Available Chocolates are : +chocolate.length ");
 for(int index = 0; index<=chocolates.length-1;index++){
     System.out.println(chocolates[index]);
  }
 System.out.println("The Available Ice Creams are :");
 for(int index=0;index<=iceCreams.length-1;index++){
     System.out.println(iceCreams[index]);
  }
 System.out.println("The Available Perfume Names are :");
 for(int index=0;index<=perfumeNames.length-1;index++){
     System.out.println(perfumeNames[index]);
 }
 System.out.println("The Available Soaps are:");
 for(int index=0;index<=soaps.length-1;index++){
     System.out.println(soaps[index]);
 }
 System.out.println("The Available Fruits are :");
 for(int index=0;index<=fruits.length-1;index++){
     System.out.println(fruits[index]);
 }
 System.out.println("The Available Vegetables are :");
 for(int index=0;index<=vegetables.length-1;index++){
	 System.out.println(vegetables[index]);
 }
 System.out.println("The Available Hand Washes are :");
 for(int index=0;index<=handWashes.length-1;index++){
	 System.out.println(handWashes[index]);
 }
 System.out.println("The Available Spices are :");
 for(int index=0;index<=spices.length-1;index++){
	 System.out.println(spices[index]);
 }
 System.out.println("The Available Juices are :");
 for(int index=0;index<=juices.length-1;index++){
	 System.out.println(juices[index]);
 }
 System.out.println("The Available Alcohols are :");
 for(int index=0;index<=alcohols.length-1;index++){
	 System.out.println(alcohols[index]);
 }
 System.out.println("The Available Utensils are :");
 for(int index=0;index<=utensils.length-1;index++){
	 System.out.println(utensils[index]);
 }
  System.out.println("The Available Stationaries are :");
 for(int index=0;index<=stationaries.length-1;index++){
	 System.out.println(stationaries[index]);
 }
  System.out.println("The Available Sauces are :");
 for(int index=0;index<= sauces.length-1;index++){
	 System.out.println( sauces[index]);
 }
  System.out.println("The Available Biscuits are :");
 for(int index=0;index<=biscuits.length-1;index++){
	 System.out.println(biscuits[index]);
 }
  System.out.println("The Available milkProducts are :");
 for(int index=0;index<=milkProducts.length-1;index++){
	 System.out.println(milkProducts[index]);
 }
}
}