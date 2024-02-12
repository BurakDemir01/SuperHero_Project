package SuperHero;

public class Batman extends SuperHeroes{

    // TODO SpiderMan'deki adımları bu class için de uygulayınız...

    private String detectiveSkillsAbility;



    public Batman(String name, String gender, String aggression, String wisdom, String beauty, String detectiveSkillsAbility) {
        super(name, gender, aggression, wisdom, beauty);
        setDetectiveSkillsAbility(detectiveSkillsAbility);
    }

    public String getDetectiveSkillsAbility() {
        return detectiveSkillsAbility;
    }

    public void setDetectiveSkillsAbility(String detectiveSkillsAbility) {
        this.detectiveSkillsAbility = detectiveSkillsAbility;
    }

    public Batman(String name, String gender, String aggression, String wisdom, String beauty) {
        super(name, gender, aggression, wisdom, beauty);
    }



    @Override
    public void attack() {
        super.attack();
        System.out.println("Ayrica"+getName()+"dedektif becerileri ile saldira bilir ve düsmanlarini planlayarak alt edebilir.");

    }

    @Override
    public void exposeSecretPower() {
        super.exposeSecretPower();
        System.out.println(getName()+"dedektiv becerilerine sahiptir ve bu yetenegi ile suclulari yakalamada ustalasmistir.");
    }
    @Override
    public void printInfo() {
        super.printInfo();
    }
}
