
package br.com.sascar.integracao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de dadosAdicionais complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="dadosAdicionais">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataAlteracao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricaoDois" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricaoUm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="frota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="grupo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idCliente" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idVeiculo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="notaDois" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notaUm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="placa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dadosAdicionais", propOrder = {
    "dataAlteracao",
    "descricaoDois",
    "descricaoUm",
    "frota",
    "grupo",
    "idCliente",
    "idVeiculo",
    "notaDois",
    "notaUm",
    "placa"
})
public class DadosAdicionais {

    protected String dataAlteracao;
    protected String descricaoDois;
    protected String descricaoUm;
    protected String frota;
    protected String grupo;
    protected Integer idCliente;
    protected Integer idVeiculo;
    protected String notaDois;
    protected String notaUm;
    protected String placa;

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
     * Obtém o valor da propriedade descricaoDois.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoDois() {
        return descricaoDois;
    }

    /**
     * Define o valor da propriedade descricaoDois.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoDois(String value) {
        this.descricaoDois = value;
    }

    /**
     * Obtém o valor da propriedade descricaoUm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoUm() {
        return descricaoUm;
    }

    /**
     * Define o valor da propriedade descricaoUm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoUm(String value) {
        this.descricaoUm = value;
    }

    /**
     * Obtém o valor da propriedade frota.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrota() {
        return frota;
    }

    /**
     * Define o valor da propriedade frota.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrota(String value) {
        this.frota = value;
    }

    /**
     * Obtém o valor da propriedade grupo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrupo() {
        return grupo;
    }

    /**
     * Define o valor da propriedade grupo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrupo(String value) {
        this.grupo = value;
    }

    /**
     * Obtém o valor da propriedade idCliente.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdCliente() {
        return idCliente;
    }

    /**
     * Define o valor da propriedade idCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdCliente(Integer value) {
        this.idCliente = value;
    }

    /**
     * Obtém o valor da propriedade idVeiculo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdVeiculo() {
        return idVeiculo;
    }

    /**
     * Define o valor da propriedade idVeiculo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdVeiculo(Integer value) {
        this.idVeiculo = value;
    }

    /**
     * Obtém o valor da propriedade notaDois.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotaDois() {
        return notaDois;
    }

    /**
     * Define o valor da propriedade notaDois.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotaDois(String value) {
        this.notaDois = value;
    }

    /**
     * Obtém o valor da propriedade notaUm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotaUm() {
        return notaUm;
    }

    /**
     * Define o valor da propriedade notaUm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotaUm(String value) {
        this.notaUm = value;
    }

    /**
     * Obtém o valor da propriedade placa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Define o valor da propriedade placa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaca(String value) {
        this.placa = value;
    }

}
