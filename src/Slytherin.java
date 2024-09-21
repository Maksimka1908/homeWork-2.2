public class Slytherin  extends Hogwards{
    private int trick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int power;

    public Slytherin(String name, int powerMagic, int transgression, int trick, int determination, int ambition, int resourcefulness, int power) {
        super(name, powerMagic, transgression);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.power = power;
    }

    @Override
    public String toString() {
        return name +
                " trick=" + trick +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", power=" + power +
                ", powerMagic=" + powerMagic +
                ", transgression=" + transgression;
    }
    public void comparisonSlytherinStudents(Slytherin slytherinlytherin) {
        int sum1 = trick + determination + ambition + resourcefulness + power;
        int sum2 = slytherinlytherin.getTrick() + slytherinlytherin.getDetermination() + slytherinlytherin.getAmbition() + slytherinlytherin.getResourcefulness() + getPower();
        if (sum1 > sum2) {
            System.out.println(name + " лучший cлизеринец, чем " + slytherinlytherin.getName());
        } else if (sum1 < sum2) {
            System.out.println(slytherinlytherin.getName() + " лучший cлизеринец, чем " + name);
        } else {
            System.out.println(name + " и "+ slytherinlytherin.getName() + " одинаково хороши " );
        }
    }

    public int getTrick() {
        return trick;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getPower() {
        return power;
    }
}
