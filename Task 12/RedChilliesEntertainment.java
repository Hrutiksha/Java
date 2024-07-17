class RedChilliesEntertainment{
	static String movieActors[] = {null,null, null, null, null, null, null, null, null};
	static int index;
	
	public static boolean addMovieActors(String movieActor){
	boolean isMovieActorAdded = false;
	if(movieActor != null){
		movieActors[index] = movieActor;
		index++;
		return isMovieActorAdded=true;
	}else
		System.out.println("Please add the Actors name..");
	
	return isMovieActorAdded;
	
	
	}
	public static void getMovieActors(){
		for(String movieActor : movieActors){
		System.out.println("The movie Actor name is : " +movieActor);
		}
	}



}