package jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Marshalling {
 public static void main(String[] args) throws JAXBException {
	//marshalling :coverting java obj into xml
	 
	 Employee emp=new Employee();
	 emp.setEmpno(300);
	 emp.setName("dinesh");
	 emp.setSalary(20000.0);
	 //create jaxb context object
	 JAXBContext context=JAXBContext.newInstance(Employee.class);
	 
	 
	 //create marshaller object from jaxbcontext
	 Marshaller marshaller = context.createMarshaller();
	 
	 //marshaller.marshal(emp, System.out);
	 File file=new File("emp.xml");
	 marshaller.marshal(emp, file);
	 System.out.println("Done");
 
 }
}
