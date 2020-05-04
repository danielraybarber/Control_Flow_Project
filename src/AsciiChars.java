import java.util.Scanner;
public class AsciiChars 
{ 
  public static void main(String[] args) 
  {
	  AsciiChars.printNumbers();
	  AsciiChars.printUpperCase();
	  AsciiChars.printLowerCase();
	  AsciiChars.printName();
	  AsciiChars.interactivePortion();
  }
  public static void printNumbers()
  {
    // TODO: print valid numeric input
	  int i;
	  for(i = 48; i <= 57; i++) {
		  System.out.println("The ASCII value of " + (char)i + " = " + i);
	  }
  }

  public static void printLowerCase()
  {
    // TODO: print valid lowercase alphabetic input
	  int i;
	  for(i = 97; i <= 122; i++) {
		  System.out.println("The ASCII value of " + (char)i + " = " + i);
	  }
  }

  public static void printUpperCase()
  {
    // TODO: print valid uppercase alphabetic input
	  int i;
	  for(i = 65; i <= 90; i++) {
		  System.out.println("The ASCII value of " + (char)i + " = " + i);
	  }
  }
  public static void printName() {
  
  Scanner input = new Scanner(System.in);
  System.out.println("Enter your name: ");
  String name = input.next();
  System.out.println("Hello " + name);
  
  }
  
  public static void interactivePortion() {
	  
  System.out.println("Would you like to continue to the interactive portion?(yes, no)");
  Scanner yesNo = new Scanner(System.in);
  String answer = yesNo.next();
  if(answer.equals("yes")|| answer.contentEquals("Yes")|| answer.contentEquals("Y")|| answer.contentEquals("y")) {
	  System.out.println( "Lets continue.");
	  
  }else {
	 System.out.println("Please return later to complete the survey.");
	 System.exit(0);
	 
  }
  
  //Repeats interactive portion.
  for(int i = 0; i < 1; i++ ) {
	  boolean carIsRed;
	  int a = 0;
	  do {
	  System.out.println("Do you have a red car?(yes, no)");
	  Scanner input1 = new Scanner(System.in);
	  String redCar = input1.next();
	  
	  if(redCar.equals("yes")||redCar.equals("y")||redCar.equals("Yes")||redCar.equals("Yes")) {
		 carIsRed = true;
		 
		 a = 1;
	  }else if(redCar.equals("no")||redCar.equals("n")||redCar.equals("No")||redCar.equals("N")){
		  carIsRed = false;
		  
		  a = 1;
	  }else {
		  System.out.println("Yes or no wasn't detected. Please try again.");
	  }
	  
	  }while(a < 1);
	  
	  System.out.println("What is the name of your favorite pet?");
	  Scanner input2 = new Scanner(System.in);
	  String petName = input2.next();
	  
	  int f = 0;
	  int petAge = 0;
	  do {
	  System.out.println("What is the age of your favorite pet?");
	  Scanner input3 = new Scanner(System.in);
	  if(input3.hasNextInt()) {
		  f = 1;
		  petAge = input3.nextInt();
	  }else {
		  System.out.println("Incorrect input.");
	  }
	  
	  }while(f < 1);
	  
	  int g = 0;
	  int luckyNumber = 0;
	  do {
	  System.out.println("What is your lucky number?");//add do while
	  Scanner input4 = new Scanner(System.in);
	  if(input4.hasNextInt()) {
		 luckyNumber = input4.nextInt(); 
		 g = 1;
	  }else {
		  System.out.println("Incorrect input.");
	  }
	  }while(g < 1 );
	  
	  int b = 0;
	  int qbNum;
	  boolean quaterbackPicked;
	  do {
	  System.out.println("Do you have a favorite quaterback?(yes, no)");
	  Scanner input5 = new Scanner(System.in);
	  String quaterback = input5.next();
	  int e = 0;
	  qbNum = 1;
	  if(quaterback.equals("yes")||quaterback.equals("y")||quaterback.equals("Yes")||quaterback.equals("Yes")) {
			 quaterbackPicked = true;
			 System.out.println("What is their jersey number?");
			 Scanner optional1 = new Scanner(System.in);
			 
			 do {
			 if(optional1.hasNextInt()) {
				 qbNum = optional1.nextInt(); 
				 b = 1;
				 e = 1;
			 }else {
				 System.out.println("Not a number.");
			 }
			 }while(e < 0);
			 
		  }else if (quaterback.equals("No")||quaterback.equals("no")||quaterback.equals("N")||quaterback.equals("n")) {
			  quaterbackPicked = false;
			  System.out.println("Not even Drew Brees?");
			  b = 1;
		  }else {
			  System.out.println("Please enter a yes or no.");
		  }
	  }while(b < 1);
		  
	  int c = 0;
	  int carYear = 0;
	  do { 
	  System.out.println("What is the two-digit model year of your car?");
	  Scanner input6 = new Scanner(System.in);
	  
	  if(input6.hasNextInt()) {
		  carYear = input6.nextInt();
		  c = 1;
	  }else {
		  System.out.println("Not a valid year.");
	  }
	  }while(c < 1);
	  
	  
	  System.out.println("What is the name of your favorite actor or actress?");
	  Scanner input7 = new Scanner(System.in);
	  String actorName = input7.next();
	  int d = 0;
	  int pickedNumber = 0;
	  do {
	  System.out.println("Pick a number between 1 and 50");
	  Scanner input8 = new Scanner(System.in);
	  
	  
	  if(input8.hasNextInt()) {
		  pickedNumber = input8.nextInt();
		  if(pickedNumber <= 50 && pickedNumber > 0) {
			  d = 1;
		  }else { 
			  System.out.println("Number not in range.");
		  }
	  }else {
		  System.out.println("You didn't input a number between 1 and 50");
	  }
	  }while (d < 1);
	  
	  int magicBall = 1;
	  
	  if (quaterbackPicked = true) {
		  magicBall = qbNum * luckyNumber;
		  if(magicBall > 75){
		  do {
			  magicBall= magicBall - 75;
		  }while (magicBall > 75);
		  }else {
			  System.out.println("Something went wrong.");
		  }
	  }else if(quaterbackPicked = false){
		  magicBall = luckyNumber;
		  if(magicBall > 75) {
		  do {
			  magicBall= magicBall - 75;
		  }while (magicBall > 75);
		  }else {
			  System.out.println("Something went wrong.");
		  }
	  }else {
		  System.out.println("something went wrong.");
	  }
	  
	  
	  //Generate Numbers
	  char petNameLetter = petName.charAt(2);
	  int firstNum = 0;
	  if(petNameLetter > 64 && petNameLetter < 96) {
		  firstNum = petNameLetter - 64;
	  }else if(petNameLetter > 96) {
		  firstNum = petNameLetter - 96;
	  }else {
		  firstNum = 42;
	  }
	  
	  int secondNum = carYear + luckyNumber; //65
	  if(secondNum >65) {
		  do {
		  secondNum= secondNum - 65;
		  }while (secondNum > 65);
	  }else {
		  System.out.println("Something went wrong.");
	  }	
	  int thirdNum = petAge + carYear; //65
	  if(thirdNum >65) {
		  do {
		  thirdNum= thirdNum - 65;
		  }while (thirdNum > 65);
	  }else {
		  System.out.println("Something went wrong.");
	  }	
	  
	  int fourthNum = 0;
	  if (quaterbackPicked = true) {
		  fourthNum = qbNum + petAge + luckyNumber;
		  if(fourthNum >65) {
			  do {
			  fourthNum= fourthNum - 65;
			  }while (fourthNum > 65);
		  }else {
			  fourthNum = pickedNumber;
		  }
	  }else if (quaterbackPicked = false) {
		  fourthNum = pickedNumber;
	  }else {
		  System.out.println("Something went wrong.");
	  }
	  char actorLetter = actorName.charAt(0);
	  int fifthNum = actorLetter;
	  if(actorLetter > 64 && actorLetter < 96) {
		  fifthNum = actorLetter - 64;
	  }else if(actorLetter > 96) {
		  fifthNum = actorLetter - 96;
	  }else {
		  fifthNum = 42;
	  }
	  System.out.println("Now generating your lottery numbers " + firstNum + ", " + secondNum + ", " + thirdNum + ", " + fourthNum + ", " + fifthNum + ", and your magicball is: " + magicBall);
	  System.out.println("Do you want to restart?");
	  Scanner loop = new Scanner(System.in);
	  String end = loop.next();
	  if(end.equals("yes")||end.equals("Yes")||end.equals("Y")||end.equals("Y")) {
		  i = -1;
		  System.out.println("Restarting program.");
	  }else {
		  System.out.println("See ya next time.");
		  System.exit(0); 
	  }
	  
	  
	  
	  
	  
  }
  
  
  }
}
