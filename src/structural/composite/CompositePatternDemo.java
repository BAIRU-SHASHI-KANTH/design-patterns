package structural.composite;

public class CompositePatternDemo {
    public static void main(String[] args) {

        Employee CEO = new Employee("Ajay","CEO", 60000);

        Employee technicalManager = new Employee("Ramesh","technical", 30000);
        Employee financialManager = new Employee("Suresh","financial", 20000);
        Employee humanResourcesManager = new Employee("vijay","HR", 40000);
        Employee administrationManager = new Employee("Mohan","administration", 30000);

        Employee teamLeader = new Employee("rama","team", 10000);

        CEO.add(technicalManager);
        CEO.add(financialManager);
        CEO.add(humanResourcesManager);
        CEO.add(administrationManager);

        technicalManager.add(teamLeader);

        System.out.println("-> CEO : " + CEO);
        System.out.println();

        for (Employee manager : CEO.getSubordinates()) {
            System.out.println("  -> "+manager.getDept()+" Manager : " + manager);

            for (Employee employee : manager.getSubordinates()) {
                System.out.println("     -> Team Leader: " + employee);
            }
            System.out.println();
        }
    }
}