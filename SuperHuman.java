/**
 * Created by eugenevendensky on 1/18/17.
 */
public class SuperHuman extends Human {

    public boolean isGood = true;
    public String heroName;
    public String heroPower;

    public SuperHuman(String heroName, String heroPower) {
        this.heroName = heroName;
        this.heroPower = heroPower;
    }

    public void getHeroName(){
        System.out.println(heroName);

    }

    public void getHeroPower() {
        System.out.println(heroPower);
    }
}



