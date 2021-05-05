import java.util.Scanner;

class GuessGame{

	public static void main(String[] args){
			
			
		
		int number = 50;
		int count = 1;

	
			
		
Scanner input = new Scanner(System.in);
		

	//System.out.print("enter a number");
	//wrongNumber= input.nextInt();
	
	
while (count <=3){


 
	System.out.println("Enter a number.......\t");
	int userInput = input.nextInt();
	
	

	if (userInput >number){
		System.out.printf("try again!! number too farther\n", count);

		}
		
	else if (userInput <number){
	
	System.out.print("try again!!! number too lower\n");
	}
	
	else if (userInput == number){ 
	System.out.println("hurray you won!!!");

		}
count++;
	
	
	
	}
		
	
	
	
	}
	
}