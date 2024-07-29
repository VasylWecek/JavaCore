package chapter30.prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1, "SuperProject", "SorceCode sourceCode = new SourceCode();\n");

        System.out.println(master);

       // Project masterClonne = (Project) master.copy();

        ProjectFactory factory = new ProjectFactory(master);
        Project masterClonne = factory.clonneProject();
        System.out.println("\n=======================\n");
        System.out.println(masterClonne);
    }
}
