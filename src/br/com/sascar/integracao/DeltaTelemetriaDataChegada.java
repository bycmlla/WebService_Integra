
package br.com.sascar.integracao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de deltaTelemetriaDataChegada complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="deltaTelemetriaDataChegada">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.web.integracao.sascar.com.br/}deltaTelemetria">
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
@XmlType(name = "deltaTelemetriaDataChegada", propOrder = {
    "dataChegada"
})
public class DeltaTelemetriaDataChegada
    extends DeltaTelemetria
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
