public class Hufflepuff extends Hogwards {
    private final int industriousness;
    private final int loyalty;
    private final int honesty;

    public Hufflepuff(String name, int powerMagic, int transgression, int industriousness, int loyalty, int honesty) {
        super(name, powerMagic, transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return name +
                " industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                ", powerMagic=" + powerMagic +
                ", transgression=" + transgression;
    }
    public void comparisonHufflepuffStudents(Hufflepuff hufflepuff) {
        int sum1 = industriousness + loyalty + honesty;
        int sum2 = hufflepuff.getIndustriousness() + hufflepuff.getLoyalty() +hufflepuff.getHonesty() ;
        if (sum1 > sum2) {
            System.out.println(name + " лучший пуффендуец, чем " + hufflepuff.getName());
        } else if (sum1 < sum2) {
            System.out.println(hufflepuff.getName() + " лучший пуффендуец, чем " + name);
        } else {
            System.out.println(name + " и "+ hufflepuff.getName() + " одинаково хороши " );
        }
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }
}
