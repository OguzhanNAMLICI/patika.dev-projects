public class Match {
    Fighter firstFighter;
    Fighter secondFighter;
    int minimumWeight;
    int maximumWeight;

    int tossUp;

    public Match(Fighter firstFighter , Fighter secondFighter , int minimumWeight , int maximumWeight){
        this.firstFighter = firstFighter;
        this.secondFighter = secondFighter;
        this.minimumWeight = minimumWeight;
        this.maximumWeight = maximumWeight;
    }

    public void runMatch(){
        System.out.println("THE MATCH BEGINS");
        showFighter(this.firstFighter);
        showFighter(this.secondFighter);
        System.out.println("FIGHT...");

        if(isSameWeight()){
            while(this.firstFighter.boxerHealth > 0 && this.secondFighter.boxerHealth > 0){

                System.out.println("==== ==== ====");
                tossUp = (int)(Math.random()*2)+1;
                if(tossUp == 1){
                    System.out.println(firstFighter.boxerName + " start the game."+"\n");
                    //firstFighter damaged secondFighter
                    this.secondFighter.boxerHealth = this.firstFighter.fighterHit(this.secondFighter);

                    if(isWinTheGame()){
                        break;
                    }

                    //secondFighter damaged firstFighter
                    this.firstFighter.boxerHealth = this.secondFighter.fighterHit(this.firstFighter);

                    if(isWinTheGame()){
                        break;
                    }

                    System.out.println("");
                    System.out.println(this.firstFighter.boxerName+"'s health: "+this.firstFighter.boxerHealth);
                    System.out.println(this.secondFighter.boxerName+"'s health: "+this.secondFighter.boxerHealth);
                    System.out.println("");
                }

                if(tossUp == 2){
                    System.out.println(secondFighter.boxerName + " start the game."+"\n");

                    //secondFighter damaged firstFighter
                    this.firstFighter.boxerHealth = this.secondFighter.fighterHit(this.firstFighter);

                    if(isWinTheGame()){
                        break;
                    }


                    //firstFighter damaged secondFighter
                    this.secondFighter.boxerHealth = this.firstFighter.fighterHit(this.secondFighter);

                    if(isWinTheGame()){
                        break;
                    }

                    System.out.println("");
                    System.out.println(this.firstFighter.boxerName+"'s health: "+this.firstFighter.boxerHealth);
                    System.out.println(this.secondFighter.boxerName+"'s health: "+this.secondFighter.boxerHealth);
                    System.out.println("");
                }
            }
        }
        else{
            System.out.println("Boxers are not the same weight..");
        }

    }


    public boolean isSameWeight(){
       return ((this.firstFighter.boxerWeight >= minimumWeight && this.firstFighter.boxerWeight <= maximumWeight) &&
               (this.secondFighter.boxerWeight >= minimumWeight && this.secondFighter.boxerWeight <=maximumWeight));
    }

    public boolean isWinTheGame(){
        if(this.firstFighter.boxerHealth == 0){
            System.out.println(secondFighter.boxerName + " is winner.");
            return true;
        }
        if(this.secondFighter.boxerHealth == 0){
            System.out.println(firstFighter.boxerName + " is winner.");
            return true;
        }
        return false;
    }

    public void showFighter(Fighter fighter){
        System.out.println();
        System.out.println("NAME: " + fighter.boxerName);
        System.out.println("DAMAGE: " + fighter.boxerDamage);
        System.out.println("HEALTH: " + fighter.boxerHealth);
        System.out.println("WEIGHT: " + fighter.boxerWeight );
        System.out.println("==== ==== ====");
    }




}
