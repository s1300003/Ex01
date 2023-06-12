import java.util.Scanner;
import java.util.Random;
class Dice{
    static void main(String[] args){
	System.out.println("What is your name?");
	Systeem.out.print("> ");
	Scanner scan = new Scanner(System.in);
	String str = scan.nextLine();
	Random rand=new Random();
	int n= rand.nextInt(6)+1;
	int m= rand.nextInt(6)+1;
	System.out.println("Hello, "+ str + "!");
	System.out.println("Rolling dice...");
	System.out.println("Die 1: "+n);
	System.out.println("Die 2: "+m);
	System.out.println("Total value: "+(n+m));
    }
}
