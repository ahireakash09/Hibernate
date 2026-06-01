//package com.akash;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
//public class StoreData {
//    public static void main(String[] args) {
//        Student s1=new Student();
//        s1.setRollNo(106);
//        s1.setsName("akash");
//        s1.setsAge(19);
//
//        SessionFactory sf=new Configuration()
//                      .addAnnotatedClass(com.akash.Student.class)
//                      .configure()
//                      .buildSessionFactory();
//        Session session=sf.openSession();
//        Transaction transaction=session.beginTransaction();
//        session.persist(s1);
//        transaction.commit();
//        session.close();
//        sf.close();
//        System.out.println(s1);
//    }
//}
