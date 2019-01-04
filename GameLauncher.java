public class GameLauncher{
    public static void main(String[] args){
        GuessGame newGame = new GuessGame();
        newGame.start();
    }
}

class GuessGame{
    public static void start(){
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        boolean p1won = false;
        boolean p2won = false;
        boolean p3won = false;

        int numToGuess = (int) (Math.random() * 10);

        while(true){
            System.out.println("The number to guess is " + numToGuess);

            p1.guess();
            p2.guess();
            p3.guess();

            int p1guess = p1.number;
            int p2guess = p2.number;
            int p3guess = p3.number;

            if(p1guess == numToGuess){
                p1won = true;
                System.out.println("Player 1 won");
            }
            
            if (p2guess == numToGuess) {
                p2won = true;
                System.out.println("Player 2 won");
            }
            
            if(p3guess == numToGuess){
                p3won = true;
                System.out.println("Player 3 won");
            }
            
            if(p1won == true|| p2won == true || p3won == true){
                System.out.println("Game over!");
                break;
            }

            else{
                System.out.println("Let's try again");
            }
        }
    }

}

class Player{
    String name;
    int number;

    public void guess(){
        number = (int) (Math.random() * 10);
        System.out.println( Name + ": I guess " + number);
    }
}