class Library{
	
	static String naMe;
	static String surNm;
	static String bookId;
	static String dueDate;
	static String bookName;
	static String authoR;
	static int bookCost;
	
	
	//method declaration
	public static boolean createPassword(String name,String surname,String bookid,
	String duedate ,String bookname,String author,int bookcost ){
		boolean isLibraryDataCreated = false;
	
			naMe = name;
			surNm = surname;
	        bookId = bookid;
			dueDate = duedate;
			bookName = bookname;
			authoR=author;
			bookCost=bookcost;
			   
						
					
	return isLibraryDataCreated;
	}
			
		    public static void getLibraryDetails(){	
				
				
				System.out.println("the name is:"+naMe);
				System.out.println("the surname is :"+surNm);
				System.out.println("the bookid is :"+bookId);
				System.out.println("the due date is:"+dueDate);
				System.out.println("the book name is:"+bookName);
				System.out.println("the author is:"+authoR);
				System.out.println("the book cost is:"+bookCost);
				

			}

}