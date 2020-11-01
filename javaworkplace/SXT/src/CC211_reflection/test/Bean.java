package CC211_reflection.test;

public class Bean {
    private String name;
    private boolean isGood;

    public Bean(String name, boolean isGood) {
        this.name = name;
        this.isGood = isGood;
    }

    @Override
    public String toString() {
        return "Bean{" +
                "name='" + name + '\'' +
                ", isGood=" + isGood +
                '}'+super.toString();
    }
}
