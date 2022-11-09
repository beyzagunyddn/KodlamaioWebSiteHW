package business;

import DataAccess.abstractDao.CategoryDao;
import DataAccess.concreteDao.hibernate.HibernateCategoryDao;
import entities.Category;
import logging.Logger;

import java.util.List;
import java.util.logging.Level;

public class CategoryManager implements  ICategory{
    private CategoryDao categoryDao = null;
    private List<Category> categories = null;
    private List<Logger> loggers = null;

    public CategoryManager(CategoryDao categoryDao, List<Category> categories, List<Logger> loggers) {
        this.categoryDao = categoryDao;
        this.categories = categories;
        this.loggers = loggers;
    }

    public CategoryManager(HibernateCategoryDao hibernateCategoryDao, List<Category> categories) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void add(Category category) {
        for (Category c : categories) {
            if (category.getCategoryName().equals(c.getCategoryName())) {
                try {
                    throw new Exception("More than one category with the same name cannot be added.");
                } catch (Exception ex) {
                    java.util.logging.Logger.getLogger(CategoryManager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        categoryDao.add(category);
        categories.add(category);

    }
}
