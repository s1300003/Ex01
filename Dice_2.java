import java.util.Random;
class Dice_2{
    public static void main(String[] args){
	Random rand=new Random();
	int n= rand.nextInt(6)+1;
	int m= rand.nextInt(6)+1;
	System.out.println("Rolling dice...");
	System.out.println("Die 1: "+n);
	System.out.println("Die 2: "+m);
	System.out.println("Total value: "+(n+m));
    }
}
