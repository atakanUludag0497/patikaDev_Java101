package Boxing_Game;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Sifu",10,120,100,75);
        Fighter f2 = new Fighter("Taylong",20,85,85,50);

        Match match = new Match(f1,f2,85,110);
        match.run();
    }
}
