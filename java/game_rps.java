import java.util.*;

class game_rps{
    public static String user_choice,computer_choice;
    public static void main(String[] args) {
        int user,i=0;
        
        // ROCK=0;
        // PAPER=1;
        // SCISSOR=2;
        Scanner sc = new Scanner (System.in);

        //Taking choice from user

        do{
        System.out.println("Select your choice in numbers:"+"\n"+"ROCK\t0"+"\n"+"PAPER\t1"+"\n"+"SCISSOR\t2");
        user = sc.nextInt();
        if(user==0){
           game_rps.user_choice= "ROCK" ;
        System.out.println("Your choice is: "+game_rps.user_choice);
        i=0;
    }
    else if(user==1){
        game_rps.user_choice= "PAPER" ;
        System.out.println("Your choice is: "+game_rps.user_choice);
        i=0;
    }
    else if(user==2){
        game_rps.user_choice= "SCISSOR" ;
        System.out.println("Your choice is: "+game_rps.user_choice);
        i=0;
    }
    else if(user>2){
        System.out.println("Please Select Correct INPUT");
        i=1;
    } 
    }while(i!=0);
    System.out.println(game_rps.user_choice);

    //Taking choice from computer

    Random rand = new Random();
    i= rand.nextInt(3);
    if(i==0){
        game_rps.computer_choice= "ROCK" ;
     System.out.println("Computer choice is: "+game_rps.computer_choice);
     }
 else if(i==1){
     game_rps.computer_choice= "PAPER" ;
     System.out.println("Computer choice is: "+game_rps.computer_choice);
    
 }
 else if(i==2){
     game_rps.computer_choice= "SCISSOR" ;
     System.out.println("Computer choice is: "+game_rps.computer_choice);
     
 }

 // Game begin
if(game_rps.computer_choice==game_rps.user_choice){
    System.out.println("Match Draw");
}
 else if(game_rps.computer_choice=="ROCK"){
    if(game_rps.user_choice=="PAPER"){
        System.out.println("User Wins");
    }
    else{
        System.out.println("Computer Wins");
    }
}
 else if(game_rps.computer_choice=="PAPER"){
    if(game_rps.user_choice=="ROCK"){
        System.out.println("Computer Wins");
    }
    else{
        System.out.println("User Wins");
    }
 }
 else if(game_rps.user_choice=="ROCK"){
    System.out.println("User Wins");
 }
 else{
    System.out.println("Computers Wins");
 }
sc.close();
}

}
