package chapter30.iterator;

public class JavaDeveloper implements Collection{
    private String name;
    private String [] skills;

    public JavaDeveloper(String name, String[] skils) {
        this.name = name;
        this.skills = skils;
    }

    public String getName() {
        return name;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSkills(String[] skils) {
        this.skills = skils;
    }

    @Override
    public Iterator getIterator() {
        return new SkillIterator();
    }

    private class SkillIterator implements Iterator{
        int index;
        @Override
        public boolean hasNext() {
            if (index < skills.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return skills[index++];
        }
    }
}
