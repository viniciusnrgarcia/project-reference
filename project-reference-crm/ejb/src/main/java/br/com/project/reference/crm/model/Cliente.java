/**
 * Package br.com.project.reference.crm.ejb.model
 */
package br.com.project.reference.crm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import br.com.project.reference.crm.common.dto.NovoClienteDto;
import br.com.project.reference.crm.model.util.CommonEntity;

/**
 * Name
 * Description
 *
 * @author Vinicius Garcia
 *         27/09/2014 19:52:54
 *
 */
@Entity
@Table(name = "tbcliente")
@NamedQueries({
        @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
        @NamedQuery(name = "Cliente.findByName", query = "SELECT DISTINCT c FROM Cliente c where c.nome = :nome") })
public class Cliente extends CommonEntity {
    /**
     * Atributo serialVersionUID
     */
    private static final long serialVersionUID = -8360887886574449605L;

    /**
     * Atributo id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    /**
     * Atributo nome
     */
    @Column(name = "nome", nullable = false, length = 20)
    private String nome;

    /**
     * Atributo sobrenome
     */
    @Column(name = "sobrenome", nullable = false, length = 100)
    private String sobrenome;

    /**
     * Construtor Padrao
     */
    public Cliente() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(final Long id) {
        this.id = id;
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

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result
                + ((sobrenome == null) ? 0 : sobrenome.hashCode());
        return result;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Cliente other = (Cliente) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (sobrenome == null) {
            if (other.sobrenome != null)
                return false;
        } else if (!sobrenome.equals(other.sobrenome))
            return false;
        return true;
    }

    /**
     * Metodo convertToEntity.
     *
     * @param cliente
     * @param dto
     * @return
     */
    public Cliente convertToEntity(final Cliente cliente,
            final NovoClienteDto dto) {
        cliente.setNome(dto.getNome());
        cliente.setSobrenome(dto.getSobrenome());
        return cliente;
    }

}
