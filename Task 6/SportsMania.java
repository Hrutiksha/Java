class SportsMania{
static String iplTeamNames[] = {"Royal Challengers Bengaluru","Chennai Super Kings","Kolkata Knight Riders","Rajastan Royals","Gujarat Titans","Delhi Capitals","Punjab Kings","Sunrisers Hyderabad"};
static String top10BatsMen[] = {"S R Tendulkar","M S Dhoni","Virat Kohli","Dravid","Raina","Jadeja","S Dhawan","N S Sidhu","K L Rahul","SS Iyer"};
static String top10Bowlers[] = {"Kumble","Ashwin","Sharma","Khan","Bedi","I Sharma","Srinath","Yadav","Bumrah","Shastri"};
static String top10IccTeamNames[] = {"India","Australia","Ireland","USA","Pakistan","Bangladesh","South Africa","New Zealand","England"};
public static void main(String cricket[]){
	System.out.println("The Ipl Team Names are: ");
	for(int index=0;index<=iplTeamNames.length-1;index++){
		System.out.println(iplTeamNames[index]);
	}
	System.out.println("The Top 10 BatsMen are: ");
	for(int index=0;index<=top10BatsMen.length-1;index++){
		System.out.println(top10BatsMen[index]);
	}
	System.out.println("The  Top 10 Bowlers are: ");
	for(int index=0;index<= top10Bowlers.length-1;index++){
		System.out.println( top10Bowlers[index]);
	}
	System.out.println("The Top 10 IccTeam Names are: ");
	for(int index=0;index<=top10IccTeamNames.length-1;index++){
		System.out.println(top10IccTeamNames[index]);
	}
}
}  