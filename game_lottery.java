package ex2;
import java.util.Scanner;
public class game_lottery {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lottery= (int)(Math.random()*900+100);

		Scanner input = new Scanner(System.in);
		System.out.print("Enter your hh pick (three digits): ");
		int guess =input.nextInt();

		//Get digits from lottery
		int lotteryDigit1=lottery/100;
		int lotteryDigit2=(lottery-lotteryDigit1*100)/10;
		int lotteryDigit3=lottery-lotteryDigit1*100-lotteryDigit2*10;

		//Get digits from guess
		int guessDigit1=guess/100;
		int guessDigit2=(guess-guessDigit1*100)/10;
		int guessDigit3=guess-guessDigit1*100-guessDigit2*10;

		System.out.println("The lottery number is "+lottery);

		//check the guess
		if(guess==lottery)
			System.out.println("Exact match:you win $10000");
		else if((guessDigit1==lotteryDigit1
				&&guessDigit2==lotteryDigit3
				&&guessDigit3==lotteryDigit2)
				||(guessDigit1==lotteryDigit2
				&&guessDigit2==lotteryDigit1
				&&guessDigit3==lotteryDigit3)
				||(guessDigit1==lotteryDigit2
				&&guessDigit2==lotteryDigit3
				&&guessDigit3==lotteryDigit1)
				||(guessDigit1==lotteryDigit3
				&&guessDigit2==lotteryDigit1
				&&guessDigit3==lotteryDigit2)
				||(guessDigit1==lotteryDigit3
				&&guessDigit2==lotteryDigit2
				&&guessDigit3==lotteryDigit1))
			System.out.println("Math all digits:you win $3000");
		else if (guessDigit1==lotteryDigit1
				||guessDigit1==lotteryDigit2
				||guessDigit1==lotteryDigit3
				||guessDigit2==lotteryDigit1
				||guessDigit2==lotteryDigit2
				||guessDigit2==lotteryDigit3
				||guessDigit3==lotteryDigit1
				||guessDigit3==lotteryDigit2
				||guessDigit3==lotteryDigit3)
			System.out.println("Match one digit:you win $1000");
		else
			System.out.println("Sorry,no match");
	}

}
