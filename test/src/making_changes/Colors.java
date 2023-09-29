package making_changes;

public class Colors
{
    private String pink;
    private String yellow;

    public Colors(String pink, String yellow) {
        this.pink = pink;
        this.yellow = yellow;
    }

    public String getPink() {
        return pink;
    }

    public void setPink(String pink) {
        this.pink = pink;
    }

    public String getYellow() {
        return yellow;
    }

    public void setYellow(String yellow) {
        this.yellow = yellow;
    }

    @Override
    public String toString() {
        return "Colors{" +
                "pink='" + pink + '\'' +
                ", yellow='" + yellow + '\'' +
                '}';
    }
}
