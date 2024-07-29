
package br.com.sascar.integracao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de obterAlertasAVDVinculados complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="obterAlertasAVDVinculados">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="veiplaca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="veioid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obterAlertasAVDVinculados", propOrder = {
    "usuario",
    "senha",
    "veiplaca",
    "veioid"
})
public class ObterAlertasAVDVinculados {

    protected String usuario;
    protected String senha;
    protected String veiplaca;
    protected String veioid;

    /**
     * Obtém o valor da propriedade usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define o valor da propriedade usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Obtém o valor da propriedade senha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Define o valor da propriedade senha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenha(String value) {
        this.senha = value;
    }

    /**
     * Obtém o valor da propriedade veiplaca.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVeiplaca() {
        return veiplaca;
    }

    /**
     * Define o valor da propriedade veiplaca.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVeiplaca(String value) {
        this.veiplaca = value;
    }

    /**
     * Obtém o valor da propriedade veioid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVeioid() {
        return veioid;
    }

    /**
     * Define o valor da propriedade veioid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVeioid(String value) {
        this.veioid = value;
    }

}
