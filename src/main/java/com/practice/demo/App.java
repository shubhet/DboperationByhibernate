package com.practice.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	
    	//System.out.println(factory);
    	//System.out.println(factory.isClosed());
    	
//     	  Laptop lappy=new Laptop();
//     	  lappy.setLid(1);
//     	  lappy.setLname("Dell");
    	
    	
    	Student st=new Student();
         
//         st.setId(104);
//         st.setName("Vinay");
//         st.setCity("Alld");
        // st.setLaptop(lappy);
         
        // System.out.println(st);
         Configuration cfg=new Configuration();
     	cfg.configure("hibernate.cfg.xml");//.addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
     	SessionFactory factory=cfg.buildSessionFactory();
         Session session=factory.openSession();
        
         Transaction tx=session.beginTransaction();
        // session.save(lappy);
        // session.save(st);//To save data
         //st=(Student)session.get(Student.class,101);
         
//         Query q=session.createQuery("from Student");
//          List<Student> students=q.list();
//          for(Student s:students)
//          {
//        	  System.out.println(s);
//          }
         
         
         Query q=session.createQuery("from Student where id=101");
        List<Student> students=q.list();
        for(Student s:students)
        {
     	  System.out.println(s);
        }
         
         
         
         
         //Native sql query
         
//    String q="select * from student";
//    NativeQuery n=session.createSQLQuery(q);
//    List<Object[]> list=n.list();
//    for(Object[] student:list)
//    {
//    System.out.println(student[2]+"");
//    }
  
    //fetching via using get and load
//      Student s1=(Student) session.get(Student.class, 10);
//         Student s2=(Student) session.load(Student.class, 104);
//         System.out.println(s1);
        // System.out.println(s2);
         
         
         tx.commit();
         //System.out.println(st); 
         session.close();
    	
    }
}
