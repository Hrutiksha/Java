import java.util.Arrays;

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
	
	
	public static boolean deleteMovieActors(String MovieActorsToBeDeleted){
	 System.out.println("Delete Movie actor started");
	 boolean isMovieActorDeleted = false;
	 int newIndex, oldIndex;
	 for(newIndex=0 ,oldIndex=0 ;oldIndex<movieActors.length; oldIndex++){
        if(movieActors[oldIndex] != MovieActorsToBeDeleted)
		{
           movieActors[newIndex] = movieActors[oldIndex];
		   newIndex++;
		}
	 }
        movieActors = Arrays.copyOf(movieActors,newIndex);
        if(movieActors != null){
           isMovieActorDeleted  = true;
		}
    if(isMovieActorDeleted  == false){
        System.out.println(MovieActorsToBeDeleted + "not found");
	}
    System.out.println("Delete Movie Actor ended");
       return isMovieActorDeleted ;	
 }	   



}