
package br.com.sascar.integracao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de alertasAVDVinculados complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="alertasAVDVinculados">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acoes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idAlerta" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeAlerta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="veioid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="veiplaca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alertasAVDVinculados", propOrder = {
    "acoes",
    "idAlerta",
    "login",
    "nomeAlerta",
    "veioid",
    "veiplaca"
})
public class AlertasAVDVinculados {

    protected String acoes;
    protected Integer idAlerta;
    protected String login;
    protected String nomeAlerta;
    protected String veioid;
    protected String veiplaca;

    /**
     * Obtém o valor da propriedade acoes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcoes() {
        return acoes;
    }

    /**
     * Define o valor da propriedade acoes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcoes(String value) {
        this.acoes = value;
    }

    /**
     * Obtém o valor da propriedade idAlerta.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdAlerta() {
        return idAlerta;
    }

    /**
     * Define o valor da propriedade idAlerta.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdAlerta(Integer value) {
        this.idAlerta = value;
    }

    /**
     * Obtém o valor da propriedade login.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogin() {
        return login;
    }

    /**
     * Define o valor da propriedade login.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogin(String value) {
        this.login = value;
    }

    /**
     * Obtém o valor da propriedade nomeAlerta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeAlerta() {
        return nomeAlerta;
    }

    /**
     * Define o valor da propriedade nomeAlerta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeAlerta(String value) {
        this.nomeAlerta = value;
    }

    /**
     * Obtém o valor da propriedade veioid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVeioid() {
        return veioid;
    }

    /**
     * Define o valor da propriedade veioid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVeioid(String value) {
        this.veioid = value;
    }

    /**
     * Obtém o valor da propriedade veiplaca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVeiplaca() {
        return veiplaca;
    }

    /**
     * Define o valor da propriedade veiplaca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVeiplaca(String value) {
        this.veiplaca = value;
    }

}
