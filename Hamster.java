public class Hamster extends Animal {

    public Hamster(String name, String skills) {
        super(name, skills);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void Command() {
        // TODO Auto-generated method stub
        System.out.println("Команды для хомяка" + getName() + getSkills());
        throw new UnsupportedOperationException("Unimplemented method 'Command'");
    }

    @Override
    public void newCommand(String command) {
        // TODO Auto-generated method stub
        String newSkills = getSkills() + command;
        setSkills(newSkills);
        System.out.println("Хомяк " + getName() + "научилась новой команде" + command);
        throw new UnsupportedOperationException("Unimplemented method 'newCommand'");
    }

}
