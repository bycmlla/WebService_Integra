
package br.com.sascar.integracao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de pacotePendente complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="pacotePendente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dtUltimaRequisicao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="qtdPacotesPendentes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pacotePendente", propOrder = {
    "dtUltimaRequisicao",
    "qtdPacotesPendentes"
})
public class PacotePendente {

    protected String dtUltimaRequisicao;
    protected Integer qtdPacotesPendentes;

    /**
     * Obtém o valor da propriedade dtUltimaRequisicao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtUltimaRequisicao() {
        return dtUltimaRequisicao;
    }

    /**
     * Define o valor da propriedade dtUltimaRequisicao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtUltimaRequisicao(String value) {
        this.dtUltimaRequisicao = value;
    }

    /**
     * Obtém o valor da propriedade qtdPacotesPendentes.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQtdPacotesPendentes() {
        return qtdPacotesPendentes;
    }

    /**
     * Define o valor da propriedade qtdPacotesPendentes.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQtdPacotesPendentes(Integer value) {
        this.qtdPacotesPendentes = value;
    }

}
