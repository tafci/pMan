package hu.johnny.pman;

public class MrPoliceman {

    private Feeling feeling;

    public void setFeeling(Feeling feeling) {
        this.feeling = feeling;
    }

    public Feeling getFeeling() {
        return feeling;
    }

    public void IdCheck() {
        System.out.println("Driver license, please!");
        IdCard clientCard = takeIdCard();
        sayGoodMorning(clientCard.getName());
        doSomething();
    }

    private IdCard takeIdCard() {
        return new IdCard("007", "John Smith");
    }

    private void sayGoodMorning(String name) {
        System.out.println("Good morning, " + name + "!");
    }

    public void doSomething() {
        switch (feeling) {
            case FUNNY:
                System.out.println("I'm happy!");
                break;
            case VERYGOOD:
                System.out.println("Good.");
                break;
            case NORMAL:
                System.out.println("This is a good day.");
                break;
            case SAD:
                System.out.println("I let you go.");
                break;
            case ANGRY:
                System.out.println("Hands up! You're arrested.");
                break;
        }
    }
}
