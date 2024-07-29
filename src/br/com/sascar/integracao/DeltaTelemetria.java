
package br.com.sascar.integracao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de deltaTelemetria complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="deltaTelemetria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consumoCombustivel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dataPosicao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distPercorridaAscendenteFxAmarela" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="distPercorridaAscendenteFxMarchaLenta" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="distPercorridaAscendenteFxPerigo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="distPercorridaAscendenteFxTransic" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="distPercorridaAscendenteFxVerde" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="distPercorridaAscendenteFxVerde_ext" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="distPercorridaDescendenteFxAmarela" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="distPercorridaDescendenteFxMarchaLenta" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="distPercorridaDescendenteFxPerigo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="distPercorridaDescendenteFxTransic" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="distPercorridaDescendenteFxVerde" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="distPercorridaDescendenteFxVerde_ext" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="distPercorridaEstavelFxAmarela" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="distPercorridaEstavelFxMarchaLenta" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="distPercorridaEstavelFxPerigo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="distPercorridaEstavelFxTransic" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="distPercorridaEstavelFxVerde" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="distPercorridaEstavelFxVerde_ext" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="distTotalFxAscendente" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="distTotalFxDescendente" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="distTotalFxEstavel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="distanciaPercorrida" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="distanciaPercorridaEmbreagemAcionada" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="distanciaPercorridaFreioAcionado" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="horimetro" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idMotorista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idVeiculo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="loginMotorista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="nomeMotorista" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="odometro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pressaoMediaDoOleoDoMotor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pressaoMediaDoSistemaDeFreioAAr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="rpmMaximo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="rpmMedia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="temperaturaMediaDoArrefecimento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="temperaturaMediaDoCombustivel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="temperaturaMediaDoOleoDoMotor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoDuracaoAscendenteFxAmarela" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoDuracaoAscendenteFxMarchaLenta" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoDuracaoAscendenteFxPerigo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoDuracaoAscendenteFxTransic" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoDuracaoAscendenteFxVerde" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoDuracaoAscendenteFxVerde_ext" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoDuracaoDescendenteFxAmarela" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoDuracaoDescendenteFxMarchaLenta" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoDuracaoDescendenteFxPerigo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoDuracaoDescendenteFxTransic" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoDuracaoDescendenteFxVerde" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoDuracaoDescendenteFxVerde_ext" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoDuracaoEstavelFxAmarela" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoDuracaoEstavelFxMarchaLenta" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoDuracaoEstavelFxPerigo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoDuracaoEstavelFxTransic" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoDuracaoEstavelFxVerde" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoDuracaoEstavelFxVerde_ext" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoDuracaoFaixaAmarela" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoDuracaoFaixaAmarelaComInercia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoDuracaoFaixaAmarerlaSemInercia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoDuracaoFaixaAzul" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoDuracaoFaixaDePerigoComInercia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoDuracaoFaixaDePerigoSemInercia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoDuracaoFaixaDeTransicaoComInercia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoDuracaoFaixaDeTransicaoSemInercia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoDuracaoFaixaMarchaLenta" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoDuracaoFaixaMarchaLentaComVelocidade" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoDuracaoFaixaVerde" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoDuracaoFaixaVerdeComInercia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoDuracaoFaixaVerdeEconomicaComInercia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoDuracaoFaixaVerdeEconomicaSemInercia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoDuracaoFaixaVerdeSemInercia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoDuracaoFaixaVermelha" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoDuracaoFreioMotor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoDuracaoGiroMotor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoDuracaoMovimento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoDuracaoParado" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoDuracaoTotal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoTotalComCinto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoTotalFxAscendente" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoTotalFxDescendente" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tempoTotalFxEstavel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tensaoMediaDaBateria" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tipoDelta" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="velocidadeMaximaFaixaAmarela" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="velocidadeMedia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deltaTelemetria", propOrder = {
    "consumoCombustivel",
    "dataPosicao",
    "distPercorridaAscendenteFxAmarela",
    "distPercorridaAscendenteFxMarchaLenta",
    "distPercorridaAscendenteFxPerigo",
    "distPercorridaAscendenteFxTransic",
    "distPercorridaAscendenteFxVerde",
    "distPercorridaAscendenteFxVerdeExt",
    "distPercorridaDescendenteFxAmarela",
    "distPercorridaDescendenteFxMarchaLenta",
    "distPercorridaDescendenteFxPerigo",
    "distPercorridaDescendenteFxTransic",
    "distPercorridaDescendenteFxVerde",
    "distPercorridaDescendenteFxVerdeExt",
    "distPercorridaEstavelFxAmarela",
    "distPercorridaEstavelFxMarchaLenta",
    "distPercorridaEstavelFxPerigo",
    "distPercorridaEstavelFxTransic",
    "distPercorridaEstavelFxVerde",
    "distPercorridaEstavelFxVerdeExt",
    "distTotalFxAscendente",
    "distTotalFxDescendente",
    "distTotalFxEstavel",
    "distanciaPercorrida",
    "distanciaPercorridaEmbreagemAcionada",
    "distanciaPercorridaFreioAcionado",
    "horimetro",
    "idMotorista",
    "idVeiculo",
    "latitude",
    "loginMotorista",
    "longitude",
    "nomeMotorista",
    "odometro",
    "pressaoMediaDoOleoDoMotor",
    "pressaoMediaDoSistemaDeFreioAAr",
    "rpmMaximo",
    "rpmMedia",
    "temperaturaMediaDoArrefecimento",
    "temperaturaMediaDoCombustivel",
    "temperaturaMediaDoOleoDoMotor",
    "tempoDuracaoAscendenteFxAmarela",
    "tempoDuracaoAscendenteFxMarchaLenta",
    "tempoDuracaoAscendenteFxPerigo",
    "tempoDuracaoAscendenteFxTransic",
    "tempoDuracaoAscendenteFxVerde",
    "tempoDuracaoAscendenteFxVerdeExt",
    "tempoDuracaoDescendenteFxAmarela",
    "tempoDuracaoDescendenteFxMarchaLenta",
    "tempoDuracaoDescendenteFxPerigo",
    "tempoDuracaoDescendenteFxTransic",
    "tempoDuracaoDescendenteFxVerde",
    "tempoDuracaoDescendenteFxVerdeExt",
    "tempoDuracaoEstavelFxAmarela",
    "tempoDuracaoEstavelFxMarchaLenta",
    "tempoDuracaoEstavelFxPerigo",
    "tempoDuracaoEstavelFxTransic",
    "tempoDuracaoEstavelFxVerde",
    "tempoDuracaoEstavelFxVerdeExt",
    "tempoDuracaoFaixaAmarela",
    "tempoDuracaoFaixaAmarelaComInercia",
    "tempoDuracaoFaixaAmarerlaSemInercia",
    "tempoDuracaoFaixaAzul",
    "tempoDuracaoFaixaDePerigoComInercia",
    "tempoDuracaoFaixaDePerigoSemInercia",
    "tempoDuracaoFaixaDeTransicaoComInercia",
    "tempoDuracaoFaixaDeTransicaoSemInercia",
    "tempoDuracaoFaixaMarchaLenta",
    "tempoDuracaoFaixaMarchaLentaComVelocidade",
    "tempoDuracaoFaixaVerde",
    "tempoDuracaoFaixaVerdeComInercia",
    "tempoDuracaoFaixaVerdeEconomicaComInercia",
    "tempoDuracaoFaixaVerdeEconomicaSemInercia",
    "tempoDuracaoFaixaVerdeSemInercia",
    "tempoDuracaoFaixaVermelha",
    "tempoDuracaoFreioMotor",
    "tempoDuracaoGiroMotor",
    "tempoDuracaoMovimento",
    "tempoDuracaoParado",
    "tempoDuracaoTotal",
    "tempoTotalComCinto",
    "tempoTotalFxAscendente",
    "tempoTotalFxDescendente",
    "tempoTotalFxEstavel",
    "tensaoMediaDaBateria",
    "tipoDelta",
    "velocidadeMaximaFaixaAmarela",
    "velocidadeMedia"
})
@XmlSeeAlso({
    DeltaTelemetriaDataChegada.class
})
public class DeltaTelemetria {

    protected Integer consumoCombustivel;
    protected String dataPosicao;
    protected Integer distPercorridaAscendenteFxAmarela;
    protected Integer distPercorridaAscendenteFxMarchaLenta;
    protected Integer distPercorridaAscendenteFxPerigo;
    protected Integer distPercorridaAscendenteFxTransic;
    protected Integer distPercorridaAscendenteFxVerde;
    @XmlElement(name = "distPercorridaAscendenteFxVerde_ext")
    protected Integer distPercorridaAscendenteFxVerdeExt;
    protected Integer distPercorridaDescendenteFxAmarela;
    protected Integer distPercorridaDescendenteFxMarchaLenta;
    protected Integer distPercorridaDescendenteFxPerigo;
    protected Integer distPercorridaDescendenteFxTransic;
    protected Integer distPercorridaDescendenteFxVerde;
    @XmlElement(name = "distPercorridaDescendenteFxVerde_ext")
    protected Integer distPercorridaDescendenteFxVerdeExt;
    protected Integer distPercorridaEstavelFxAmarela;
    protected Integer distPercorridaEstavelFxMarchaLenta;
    protected Integer distPercorridaEstavelFxPerigo;
    protected Integer distPercorridaEstavelFxTransic;
    protected Integer distPercorridaEstavelFxVerde;
    @XmlElement(name = "distPercorridaEstavelFxVerde_ext")
    protected Integer distPercorridaEstavelFxVerdeExt;
    protected Integer distTotalFxAscendente;
    protected Integer distTotalFxDescendente;
    protected Integer distTotalFxEstavel;
    protected Integer distanciaPercorrida;
    protected Integer distanciaPercorridaEmbreagemAcionada;
    protected Integer distanciaPercorridaFreioAcionado;
    protected Integer horimetro;
    protected Integer idMotorista;
    protected Integer idVeiculo;
    protected Double latitude;
    protected Integer loginMotorista;
    protected Double longitude;
    protected String nomeMotorista;
    protected String odometro;
    protected Integer pressaoMediaDoOleoDoMotor;
    protected Integer pressaoMediaDoSistemaDeFreioAAr;
    protected Integer rpmMaximo;
    protected Integer rpmMedia;
    protected Integer temperaturaMediaDoArrefecimento;
    protected Integer temperaturaMediaDoCombustivel;
    protected Integer temperaturaMediaDoOleoDoMotor;
    protected Integer tempoDuracaoAscendenteFxAmarela;
    protected Integer tempoDuracaoAscendenteFxMarchaLenta;
    protected Integer tempoDuracaoAscendenteFxPerigo;
    protected Integer tempoDuracaoAscendenteFxTransic;
    protected Integer tempoDuracaoAscendenteFxVerde;
    @XmlElement(name = "tempoDuracaoAscendenteFxVerde_ext")
    protected Integer tempoDuracaoAscendenteFxVerdeExt;
    protected Integer tempoDuracaoDescendenteFxAmarela;
    protected Integer tempoDuracaoDescendenteFxMarchaLenta;
    protected Integer tempoDuracaoDescendenteFxPerigo;
    protected Integer tempoDuracaoDescendenteFxTransic;
    protected Integer tempoDuracaoDescendenteFxVerde;
    @XmlElement(name = "tempoDuracaoDescendenteFxVerde_ext")
    protected Integer tempoDuracaoDescendenteFxVerdeExt;
    protected Integer tempoDuracaoEstavelFxAmarela;
    protected Integer tempoDuracaoEstavelFxMarchaLenta;
    protected Integer tempoDuracaoEstavelFxPerigo;
    protected Integer tempoDuracaoEstavelFxTransic;
    protected Integer tempoDuracaoEstavelFxVerde;
    @XmlElement(name = "tempoDuracaoEstavelFxVerde_ext")
    protected Integer tempoDuracaoEstavelFxVerdeExt;
    protected Integer tempoDuracaoFaixaAmarela;
    protected Integer tempoDuracaoFaixaAmarelaComInercia;
    protected Integer tempoDuracaoFaixaAmarerlaSemInercia;
    protected Integer tempoDuracaoFaixaAzul;
    protected Integer tempoDuracaoFaixaDePerigoComInercia;
    protected Integer tempoDuracaoFaixaDePerigoSemInercia;
    protected Integer tempoDuracaoFaixaDeTransicaoComInercia;
    protected Integer tempoDuracaoFaixaDeTransicaoSemInercia;
    protected Integer tempoDuracaoFaixaMarchaLenta;
    protected Integer tempoDuracaoFaixaMarchaLentaComVelocidade;
    protected Integer tempoDuracaoFaixaVerde;
    protected Integer tempoDuracaoFaixaVerdeComInercia;
    protected Integer tempoDuracaoFaixaVerdeEconomicaComInercia;
    protected Integer tempoDuracaoFaixaVerdeEconomicaSemInercia;
    protected Integer tempoDuracaoFaixaVerdeSemInercia;
    protected Integer tempoDuracaoFaixaVermelha;
    protected Integer tempoDuracaoFreioMotor;
    protected Integer tempoDuracaoGiroMotor;
    protected Integer tempoDuracaoMovimento;
    protected Integer tempoDuracaoParado;
    protected Integer tempoDuracaoTotal;
    protected Integer tempoTotalComCinto;
    protected Integer tempoTotalFxAscendente;
    protected Integer tempoTotalFxDescendente;
    protected Integer tempoTotalFxEstavel;
    protected Integer tensaoMediaDaBateria;
    protected Integer tipoDelta;
    protected Integer velocidadeMaximaFaixaAmarela;
    protected Integer velocidadeMedia;

    /**
     * Obtém o valor da propriedade consumoCombustivel.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConsumoCombustivel() {
        return consumoCombustivel;
    }

    /**
     * Define o valor da propriedade consumoCombustivel.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConsumoCombustivel(Integer value) {
        this.consumoCombustivel = value;
    }

    /**
     * Obtém o valor da propriedade dataPosicao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataPosicao() {
        return dataPosicao;
    }

    /**
     * Define o valor da propriedade dataPosicao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataPosicao(String value) {
        this.dataPosicao = value;
    }

    /**
     * Obtém o valor da propriedade distPercorridaAscendenteFxAmarela.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistPercorridaAscendenteFxAmarela() {
        return distPercorridaAscendenteFxAmarela;
    }

    /**
     * Define o valor da propriedade distPercorridaAscendenteFxAmarela.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistPercorridaAscendenteFxAmarela(Integer value) {
        this.distPercorridaAscendenteFxAmarela = value;
    }

    /**
     * Obtém o valor da propriedade distPercorridaAscendenteFxMarchaLenta.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistPercorridaAscendenteFxMarchaLenta() {
        return distPercorridaAscendenteFxMarchaLenta;
    }

    /**
     * Define o valor da propriedade distPercorridaAscendenteFxMarchaLenta.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistPercorridaAscendenteFxMarchaLenta(Integer value) {
        this.distPercorridaAscendenteFxMarchaLenta = value;
    }

    /**
     * Obtém o valor da propriedade distPercorridaAscendenteFxPerigo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistPercorridaAscendenteFxPerigo() {
        return distPercorridaAscendenteFxPerigo;
    }

    /**
     * Define o valor da propriedade distPercorridaAscendenteFxPerigo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistPercorridaAscendenteFxPerigo(Integer value) {
        this.distPercorridaAscendenteFxPerigo = value;
    }

    /**
     * Obtém o valor da propriedade distPercorridaAscendenteFxTransic.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistPercorridaAscendenteFxTransic() {
        return distPercorridaAscendenteFxTransic;
    }

    /**
     * Define o valor da propriedade distPercorridaAscendenteFxTransic.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistPercorridaAscendenteFxTransic(Integer value) {
        this.distPercorridaAscendenteFxTransic = value;
    }

    /**
     * Obtém o valor da propriedade distPercorridaAscendenteFxVerde.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistPercorridaAscendenteFxVerde() {
        return distPercorridaAscendenteFxVerde;
    }

    /**
     * Define o valor da propriedade distPercorridaAscendenteFxVerde.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistPercorridaAscendenteFxVerde(Integer value) {
        this.distPercorridaAscendenteFxVerde = value;
    }

    /**
     * Obtém o valor da propriedade distPercorridaAscendenteFxVerdeExt.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistPercorridaAscendenteFxVerdeExt() {
        return distPercorridaAscendenteFxVerdeExt;
    }

    /**
     * Define o valor da propriedade distPercorridaAscendenteFxVerdeExt.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistPercorridaAscendenteFxVerdeExt(Integer value) {
        this.distPercorridaAscendenteFxVerdeExt = value;
    }

    /**
     * Obtém o valor da propriedade distPercorridaDescendenteFxAmarela.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistPercorridaDescendenteFxAmarela() {
        return distPercorridaDescendenteFxAmarela;
    }

    /**
     * Define o valor da propriedade distPercorridaDescendenteFxAmarela.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistPercorridaDescendenteFxAmarela(Integer value) {
        this.distPercorridaDescendenteFxAmarela = value;
    }

    /**
     * Obtém o valor da propriedade distPercorridaDescendenteFxMarchaLenta.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistPercorridaDescendenteFxMarchaLenta() {
        return distPercorridaDescendenteFxMarchaLenta;
    }

    /**
     * Define o valor da propriedade distPercorridaDescendenteFxMarchaLenta.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistPercorridaDescendenteFxMarchaLenta(Integer value) {
        this.distPercorridaDescendenteFxMarchaLenta = value;
    }

    /**
     * Obtém o valor da propriedade distPercorridaDescendenteFxPerigo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistPercorridaDescendenteFxPerigo() {
        return distPercorridaDescendenteFxPerigo;
    }

    /**
     * Define o valor da propriedade distPercorridaDescendenteFxPerigo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistPercorridaDescendenteFxPerigo(Integer value) {
        this.distPercorridaDescendenteFxPerigo = value;
    }

    /**
     * Obtém o valor da propriedade distPercorridaDescendenteFxTransic.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistPercorridaDescendenteFxTransic() {
        return distPercorridaDescendenteFxTransic;
    }

    /**
     * Define o valor da propriedade distPercorridaDescendenteFxTransic.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistPercorridaDescendenteFxTransic(Integer value) {
        this.distPercorridaDescendenteFxTransic = value;
    }

    /**
     * Obtém o valor da propriedade distPercorridaDescendenteFxVerde.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistPercorridaDescendenteFxVerde() {
        return distPercorridaDescendenteFxVerde;
    }

    /**
     * Define o valor da propriedade distPercorridaDescendenteFxVerde.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistPercorridaDescendenteFxVerde(Integer value) {
        this.distPercorridaDescendenteFxVerde = value;
    }

    /**
     * Obtém o valor da propriedade distPercorridaDescendenteFxVerdeExt.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistPercorridaDescendenteFxVerdeExt() {
        return distPercorridaDescendenteFxVerdeExt;
    }

    /**
     * Define o valor da propriedade distPercorridaDescendenteFxVerdeExt.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistPercorridaDescendenteFxVerdeExt(Integer value) {
        this.distPercorridaDescendenteFxVerdeExt = value;
    }

    /**
     * Obtém o valor da propriedade distPercorridaEstavelFxAmarela.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistPercorridaEstavelFxAmarela() {
        return distPercorridaEstavelFxAmarela;
    }

    /**
     * Define o valor da propriedade distPercorridaEstavelFxAmarela.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistPercorridaEstavelFxAmarela(Integer value) {
        this.distPercorridaEstavelFxAmarela = value;
    }

    /**
     * Obtém o valor da propriedade distPercorridaEstavelFxMarchaLenta.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistPercorridaEstavelFxMarchaLenta() {
        return distPercorridaEstavelFxMarchaLenta;
    }

    /**
     * Define o valor da propriedade distPercorridaEstavelFxMarchaLenta.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistPercorridaEstavelFxMarchaLenta(Integer value) {
        this.distPercorridaEstavelFxMarchaLenta = value;
    }

    /**
     * Obtém o valor da propriedade distPercorridaEstavelFxPerigo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistPercorridaEstavelFxPerigo() {
        return distPercorridaEstavelFxPerigo;
    }

    /**
     * Define o valor da propriedade distPercorridaEstavelFxPerigo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistPercorridaEstavelFxPerigo(Integer value) {
        this.distPercorridaEstavelFxPerigo = value;
    }

    /**
     * Obtém o valor da propriedade distPercorridaEstavelFxTransic.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistPercorridaEstavelFxTransic() {
        return distPercorridaEstavelFxTransic;
    }

    /**
     * Define o valor da propriedade distPercorridaEstavelFxTransic.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistPercorridaEstavelFxTransic(Integer value) {
        this.distPercorridaEstavelFxTransic = value;
    }

    /**
     * Obtém o valor da propriedade distPercorridaEstavelFxVerde.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistPercorridaEstavelFxVerde() {
        return distPercorridaEstavelFxVerde;
    }

    /**
     * Define o valor da propriedade distPercorridaEstavelFxVerde.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistPercorridaEstavelFxVerde(Integer value) {
        this.distPercorridaEstavelFxVerde = value;
    }

    /**
     * Obtém o valor da propriedade distPercorridaEstavelFxVerdeExt.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistPercorridaEstavelFxVerdeExt() {
        return distPercorridaEstavelFxVerdeExt;
    }

    /**
     * Define o valor da propriedade distPercorridaEstavelFxVerdeExt.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistPercorridaEstavelFxVerdeExt(Integer value) {
        this.distPercorridaEstavelFxVerdeExt = value;
    }

    /**
     * Obtém o valor da propriedade distTotalFxAscendente.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistTotalFxAscendente() {
        return distTotalFxAscendente;
    }

    /**
     * Define o valor da propriedade distTotalFxAscendente.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistTotalFxAscendente(Integer value) {
        this.distTotalFxAscendente = value;
    }

    /**
     * Obtém o valor da propriedade distTotalFxDescendente.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistTotalFxDescendente() {
        return distTotalFxDescendente;
    }

    /**
     * Define o valor da propriedade distTotalFxDescendente.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistTotalFxDescendente(Integer value) {
        this.distTotalFxDescendente = value;
    }

    /**
     * Obtém o valor da propriedade distTotalFxEstavel.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistTotalFxEstavel() {
        return distTotalFxEstavel;
    }

    /**
     * Define o valor da propriedade distTotalFxEstavel.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistTotalFxEstavel(Integer value) {
        this.distTotalFxEstavel = value;
    }

    /**
     * Obtém o valor da propriedade distanciaPercorrida.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    /**
     * Define o valor da propriedade distanciaPercorrida.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistanciaPercorrida(Integer value) {
        this.distanciaPercorrida = value;
    }

    /**
     * Obtém o valor da propriedade distanciaPercorridaEmbreagemAcionada.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistanciaPercorridaEmbreagemAcionada() {
        return distanciaPercorridaEmbreagemAcionada;
    }

    /**
     * Define o valor da propriedade distanciaPercorridaEmbreagemAcionada.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistanciaPercorridaEmbreagemAcionada(Integer value) {
        this.distanciaPercorridaEmbreagemAcionada = value;
    }

    /**
     * Obtém o valor da propriedade distanciaPercorridaFreioAcionado.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDistanciaPercorridaFreioAcionado() {
        return distanciaPercorridaFreioAcionado;
    }

    /**
     * Define o valor da propriedade distanciaPercorridaFreioAcionado.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDistanciaPercorridaFreioAcionado(Integer value) {
        this.distanciaPercorridaFreioAcionado = value;
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
     * Obtém o valor da propriedade loginMotorista.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLoginMotorista() {
        return loginMotorista;
    }

    /**
     * Define o valor da propriedade loginMotorista.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLoginMotorista(Integer value) {
        this.loginMotorista = value;
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
     *     {@link String }
     *     
     */
    public String getOdometro() {
        return odometro;
    }

    /**
     * Define o valor da propriedade odometro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOdometro(String value) {
        this.odometro = value;
    }

    /**
     * Obtém o valor da propriedade pressaoMediaDoOleoDoMotor.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPressaoMediaDoOleoDoMotor() {
        return pressaoMediaDoOleoDoMotor;
    }

    /**
     * Define o valor da propriedade pressaoMediaDoOleoDoMotor.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPressaoMediaDoOleoDoMotor(Integer value) {
        this.pressaoMediaDoOleoDoMotor = value;
    }

    /**
     * Obtém o valor da propriedade pressaoMediaDoSistemaDeFreioAAr.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPressaoMediaDoSistemaDeFreioAAr() {
        return pressaoMediaDoSistemaDeFreioAAr;
    }

    /**
     * Define o valor da propriedade pressaoMediaDoSistemaDeFreioAAr.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPressaoMediaDoSistemaDeFreioAAr(Integer value) {
        this.pressaoMediaDoSistemaDeFreioAAr = value;
    }

    /**
     * Obtém o valor da propriedade rpmMaximo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRpmMaximo() {
        return rpmMaximo;
    }

    /**
     * Define o valor da propriedade rpmMaximo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRpmMaximo(Integer value) {
        this.rpmMaximo = value;
    }

    /**
     * Obtém o valor da propriedade rpmMedia.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRpmMedia() {
        return rpmMedia;
    }

    /**
     * Define o valor da propriedade rpmMedia.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRpmMedia(Integer value) {
        this.rpmMedia = value;
    }

    /**
     * Obtém o valor da propriedade temperaturaMediaDoArrefecimento.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTemperaturaMediaDoArrefecimento() {
        return temperaturaMediaDoArrefecimento;
    }

    /**
     * Define o valor da propriedade temperaturaMediaDoArrefecimento.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTemperaturaMediaDoArrefecimento(Integer value) {
        this.temperaturaMediaDoArrefecimento = value;
    }

    /**
     * Obtém o valor da propriedade temperaturaMediaDoCombustivel.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTemperaturaMediaDoCombustivel() {
        return temperaturaMediaDoCombustivel;
    }

    /**
     * Define o valor da propriedade temperaturaMediaDoCombustivel.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTemperaturaMediaDoCombustivel(Integer value) {
        this.temperaturaMediaDoCombustivel = value;
    }

    /**
     * Obtém o valor da propriedade temperaturaMediaDoOleoDoMotor.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTemperaturaMediaDoOleoDoMotor() {
        return temperaturaMediaDoOleoDoMotor;
    }

    /**
     * Define o valor da propriedade temperaturaMediaDoOleoDoMotor.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTemperaturaMediaDoOleoDoMotor(Integer value) {
        this.temperaturaMediaDoOleoDoMotor = value;
    }

    /**
     * Obtém o valor da propriedade tempoDuracaoAscendenteFxAmarela.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoDuracaoAscendenteFxAmarela() {
        return tempoDuracaoAscendenteFxAmarela;
    }

    /**
     * Define o valor da propriedade tempoDuracaoAscendenteFxAmarela.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoDuracaoAscendenteFxAmarela(Integer value) {
        this.tempoDuracaoAscendenteFxAmarela = value;
    }

    /**
     * Obtém o valor da propriedade tempoDuracaoAscendenteFxMarchaLenta.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoDuracaoAscendenteFxMarchaLenta() {
        return tempoDuracaoAscendenteFxMarchaLenta;
    }

    /**
     * Define o valor da propriedade tempoDuracaoAscendenteFxMarchaLenta.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoDuracaoAscendenteFxMarchaLenta(Integer value) {
        this.tempoDuracaoAscendenteFxMarchaLenta = value;
    }

    /**
     * Obtém o valor da propriedade tempoDuracaoAscendenteFxPerigo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoDuracaoAscendenteFxPerigo() {
        return tempoDuracaoAscendenteFxPerigo;
    }

    /**
     * Define o valor da propriedade tempoDuracaoAscendenteFxPerigo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoDuracaoAscendenteFxPerigo(Integer value) {
        this.tempoDuracaoAscendenteFxPerigo = value;
    }

    /**
     * Obtém o valor da propriedade tempoDuracaoAscendenteFxTransic.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoDuracaoAscendenteFxTransic() {
        return tempoDuracaoAscendenteFxTransic;
    }

    /**
     * Define o valor da propriedade tempoDuracaoAscendenteFxTransic.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoDuracaoAscendenteFxTransic(Integer value) {
        this.tempoDuracaoAscendenteFxTransic = value;
    }

    /**
     * Obtém o valor da propriedade tempoDuracaoAscendenteFxVerde.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoDuracaoAscendenteFxVerde() {
        return tempoDuracaoAscendenteFxVerde;
    }

    /**
     * Define o valor da propriedade tempoDuracaoAscendenteFxVerde.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoDuracaoAscendenteFxVerde(Integer value) {
        this.tempoDuracaoAscendenteFxVerde = value;
    }

    /**
     * Obtém o valor da propriedade tempoDuracaoAscendenteFxVerdeExt.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoDuracaoAscendenteFxVerdeExt() {
        return tempoDuracaoAscendenteFxVerdeExt;
    }

    /**
     * Define o valor da propriedade tempoDuracaoAscendenteFxVerdeExt.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoDuracaoAscendenteFxVerdeExt(Integer value) {
        this.tempoDuracaoAscendenteFxVerdeExt = value;
    }

    /**
     * Obtém o valor da propriedade tempoDuracaoDescendenteFxAmarela.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoDuracaoDescendenteFxAmarela() {
        return tempoDuracaoDescendenteFxAmarela;
    }

    /**
     * Define o valor da propriedade tempoDuracaoDescendenteFxAmarela.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoDuracaoDescendenteFxAmarela(Integer value) {
        this.tempoDuracaoDescendenteFxAmarela = value;
    }

    /**
     * Obtém o valor da propriedade tempoDuracaoDescendenteFxMarchaLenta.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoDuracaoDescendenteFxMarchaLenta() {
        return tempoDuracaoDescendenteFxMarchaLenta;
    }

    /**
     * Define o valor da propriedade tempoDuracaoDescendenteFxMarchaLenta.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoDuracaoDescendenteFxMarchaLenta(Integer value) {
        this.tempoDuracaoDescendenteFxMarchaLenta = value;
    }

    /**
     * Obtém o valor da propriedade tempoDuracaoDescendenteFxPerigo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoDuracaoDescendenteFxPerigo() {
        return tempoDuracaoDescendenteFxPerigo;
    }

    /**
     * Define o valor da propriedade tempoDuracaoDescendenteFxPerigo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoDuracaoDescendenteFxPerigo(Integer value) {
        this.tempoDuracaoDescendenteFxPerigo = value;
    }

    /**
     * Obtém o valor da propriedade tempoDuracaoDescendenteFxTransic.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoDuracaoDescendenteFxTransic() {
        return tempoDuracaoDescendenteFxTransic;
    }

    /**
     * Define o valor da propriedade tempoDuracaoDescendenteFxTransic.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoDuracaoDescendenteFxTransic(Integer value) {
        this.tempoDuracaoDescendenteFxTransic = value;
    }

    /**
     * Obtém o valor da propriedade tempoDuracaoDescendenteFxVerde.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoDuracaoDescendenteFxVerde() {
        return tempoDuracaoDescendenteFxVerde;
    }

    /**
     * Define o valor da propriedade tempoDuracaoDescendenteFxVerde.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoDuracaoDescendenteFxVerde(Integer value) {
        this.tempoDuracaoDescendenteFxVerde = value;
    }

    /**
     * Obtém o valor da propriedade tempoDuracaoDescendenteFxVerdeExt.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoDuracaoDescendenteFxVerdeExt() {
        return tempoDuracaoDescendenteFxVerdeExt;
    }

    /**
     * Define o valor da propriedade tempoDuracaoDescendenteFxVerdeExt.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoDuracaoDescendenteFxVerdeExt(Integer value) {
        this.tempoDuracaoDescendenteFxVerdeExt = value;
    }

    /**
     * Obtém o valor da propriedade tempoDuracaoEstavelFxAmarela.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoDuracaoEstavelFxAmarela() {
        return tempoDuracaoEstavelFxAmarela;
    }

    /**
     * Define o valor da propriedade tempoDuracaoEstavelFxAmarela.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoDuracaoEstavelFxAmarela(Integer value) {
        this.tempoDuracaoEstavelFxAmarela = value;
    }

    /**
     * Obtém o valor da propriedade tempoDuracaoEstavelFxMarchaLenta.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoDuracaoEstavelFxMarchaLenta() {
        return tempoDuracaoEstavelFxMarchaLenta;
    }

    /**
     * Define o valor da propriedade tempoDuracaoEstavelFxMarchaLenta.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoDuracaoEstavelFxMarchaLenta(Integer value) {
        this.tempoDuracaoEstavelFxMarchaLenta = value;
    }

    /**
     * Obtém o valor da propriedade tempoDuracaoEstavelFxPerigo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoDuracaoEstavelFxPerigo() {
        return tempoDuracaoEstavelFxPerigo;
    }

    /**
     * Define o valor da propriedade tempoDuracaoEstavelFxPerigo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoDuracaoEstavelFxPerigo(Integer value) {
        this.tempoDuracaoEstavelFxPerigo = value;
    }

    /**
     * Obtém o valor da propriedade tempoDuracaoEstavelFxTransic.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoDuracaoEstavelFxTransic() {
        return tempoDuracaoEstavelFxTransic;
    }

    /**
     * Define o valor da propriedade tempoDuracaoEstavelFxTransic.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoDuracaoEstavelFxTransic(Integer value) {
        this.tempoDuracaoEstavelFxTransic = value;
    }

    /**
     * Obtém o valor da propriedade tempoDuracaoEstavelFxVerde.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoDuracaoEstavelFxVerde() {
        return tempoDuracaoEstavelFxVerde;
    }

    /**
     * Define o valor da propriedade tempoDuracaoEstavelFxVerde.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoDuracaoEstavelFxVerde(Integer value) {
        this.tempoDuracaoEstavelFxVerde = value;
    }

    /**
     * Obtém o valor da propriedade tempoDuracaoEstavelFxVerdeExt.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoDuracaoEstavelFxVerdeExt() {
        return tempoDuracaoEstavelFxVerdeExt;
    }

    /**
     * Define o valor da propriedade tempoDuracaoEstavelFxVerdeExt.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoDuracaoEstavelFxVerdeExt(Integer value) {
        this.tempoDuracaoEstavelFxVerdeExt = value;
    }

    /**
     * Obtém o valor da propriedade tempoDuracaoFaixaAmarela.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoDuracaoFaixaAmarela() {
        return tempoDuracaoFaixaAmarela;
    }

    /**
     * Define o valor da propriedade tempoDuracaoFaixaAmarela.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoDuracaoFaixaAmarela(Integer value) {
        this.tempoDuracaoFaixaAmarela = value;
    }

    /**
     * Obtém o valor da propriedade tempoDuracaoFaixaAmarelaComInercia.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoDuracaoFaixaAmarelaComInercia() {
        return tempoDuracaoFaixaAmarelaComInercia;
    }

    /**
     * Define o valor da propriedade tempoDuracaoFaixaAmarelaComInercia.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoDuracaoFaixaAmarelaComInercia(Integer value) {
        this.tempoDuracaoFaixaAmarelaComInercia = value;
    }

    /**
     * Obtém o valor da propriedade tempoDuracaoFaixaAmarerlaSemInercia.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoDuracaoFaixaAmarerlaSemInercia() {
        return tempoDuracaoFaixaAmarerlaSemInercia;
    }

    /**
     * Define o valor da propriedade tempoDuracaoFaixaAmarerlaSemInercia.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoDuracaoFaixaAmarerlaSemInercia(Integer value) {
        this.tempoDuracaoFaixaAmarerlaSemInercia = value;
    }

    /**
     * Obtém o valor da propriedade tempoDuracaoFaixaAzul.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoDuracaoFaixaAzul() {
        return tempoDuracaoFaixaAzul;
    }

    /**
     * Define o valor da propriedade tempoDuracaoFaixaAzul.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoDuracaoFaixaAzul(Integer value) {
        this.tempoDuracaoFaixaAzul = value;
    }

    /**
     * Obtém o valor da propriedade tempoDuracaoFaixaDePerigoComInercia.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoDuracaoFaixaDePerigoComInercia() {
        return tempoDuracaoFaixaDePerigoComInercia;
    }

    /**
     * Define o valor da propriedade tempoDuracaoFaixaDePerigoComInercia.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoDuracaoFaixaDePerigoComInercia(Integer value) {
        this.tempoDuracaoFaixaDePerigoComInercia = value;
    }

    /**
     * Obtém o valor da propriedade tempoDuracaoFaixaDePerigoSemInercia.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoDuracaoFaixaDePerigoSemInercia() {
        return tempoDuracaoFaixaDePerigoSemInercia;
    }

    /**
     * Define o valor da propriedade tempoDuracaoFaixaDePerigoSemInercia.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoDuracaoFaixaDePerigoSemInercia(Integer value) {
        this.tempoDuracaoFaixaDePerigoSemInercia = value;
    }

    /**
     * Obtém o valor da propriedade tempoDuracaoFaixaDeTransicaoComInercia.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoDuracaoFaixaDeTransicaoComInercia() {
        return tempoDuracaoFaixaDeTransicaoComInercia;
    }

    /**
     * Define o valor da propriedade tempoDuracaoFaixaDeTransicaoComInercia.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoDuracaoFaixaDeTransicaoComInercia(Integer value) {
        this.tempoDuracaoFaixaDeTransicaoComInercia = value;
    }

    /**
     * Obtém o valor da propriedade tempoDuracaoFaixaDeTransicaoSemInercia.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoDuracaoFaixaDeTransicaoSemInercia() {
        return tempoDuracaoFaixaDeTransicaoSemInercia;
    }

    /**
     * Define o valor da propriedade tempoDuracaoFaixaDeTransicaoSemInercia.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoDuracaoFaixaDeTransicaoSemInercia(Integer value) {
        this.tempoDuracaoFaixaDeTransicaoSemInercia = value;
    }

    /**
     * Obtém o valor da propriedade tempoDuracaoFaixaMarchaLenta.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoDuracaoFaixaMarchaLenta() {
        return tempoDuracaoFaixaMarchaLenta;
    }

    /**
     * Define o valor da propriedade tempoDuracaoFaixaMarchaLenta.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoDuracaoFaixaMarchaLenta(Integer value) {
        this.tempoDuracaoFaixaMarchaLenta = value;
    }

    /**
     * Obtém o valor da propriedade tempoDuracaoFaixaMarchaLentaComVelocidade.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoDuracaoFaixaMarchaLentaComVelocidade() {
        return tempoDuracaoFaixaMarchaLentaComVelocidade;
    }

    /**
     * Define o valor da propriedade tempoDuracaoFaixaMarchaLentaComVelocidade.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoDuracaoFaixaMarchaLentaComVelocidade(Integer value) {
        this.tempoDuracaoFaixaMarchaLentaComVelocidade = value;
    }

    /**
     * Obtém o valor da propriedade tempoDuracaoFaixaVerde.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoDuracaoFaixaVerde() {
        return tempoDuracaoFaixaVerde;
    }

    /**
     * Define o valor da propriedade tempoDuracaoFaixaVerde.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoDuracaoFaixaVerde(Integer value) {
        this.tempoDuracaoFaixaVerde = value;
    }

    /**
     * Obtém o valor da propriedade tempoDuracaoFaixaVerdeComInercia.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoDuracaoFaixaVerdeComInercia() {
        return tempoDuracaoFaixaVerdeComInercia;
    }

    /**
     * Define o valor da propriedade tempoDuracaoFaixaVerdeComInercia.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoDuracaoFaixaVerdeComInercia(Integer value) {
        this.tempoDuracaoFaixaVerdeComInercia = value;
    }

    /**
     * Obtém o valor da propriedade tempoDuracaoFaixaVerdeEconomicaComInercia.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoDuracaoFaixaVerdeEconomicaComInercia() {
        return tempoDuracaoFaixaVerdeEconomicaComInercia;
    }

    /**
     * Define o valor da propriedade tempoDuracaoFaixaVerdeEconomicaComInercia.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoDuracaoFaixaVerdeEconomicaComInercia(Integer value) {
        this.tempoDuracaoFaixaVerdeEconomicaComInercia = value;
    }

    /**
     * Obtém o valor da propriedade tempoDuracaoFaixaVerdeEconomicaSemInercia.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoDuracaoFaixaVerdeEconomicaSemInercia() {
        return tempoDuracaoFaixaVerdeEconomicaSemInercia;
    }

    /**
     * Define o valor da propriedade tempoDuracaoFaixaVerdeEconomicaSemInercia.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoDuracaoFaixaVerdeEconomicaSemInercia(Integer value) {
        this.tempoDuracaoFaixaVerdeEconomicaSemInercia = value;
    }

    /**
     * Obtém o valor da propriedade tempoDuracaoFaixaVerdeSemInercia.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoDuracaoFaixaVerdeSemInercia() {
        return tempoDuracaoFaixaVerdeSemInercia;
    }

    /**
     * Define o valor da propriedade tempoDuracaoFaixaVerdeSemInercia.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoDuracaoFaixaVerdeSemInercia(Integer value) {
        this.tempoDuracaoFaixaVerdeSemInercia = value;
    }

    /**
     * Obtém o valor da propriedade tempoDuracaoFaixaVermelha.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoDuracaoFaixaVermelha() {
        return tempoDuracaoFaixaVermelha;
    }

    /**
     * Define o valor da propriedade tempoDuracaoFaixaVermelha.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoDuracaoFaixaVermelha(Integer value) {
        this.tempoDuracaoFaixaVermelha = value;
    }

    /**
     * Obtém o valor da propriedade tempoDuracaoFreioMotor.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoDuracaoFreioMotor() {
        return tempoDuracaoFreioMotor;
    }

    /**
     * Define o valor da propriedade tempoDuracaoFreioMotor.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoDuracaoFreioMotor(Integer value) {
        this.tempoDuracaoFreioMotor = value;
    }

    /**
     * Obtém o valor da propriedade tempoDuracaoGiroMotor.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoDuracaoGiroMotor() {
        return tempoDuracaoGiroMotor;
    }

    /**
     * Define o valor da propriedade tempoDuracaoGiroMotor.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoDuracaoGiroMotor(Integer value) {
        this.tempoDuracaoGiroMotor = value;
    }

    /**
     * Obtém o valor da propriedade tempoDuracaoMovimento.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoDuracaoMovimento() {
        return tempoDuracaoMovimento;
    }

    /**
     * Define o valor da propriedade tempoDuracaoMovimento.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoDuracaoMovimento(Integer value) {
        this.tempoDuracaoMovimento = value;
    }

    /**
     * Obtém o valor da propriedade tempoDuracaoParado.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoDuracaoParado() {
        return tempoDuracaoParado;
    }

    /**
     * Define o valor da propriedade tempoDuracaoParado.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoDuracaoParado(Integer value) {
        this.tempoDuracaoParado = value;
    }

    /**
     * Obtém o valor da propriedade tempoDuracaoTotal.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoDuracaoTotal() {
        return tempoDuracaoTotal;
    }

    /**
     * Define o valor da propriedade tempoDuracaoTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoDuracaoTotal(Integer value) {
        this.tempoDuracaoTotal = value;
    }

    /**
     * Obtém o valor da propriedade tempoTotalComCinto.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoTotalComCinto() {
        return tempoTotalComCinto;
    }

    /**
     * Define o valor da propriedade tempoTotalComCinto.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoTotalComCinto(Integer value) {
        this.tempoTotalComCinto = value;
    }

    /**
     * Obtém o valor da propriedade tempoTotalFxAscendente.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoTotalFxAscendente() {
        return tempoTotalFxAscendente;
    }

    /**
     * Define o valor da propriedade tempoTotalFxAscendente.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoTotalFxAscendente(Integer value) {
        this.tempoTotalFxAscendente = value;
    }

    /**
     * Obtém o valor da propriedade tempoTotalFxDescendente.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoTotalFxDescendente() {
        return tempoTotalFxDescendente;
    }

    /**
     * Define o valor da propriedade tempoTotalFxDescendente.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoTotalFxDescendente(Integer value) {
        this.tempoTotalFxDescendente = value;
    }

    /**
     * Obtém o valor da propriedade tempoTotalFxEstavel.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTempoTotalFxEstavel() {
        return tempoTotalFxEstavel;
    }

    /**
     * Define o valor da propriedade tempoTotalFxEstavel.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTempoTotalFxEstavel(Integer value) {
        this.tempoTotalFxEstavel = value;
    }

    /**
     * Obtém o valor da propriedade tensaoMediaDaBateria.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTensaoMediaDaBateria() {
        return tensaoMediaDaBateria;
    }

    /**
     * Define o valor da propriedade tensaoMediaDaBateria.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTensaoMediaDaBateria(Integer value) {
        this.tensaoMediaDaBateria = value;
    }

    /**
     * Obtém o valor da propriedade tipoDelta.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTipoDelta() {
        return tipoDelta;
    }

    /**
     * Define o valor da propriedade tipoDelta.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTipoDelta(Integer value) {
        this.tipoDelta = value;
    }

    /**
     * Obtém o valor da propriedade velocidadeMaximaFaixaAmarela.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVelocidadeMaximaFaixaAmarela() {
        return velocidadeMaximaFaixaAmarela;
    }

    /**
     * Define o valor da propriedade velocidadeMaximaFaixaAmarela.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVelocidadeMaximaFaixaAmarela(Integer value) {
        this.velocidadeMaximaFaixaAmarela = value;
    }

    /**
     * Obtém o valor da propriedade velocidadeMedia.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVelocidadeMedia() {
        return velocidadeMedia;
    }

    /**
     * Define o valor da propriedade velocidadeMedia.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVelocidadeMedia(Integer value) {
        this.velocidadeMedia = value;
    }

}
