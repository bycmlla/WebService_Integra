
package br.com.sascar.integracao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de rota complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="rota">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dtAlteracao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtCriacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtExclusao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idGeradora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idrota" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="logEfetivodel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="logEfetivoins" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="logEfetivoupd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loginRota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="logoIddel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="logoIdins" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="logoidupd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rotraio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rota", propOrder = {
    "dtAlteracao",
    "dtCriacao",
    "dtExclusao",
    "idCliente",
    "idGeradora",
    "idrota",
    "logEfetivodel",
    "logEfetivoins",
    "logEfetivoupd",
    "loginRota",
    "logoIddel",
    "logoIdins",
    "logoidupd",
    "nome",
    "rotraio"
})
public class Rota {

    protected String dtAlteracao;
    protected String dtCriacao;
    protected String dtExclusao;
    protected String idCliente;
    protected String idGeradora;
    protected Integer idrota;
    protected String logEfetivodel;
    protected String logEfetivoins;
    protected String logEfetivoupd;
    protected String loginRota;
    protected String logoIddel;
    protected String logoIdins;
    protected String logoidupd;
    protected String nome;
    protected String rotraio;

    /**
     * Obtém o valor da propriedade dtAlteracao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtAlteracao() {
        return dtAlteracao;
    }

    /**
     * Define o valor da propriedade dtAlteracao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtAlteracao(String value) {
        this.dtAlteracao = value;
    }

    /**
     * Obtém o valor da propriedade dtCriacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtCriacao() {
        return dtCriacao;
    }

    /**
     * Define o valor da propriedade dtCriacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtCriacao(String value) {
        this.dtCriacao = value;
    }

    /**
     * Obtém o valor da propriedade dtExclusao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtExclusao() {
        return dtExclusao;
    }

    /**
     * Define o valor da propriedade dtExclusao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtExclusao(String value) {
        this.dtExclusao = value;
    }

    /**
     * Obtém o valor da propriedade idCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCliente() {
        return idCliente;
    }

    /**
     * Define o valor da propriedade idCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCliente(String value) {
        this.idCliente = value;
    }

    /**
     * Obtém o valor da propriedade idGeradora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdGeradora() {
        return idGeradora;
    }

    /**
     * Define o valor da propriedade idGeradora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdGeradora(String value) {
        this.idGeradora = value;
    }

    /**
     * Obtém o valor da propriedade idrota.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdrota() {
        return idrota;
    }

    /**
     * Define o valor da propriedade idrota.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdrota(Integer value) {
        this.idrota = value;
    }

    /**
     * Obtém o valor da propriedade logEfetivodel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogEfetivodel() {
        return logEfetivodel;
    }

    /**
     * Define o valor da propriedade logEfetivodel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogEfetivodel(String value) {
        this.logEfetivodel = value;
    }

    /**
     * Obtém o valor da propriedade logEfetivoins.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogEfetivoins() {
        return logEfetivoins;
    }

    /**
     * Define o valor da propriedade logEfetivoins.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogEfetivoins(String value) {
        this.logEfetivoins = value;
    }

    /**
     * Obtém o valor da propriedade logEfetivoupd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogEfetivoupd() {
        return logEfetivoupd;
    }

    /**
     * Define o valor da propriedade logEfetivoupd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogEfetivoupd(String value) {
        this.logEfetivoupd = value;
    }

    /**
     * Obtém o valor da propriedade loginRota.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginRota() {
        return loginRota;
    }

    /**
     * Define o valor da propriedade loginRota.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginRota(String value) {
        this.loginRota = value;
    }

    /**
     * Obtém o valor da propriedade logoIddel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogoIddel() {
        return logoIddel;
    }

    /**
     * Define o valor da propriedade logoIddel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogoIddel(String value) {
        this.logoIddel = value;
    }

    /**
     * Obtém o valor da propriedade logoIdins.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogoIdins() {
        return logoIdins;
    }

    /**
     * Define o valor da propriedade logoIdins.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogoIdins(String value) {
        this.logoIdins = value;
    }

    /**
     * Obtém o valor da propriedade logoidupd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogoidupd() {
        return logoidupd;
    }

    /**
     * Define o valor da propriedade logoidupd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogoidupd(String value) {
        this.logoidupd = value;
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

    /**
     * Obtém o valor da propriedade rotraio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRotraio() {
        return rotraio;
    }

    /**
     * Define o valor da propriedade rotraio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRotraio(String value) {
        this.rotraio = value;
    }

}
