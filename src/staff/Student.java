package staff;

public class Student extends Person{
    private String program;
    private int year;
    private double fee;

    public Student(String firstName, String lastName,String address, String program,int year, double fee){
        super(firstName, lastName,address);
        this.program = program;
        this.year  = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    /*public String toString(){
        return "Student[Person[name= " + super.getName() + ",address= " +
                super.getAddress() + "], program= " + this.program + " , year= " +
                   this.year + " , fee= " + this.fee + "]";
    }*/
    @Override
    public String toString(){
        return String.format("%s,%s,%s,%d,%s,%d,%f",
                super.getFirstName(),super.getLastName(),super.getAddress(),super.getId(),
                this.program,this.year,this.fee);
    }

}
