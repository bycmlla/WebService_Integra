
package br.com.sascar.integracao;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de macroTd50TmcdDetalhado complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="macroTd50TmcdDetalhado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idMacroTd50Tmcd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idTmcd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="listaLayout" type="{http://webservice.web.integracao.sascar.com.br/}layoutDetalhado" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listaVeiculos" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "macroTd50TmcdDetalhado", propOrder = {
    "idMacroTd50Tmcd",
    "idTmcd",
    "listaLayout",
    "listaVeiculos",
    "nome"
})
public class MacroTd50TmcdDetalhado {

    protected Integer idMacroTd50Tmcd;
    protected Integer idTmcd;
    @XmlElement(nillable = true)
    protected List<LayoutDetalhado> listaLayout;
    @XmlElement(nillable = true)
    protected List<Integer> listaVeiculos;
    protected String nome;

    /**
     * Obtém o valor da propriedade idMacroTd50Tmcd.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdMacroTd50Tmcd() {
        return idMacroTd50Tmcd;
    }

    /**
     * Define o valor da propriedade idMacroTd50Tmcd.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdMacroTd50Tmcd(Integer value) {
        this.idMacroTd50Tmcd = value;
    }

    /**
     * Obtém o valor da propriedade idTmcd.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdTmcd() {
        return idTmcd;
    }

    /**
     * Define o valor da propriedade idTmcd.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdTmcd(Integer value) {
        this.idTmcd = value;
    }

    /**
     * Gets the value of the listaLayout property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaLayout property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaLayout().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LayoutDetalhado }
     * 
     * 
     */
    public List<LayoutDetalhado> getListaLayout() {
        if (listaLayout == null) {
            listaLayout = new ArrayList<LayoutDetalhado>();
        }
        return this.listaLayout;
    }

    /**
     * Gets the value of the listaVeiculos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaVeiculos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaVeiculos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getListaVeiculos() {
        if (listaVeiculos == null) {
            listaVeiculos = new ArrayList<Integer>();
        }
        return this.listaVeiculos;
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
