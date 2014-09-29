/**
 * Package br.com.project.reference.crm.common.dto
 */
package br.com.project.reference.crm.common.dto;

import java.io.Serializable;

/**
 * Name
 * Description
 *
 * @author Vinicius Garcia
 *         27/09/2014 12:03:05
 *
 */
public class NovoClienteDto implements Serializable {

    /**
     * Atributo serialVersionUID
     */
    private static final long serialVersionUID = -4490067597144172502L;

    /**
     * Atributo nome
     */
    private String nome;

    /**
     * Atributo sobrenome
     */
    private String sobrenome;

    /**
     * Atributo email
     */
    private String email;

    /**
     * Construtor Padrao
     */
    public NovoClienteDto() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome
     *            the nome to set
     */
    public void setNome(final String nome) {
        this.nome = nome;
    }

    /**
     * @return the sobrenome
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * @param sobrenome
     *            the sobrenome to set
     */
    public void setSobrenome(final String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     *            the email to set
     */
    public void setEmail(final String email) {
        this.email = email;
    }

}
