package ua.goit.jdbc.dao;

import ua.goit.jdbc.dao.model.Location;

public interface DataAccessObject<T> {
    T findById(Integer id);
    T create(T entity);
}
