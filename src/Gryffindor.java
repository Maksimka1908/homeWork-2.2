public class Gryffindor extends Hogwards {
    private final int nobility;
    private final int honor;
    private final int bravery;

    public Gryffindor(String name, int powerMagic, int transgression, int nobility, int honor, int bravery) {
        super(name, powerMagic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return name +
                " nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                ", powerMagic=" + powerMagic +
                ", transgression=" + transgression;
    }

    public void comparisonGryffindorStudents(Gryffindor gryffindor) {
        int sum1 = nobility + honor + bravery;
        int sum2 = gryffindor.getBravery() + gryffindor.getHonor() + gryffindor.getNobility();
        if (sum1 > sum2) {
            System.out.println(name + " лучший Гриффиндорец, чем " + gryffindor.getName());
        } else if (sum1 < sum2) {
            System.out.println(gryffindor.getName() + " лучший Гриффиндорец, чем " + name);
        } else {
            System.out.println(name + " и "+ gryffindor.getName() + " одинаково хороши " );
        }
    }


    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }


}
