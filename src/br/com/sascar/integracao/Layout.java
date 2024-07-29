
package br.com.sascar.integracao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de layout complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="layout">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dataAlteracao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataCriacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idLayout" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tipoTeclado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "layout", propOrder = {
    "codigo",
    "dataAlteracao",
    "dataCriacao",
    "descricao",
    "idLayout",
    "tipoTeclado"
})
public class Layout {

    protected Integer codigo;
    protected String dataAlteracao;
    protected String dataCriacao;
    protected String descricao;
    protected Integer idLayout;
    protected int tipoTeclado;

    /**
     * Obtém o valor da propriedade codigo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigo() {
        return codigo;
    }

    /**
     * Define o valor da propriedade codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigo(Integer value) {
        this.codigo = value;
    }

    /**
     * Obtém o valor da propriedade dataAlteracao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataAlteracao() {
        return dataAlteracao;
    }

    /**
     * Define o valor da propriedade dataAlteracao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataAlteracao(String value) {
        this.dataAlteracao = value;
    }

    /**
     * Obtém o valor da propriedade dataCriacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataCriacao() {
        return dataCriacao;
    }

    /**
     * Define o valor da propriedade dataCriacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataCriacao(String value) {
        this.dataCriacao = value;
    }

    /**
     * Obtém o valor da propriedade descricao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define o valor da propriedade descricao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

    /**
     * Obtém o valor da propriedade idLayout.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdLayout() {
        return idLayout;
    }

    /**
     * Define o valor da propriedade idLayout.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdLayout(Integer value) {
        this.idLayout = value;
    }

    /**
     * Obtém o valor da propriedade tipoTeclado.
     * 
     */
    public int getTipoTeclado() {
        return tipoTeclado;
    }

    /**
     * Define o valor da propriedade tipoTeclado.
     * 
     */
    public void setTipoTeclado(int value) {
        this.tipoTeclado = value;
    }

}
