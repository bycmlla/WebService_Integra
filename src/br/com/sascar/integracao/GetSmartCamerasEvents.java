
package br.com.sascar.integracao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de getSmartCamerasEvents complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="getSmartCamerasEvents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agrupador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="offset" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="limit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="motoristas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="veiculos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataInicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataFim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoEvento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="criticidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="turno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="diaSemana" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quantidade" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSmartCamerasEvents", propOrder = {
    "usuario",
    "agrupador",
    "senha",
    "offset",
    "limit",
    "motoristas",
    "veiculos",
    "dataInicio",
    "dataFim",
    "tipoEvento",
    "criticidade",
    "turno",
    "diaSemana",
    "quantidade",
    "status"
})
public class GetSmartCamerasEvents {

    protected String usuario;
    protected String agrupador;
    protected String senha;
    protected int offset;
    protected int limit;
    protected String motoristas;
    protected String veiculos;
    protected String dataInicio;
    protected String dataFim;
    protected String tipoEvento;
    protected String criticidade;
    protected String turno;
    protected String diaSemana;
    protected int quantidade;
    protected String status;

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
     * Obtém o valor da propriedade agrupador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgrupador() {
        return agrupador;
    }

    /**
     * Define o valor da propriedade agrupador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgrupador(String value) {
        this.agrupador = value;
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
     * Obtém o valor da propriedade offset.
     * 
     */
    public int getOffset() {
        return offset;
    }

    /**
     * Define o valor da propriedade offset.
     * 
     */
    public void setOffset(int value) {
        this.offset = value;
    }

    /**
     * Obtém o valor da propriedade limit.
     * 
     */
    public int getLimit() {
        return limit;
    }

    /**
     * Define o valor da propriedade limit.
     * 
     */
    public void setLimit(int value) {
        this.limit = value;
    }

    /**
     * Obtém o valor da propriedade motoristas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotoristas() {
        return motoristas;
    }

    /**
     * Define o valor da propriedade motoristas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotoristas(String value) {
        this.motoristas = value;
    }

    /**
     * Obtém o valor da propriedade veiculos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVeiculos() {
        return veiculos;
    }

    /**
     * Define o valor da propriedade veiculos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVeiculos(String value) {
        this.veiculos = value;
    }

    /**
     * Obtém o valor da propriedade dataInicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataInicio() {
        return dataInicio;
    }

    /**
     * Define o valor da propriedade dataInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataInicio(String value) {
        this.dataInicio = value;
    }

    /**
     * Obtém o valor da propriedade dataFim.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataFim() {
        return dataFim;
    }

    /**
     * Define o valor da propriedade dataFim.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataFim(String value) {
        this.dataFim = value;
    }

    /**
     * Obtém o valor da propriedade tipoEvento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoEvento() {
        return tipoEvento;
    }

    /**
     * Define o valor da propriedade tipoEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoEvento(String value) {
        this.tipoEvento = value;
    }

    /**
     * Obtém o valor da propriedade criticidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCriticidade() {
        return criticidade;
    }

    /**
     * Define o valor da propriedade criticidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCriticidade(String value) {
        this.criticidade = value;
    }

    /**
     * Obtém o valor da propriedade turno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTurno() {
        return turno;
    }

    /**
     * Define o valor da propriedade turno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTurno(String value) {
        this.turno = value;
    }

    /**
     * Obtém o valor da propriedade diaSemana.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiaSemana() {
        return diaSemana;
    }

    /**
     * Define o valor da propriedade diaSemana.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiaSemana(String value) {
        this.diaSemana = value;
    }

    /**
     * Obtém o valor da propriedade quantidade.
     * 
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * Define o valor da propriedade quantidade.
     * 
     */
    public void setQuantidade(int value) {
        this.quantidade = value;
    }

    /**
     * Obtém o valor da propriedade status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define o valor da propriedade status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
