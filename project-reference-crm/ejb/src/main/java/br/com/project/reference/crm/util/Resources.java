package br.com.project.reference.crm.util;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * This class uses CDI to alias Java EE resources, such as the persistence
 * context, to CDI beans
 *
 * <p>
 * Example injection on a managed bean field:
 * </p>
 *
 * <pre>
 * Inject
 * private EntityManager em;
 * </pre>
 */
public class Resources {

    @Produces
    @PersistenceContext
    private EntityManager em;

    // @Produces
    // public Logger produceLog(InjectionPoint injectionPoint) {
    // return
    // LoggerFactory.getLogger(injectionPoint.getMember().getDeclaringClass().getName());
    // }

}