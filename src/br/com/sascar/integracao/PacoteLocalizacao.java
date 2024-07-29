
package br.com.sascar.integracao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de pacoteLocalizacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="pacoteLocalizacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataPacote" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="direcao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="gps" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idVeiculo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ignicao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="velocidade" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pacoteLocalizacao", propOrder = {
    "dataPacote",
    "direcao",
    "gps",
    "idVeiculo",
    "ignicao",
    "latitude",
    "longitude",
    "velocidade"
})
public class PacoteLocalizacao {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataPacote;
    protected Integer direcao;
    protected Integer gps;
    protected Integer idVeiculo;
    protected Integer ignicao;
    protected Double latitude;
    protected Double longitude;
    protected Integer velocidade;

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
     * Obtém o valor da propriedade direcao.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDirecao() {
        return direcao;
    }

    /**
     * Define o valor da propriedade direcao.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDirecao(Integer value) {
        this.direcao = value;
    }

    /**
     * Obtém o valor da propriedade gps.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGps() {
        return gps;
    }

    /**
     * Define o valor da propriedade gps.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGps(Integer value) {
        this.gps = value;
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
     * Obtém o valor da propriedade ignicao.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIgnicao() {
        return ignicao;
    }

    /**
     * Define o valor da propriedade ignicao.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIgnicao(Integer value) {
        this.ignicao = value;
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
     * Obtém o valor da propriedade velocidade.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVelocidade() {
        return velocidade;
    }

    /**
     * Define o valor da propriedade velocidade.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVelocidade(Integer value) {
        this.velocidade = value;
    }

}
