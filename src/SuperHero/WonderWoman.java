package SuperHero;

public class WonderWoman extends SuperHeroes{
    // TODO: SpiderMan'deki adımları bu sınıf için de uygulayınız...
    private String lassoOfTruthAbility;

    public WonderWoman(String name, String gender, String aggression, String wisdom, String beauty, String lassoOfTruthAbility) {
        super(name, gender, aggression, wisdom, beauty);
        setLassoOfTruthAbility(lassoOfTruthAbility);
    }

    public WonderWoman(String lassoOfTruthAbility) {
        this.lassoOfTruthAbility = lassoOfTruthAbility;
    }

    public String getLassoOfTruthAbility() {
        return lassoOfTruthAbility;
    }

    public void setLassoOfTruthAbility(String lassoOfTruthAbility) {
        this.lassoOfTruthAbility = lassoOfTruthAbility;
    }



    @Override
    public void attack() {
        super.attack();
        System.out.println("Ayrica"+getName()+" Golden Lasso-güclü Truth Lasso ile saldirabilir " +
                "ve düsmanlarini dogrulugu söylemeye zorlayabilir");
    }

    @Override
    public void exposeSecretPower() {
        super.exposeSecretPower();
        System.out.println(getName()+"dogrulugu söylemeye zorlayan Truth Lasso`ya sahiptir");
    }
    @Override
    public void printInfo() {
        super.printInfo();
    }
}
