package DataAccess.concreteDao.jdbc;

import DataAccess.abstractDao.CourseDao;
import entities.Course;

public class JDBCCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println(course.getCourseName() + " added to course database with JDBC");
    }
}
