
package br.com.sascar.integracao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de layoutGrupoAreaAvd complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="layoutGrupoAreaAvd">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clienteId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dataAlteracao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataCriacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataExclusao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="gerenciadoraId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="logEfetivoDelelete" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="logEfetivoInsert" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="logEfetivoUpdate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="logIdDelelete" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="logIdInsert" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="logIdUpdate" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "layoutGrupoAreaAvd", propOrder = {
    "clienteId",
    "dataAlteracao",
    "dataCriacao",
    "dataExclusao",
    "gerenciadoraId",
    "id",
    "logEfetivoDelelete",
    "logEfetivoInsert",
    "logEfetivoUpdate",
    "logIdDelelete",
    "logIdInsert",
    "logIdUpdate",
    "nome"
})
public class LayoutGrupoAreaAvd {

    protected Integer clienteId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataAlteracao;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataCriacao;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataExclusao;
    protected Integer gerenciadoraId;
    protected Integer id;
    protected Integer logEfetivoDelelete;
    protected Integer logEfetivoInsert;
    protected Integer logEfetivoUpdate;
    protected Integer logIdDelelete;
    protected Integer logIdInsert;
    protected Integer logIdUpdate;
    protected String nome;

    /**
     * Obtém o valor da propriedade clienteId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClienteId() {
        return clienteId;
    }

    /**
     * Define o valor da propriedade clienteId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClienteId(Integer value) {
        this.clienteId = value;
    }

    /**
     * Obtém o valor da propriedade dataAlteracao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataAlteracao() {
        return dataAlteracao;
    }

    /**
     * Define o valor da propriedade dataAlteracao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAlteracao(XMLGregorianCalendar value) {
        this.dataAlteracao = value;
    }

    /**
     * Obtém o valor da propriedade dataCriacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataCriacao() {
        return dataCriacao;
    }

    /**
     * Define o valor da propriedade dataCriacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataCriacao(XMLGregorianCalendar value) {
        this.dataCriacao = value;
    }

    /**
     * Obtém o valor da propriedade dataExclusao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataExclusao() {
        return dataExclusao;
    }

    /**
     * Define o valor da propriedade dataExclusao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataExclusao(XMLGregorianCalendar value) {
        this.dataExclusao = value;
    }

    /**
     * Obtém o valor da propriedade gerenciadoraId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGerenciadoraId() {
        return gerenciadoraId;
    }

    /**
     * Define o valor da propriedade gerenciadoraId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGerenciadoraId(Integer value) {
        this.gerenciadoraId = value;
    }

    /**
     * Obtém o valor da propriedade id.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade logEfetivoDelelete.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLogEfetivoDelelete() {
        return logEfetivoDelelete;
    }

    /**
     * Define o valor da propriedade logEfetivoDelelete.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLogEfetivoDelelete(Integer value) {
        this.logEfetivoDelelete = value;
    }

    /**
     * Obtém o valor da propriedade logEfetivoInsert.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLogEfetivoInsert() {
        return logEfetivoInsert;
    }

    /**
     * Define o valor da propriedade logEfetivoInsert.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLogEfetivoInsert(Integer value) {
        this.logEfetivoInsert = value;
    }

    /**
     * Obtém o valor da propriedade logEfetivoUpdate.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLogEfetivoUpdate() {
        return logEfetivoUpdate;
    }

    /**
     * Define o valor da propriedade logEfetivoUpdate.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLogEfetivoUpdate(Integer value) {
        this.logEfetivoUpdate = value;
    }

    /**
     * Obtém o valor da propriedade logIdDelelete.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLogIdDelelete() {
        return logIdDelelete;
    }

    /**
     * Define o valor da propriedade logIdDelelete.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLogIdDelelete(Integer value) {
        this.logIdDelelete = value;
    }

    /**
     * Obtém o valor da propriedade logIdInsert.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLogIdInsert() {
        return logIdInsert;
    }

    /**
     * Define o valor da propriedade logIdInsert.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLogIdInsert(Integer value) {
        this.logIdInsert = value;
    }

    /**
     * Obtém o valor da propriedade logIdUpdate.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLogIdUpdate() {
        return logIdUpdate;
    }

    /**
     * Define o valor da propriedade logIdUpdate.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLogIdUpdate(Integer value) {
        this.logIdUpdate = value;
    }

    /**
     * Obtém o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

}
