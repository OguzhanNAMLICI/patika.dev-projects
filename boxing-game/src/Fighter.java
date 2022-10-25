public class Fighter {
    String boxerName;
    int boxerDamage;
    int boxerHealth;
    int boxerWeight;
    double boxerDodge;


    public Fighter(String boxerName , int boxerDamage , int boxerHealth , int boxerWeight , double boxerDodge){
        this.boxerName = boxerName;
        this.boxerDamage = boxerDamage;
        this.boxerHealth = boxerHealth;
        this.boxerWeight = boxerWeight;
        this.boxerDodge = boxerDodge;
    }

    public int fighterHit(Fighter fighter){
        System.out.println(this.boxerName + " => " + fighter.boxerName + " " + this.boxerDamage + " damaged.");

        if(fighter.dodgeHit()){
            System.out.println(fighter.boxerName + " dodges punch..");
            return fighter.boxerHealth;
        }


        if(fighter.boxerHealth - this.boxerDamage <= 0){
            return 0;
        }

        return fighter.boxerHealth-this.boxerDamage;
    }



    public boolean dodgeHit(){
        double randomValue = Math.random() * 100;
        return randomValue <= this.boxerDodge;
    }


}
