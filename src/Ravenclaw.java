public class Ravenclaw extends Hogwards{
    private final int mind;
    private final int wisdom;
    private final int wit;
    private final int creativity;

    public Ravenclaw(String name, int powerMagic, int transgression, int mind, int wisdom, int wit, int creativity) {
        super(name, powerMagic, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return name +
                " mind=" + mind +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                ", powerMagic=" + powerMagic +
                ", transgression=" + transgression;
    }
    public void comparisonRavenclawStudents(Ravenclaw ravenclaw) {
        int sum1 = mind + wisdom + wit + creativity;
        int sum2 = ravenclaw.getMind() + ravenclaw.getWisdom() + ravenclaw.getWit() + ravenclaw.getCreativity();
        if (sum1 > sum2) {
            System.out.println(name + " лучший когтевранец, чем " + ravenclaw.getName());
        } else if (sum1 < sum2) {
            System.out.println(ravenclaw.getName() + " лучший когтевранец, чем " + name);
        } else {
            System.out.println(name + " и "+ ravenclaw.getName() + " одинаково хороши " );
        }
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }
}
