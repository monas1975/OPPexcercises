package staff;

public class ProgramStaff {

    public static void main(String[] args){

        PersonsSet set1 = new PersonsSet();
        Person[] temp;

        Person p1 = new Person("Tomasz", "Szymanski","Modrzewiowa 34,Rostworowo");
        System.out.println(p1.toString());;
        Person p2 = new Person("Anna", "Szymanski","Modrzewiowa 34,Rostworowo");
        System.out.println(p2.toString());;

        set1.addPersonToSet(p1);
        set1.addPersonToSet(p2);

        Student s1 = new Student("Tomek", "Szymanski","Poznan","Java",1,500.0);
        System.out.println(s1.toString());;

        Staff st1 = new Staff("Anka","Szymanska","Modrzewiowa","Liceum", 1500.50);
        System.out.println(st1.toString());;

        temp = set1.getPersons();
        System.out.println("przed petla");

        //for(int i =0; i<temp.length-1;i++){

            System.out.println(temp[0].toString());
        System.out.println(temp[1 ].toString());

     //   }

    }
}
