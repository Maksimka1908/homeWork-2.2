public class Hogwards {
    protected String name;
    protected int powerMagic;
    protected int transgression;

    public Hogwards(String name, int powerMagic, int transgression) {
        this.powerMagic = powerMagic;
        this.transgression = transgression;
        this.name = name;
    }

    public void comparingMagic(Hogwards hogwards) {
        int sum1 = powerMagic + transgression;
        int sum2 = hogwards.getPowerMagic() + hogwards.getTransgression();
        if (sum1 < sum2) {
            System.out.println(name + " обладает большей мощностью магии, чем " + hogwards.getName());
        } else if (sum1 > sum2) {
            System.out.println(hogwards.getName() + " обладает большей мощностью магии, чем " + name);
        } else {
            System.out.println(name +" и "+ hogwards.getName() +" равны");
        }
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public int getTransgression() {
        return transgression;
    }

    public String getName() {
        return name;
    }
}
