
package br.com.sascar.integracao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de pacotePosicaoRFNacional complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="pacotePosicaoRFNacional">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ccid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataPacote" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataPosicao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="idPacote" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idVeiculo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="integradoraId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="jamming" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="rf" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="rua" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pacotePosicaoRFNacional", propOrder = {
    "ccid",
    "cidade",
    "dataPacote",
    "dataPosicao",
    "idPacote",
    "idVeiculo",
    "integradoraId",
    "jamming",
    "latitude",
    "longitude",
    "rf",
    "rua",
    "uf"
})
public class PacotePosicaoRFNacional {

    protected String ccid;
    protected String cidade;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataPacote;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataPosicao;
    protected long idPacote;
    protected Integer idVeiculo;
    protected Integer integradoraId;
    protected Integer jamming;
    protected Double latitude;
    protected Double longitude;
    protected Long rf;
    protected String rua;
    protected String uf;

    /**
     * Obtém o valor da propriedade ccid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcid() {
        return ccid;
    }

    /**
     * Define o valor da propriedade ccid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcid(String value) {
        this.ccid = value;
    }

    /**
     * Obtém o valor da propriedade cidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * Define o valor da propriedade cidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidade(String value) {
        this.cidade = value;
    }

    /**
     * Obtém o valor da propriedade dataPacote.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataPacote() {
        return dataPacote;
    }

    /**
     * Define o valor da propriedade dataPacote.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataPacote(XMLGregorianCalendar value) {
        this.dataPacote = value;
    }

    /**
     * Obtém o valor da propriedade dataPosicao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataPosicao() {
        return dataPosicao;
    }

    /**
     * Define o valor da propriedade dataPosicao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataPosicao(XMLGregorianCalendar value) {
        this.dataPosicao = value;
    }

    /**
     * Obtém o valor da propriedade idPacote.
     * 
     */
    public long getIdPacote() {
        return idPacote;
    }

    /**
     * Define o valor da propriedade idPacote.
     * 
     */
    public void setIdPacote(long value) {
        this.idPacote = value;
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
     * Obtém o valor da propriedade integradoraId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIntegradoraId() {
        return integradoraId;
    }

    /**
     * Define o valor da propriedade integradoraId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIntegradoraId(Integer value) {
        this.integradoraId = value;
    }

    /**
     * Obtém o valor da propriedade jamming.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getJamming() {
        return jamming;
    }

    /**
     * Define o valor da propriedade jamming.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setJamming(Integer value) {
        this.jamming = value;
    }

    /**
     * Obtém o valor da propriedade latitude.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * Define o valor da propriedade latitude.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLatitude(Double value) {
        this.latitude = value;
    }

    /**
     * Obtém o valor da propriedade longitude.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * Define o valor da propriedade longitude.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLongitude(Double value) {
        this.longitude = value;
    }

    /**
     * Obtém o valor da propriedade rf.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRf() {
        return rf;
    }

    /**
     * Define o valor da propriedade rf.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRf(Long value) {
        this.rf = value;
    }

    /**
     * Obtém o valor da propriedade rua.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRua() {
        return rua;
    }

    /**
     * Define o valor da propriedade rua.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRua(String value) {
        this.rua = value;
    }

    /**
     * Obtém o valor da propriedade uf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUf() {
        return uf;
    }

    /**
     * Define o valor da propriedade uf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUf(String value) {
        this.uf = value;
    }

}
