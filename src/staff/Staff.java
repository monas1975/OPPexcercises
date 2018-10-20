package staff;

public class Staff extends Person {
    private String school;
    private double pay;

    public Staff(String firstName, String lastName, String address, String school, double pay){
        super(firstName,lastName, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
   /* public String toString(){
        return "Staff[Person[name= " +super.getName()+ " , address=" + super.getAddress()+
                "], school=" + this.school + " , pay= " + this.pay + "]";
    }*/
   public  String toString(){
       return String.format("%s,%s,%s,%d,%s,%.2f",
               super.getFirstName(),super.getLastName(),super.getAddress(),
       super.getId(),this.school,this.pay);
    }
}
