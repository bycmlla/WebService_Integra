
package br.com.sascar.integracao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de caixaPreta complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="caixaPreta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataEvento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="velocidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rpm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ignicao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="freio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="limpador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricaoEvento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "caixaPreta", propOrder = {
    "dataEvento",
    "latitude",
    "longitude",
    "operador",
    "velocidade",
    "rpm",
    "ignicao",
    "freio",
    "limpador",
    "descricaoEvento"
})
public class CaixaPreta {

    protected String dataEvento;
    protected String latitude;
    protected String longitude;
    protected String operador;
    protected String velocidade;
    protected String rpm;
    protected String ignicao;
    protected String freio;
    protected String limpador;
    protected String descricaoEvento;

    /**
     * Obtém o valor da propriedade dataEvento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataEvento() {
        return dataEvento;
    }

    /**
     * Define o valor da propriedade dataEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataEvento(String value) {
        this.dataEvento = value;
    }

    /**
     * Obtém o valor da propriedade latitude.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * Define o valor da propriedade latitude.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitude(String value) {
        this.latitude = value;
    }

    /**
     * Obtém o valor da propriedade longitude.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * Define o valor da propriedade longitude.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitude(String value) {
        this.longitude = value;
    }

    /**
     * Obtém o valor da propriedade operador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperador() {
        return operador;
    }

    /**
     * Define o valor da propriedade operador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperador(String value) {
        this.operador = value;
    }

    /**
     * Obtém o valor da propriedade velocidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVelocidade() {
        return velocidade;
    }

    /**
     * Define o valor da propriedade velocidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVelocidade(String value) {
        this.velocidade = value;
    }

    /**
     * Obtém o valor da propriedade rpm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRpm() {
        return rpm;
    }

    /**
     * Define o valor da propriedade rpm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRpm(String value) {
        this.rpm = value;
    }

    /**
     * Obtém o valor da propriedade ignicao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIgnicao() {
        return ignicao;
    }

    /**
     * Define o valor da propriedade ignicao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIgnicao(String value) {
        this.ignicao = value;
    }

    /**
     * Obtém o valor da propriedade freio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreio() {
        return freio;
    }

    /**
     * Define o valor da propriedade freio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreio(String value) {
        this.freio = value;
    }

    /**
     * Obtém o valor da propriedade limpador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimpador() {
        return limpador;
    }

    /**
     * Define o valor da propriedade limpador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimpador(String value) {
        this.limpador = value;
    }

    /**
     * Obtém o valor da propriedade descricaoEvento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoEvento() {
        return descricaoEvento;
    }

    /**
     * Define o valor da propriedade descricaoEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoEvento(String value) {
        this.descricaoEvento = value;
    }

}
