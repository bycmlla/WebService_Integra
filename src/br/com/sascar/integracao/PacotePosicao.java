
package br.com.sascar.integracao;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de pacotePosicao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="pacotePosicao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anguloReferencia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bloqueio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ccid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoMacro" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="conteudoMensagem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataPacote" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataPacoteGmt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataPosicao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataPosicaoGmt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="direcao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="distanciaReferencia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="embreagem" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="entrada1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="entrada2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="entrada3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="entrada4" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="entrada5" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="entrada6" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="entrada7" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="entrada8" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="estadoLimpadorParabrisa" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="eventoFormatado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eventoSeqFormatado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eventoSequenciamento" type="{http://webservice.web.integracao.sascar.com.br/}eventoSequenciamento" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="eventos" type="{http://webservice.web.integracao.sascar.com.br/}evento" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="eventosTelemetria" type="{http://webservice.web.integracao.sascar.com.br/}eventoTelemetriaContainer" minOccurs="0"/>
 *         &lt;element name="freio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="gps" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="horimetro" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idMotorista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idPacote" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idReferencia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idVeiculo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ignicao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="integradoraId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="jamming" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="litrometro2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="memoria" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="modoSeguroAtivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modoSeguroInativo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motorFuncionando" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nivelCombustivel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nomeMensagem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomeMotorista" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="odometro" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="placa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pontoEntrada" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pontoReferencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pontoSaida" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="rf" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="rpm" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="rua" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="saida1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="saida2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="saida3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="saida4" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="saida5" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="saida6" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="saida7" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="saida8" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="satelite" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="temperatura1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="temperatura2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="temperatura3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="temperaturaSerial" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tensao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="textoMensagem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoTeclado" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="uf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="umidadeSerial" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="velocidade" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pacotePosicao", propOrder = {
    "anguloReferencia",
    "bloqueio",
    "ccid",
    "cidade",
    "codigoMacro",
    "conteudoMensagem",
    "dataPacote",
    "dataPacoteGmt",
    "dataPosicao",
    "dataPosicaoGmt",
    "direcao",
    "distanciaReferencia",
    "embreagem",
    "entrada1",
    "entrada2",
    "entrada3",
    "entrada4",
    "entrada5",
    "entrada6",
    "entrada7",
    "entrada8",
    "estadoLimpadorParabrisa",
    "eventoFormatado",
    "eventoSeqFormatado",
    "eventoSequenciamento",
    "eventos",
    "eventosTelemetria",
    "freio",
    "gps",
    "horimetro",
    "idMotorista",
    "idPacote",
    "idReferencia",
    "idVeiculo",
    "ignicao",
    "integradoraId",
    "jamming",
    "latitude",
    "litrometro2",
    "longitude",
    "memoria",
    "modoSeguroAtivo",
    "modoSeguroInativo",
    "motorFuncionando",
    "nivelCombustivel",
    "nomeMensagem",
    "nomeMotorista",
    "odometro",
    "placa",
    "pontoEntrada",
    "pontoReferencia",
    "pontoSaida",
    "rf",
    "rpm",
    "rua",
    "saida1",
    "saida2",
    "saida3",
    "saida4",
    "saida5",
    "saida6",
    "saida7",
    "saida8",
    "satelite",
    "temperatura1",
    "temperatura2",
    "temperatura3",
    "temperaturaSerial",
    "tensao",
    "textoMensagem",
    "tipoTeclado",
    "uf",
    "umidadeSerial",
    "velocidade"
})
public class PacotePosicao {

    protected Integer anguloReferencia;
    protected Integer bloqueio;
    protected String ccid;
    protected String cidade;
    protected Integer codigoMacro;
    protected String conteudoMensagem;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataPacote;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataPacoteGmt;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataPosicao;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataPosicaoGmt;
    protected Integer direcao;
    protected Integer distanciaReferencia;
    protected Integer embreagem;
    protected Integer entrada1;
    protected Integer entrada2;
    protected Integer entrada3;
    protected Integer entrada4;
    protected Integer entrada5;
    protected Integer entrada6;
    protected Integer entrada7;
    protected Integer entrada8;
    protected Integer estadoLimpadorParabrisa;
    protected String eventoFormatado;
    protected String eventoSeqFormatado;
    @XmlElement(nillable = true)
    protected List<EventoSequenciamento> eventoSequenciamento;
    @XmlElement(nillable = true)
    protected List<Evento> eventos;
    protected EventoTelemetriaContainer eventosTelemetria;
    protected Integer freio;
    protected Integer gps;
    protected Integer horimetro;
    protected Integer idMotorista;
    protected long idPacote;
    protected Integer idReferencia;
    protected Integer idVeiculo;
    protected Integer ignicao;
    protected Integer integradoraId;
    protected Integer jamming;
    protected Double latitude;
    protected Integer litrometro2;
    protected Double longitude;
    protected Integer memoria;
    protected String modoSeguroAtivo;
    protected String modoSeguroInativo;
    protected Integer motorFuncionando;
    protected Integer nivelCombustivel;
    protected String nomeMensagem;
    protected String nomeMotorista;
    protected Integer odometro;
    protected String placa;
    protected Integer pontoEntrada;
    protected String pontoReferencia;
    protected Integer pontoSaida;
    protected Long rf;
    protected Integer rpm;
    protected String rua;
    protected Integer saida1;
    protected Integer saida2;
    protected Integer saida3;
    protected Integer saida4;
    protected Integer saida5;
    protected Integer saida6;
    protected Integer saida7;
    protected Integer saida8;
    protected Integer satelite;
    protected Integer temperatura1;
    protected Integer temperatura2;
    protected Integer temperatura3;
    protected Integer temperaturaSerial;
    protected Integer tensao;
    protected String textoMensagem;
    protected Integer tipoTeclado;
    protected String uf;
    protected Integer umidadeSerial;
    protected Integer velocidade;

    /**
     * Obtém o valor da propriedade anguloReferencia.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnguloReferencia() {
        return anguloReferencia;
    }

    /**
     * Define o valor da propriedade anguloReferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnguloReferencia(Integer value) {
        this.anguloReferencia = value;
    }

    /**
     * Obtém o valor da propriedade bloqueio.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBloqueio() {
        return bloqueio;
    }

    /**
     * Define o valor da propriedade bloqueio.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBloqueio(Integer value) {
        this.bloqueio = value;
    }

    /**
     * Obtém o valor da propriedade ccid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcid() {
        return ccid;
    }

    /**
     * Define o valor da propriedade ccid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcid(String value) {
        this.ccid = value;
    }

    /**
     * Obtém o valor da propriedade cidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * Define o valor da propriedade cidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidade(String value) {
        this.cidade = value;
    }

    /**
     * Obtém o valor da propriedade codigoMacro.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoMacro() {
        return codigoMacro;
    }

    /**
     * Define o valor da propriedade codigoMacro.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoMacro(Integer value) {
        this.codigoMacro = value;
    }

    /**
     * Obtém o valor da propriedade conteudoMensagem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConteudoMensagem() {
        return conteudoMensagem;
    }

    /**
     * Define o valor da propriedade conteudoMensagem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConteudoMensagem(String value) {
        this.conteudoMensagem = value;
    }

    /**
     * Obtém o valor da propriedade dataPacote.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataPacote() {
        return dataPacote;
    }

    /**
     * Define o valor da propriedade dataPacote.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataPacote(XMLGregorianCalendar value) {
        this.dataPacote = value;
    }

    /**
     * Obtém o valor da propriedade dataPacoteGmt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataPacoteGmt() {
        return dataPacoteGmt;
    }

    /**
     * Define o valor da propriedade dataPacoteGmt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataPacoteGmt(XMLGregorianCalendar value) {
        this.dataPacoteGmt = value;
    }

    /**
     * Obtém o valor da propriedade dataPosicao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataPosicao() {
        return dataPosicao;
    }

    /**
     * Define o valor da propriedade dataPosicao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataPosicao(XMLGregorianCalendar value) {
        this.dataPosicao = value;
    }

    /**
     * Obtém o valor da propriedade dataPosicaoGmt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataPosicaoGmt() {
        return dataPosicaoGmt;
    }

    /**
     * Define o valor da propriedade dataPosicaoGmt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataPosicaoGmt(XMLGregorianCalendar value) {
        this.dataPosicaoGmt = value;
    }

    /**
     * Obtém o valor da propriedade direcao.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDirecao() {
        return direcao;
    }

    /**
     * Define o valor da propriedade direcao.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDirecao(Integer value) {
        this.direcao = value;
    }

    /**
     * Obtém o valor da propriedade distanciaReferencia.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistanciaReferencia() {
        return distanciaReferencia;
    }

    /**
     * Define o valor da propriedade distanciaReferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistanciaReferencia(Integer value) {
        this.distanciaReferencia = value;
    }

    /**
     * Obtém o valor da propriedade embreagem.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEmbreagem() {
        return embreagem;
    }

    /**
     * Define o valor da propriedade embreagem.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEmbreagem(Integer value) {
        this.embreagem = value;
    }

    /**
     * Obtém o valor da propriedade entrada1.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEntrada1() {
        return entrada1;
    }

    /**
     * Define o valor da propriedade entrada1.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEntrada1(Integer value) {
        this.entrada1 = value;
    }

    /**
     * Obtém o valor da propriedade entrada2.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEntrada2() {
        return entrada2;
    }

    /**
     * Define o valor da propriedade entrada2.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEntrada2(Integer value) {
        this.entrada2 = value;
    }

    /**
     * Obtém o valor da propriedade entrada3.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEntrada3() {
        return entrada3;
    }

    /**
     * Define o valor da propriedade entrada3.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEntrada3(Integer value) {
        this.entrada3 = value;
    }

    /**
     * Obtém o valor da propriedade entrada4.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEntrada4() {
        return entrada4;
    }

    /**
     * Define o valor da propriedade entrada4.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEntrada4(Integer value) {
        this.entrada4 = value;
    }

    /**
     * Obtém o valor da propriedade entrada5.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEntrada5() {
        return entrada5;
    }

    /**
     * Define o valor da propriedade entrada5.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEntrada5(Integer value) {
        this.entrada5 = value;
    }

    /**
     * Obtém o valor da propriedade entrada6.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEntrada6() {
        return entrada6;
    }

    /**
     * Define o valor da propriedade entrada6.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEntrada6(Integer value) {
        this.entrada6 = value;
    }

    /**
     * Obtém o valor da propriedade entrada7.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEntrada7() {
        return entrada7;
    }

    /**
     * Define o valor da propriedade entrada7.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEntrada7(Integer value) {
        this.entrada7 = value;
    }

    /**
     * Obtém o valor da propriedade entrada8.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEntrada8() {
        return entrada8;
    }

    /**
     * Define o valor da propriedade entrada8.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEntrada8(Integer value) {
        this.entrada8 = value;
    }

    /**
     * Obtém o valor da propriedade estadoLimpadorParabrisa.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEstadoLimpadorParabrisa() {
        return estadoLimpadorParabrisa;
    }

    /**
     * Define o valor da propriedade estadoLimpadorParabrisa.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEstadoLimpadorParabrisa(Integer value) {
        this.estadoLimpadorParabrisa = value;
    }

    /**
     * Obtém o valor da propriedade eventoFormatado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventoFormatado() {
        return eventoFormatado;
    }

    /**
     * Define o valor da propriedade eventoFormatado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventoFormatado(String value) {
        this.eventoFormatado = value;
    }

    /**
     * Obtém o valor da propriedade eventoSeqFormatado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventoSeqFormatado() {
        return eventoSeqFormatado;
    }

    /**
     * Define o valor da propriedade eventoSeqFormatado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventoSeqFormatado(String value) {
        this.eventoSeqFormatado = value;
    }

    /**
     * Gets the value of the eventoSequenciamento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventoSequenciamento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventoSequenciamento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventoSequenciamento }
     * 
     * 
     */
    public List<EventoSequenciamento> getEventoSequenciamento() {
        if (eventoSequenciamento == null) {
            eventoSequenciamento = new ArrayList<EventoSequenciamento>();
        }
        return this.eventoSequenciamento;
    }

    /**
     * Gets the value of the eventos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Evento }
     * 
     * 
     */
    public List<Evento> getEventos() {
        if (eventos == null) {
            eventos = new ArrayList<Evento>();
        }
        return this.eventos;
    }

    /**
     * Obtém o valor da propriedade eventosTelemetria.
     * 
     * @return
     *     possible object is
     *     {@link EventoTelemetriaContainer }
     *     
     */
    public EventoTelemetriaContainer getEventosTelemetria() {
        return eventosTelemetria;
    }

    /**
     * Define o valor da propriedade eventosTelemetria.
     * 
     * @param value
     *     allowed object is
     *     {@link EventoTelemetriaContainer }
     *     
     */
    public void setEventosTelemetria(EventoTelemetriaContainer value) {
        this.eventosTelemetria = value;
    }

    /**
     * Obtém o valor da propriedade freio.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFreio() {
        return freio;
    }

    /**
     * Define o valor da propriedade freio.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFreio(Integer value) {
        this.freio = value;
    }

    /**
     * Obtém o valor da propriedade gps.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGps() {
        return gps;
    }

    /**
     * Define o valor da propriedade gps.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGps(Integer value) {
        this.gps = value;
    }

    /**
     * Obtém o valor da propriedade horimetro.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHorimetro() {
        return horimetro;
    }

    /**
     * Define o valor da propriedade horimetro.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHorimetro(Integer value) {
        this.horimetro = value;
    }

    /**
     * Obtém o valor da propriedade idMotorista.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdMotorista() {
        return idMotorista;
    }

    /**
     * Define o valor da propriedade idMotorista.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdMotorista(Integer value) {
        this.idMotorista = value;
    }

    /**
     * Obtém o valor da propriedade idPacote.
     * 
     */
    public long getIdPacote() {
        return idPacote;
    }

    /**
     * Define o valor da propriedade idPacote.
     * 
     */
    public void setIdPacote(long value) {
        this.idPacote = value;
    }

    /**
     * Obtém o valor da propriedade idReferencia.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdReferencia() {
        return idReferencia;
    }

    /**
     * Define o valor da propriedade idReferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdReferencia(Integer value) {
        this.idReferencia = value;
    }

    /**
     * Obtém o valor da propriedade idVeiculo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdVeiculo() {
        return idVeiculo;
    }

    /**
     * Define o valor da propriedade idVeiculo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdVeiculo(Integer value) {
        this.idVeiculo = value;
    }

    /**
     * Obtém o valor da propriedade ignicao.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIgnicao() {
        return ignicao;
    }

    /**
     * Define o valor da propriedade ignicao.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIgnicao(Integer value) {
        this.ignicao = value;
    }

    /**
     * Obtém o valor da propriedade integradoraId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIntegradoraId() {
        return integradoraId;
    }

    /**
     * Define o valor da propriedade integradoraId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIntegradoraId(Integer value) {
        this.integradoraId = value;
    }

    /**
     * Obtém o valor da propriedade jamming.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getJamming() {
        return jamming;
    }

    /**
     * Define o valor da propriedade jamming.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setJamming(Integer value) {
        this.jamming = value;
    }

    /**
     * Obtém o valor da propriedade latitude.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * Define o valor da propriedade latitude.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLatitude(Double value) {
        this.latitude = value;
    }

    /**
     * Obtém o valor da propriedade litrometro2.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLitrometro2() {
        return litrometro2;
    }

    /**
     * Define o valor da propriedade litrometro2.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLitrometro2(Integer value) {
        this.litrometro2 = value;
    }

    /**
     * Obtém o valor da propriedade longitude.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * Define o valor da propriedade longitude.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLongitude(Double value) {
        this.longitude = value;
    }

    /**
     * Obtém o valor da propriedade memoria.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMemoria() {
        return memoria;
    }

    /**
     * Define o valor da propriedade memoria.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMemoria(Integer value) {
        this.memoria = value;
    }

    /**
     * Obtém o valor da propriedade modoSeguroAtivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModoSeguroAtivo() {
        return modoSeguroAtivo;
    }

    /**
     * Define o valor da propriedade modoSeguroAtivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModoSeguroAtivo(String value) {
        this.modoSeguroAtivo = value;
    }

    /**
     * Obtém o valor da propriedade modoSeguroInativo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModoSeguroInativo() {
        return modoSeguroInativo;
    }

    /**
     * Define o valor da propriedade modoSeguroInativo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModoSeguroInativo(String value) {
        this.modoSeguroInativo = value;
    }

    /**
     * Obtém o valor da propriedade motorFuncionando.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMotorFuncionando() {
        return motorFuncionando;
    }

    /**
     * Define o valor da propriedade motorFuncionando.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMotorFuncionando(Integer value) {
        this.motorFuncionando = value;
    }

    /**
     * Obtém o valor da propriedade nivelCombustivel.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNivelCombustivel() {
        return nivelCombustivel;
    }

    /**
     * Define o valor da propriedade nivelCombustivel.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNivelCombustivel(Integer value) {
        this.nivelCombustivel = value;
    }

    /**
     * Obtém o valor da propriedade nomeMensagem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeMensagem() {
        return nomeMensagem;
    }

    /**
     * Define o valor da propriedade nomeMensagem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeMensagem(String value) {
        this.nomeMensagem = value;
    }

    /**
     * Obtém o valor da propriedade nomeMotorista.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeMotorista() {
        return nomeMotorista;
    }

    /**
     * Define o valor da propriedade nomeMotorista.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeMotorista(String value) {
        this.nomeMotorista = value;
    }

    /**
     * Obtém o valor da propriedade odometro.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOdometro() {
        return odometro;
    }

    /**
     * Define o valor da propriedade odometro.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOdometro(Integer value) {
        this.odometro = value;
    }

    /**
     * Obtém o valor da propriedade placa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Define o valor da propriedade placa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaca(String value) {
        this.placa = value;
    }

    /**
     * Obtém o valor da propriedade pontoEntrada.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPontoEntrada() {
        return pontoEntrada;
    }

    /**
     * Define o valor da propriedade pontoEntrada.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPontoEntrada(Integer value) {
        this.pontoEntrada = value;
    }

    /**
     * Obtém o valor da propriedade pontoReferencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPontoReferencia() {
        return pontoReferencia;
    }

    /**
     * Define o valor da propriedade pontoReferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPontoReferencia(String value) {
        this.pontoReferencia = value;
    }

    /**
     * Obtém o valor da propriedade pontoSaida.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPontoSaida() {
        return pontoSaida;
    }

    /**
     * Define o valor da propriedade pontoSaida.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPontoSaida(Integer value) {
        this.pontoSaida = value;
    }

    /**
     * Obtém o valor da propriedade rf.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRf() {
        return rf;
    }

    /**
     * Define o valor da propriedade rf.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRf(Long value) {
        this.rf = value;
    }

    /**
     * Obtém o valor da propriedade rpm.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRpm() {
        return rpm;
    }

    /**
     * Define o valor da propriedade rpm.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRpm(Integer value) {
        this.rpm = value;
    }

    /**
     * Obtém o valor da propriedade rua.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRua() {
        return rua;
    }

    /**
     * Define o valor da propriedade rua.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRua(String value) {
        this.rua = value;
    }

    /**
     * Obtém o valor da propriedade saida1.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSaida1() {
        return saida1;
    }

    /**
     * Define o valor da propriedade saida1.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSaida1(Integer value) {
        this.saida1 = value;
    }

    /**
     * Obtém o valor da propriedade saida2.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSaida2() {
        return saida2;
    }

    /**
     * Define o valor da propriedade saida2.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSaida2(Integer value) {
        this.saida2 = value;
    }

    /**
     * Obtém o valor da propriedade saida3.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSaida3() {
        return saida3;
    }

    /**
     * Define o valor da propriedade saida3.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSaida3(Integer value) {
        this.saida3 = value;
    }

    /**
     * Obtém o valor da propriedade saida4.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSaida4() {
        return saida4;
    }

    /**
     * Define o valor da propriedade saida4.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSaida4(Integer value) {
        this.saida4 = value;
    }

    /**
     * Obtém o valor da propriedade saida5.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSaida5() {
        return saida5;
    }

    /**
     * Define o valor da propriedade saida5.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSaida5(Integer value) {
        this.saida5 = value;
    }

    /**
     * Obtém o valor da propriedade saida6.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSaida6() {
        return saida6;
    }

    /**
     * Define o valor da propriedade saida6.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSaida6(Integer value) {
        this.saida6 = value;
    }

    /**
     * Obtém o valor da propriedade saida7.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSaida7() {
        return saida7;
    }

    /**
     * Define o valor da propriedade saida7.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSaida7(Integer value) {
        this.saida7 = value;
    }

    /**
     * Obtém o valor da propriedade saida8.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSaida8() {
        return saida8;
    }

    /**
     * Define o valor da propriedade saida8.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSaida8(Integer value) {
        this.saida8 = value;
    }

    /**
     * Obtém o valor da propriedade satelite.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSatelite() {
        return satelite;
    }

    /**
     * Define o valor da propriedade satelite.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSatelite(Integer value) {
        this.satelite = value;
    }

    /**
     * Obtém o valor da propriedade temperatura1.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTemperatura1() {
        return temperatura1;
    }

    /**
     * Define o valor da propriedade temperatura1.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTemperatura1(Integer value) {
        this.temperatura1 = value;
    }

    /**
     * Obtém o valor da propriedade temperatura2.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTemperatura2() {
        return temperatura2;
    }

    /**
     * Define o valor da propriedade temperatura2.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTemperatura2(Integer value) {
        this.temperatura2 = value;
    }

    /**
     * Obtém o valor da propriedade temperatura3.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTemperatura3() {
        return temperatura3;
    }

    /**
     * Define o valor da propriedade temperatura3.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTemperatura3(Integer value) {
        this.temperatura3 = value;
    }

    /**
     * Obtém o valor da propriedade temperaturaSerial.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTemperaturaSerial() {
        return temperaturaSerial;
    }

    /**
     * Define o valor da propriedade temperaturaSerial.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTemperaturaSerial(Integer value) {
        this.temperaturaSerial = value;
    }

    /**
     * Obtém o valor da propriedade tensao.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTensao() {
        return tensao;
    }

    /**
     * Define o valor da propriedade tensao.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTensao(Integer value) {
        this.tensao = value;
    }

    /**
     * Obtém o valor da propriedade textoMensagem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextoMensagem() {
        return textoMensagem;
    }

    /**
     * Define o valor da propriedade textoMensagem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextoMensagem(String value) {
        this.textoMensagem = value;
    }

    /**
     * Obtém o valor da propriedade tipoTeclado.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTipoTeclado() {
        return tipoTeclado;
    }

    /**
     * Define o valor da propriedade tipoTeclado.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTipoTeclado(Integer value) {
        this.tipoTeclado = value;
    }

    /**
     * Obtém o valor da propriedade uf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUf() {
        return uf;
    }

    /**
     * Define o valor da propriedade uf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUf(String value) {
        this.uf = value;
    }

    /**
     * Obtém o valor da propriedade umidadeSerial.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUmidadeSerial() {
        return umidadeSerial;
    }

    /**
     * Define o valor da propriedade umidadeSerial.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUmidadeSerial(Integer value) {
        this.umidadeSerial = value;
    }

    /**
     * Obtém o valor da propriedade velocidade.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVelocidade() {
        return velocidade;
    }

    /**
     * Define o valor da propriedade velocidade.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVelocidade(Integer value) {
        this.velocidade = value;
    }

}
