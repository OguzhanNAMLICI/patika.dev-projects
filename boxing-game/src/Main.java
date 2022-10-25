public class Main {
    public static void main(String[] args) {
        Fighter firstFighter = new Fighter("Oguzhan",10,120,100,8.0);
        Fighter secondFighter = new Fighter("Mesut",20,85,90,5.0);

        Match firstMatch = new Match(firstFighter,secondFighter,90,100);
        firstMatch.runMatch();
    }
}