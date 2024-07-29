
package br.com.sascar.integracao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de telemetria complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="telemetria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="embreagem" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="estadoLimpadorParabrisa" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="freio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="motorFuncionando" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "telemetria", propOrder = {
    "embreagem",
    "estadoLimpadorParabrisa",
    "freio",
    "motorFuncionando"
})
public class Telemetria {

    protected Integer embreagem;
    protected Integer estadoLimpadorParabrisa;
    protected Integer freio;
    protected Integer motorFuncionando;

    /**
     * Obtém o valor da propriedade embreagem.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEmbreagem() {
        return embreagem;
    }

    /**
     * Define o valor da propriedade embreagem.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEmbreagem(Integer value) {
        this.embreagem = value;
    }

    /**
     * Obtém o valor da propriedade estadoLimpadorParabrisa.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEstadoLimpadorParabrisa() {
        return estadoLimpadorParabrisa;
    }

    /**
     * Define o valor da propriedade estadoLimpadorParabrisa.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEstadoLimpadorParabrisa(Integer value) {
        this.estadoLimpadorParabrisa = value;
    }

    /**
     * Obtém o valor da propriedade freio.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFreio() {
        return freio;
    }

    /**
     * Define o valor da propriedade freio.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFreio(Integer value) {
        this.freio = value;
    }

    /**
     * Obtém o valor da propriedade motorFuncionando.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMotorFuncionando() {
        return motorFuncionando;
    }

    /**
     * Define o valor da propriedade motorFuncionando.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMotorFuncionando(Integer value) {
        this.motorFuncionando = value;
    }

}
