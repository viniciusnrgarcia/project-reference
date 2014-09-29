/**
 *
 */
package br.com.project.reference.crm.repository.util;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

/**
 * @author Vinicius Garcia
 *
 */
public class CommonRepository<T> implements Repository<T> {

    @Inject
    private EntityManager entityManager;

    // @Inject
    // protected Logger logger;

    // private Class<T> entityClass;

    // /**
    // * Construtor Padrao
    // */
    // protected CommonRepository(final Class<T> entity) {
    // this.setEntityClass(entity);
    // }

    @Override
    public void save(final T entity) {
        // logger.info("Starting method save() of the class AbstractRepository.");
        try {
            // logger.debug("Saving the object.");
            getEntityManager().persist(entity);
            // logger.debug("Object saved with sucess!");

        } catch (final Exception e) {
            // logger.error("Error trying to save the object.", e.getCause());

        }
    }

    @Override
    public void update(final T entity) {
        // logger.info("Starting method update() of the class AbstractRepository.");
        try {
            // logger.debug("Updating the object.");
            getEntityManager().merge(entity);
            // logger.debug("Object updated with sucess!");

        } catch (final Exception e) {
            // logger.error("Error trying to update the object.", e.getCause());

        }
    }

    @Override
    public void remove(final T entity, final Long id) {
        // logger.info("Starting method remove() of the class AbstractRepository.");
        try {
            // logger.debug("Removing the object.");
            getEntityManager().remove(getEntityManager().getReference(getEntityClass(),
                    id));
            // logger.debug("Object removed with sucess!");

        } catch (final Exception e) {
            // logger.error("Error trying to remove the object.", e.getCause());

        }
    }

    @Override
    public List<T> findAll() {
        // logger.info("Starting method findAll() of the class AbstractRepository.");
        List<T> list = new ArrayList<T>();

        try {
            final CriteriaBuilder builder = getEntityManager().getCriteriaBuilder();
            final CriteriaQuery<T> criteriaQuery = builder
                    .createQuery(getEntityClass());
            // final Root<T> t = criteriaQuery.from(getEntityClass());
            // criteriaQuery.select(t).orderBy(builder.asc(t.get("id")));
            list = getEntityManager().createQuery(criteriaQuery).getResultList();

        } catch (final Exception e) {
            // logger.error("Error trying to search all objects.",
            // e.getCause());
        }

        return list;
    }

    /**
     * @return the entityClass
     */
    @SuppressWarnings("unchecked")
    private Class<T> getEntityClass() {
        Class<T> entity = null;
        try {
            final Type type = getClass().getGenericSuperclass();
            final ParameterizedType pt = (ParameterizedType) type;
            entity = (Class<T>) pt.getActualTypeArguments()[0];

        } catch (final TypeNotPresentException e) {
            // TypeNotPresentException - if any of the actual type arguments
            // refers to a non-existent type declaration
            e.printStackTrace();
        } catch (final MalformedParameterizedTypeException e) {
            // MalformedParameterizedTypeException - if any of the actual type
            // parameters refer to a parameterized
            e.printStackTrace();
        }

        return entity;
    }

    /**
     * @return the entityManager
     */
    public EntityManager getEntityManager() {
        return entityManager;
    }

    /**
     * @param entityManager the entityManager to set
     */
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

}
