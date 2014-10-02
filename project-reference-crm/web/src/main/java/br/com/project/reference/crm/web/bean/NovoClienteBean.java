/**
 * Package br.com.project.reference.crm.web.bean
 */
package br.com.project.reference.crm.web.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

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

    /**
     * Atributo test
     */
    private String test;

    @EJB
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
        test = "Teste";

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

    /**
     * @return the test
     */
    public String getTest() {
        return test;
    }

    /**
     * @param test
     *            the test to set
     */
    public void setTest(final String test) {
        this.test = test;
    }

}
