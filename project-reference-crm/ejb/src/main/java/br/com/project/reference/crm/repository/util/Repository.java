package br.com.project.reference.crm.repository.util;

import java.util.List;

/**
 * @author Vinicius Garcia
 *
 * @param <T>
 */
public interface Repository<T> {

    /**
     * @param entity
     */
    public void save(T entity);

    /**
     * @param entity
     */
    public void update(T entity);

    /**
     * @param entity
     * @param id
     */
    void remove(T entity, Long id);

    /**
     * @return
     */
    public List<T> findAll();

}
