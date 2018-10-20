package staff;

public class Person {
    private String firstName;
    private String lastName;
    private String address;
    private int id;

    public Person(String firstName,String lastName, String address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.id++;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    @Override
   /* public String toString(){
        return "Person [name=" +this.getName()+ " , address= " +this.getAddress() +"]";
    }*/
   public String toString(){
       return String.format("%s,%s,%s,%d",
               this.firstName,this.lastName,this.address,this.id);
    }


}
