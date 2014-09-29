/**
 * Package br.com.project.reference.crm.ejb.service
 */
package br.com.project.reference.crm.service.util;

import java.util.List;

/**
 * Name ServiceCommon
 * Description Interface com metodos comuns de implementacao de servicos.
 *
 * @author Vinicius Garcia
 *         27/09/2014 19:45:15
 * @param <T>
 *            Entity utilizada no serico.
 *
 */
public interface ServiceCommon<T> {

    /**
     * Metodo save.
     *
     * @param entity
     */
    public abstract void save(T entity);

    /**
     * Metodo update.
     *
     * @return
     */
    public abstract T update();

    /**
     * Metodo remove.
     *
     * @param entity
     */
    public abstract void remove(T entity);

    /**
     * Metodo findAll.
     *
     * @return
     */
    public abstract List<T> findAll();

}
