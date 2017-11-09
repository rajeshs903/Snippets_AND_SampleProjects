package com.acc.sampleProj1;
import org.omg.CORBA.portable.ApplicationException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ClassPathResource;
public class Test {

	public static void main(String[] args) {

		Resource resource=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		
		
		Student s=(Student) factory.getBean("studentbean");
		s.displayResult();

		s.setName("Raj");
		s.setRollNo(56);
		s.displayResult();
		s.displayResult();
	}

}
