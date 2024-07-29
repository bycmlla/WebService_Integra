
package br.com.sascar.integracao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de obterMacroTd50Tmcd complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="obterMacroTd50Tmcd">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoTeclado" type="{http://webservice.web.integracao.sascar.com.br/}tipoTeclado" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obterMacroTd50Tmcd", propOrder = {
    "usuario",
    "senha",
    "tipoTeclado"
})
public class ObterMacroTd50Tmcd {

    protected String usuario;
    protected String senha;
    @XmlSchemaType(name = "string")
    protected TipoTeclado tipoTeclado;

    /**
     * Obt�m o valor da propriedade usuario.
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
     * Obt�m o valor da propriedade senha.
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
     * Obt�m o valor da propriedade tipoTeclado.
     * 
     * @return
     *     possible object is
     *     {@link TipoTeclado }
     *     
     */
    public TipoTeclado getTipoTeclado() {
        return tipoTeclado;
    }

    /**
     * Define o valor da propriedade tipoTeclado.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTeclado }
     *     
     */
    public void setTipoTeclado(TipoTeclado value) {
        this.tipoTeclado = value;
    }

}
