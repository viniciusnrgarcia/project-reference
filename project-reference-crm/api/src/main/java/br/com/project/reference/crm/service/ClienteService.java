package br.com.project.reference.crm.service;

import javax.ejb.Remote;

import br.com.project.reference.crm.common.dto.NovoClienteDto;

/**
 * Name
 * Description
 *
 * @author Vinicius Garcia
 *         27/09/2014 19:44:14
 *
 */
@Remote
public interface ClienteService {

    /**
     * Metodo save.
     *
     * @param <code>NovoClienteDto</code> Cliente
     */
    public void save(NovoClienteDto cliente);

}
