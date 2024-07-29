
package br.com.sascar.integracao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de obterDeltaTelemetriaIntegracaoDataChegada complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="obterDeltaTelemetriaIntegracaoDataChegada">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataInicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataFinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idVeiculo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dataInicioChegada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataFinalChegada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obterDeltaTelemetriaIntegracaoDataChegada", propOrder = {
    "usuario",
    "senha",
    "dataInicio",
    "dataFinal",
    "idVeiculo",
    "dataInicioChegada",
    "dataFinalChegada"
})
public class ObterDeltaTelemetriaIntegracaoDataChegada {

    protected String usuario;
    protected String senha;
    protected String dataInicio;
    protected String dataFinal;
    protected Integer idVeiculo;
    protected String dataInicioChegada;
    protected String dataFinalChegada;

    /**
     * Obt�m o valor da propriedade usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define o valor da propriedade usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Obt�m o valor da propriedade senha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Define o valor da propriedade senha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenha(String value) {
        this.senha = value;
    }

    /**
     * Obt�m o valor da propriedade dataInicio.
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
     * Obt�m o valor da propriedade dataFinal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataFinal() {
        return dataFinal;
    }

    /**
     * Define o valor da propriedade dataFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataFinal(String value) {
        this.dataFinal = value;
    }

    /**
     * Obt�m o valor da propriedade idVeiculo.
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
     * Obt�m o valor da propriedade dataInicioChegada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataInicioChegada() {
        return dataInicioChegada;
    }

    /**
     * Define o valor da propriedade dataInicioChegada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataInicioChegada(String value) {
        this.dataInicioChegada = value;
    }

    /**
     * Obt�m o valor da propriedade dataFinalChegada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataFinalChegada() {
        return dataFinalChegada;
    }

    /**
     * Define o valor da propriedade dataFinalChegada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataFinalChegada(String value) {
        this.dataFinalChegada = value;
    }

}
