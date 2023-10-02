public class Cat extends Animal {

    public Cat(String name, String skills) {
        super(name, skills);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void Command() {
        System.out.println("Команды для кошки" + getName() + getSkills());
        throw new UnsupportedOperationException("Unimplemented method 'Command'");
    }

    @Override
    public void newCommand(String command) {
        String newSkills = getSkills() + command;
        setSkills(newSkills);
        System.out.println("Кошка " + getName() + "научилась новой команде" + command);
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'newCommand'");
    }

}
