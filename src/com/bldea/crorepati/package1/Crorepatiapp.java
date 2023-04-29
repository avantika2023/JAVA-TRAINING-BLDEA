package com.bldea.crorepati.package1;
import java.util.Scanner;

public class Crorepatiapp {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.out.println("--WELCOME TO CROREPATHI--");
		System.out.println("The first Candidate to play the game is:");
		Scanner sc=new Scanner(System.in);
				
		System.out.println("Hi!,What is your name?:");
		String name=sc.nextLine();
		System.out.println("What is your age?:");
		int age=sc.nextInt();
		System.out.println("What is your city?:");
		String city=sc.next();
		System.out.println("What is your state?:");
		String state=sc.next();
		
		//object creation
		Candidate c1=new Candidate(name,age,city,state);
		
		System.out.println("-------------------------------");
		System.out.println("Congragulations!,Mrs/Ms." +c1.getName());
		
		System.out.println("The Rules Of The Game");
		System.out.println("1>There will be 10 questions which rewards a specific amount in the"+"increment order");
		System.out.println("2> The game contain 3 life lines."+"(Audiance_phone,50-50 and Swap the question)");
		System.out.println("3> you can Quit the game at any stage.");
		
		System.out.println("--------------------------------");
		System.out.println("Please enter the 1,if you wish to see the reward per quetion."+"else type 2.");
		int type_1=sc.nextInt();
		if(type_1==1) {
			System.out.println("Q-1:  1000pt\n"+
					   "Q-2:  5000pt\n"+
					   "Q-3:  10000pt\n"+
					   "Q-4:  20000pt\n"+
					   "Q-5:  40000pt\n"+
					   "Q-6:  80000pt\n"+
					   "Q-7:  160000pt\n"+
					   "Q-8:  320000pt\n"+
					   "Q-9:  640000pt\n"+
					   "Q-10: 1250000pt\n");
					
			System.out.println("Do you wish to continue??(type:YES/NO)");	
		}
		else {
			System.out.println("Do you wish to continue??(type:YES/NO)");
		}
			String type_2=sc.next();
			if(type_2.equalsIgnoreCase("yes")==true) {
				System.out.println("*lets continue the game*");
				System.out.println("here is the first question");
				System.out.println();
				boolean res1=Questions.fetchQuestion1(c1.getName());
				if(res1==true) {
					System.out.println("Congratulations!! Your Answer is Correct.\n"+"You have won "+c1.getAmount()+" points");
					System.out.println();
					System.out.println("Here is your next question");
					System.out.println();
					boolean res2=Questions.fetchQuestion2(c1.getName());
				if(res2==true) {
				System.out.println("Congratulations!! Your Answer is Correct.\n"+"You have won "+c1.getAmount()+" points");
				System.out.println();
				System.out.println("Here is your next question");
				System.out.println();
				boolean res3=Questions.fetchQuestion3(c1.getName());
				if(res3==true) {
					System.out.println("Congratulations!! Your Answer is Correct.\n"+"You have won "+c1.getAmount()+" points");
					System.out.println();
					System.out.println("Here is your next question");
					System.out.println();
				boolean res4=Questions.fetchQuestion4(c1.getName());
				if(res4==true) {
					System.out.println("Congratulations!! Your Answer is Correct.\n"+"You have won "+c1.getAmount()+" points");
					System.out.println();
					System.out.println("Here is your next question");
					System.out.println();
					boolean res5=Questions.fetchQuestion5(c1.getName());
					if(res5==true) {
						System.out.println("Congratulations!! Your Answer is Correct.\n"+"You have won "+c1.getAmount()+" points");
						System.out.println();
						System.out.println("Here is your next question");
						System.out.println();
						boolean res6=Questions.fetchQuestion6(c1.getName());
						if(res6==true) {
							System.out.println("Congratulations!! Your Answer is Correct.\n"+"You have won "+c1.getAmount()+" points");
							System.out.println();
							System.out.println("Here is your next question");
							System.out.println();
						boolean res7=Questions.fetchQuestion7(c1.getName());
						if(res7==true) {
							System.out.println("Congratulations!! Your Answer is Correct.\n"+"You have won "+c1.getAmount()+" points");
							System.out.println();
							System.out.println("Here is your next question");
							System.out.println();
						boolean res8=Questions.fetchQuestion8(c1.getName());
						if(res8==true) {
							System.out.println("Congratulations!! Your Answer is Correct.\n"+"You have won "+c1.getAmount()+" points");
							System.out.println();
							System.out.println("Here is your next question");
							System.out.println();
						boolean res9=Questions.fetchQuestion9(c1.getName());
						if(res9==true) {
							System.out.println("Congratulations!! Your Answer is Correct.\n"+"You have won "+c1.getAmount()+" points");
							System.out.println();
							System.out.println("Here is your next question");
							System.out.println();
							boolean res10=Questions.fetchQuestion10(c1.getName());
							if(res10==true) {
								System.out.println("Congratulations!! Your Answer is Correct.\n"+"You have won "+c1.getAmount()+" points");
								System.out.println();
								System.out.println("Here is your next question");
								System.out.println();
							}
							
							
		    else {
		    	System.out.println("OOPS,Your answer is wrong "+"You have won ,"+c1.getAmount()+" Points");
		    }
		    }
			else {
		    	System.out.println("OOPS,Your answer is wrong "+"You have won ,"+c1.getAmount()+" Points");
		    }
		    }
			else {
		    	System.out.println("OOPS,Your answer is wrong "+"You have won ,"+c1.getAmount()+" Points");
		    }
			}
			else {
				System.out.println("OOPS,Your answer is wrong "+"You have won ,"+c1.getAmount()+" Points");				
			}
			}
			else {
				System.out.println("OOPS,Your answer is wrong "+"You have won ,"+c1.getAmount()+" Points");
			}
			}
			else {
				System.out.println("OOPS,Your answer is wrong "+"You have won ,"+c1.getAmount()+" Points");
			}
			}
			else {
				System.out.println("OOPS,Your answer is wrong "+"You have won ,"+c1.getAmount()+" Points");
			}
			}
			else {
				System.out.println("OOPS,Your answer is wrong "+"You have won ,"+c1.getAmount()+" Points");
			}
			}
			else {
				System.out.println("OOPS,Your answer is wrong "+"You have won ,"+c1.getAmount()+" Points");
			}
		    }
			else {
				System.out.println("OOPS,Your answer is wrong "+"You have won ,"+c1.getAmount()+" Points");
			}
			}
			
	       else {
				System.out.println("THANK YOU! Mrs/Ms:"+c1.getName());
				System.out.println("-------------------------");
	       }

	}

}