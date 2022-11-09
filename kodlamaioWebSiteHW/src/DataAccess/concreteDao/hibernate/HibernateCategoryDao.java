package DataAccess.concreteDao.hibernate;

import DataAccess.abstractDao.CategoryDao;
import entities.Category;

public class HibernateCategoryDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println(category.getCategoryName() + " added to category database with Hibernate");
    }
}
