package DataAccess.concreteDao.hibernate;

import DataAccess.abstractDao.CourseDao;
import entities.Course;

public class HibernateCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println(course.getCourseName() + " added to course database with Hibernate");
    }
}
