package business;

import DataAccess.abstractDao.InstructorDao;
import entities.Instructor;
import logging.Logger;

import java.util.List;

public class InstructorManager implements IInstructor{
    private final InstructorDao instructorDao;
    private final List<Logger> loggers;

    public InstructorManager(InstructorDao instructorDao, List<Logger> loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }
    @Override
    public void add(Instructor instructor) {
        instructorDao.add((Instructor) instructor);

        for (Logger logger : loggers) {
            logger.log(((Instructor) instructor).getInstructorFirstName()+ " " + ((Instructor) instructor).getInstructorLastName());
        }
    }
}
