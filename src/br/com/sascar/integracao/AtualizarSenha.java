
package br.com.sascar.integracao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de atualizarSenha complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="atualizarSenha">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senhaAtual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="novaSenha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "atualizarSenha", propOrder = {
    "usuario",
    "senhaAtual",
    "novaSenha"
})
public class AtualizarSenha {

    protected String usuario;
    protected String senhaAtual;
    protected String novaSenha;

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
     * Obtém o valor da propriedade senhaAtual.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenhaAtual() {
        return senhaAtual;
    }

    /**
     * Define o valor da propriedade senhaAtual.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenhaAtual(String value) {
        this.senhaAtual = value;
    }

    /**
     * Obtém o valor da propriedade novaSenha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNovaSenha() {
        return novaSenha;
    }

    /**
     * Define o valor da propriedade novaSenha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNovaSenha(String value) {
        this.novaSenha = value;
    }

}
