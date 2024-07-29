
package br.com.sascar.integracao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de eventoTempoDirecaoDataChegada complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="eventoTempoDirecaoDataChegada">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.web.integracao.sascar.com.br/}eventoTempoDirecao">
 *       &lt;sequence>
 *         &lt;element name="dataChegada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eventoTempoDirecaoDataChegada", propOrder = {
    "dataChegada"
})
public class EventoTempoDirecaoDataChegada
    extends EventoTempoDirecao
{

    protected String dataChegada;

    /**
     * Obtém o valor da propriedade dataChegada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataChegada() {
        return dataChegada;
    }

    /**
     * Define o valor da propriedade dataChegada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataChegada(String value) {
        this.dataChegada = value;
    }

}
