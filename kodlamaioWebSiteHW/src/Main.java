import DataAccess.concreteDao.hibernate.HibernateCategoryDao;
import DataAccess.concreteDao.hibernate.HibernateInstructorDao;
import DataAccess.concreteDao.jdbc.JDBCCourseDao;
import DataAccess.concreteDao.jdbc.JDBCInstructorDao;
import business.CategoryManager;
import business.CourseManager;
import business.ICourse;
import business.InstructorManager;
import entities.Category;
import entities.Course;
import entities.Instructor;
import logging.DatabaseLogger;
import logging.FileLogger;
import logging.Logger;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws  Exception{
        List<Logger>loggers = new ArrayList<Logger>();
        loggers.add(new DatabaseLogger());
        loggers.add(new FileLogger());

        Instructor instructor1 =new Instructor();
        instructor1.setInstructorId(01);
        instructor1.setInstructorFirstName("Beyzanur");
        instructor1.setInstructorLastName("Günaydın");

        Instructor instructor2 = new Instructor();
        instructor2.setInstructorId(02);
        instructor2.setInstructorFirstName("Engin");
        instructor2.setInstructorLastName("Demiroğ");

        InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(),loggers);
        instructorManager.add(instructor1);

        InstructorManager instructorManager2 = new InstructorManager(new JDBCInstructorDao(), loggers);
        instructorManager2.add(instructor2);

        List<Course> courses = new ArrayList<>();

        Course course = new Course();
        course.setCourseId(1);
        course.setCourseName("Java Course");
        course.setCoursePrice(50000);

        Course course2 = new Course();
        course2.setCourseId(2);
        course2.setCourseName("Machine Code Course");
        course2.setCoursePrice(40000);

        CourseManager courseManager = new CourseManager(new JDBCCourseDao(),courses,loggers);
        courseManager.add(course);

        List<Category>categories = new ArrayList<>();

        Category category = new Category();
        category.setCategoryId(1);
        category.setCategoryName("High Level Language");

        Category category2 = new Category();
        category2.setCategoryId(2);
        category2.setCategoryName("Low Level Languge");

        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(),categories);
        categoryManager.add(category);

    }
}
