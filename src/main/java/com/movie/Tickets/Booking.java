package com.movie.Tickets;
import java.util.Scanner;

public class Booking
{
	static int n;
	public static void main(String args[])
    {
    
	int i=0,j=0,k=0,tickets=100;
	String[] movie= {"bheeshma","sye","Harrypotter"};

    System.out.println("The movies available:");
	for(i=0;i<3;i++) {
		 System.out.println(movie[i]);
	}
    String[] location= {"hyd","chennai","Bangalore"};
    double[] time= {10.30,11.00,2.00};
	System.out.println("Enter the movie choice:");
    Scanner s=new Scanner(System.in);
   int  movies=s.nextInt();
    switch(movies)
    {
    case 1:
    	System.out.println(movie[0]);
    	break;
    case 2:
       System.out.println(movie[1]);
        //System.out.println(location[1]);
        	break;
    case 3:
          System.out.println(movie[2]);
            	break;
    default :
           System.out.println("Enter the valid choice");
    }
    System.out.println("the locations available are:");
    for(j=0;j<3;j++)
    {
    	 System.out.println(location[j]);	
    }
    System.out.println("enter the location choice ");
    int locations=s.nextInt();
    switch(locations)
    {
    case 1:
    	System.out.println(location[0]);
    	break;
    case 2:
       System.out.println(location[1]);
        //System.out.println(location[1]);
        	break;
    case 3:
          System.out.println(location[2]);
            	break;
    default :
           System.out.println("Enter the valid choice");
    }
    System.out.println("the movie timing are:");
    for(k=0;k<3;k++)
    {
    	  System.out.println(time[k]);	
    }
    System.out.println("Enter the timings choice");
    int  timings=s.nextInt();
   
      switch(timings)
      {
      case 1:
      	System.out.println(time[0]);
      	break;
      case 2:
         System.out.println(time[1]);
          //System.out.println(location[1]);
          	break;
      case 3:
            System.out.println(time[2]);
              	break;
      default :
             System.out.println("Enter the valid choice");
      }
     
      System.out.println("Enter the no.of tickets");
      int n=s.nextInt();
      if(tickets>=n) {
    	  
    	  System.out.println("the tickets are available"); 
      }
      else
      {
    	  System.out.println("the tickets are not available");
      }
      s.close();
    	  
    }
}
   
   
/*	

The movies available:
bheeshma
sye
Harrypotter
Enter the movie choice:
3
Harrypotter
the locations available are:
hyd
chennai
Bangalore
enter the location choice 
2
chennai
the movie timing are:
10.3
11.0
2.0
Enter the timings choice
3
2.0
Enter the no.of tickets
200
the tickets are not available*/
