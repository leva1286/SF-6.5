public class OOP extends Module {

    private int numberOfSections;
    private String[] sections;

    public OOP(String name, String[] sections) {
        super(name);
        this.sections = new String[numberOfSections + 1];
        this.sections[0] = name;

        for (int i = 1; i <this.sections.length; i++) {
            this.sections[i] = sections[i - 1];
        }

    }
    public String viewing(int n) {
        return sections[n];
    }
}
