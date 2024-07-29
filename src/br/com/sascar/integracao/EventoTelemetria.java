
package br.com.sascar.integracao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de eventoTelemetria complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="eventoTelemetria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aceleracaoLateralForcaG" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="dataPosicao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direcaoForcaG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="horimetro" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idEvento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idMotorista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idVeiculo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="limiteMovLateralForcaG" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="loginMotorista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="nomeMotorista" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="odometro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tempoDuracao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="valorConfigurado" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="valorVioladoFreioAr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="velocidadeMaximaEvento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="velocidadeReferencia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eventoTelemetria", propOrder = {
    "aceleracaoLateralForcaG",
    "dataPosicao",
    "direcaoForcaG",
    "horimetro",
    "idEvento",
    "idMotorista",
    "idVeiculo",
    "latitude",
    "limiteMovLateralForcaG",
    "loginMotorista",
    "longitude",
    "nomeMotorista",
    "odometro",
    "tempoDuracao",
    "valorConfigurado",
    "valorVioladoFreioAr",
    "velocidadeMaximaEvento",
    "velocidadeReferencia"
})
@XmlSeeAlso({
    EventoTelemetriaDataChegada.class
})
public class EventoTelemetria {

    protected Double aceleracaoLateralForcaG;
    protected String dataPosicao;
    protected String direcaoForcaG;
    protected Integer horimetro;
    protected Integer idEvento;
    protected Integer idMotorista;
    protected Integer idVeiculo;
    protected Double latitude;
    protected Double limiteMovLateralForcaG;
    protected Integer loginMotorista;
    protected Double longitude;
    protected String nomeMotorista;
    protected String odometro;
    protected Integer tempoDuracao;
    protected Integer valorConfigurado;
    protected Integer valorVioladoFreioAr;
    protected Integer velocidadeMaximaEvento;
    protected Integer velocidadeReferencia;

    /**
     * Obtém o valor da propriedade aceleracaoLateralForcaG.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAceleracaoLateralForcaG() {
        return aceleracaoLateralForcaG;
    }

    /**
     * Define o valor da propriedade aceleracaoLateralForcaG.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAceleracaoLateralForcaG(Double value) {
        this.aceleracaoLateralForcaG = value;
    }

    /**
     * Obtém o valor da propriedade dataPosicao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataPosicao() {
        return dataPosicao;
    }

    /**
     * Define o valor da propriedade dataPosicao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataPosicao(String value) {
        this.dataPosicao = value;
    }

    /**
     * Obtém o valor da propriedade direcaoForcaG.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirecaoForcaG() {
        return direcaoForcaG;
    }

    /**
     * Define o valor da propriedade direcaoForcaG.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirecaoForcaG(String value) {
        this.direcaoForcaG = value;
    }

    /**
     * Obtém o valor da propriedade horimetro.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHorimetro() {
        return horimetro;
    }

    /**
     * Define o valor da propriedade horimetro.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHorimetro(Integer value) {
        this.horimetro = value;
    }

    /**
     * Obtém o valor da propriedade idEvento.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdEvento() {
        return idEvento;
    }

    /**
     * Define o valor da propriedade idEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdEvento(Integer value) {
        this.idEvento = value;
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
     * Obtém o valor da propriedade limiteMovLateralForcaG.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLimiteMovLateralForcaG() {
        return limiteMovLateralForcaG;
    }

    /**
     * Define o valor da propriedade limiteMovLateralForcaG.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLimiteMovLateralForcaG(Double value) {
        this.limiteMovLateralForcaG = value;
    }

    /**
     * Obtém o valor da propriedade loginMotorista.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLoginMotorista() {
        return loginMotorista;
    }

    /**
     * Define o valor da propriedade loginMotorista.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLoginMotorista(Integer value) {
        this.loginMotorista = value;
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
     * Obtém o valor da propriedade odometro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOdometro() {
        return odometro;
    }

    /**
     * Define o valor da propriedade odometro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOdometro(String value) {
        this.odometro = value;
    }

    /**
     * Obtém o valor da propriedade tempoDuracao.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoDuracao() {
        return tempoDuracao;
    }

    /**
     * Define o valor da propriedade tempoDuracao.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoDuracao(Integer value) {
        this.tempoDuracao = value;
    }

    /**
     * Obtém o valor da propriedade valorConfigurado.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValorConfigurado() {
        return valorConfigurado;
    }

    /**
     * Define o valor da propriedade valorConfigurado.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValorConfigurado(Integer value) {
        this.valorConfigurado = value;
    }

    /**
     * Obtém o valor da propriedade valorVioladoFreioAr.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValorVioladoFreioAr() {
        return valorVioladoFreioAr;
    }

    /**
     * Define o valor da propriedade valorVioladoFreioAr.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValorVioladoFreioAr(Integer value) {
        this.valorVioladoFreioAr = value;
    }

    /**
     * Obtém o valor da propriedade velocidadeMaximaEvento.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVelocidadeMaximaEvento() {
        return velocidadeMaximaEvento;
    }

    /**
     * Define o valor da propriedade velocidadeMaximaEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVelocidadeMaximaEvento(Integer value) {
        this.velocidadeMaximaEvento = value;
    }

    /**
     * Obtém o valor da propriedade velocidadeReferencia.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVelocidadeReferencia() {
        return velocidadeReferencia;
    }

    /**
     * Define o valor da propriedade velocidadeReferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVelocidadeReferencia(Integer value) {
        this.velocidadeReferencia = value;
    }

}
