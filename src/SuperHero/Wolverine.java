package SuperHero;

public class Wolverine extends SuperHeroes{
        // TODO: SpiderMan'deki adımları bu sınıf için de uygulayınız...
    private String adamantiumClaws;

    public Wolverine(String name, String gender, String aggression, String wisdom, String beauty, String adamantiumClaws) {
        super(name, gender, aggression, wisdom, beauty);
        setAdamantiumClaws(adamantiumClaws);
    }

    public Wolverine(String adamantiumClaws) {
        this.adamantiumClaws = adamantiumClaws;
    }

    public String getAdamantiumClaws() {
        return adamantiumClaws;
    }

    public void setAdamantiumClaws(String adamantiumClaws) {
        this.adamantiumClaws = adamantiumClaws;
    }


    @Override
    public void attack() {
        super.attack();
        System.out.println("Ayrica"+getName()+"adamantium penceleriyle saldirabilir ve düsmanlarini hizla etkisiz hale getire bilir. ");
    }

    @Override
    public void exposeSecretPower() {
        super.exposeSecretPower();
        System.out.println(getName()+"adamantium pencelerine sahiptir ve bu penceleriyle her türlü maddeyi kesip" +
                "parcalaya bilir");
    }
    @Override public void printInfo() {
        super.printInfo();
    }
}

