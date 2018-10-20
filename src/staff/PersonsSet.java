package staff;

public class PersonsSet {
    private Person[] persons;
    private static final int MAX_PERSONS =100;
    private int personCounter = 0;

    public PersonsSet(){
        this.persons = new Person[MAX_PERSONS];
    }

    public Person[] getPersons() {
        return persons;
    }

    public  boolean addPersonToSet(Person newPerson){
        if(this.personCounter < MAX_PERSONS){
            this.persons[this.personCounter]=newPerson;
            personCounter++;
            return true;
        }
        else return false;

    }
}
