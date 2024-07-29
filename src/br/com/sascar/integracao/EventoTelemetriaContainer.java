
package br.com.sascar.integracao;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de eventoTelemetriaContainer complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="eventoTelemetriaContainer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eventoTelemetria" type="{http://webservice.web.integracao.sascar.com.br/}eventoTelemetria" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eventoTelemetriaContainer", propOrder = {
    "eventoTelemetria"
})
public class EventoTelemetriaContainer {

    @XmlElement(nillable = true)
    protected List<EventoTelemetria> eventoTelemetria;

    /**
     * Gets the value of the eventoTelemetria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventoTelemetria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventoTelemetria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventoTelemetria }
     * 
     * 
     */
    public List<EventoTelemetria> getEventoTelemetria() {
        if (eventoTelemetria == null) {
            eventoTelemetria = new ArrayList<EventoTelemetria>();
        }
        return this.eventoTelemetria;
    }

}
