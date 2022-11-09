package business;

import DataAccess.abstractDao.CourseDao;
import entities.Course;
import logging.Logger;

import java.util.List;
import java.util.logging.Level;

public class CourseManager implements ICourse{
    private final CourseDao courseDao;
    private final List<Course> courses;
    private final List<Logger> loggers;

    public CourseManager(CourseDao courseDao, List<Course> courses, List<Logger> loggers) {
        this.courseDao = courseDao;
        this.courses = courses;
        this.loggers = loggers;
    }


    @Override
    public void add(Course course) {
        if (course.getCoursePrice() < 0) {
            System.out.println("The course fee cannot be less than 0");
            return;
        }
        for (Course c : courses) {
            if (course.getCourseName().equals(c.getCourseName())) {
                try {
                    throw new Exception("More than one course with the same name cannot be added.");
                } catch (Exception ex) {
                    java.util.logging.Logger.getLogger(CourseManager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        courseDao.add(course);
        courses.add(course);

        for (Logger logger : loggers) {
            logger.log(course.getCourseName());
        }
    }
}
