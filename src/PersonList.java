import java.util.ArrayList;
import java.util.Comparator;

public class PersonList {

    private ArrayList<Person> list = new ArrayList<Person>();

    /**
     * Add person to the list
     * @param p
     */
    public void addPerson(Person p){
        list.add(p);
    }

    /**
     * Get person from list by index
     * @param index
     * @return
     */
    public Person getPerson(int index){
        return list.get(index);
    }

    /**
     * Finds first by name
     * @param fn
     * @return
     */
    public Person firsFoundByName(String fn){
        for(Person p:list){
            if(p.getFirstName().equals(fn)){
                return p;
            }
        }
        return null;
    }

    /**
     * Finds everyone by name
     * @param fn
     * @return
     */
    public PersonList foundByName(String fn){
        PersonList resultList = new PersonList();
        for(Person p: list){
            if(p.getFirstName().equals(fn)){
                resultList.addPerson(p);
            }
        }
        return resultList;
    }

    /**
     * Print list
     */
    public void printList(){
        for(Person p: list){
            p.print();
        }
    }

    /**
     * Sort by salary
     */
    public void sortBySalary(){
        Comparator<Person> bySalary = (p1,p2) -> Float.compare(p1.getSalary(),p2.getSalary());
        list.sort(bySalary);
    }

    /**
     * Sort by name
     */
    public void sortByName(){
        Comparator<Person>byName = (p1,p2) ->p1.getFirstName().compareTo(p2.getFirstName());
        list.sort(byName);
    }

    /**
     * Sort by salary and by name
     */
    public void sortBySalaryAndByName(){

        Comparator<Person>bySalary = (p1,p2) ->Float.compare(p1.getSalary(),p2.getSalary());
        Comparator<Person>byName = (p1,p2)->p1.getFirstName().compareTo(p2.getFirstName());
        list.sort(byName.thenComparing(bySalary));
    }
}
