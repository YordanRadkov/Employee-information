public class MainClass {
    public static void main(String[] args) {

        PersonList list = new PersonList();
        list.addPerson(new Person("Ivan","Petrov",23,1700.00f));
        list.addPerson(new Person("George","Petrov",33,1100.00f));
        list.addPerson(new Person("Ivan","Toshev",18,1100.00f));
        list.addPerson(new Person("Todor","Penkov",55,1550.00f));

        System.out.println("Print original list");
        list.printList();

        System.out.println("----------");

        System.out.println("Print firs found Ivan");
        list.firsFoundByName("Ivan").print();

        System.out.println("----------");

        System.out.println("Print all found Ivan");
        list.foundByName("Ivan").printList();

        System.out.println("----------");
        System.out.println("Sorted by salary and by name");
        list.sortBySalaryAndByName();
        list.printList();

    }
}

