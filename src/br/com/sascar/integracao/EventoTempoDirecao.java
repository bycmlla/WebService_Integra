
package br.com.sascar.integracao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de eventoTempoDirecao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="eventoTempoDirecao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataInicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricaoEventoTempoDirecao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricaoEventoTempoDirecaoAnterior" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eventoTempoDirecao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="eventoTempoDirecaoAnterior" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idCliente" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idMotorista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idMotoristaReserva" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idVeiculo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="nomeCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeMotorista" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeMotoristaReserva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="odometro" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="placa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "eventoTempoDirecao", propOrder = {
    "cidade",
    "dataInicio",
    "descricaoEventoTempoDirecao",
    "descricaoEventoTempoDirecaoAnterior",
    "eventoTempoDirecao",
    "eventoTempoDirecaoAnterior",
    "idCliente",
    "idMotorista",
    "idMotoristaReserva",
    "idVeiculo",
    "latitude",
    "longitude",
    "nomeCliente",
    "nomeMotorista",
    "nomeMotoristaReserva",
    "odometro",
    "placa",
    "rua",
    "uf"
})
@XmlSeeAlso({
    EventoTempoDirecaoDataChegada.class
})
public class EventoTempoDirecao {

    protected String cidade;
    protected String dataInicio;
    protected String descricaoEventoTempoDirecao;
    protected String descricaoEventoTempoDirecaoAnterior;
    protected Integer eventoTempoDirecao;
    protected Integer eventoTempoDirecaoAnterior;
    protected Integer idCliente;
    protected Integer idMotorista;
    protected Integer idMotoristaReserva;
    protected Integer idVeiculo;
    protected Double latitude;
    protected Double longitude;
    protected String nomeCliente;
    protected String nomeMotorista;
    protected String nomeMotoristaReserva;
    protected Integer odometro;
    protected String placa;
    protected String rua;
    protected String uf;

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
     * Obtém o valor da propriedade dataInicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataInicio() {
        return dataInicio;
    }

    /**
     * Define o valor da propriedade dataInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataInicio(String value) {
        this.dataInicio = value;
    }

    /**
     * Obtém o valor da propriedade descricaoEventoTempoDirecao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoEventoTempoDirecao() {
        return descricaoEventoTempoDirecao;
    }

    /**
     * Define o valor da propriedade descricaoEventoTempoDirecao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoEventoTempoDirecao(String value) {
        this.descricaoEventoTempoDirecao = value;
    }

    /**
     * Obtém o valor da propriedade descricaoEventoTempoDirecaoAnterior.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoEventoTempoDirecaoAnterior() {
        return descricaoEventoTempoDirecaoAnterior;
    }

    /**
     * Define o valor da propriedade descricaoEventoTempoDirecaoAnterior.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoEventoTempoDirecaoAnterior(String value) {
        this.descricaoEventoTempoDirecaoAnterior = value;
    }

    /**
     * Obtém o valor da propriedade eventoTempoDirecao.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEventoTempoDirecao() {
        return eventoTempoDirecao;
    }

    /**
     * Define o valor da propriedade eventoTempoDirecao.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEventoTempoDirecao(Integer value) {
        this.eventoTempoDirecao = value;
    }

    /**
     * Obtém o valor da propriedade eventoTempoDirecaoAnterior.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEventoTempoDirecaoAnterior() {
        return eventoTempoDirecaoAnterior;
    }

    /**
     * Define o valor da propriedade eventoTempoDirecaoAnterior.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEventoTempoDirecaoAnterior(Integer value) {
        this.eventoTempoDirecaoAnterior = value;
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
     * Obtém o valor da propriedade idMotorista.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdMotorista() {
        return idMotorista;
    }

    /**
     * Define o valor da propriedade idMotorista.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdMotorista(Integer value) {
        this.idMotorista = value;
    }

    /**
     * Obtém o valor da propriedade idMotoristaReserva.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdMotoristaReserva() {
        return idMotoristaReserva;
    }

    /**
     * Define o valor da propriedade idMotoristaReserva.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdMotoristaReserva(Integer value) {
        this.idMotoristaReserva = value;
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
     * Obtém o valor da propriedade nomeCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * Define o valor da propriedade nomeCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeCliente(String value) {
        this.nomeCliente = value;
    }

    /**
     * Obtém o valor da propriedade nomeMotorista.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeMotorista() {
        return nomeMotorista;
    }

    /**
     * Define o valor da propriedade nomeMotorista.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeMotorista(String value) {
        this.nomeMotorista = value;
    }

    /**
     * Obtém o valor da propriedade nomeMotoristaReserva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeMotoristaReserva() {
        return nomeMotoristaReserva;
    }

    /**
     * Define o valor da propriedade nomeMotoristaReserva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeMotoristaReserva(String value) {
        this.nomeMotoristaReserva = value;
    }

    /**
     * Obtém o valor da propriedade odometro.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOdometro() {
        return odometro;
    }

    /**
     * Define o valor da propriedade odometro.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOdometro(Integer value) {
        this.odometro = value;
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
