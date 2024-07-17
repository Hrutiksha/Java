class Netflix{
 static String top10Movies[] = {"Hit Man","Four Brothers","	Mission","Mysteries of the Terracotta Warriors","Wonder","Home","Safe Home","Ultraman","How to Rob a Bank","Atlas"};
 static String englishMovies[] = {"The God Father","Pulp Fiction","Good Fellas","Alien","Rear Window","The Devil Wears Prada","The Wolf and the Lion","The Revenant","Four Brothers","Top Gun: Maverick","Spider-Man: Across the Spider-Verse","Zom 100: Bucket List of the Dead","A Silent Voice","Joker","Dune","Four Brothers","Cast Away","Baby Driver","The Old gaurd","Get Out","Cast Away","Money Ball","The King","2 Guns","The matrix"};
 static String hindiMovies[] = {"Bareilly ki Barfi","Pad Man","Mom","Udta Punjab","Dear Zindagi","Madras Cafe","Kabir Singh","The LunchBox","Barfi","Swades","Special 26","Queen","Drishyam","Pink","BaahuBali 1","BaahuBali 2","P K","Masaan","Sanju","Mimi","Mirzapur","Ugly","Dangal","Rukh","Black Friday"};
 static String kannadaMovies[] = {"Vikrant Rona","Kantara","Ek Love Ya","Love Mocktail","KGF 2","Petromax","Old Monk","James","Gaalipata","Avatara purusha","Guru Shisyaru","Window seat","Family pack","Blink","Ond sarala prema kathe","kerebete","Shakahari","Om","H2o","A","KGF","Shh","Uppi 2","Buddivanta","Ka"};
 static String koreanSeries[] = {"Sweet Home","D P","All of us are dead","Crash landing on you","Put your head on my shoulder","Goblin","My Demon","Hierarchy","Kingdom","Business Proposal","Boys","Our Beloved Summer","Twenty Five","Twenty One","Little Women","Mr Sunshine 3","The time i called you 2","Window","Lockup","Death Game","Extraordinary you","Hell Bound","Physical","Mr Sunshine","A time called You "};
 public static void main(String[] movies){
	 
 System.out.println("The Top 10 Movies are :");
 for(int index=0;index<=top10Movies.length-1;index++){
	 System.out.println(top10Movies[index]);
 }
  System.out.println("The English Movies are :");
 for(int index=0;index<=englishMovies.length-1;index++){
	 System.out.println(englishMovies[index]);
 }
  System.out.println("The Hindi Movies are :");
 for(int index=0;index<=hindiMovies.length-1;index++){
	 System.out.println(hindiMovies[index]);
 }
  System.out.println("The Kannada Movies are :");
 for(int index=0;index<= kannadaMovies.length-1;index++){
	 System.out.println(kannadaMovies[index]);
 }
  for(String koreanSeries :koreanSeries){
	  System.out.println(koreanSeries);
 }
 }
}