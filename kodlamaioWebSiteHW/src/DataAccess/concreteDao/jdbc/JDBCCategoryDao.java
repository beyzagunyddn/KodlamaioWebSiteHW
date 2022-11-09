package DataAccess.concreteDao.jdbc;

import DataAccess.abstractDao.CategoryDao;
import entities.Category;

public class JDBCCategoryDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println(category.getCategoryName() + " added to category database with JDBC");
    }
}
