//package com.akash;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
//public class DeleteData {
//    public static void main(String[] args) {
//
//        SessionFactory sf=new Configuration()
//                .addAnnotatedClass(com.akash.Student.class)
//                .configure()
//                .buildSessionFactory();
//        Session session=sf.openSession();
//
//        Transaction transaction=session.beginTransaction();
//
//        Student s1=new Student();
//        s1=session.getReference(Student.class,103);
//        session.remove(s1);
//
//        transaction.commit();
//        session.close();
//        sf.close();
//    }
//}
