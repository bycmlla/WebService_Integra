
package br.com.sascar.integracao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoEventoTelemetriaDescricao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="tipoEventoTelemetriaDescricao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eventoDescricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eventoTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idEvento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoEventoTelemetriaDescricao", propOrder = {
    "eventoDescricao",
    "eventoTipo",
    "idEvento"
})
public class TipoEventoTelemetriaDescricao {

    protected String eventoDescricao;
    protected String eventoTipo;
    protected Integer idEvento;

    /**
     * Obtém o valor da propriedade eventoDescricao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventoDescricao() {
        return eventoDescricao;
    }

    /**
     * Define o valor da propriedade eventoDescricao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventoDescricao(String value) {
        this.eventoDescricao = value;
    }

    /**
     * Obtém o valor da propriedade eventoTipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventoTipo() {
        return eventoTipo;
    }

    /**
     * Define o valor da propriedade eventoTipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventoTipo(String value) {
        this.eventoTipo = value;
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

}
