
package br.com.sascar.integracao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de obterMensagemPortalResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="obterMensagemPortalResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://webservice.web.integracao.sascar.com.br/}mensagem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obterMensagemPortalResponse", propOrder = {
    "_return"
})
public class ObterMensagemPortalResponse {

    @XmlElement(name = "return")
    protected Mensagem _return;

    /**
     * Obt�m o valor da propriedade return.
     * 
     * @return
     *     possible object is
     *     {@link Mensagem }
     *     
     */
    public Mensagem getReturn() {
        return _return;
    }

    /**
     * Define o valor da propriedade return.
     * 
     * @param value
     *     allowed object is
     *     {@link Mensagem }
     *     
     */
    public void setReturn(Mensagem value) {
        this._return = value;
    }

}
