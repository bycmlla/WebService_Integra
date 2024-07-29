
package br.com.sascar.integracao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de layoutAcaoEmbarcadaAVD complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="layoutAcaoEmbarcadaAVD">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idLayoutAcaoEmbarcadaAVD" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "layoutAcaoEmbarcadaAVD", propOrder = {
    "idLayoutAcaoEmbarcadaAVD",
    "nome"
})
public class LayoutAcaoEmbarcadaAVD {

    protected Integer idLayoutAcaoEmbarcadaAVD;
    protected String nome;

    /**
     * Obtém o valor da propriedade idLayoutAcaoEmbarcadaAVD.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdLayoutAcaoEmbarcadaAVD() {
        return idLayoutAcaoEmbarcadaAVD;
    }

    /**
     * Define o valor da propriedade idLayoutAcaoEmbarcadaAVD.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdLayoutAcaoEmbarcadaAVD(Integer value) {
        this.idLayoutAcaoEmbarcadaAVD = value;
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

}
