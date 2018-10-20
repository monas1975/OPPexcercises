package xmlExcersises;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.ArrayList;


public class ProgramXML {
   static Customers customers = new Customers();
    static {

        customers.setCustomers(new ArrayList<>());
        Customer c1 = new Customer();
        c1.setName("Tomek Szymanski");
        c1.setAge(43);
        c1.setId(1);

        Customer c2 = new Customer();
        c2.setName("Anka Szymanska");
        c2.setAge(42);
        c2.setId(2);
        customers.getCustomers().add(c1);
        customers.getCustomers().add(c2);

    }
        private static void marshalingExample()throws JAXBException{


                JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
                Marshaller jaxbMarshaler = jaxbContext.createMarshaller();

                jaxbMarshaler.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);


                jaxbMarshaler.marshal(customers,System.out);

            File file = new File("test2.xml");
            jaxbMarshaler.marshal(customers,file);
                //
                //jaxbMarshaler.marshal(c2,System.out);


        }

        public static void main(String[] args){
            try {
                marshalingExample();
            } catch (JAXBException e) {
                e.printStackTrace();
            }
        }

    }

