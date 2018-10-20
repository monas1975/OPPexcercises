package author;

public class Program {

    public static void main(String[] args){
        Author ahTeck = new Author("Tan Ah Theck", "ahtheck@nowhere.com",'m');
        System.out.println("name="+ ahTeck.getName());
        System.out.println("email="+ ahTeck.getEmail());
        System.out.println("gender="+ ahTeck.getGender());
        System.out.println(ahTeck.toString());

        Book dummyBook = new Book("Java for dummy",ahTeck,19.95,99);

        System.out.println(dummyBook.toString());
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is" + dummyBook.getName());
        System.out.println("price is" + dummyBook.getPrice());
        System.out.println("qty is" + dummyBook.getQty());
        System.out.println("Author is: "+ dummyBook.getAuthor());
        System.out.println("Author anem is  " + dummyBook.getAuthor().getName());
        System.out.println("Author's mail is  " +dummyBook.getAuthor().getEmail());

        Book anoherBook =new Book("more Java", new Author("Paul Tan","paul@somwhere.com",'m'),29.95);
        System.out.println(anoherBook.toString());
        System.out.println(anoherBook.getAuthor().getName());
        System.out.println(anoherBook.getAuthor().getEmail());

        System.out.println(anoherBook.getAuthorName());
        System.out.println(anoherBook.getAuthorEmal());


    }
}
