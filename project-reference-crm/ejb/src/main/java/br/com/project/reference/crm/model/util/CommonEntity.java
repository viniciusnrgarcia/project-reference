/**
 * Package br.com.project.reference.crm.model
 */
package br.com.project.reference.crm.model.util;

import java.io.Serializable;

/**
 * Name
 * Description
 *
 * @author Vinicius Garcia
 *         27/09/2014 20:26:13
 *
 */
public abstract class CommonEntity implements Serializable {

    /**
     * Atributo serialVersionUID
     */
    private static final long serialVersionUID = 2641205113622619102L;

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public abstract int hashCode();

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public abstract boolean equals(final Object obj);
}
