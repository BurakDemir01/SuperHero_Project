package SuperHero;

public class Superman extends SuperHeroes{
    // TODO: SpiderMan'deki adımları bu sınıf için de uygulayınız...
    private String flyingAbility;

    public Superman(String name, String gender, String aggression, String wisdom, String beauty, String flyingAbility) {
        super(name, gender, aggression, wisdom, beauty);
        setFlyingAbility(flyingAbility);
    }

    public Superman(String flyingAbility) {
        this.flyingAbility = flyingAbility;
    }

    public String getFlyingAbility() {
        return flyingAbility;
    }

    public void setFlyingAbility(String flyingAbility) {
        this.flyingAbility = flyingAbility;
    }



    @Override
    public void attack() {
        super.attack();
        System.out.println("Ayrica"+getName()+"ucarken supersonik flight güclü saldirilar gerceklestire bilir.");
    }

    @Override
    public void exposeSecretPower() {
        super.exposeSecretPower();
        System.out.println(getName()+"supersonik flight hizinda ucma yetenegine sahiptir.");
    }
    @Override
    public void printInfo() {
        super.printInfo();
    }
}
