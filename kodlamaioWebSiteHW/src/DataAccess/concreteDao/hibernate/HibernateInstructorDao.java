package DataAccess.concreteDao.hibernate;

import DataAccess.abstractDao.InstructorDao;
import entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println(instructor.getInstructorFirstName()+ " " +instructor.getInstructorLastName()+ " " + " added to instructor database with Hibernate");
    }
}
