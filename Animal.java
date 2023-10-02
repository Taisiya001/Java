public abstract class Animal {
    private String name;

    private String skills;

    public Animal(String name, String skills) {
        this.name = name;
        this.skills = skills;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void Command();

    public abstract void newCommand(String command);

}