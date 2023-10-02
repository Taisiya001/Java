public class Donkey extends Animal {

    public Donkey(String name, String skills) {
        super(name, skills);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void Command() {
        // TODO Auto-generated method stub
        System.out.println("Команды для осла" + getName() + getSkills());
        throw new UnsupportedOperationException("Unimplemented method 'Command'");
    }

    @Override
    public void newCommand(String command) {
        // TODO Auto-generated method stub
        String newSkills = getSkills() + command;
        setSkills(newSkills);
        System.out.println("Осел " + getName() + "научилась новой команде" + command);
        throw new UnsupportedOperationException("Unimplemented method 'newCommand'");
    }

}
