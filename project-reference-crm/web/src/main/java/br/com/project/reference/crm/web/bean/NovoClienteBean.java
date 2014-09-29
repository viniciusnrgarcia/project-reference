/**
 * Package br.com.project.reference.crm.web.bean
 */
package br.com.project.reference.crm.web.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

import br.com.project.reference.crm.common.dto.NovoClienteDto;
import br.com.project.reference.crm.service.ClienteService;

/**
 * Name
 * Description
 *
 * @author Vinicius Garcia
 *         27/09/2014 10:43:37
 *
 */
@ManagedBean
@ViewScoped
public class NovoClienteBean implements Serializable {
    /**
     * Atributo serialVersionUID
     */
    private static final long serialVersionUID = 5712897827544514760L;

    /**
     * Atributo novoClienteDto
     */
    private NovoClienteDto novoClienteDto;

    @Inject
    private ClienteService service;

    /**
     * Construtor Padrao
     */
    public NovoClienteBean() {
    }

    /**
     * Metodo init.
     */
    @PostConstruct
    public void init() {
        novoClienteDto = new NovoClienteDto();
        novoClienteDto.setNome("Vinicius");
        if (service != null) {
            novoClienteDto.setNome("Vinicius Garcia");
        }
    }

    /**
     * @return the novoClienteDto
     */
    public NovoClienteDto getNovoClienteDto() {
        return novoClienteDto;
    }

    /**
     * @param novoClienteDto
     *            the novoClienteDto to set
     */
    public void setNovoClienteDto(final NovoClienteDto novoClienteDto) {
        this.novoClienteDto = novoClienteDto;
    }

}
