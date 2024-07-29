
package br.com.sascar.integracao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de macro complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="macro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="desricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idMacro" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="layout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "macro", propOrder = {
    "desricao",
    "idMacro",
    "layout"
})
public class Macro {

    protected String desricao;
    protected Integer idMacro;
    protected String layout;

    /**
     * Obtém o valor da propriedade desricao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesricao() {
        return desricao;
    }

    /**
     * Define o valor da propriedade desricao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesricao(String value) {
        this.desricao = value;
    }

    /**
     * Obtém o valor da propriedade idMacro.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdMacro() {
        return idMacro;
    }

    /**
     * Define o valor da propriedade idMacro.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdMacro(Integer value) {
        this.idMacro = value;
    }

    /**
     * Obtém o valor da propriedade layout.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayout() {
        return layout;
    }

    /**
     * Define o valor da propriedade layout.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayout(String value) {
        this.layout = value;
    }

}
