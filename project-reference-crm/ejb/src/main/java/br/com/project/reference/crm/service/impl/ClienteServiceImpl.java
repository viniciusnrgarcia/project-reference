package br.com.project.reference.crm.service.impl;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.project.reference.crm.common.dto.NovoClienteDto;
import br.com.project.reference.crm.model.Cliente;
import br.com.project.reference.crm.repository.ClienteRepository;
import br.com.project.reference.crm.service.ClienteService;

/**
 * Session Bean implementation class ClienteServiceImpl
 */
@Stateless
public class ClienteServiceImpl implements ClienteService {

    /**
     * Atributo repository
     */
    @Inject
    private ClienteRepository repository;

    @Override
    public void save(final NovoClienteDto dto) {

        try {
            Cliente cliente = new Cliente();
            cliente = cliente.convertToEntity(cliente, dto);
            repository.save(cliente);

        } catch (final Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }

}
