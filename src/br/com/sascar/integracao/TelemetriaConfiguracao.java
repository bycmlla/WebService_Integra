
package br.com.sascar.integracao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de telemetriaConfiguracao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="telemetriaConfiguracao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arrancadaBruscaSensibilidadeInfracao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="banguelaSensibilidadeInfracao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="banguelaVelocidadeMinima" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="buzzerEstadoEvento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="defeitoAlternadorSensibilidadeInfracao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="defeitoAlternadorTensaoMaxima" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="defeitoAlternadorTensaoMinima" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="defeitoAlternadorTensaoNormalOperacao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="excessoTempoParadoSensibilidadeInfracao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="excessoVelocidadeMaximaRodoviarioComChuva" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="excessoVelocidadeMaximaRodoviarioSemChuva" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="excessoVelocidadeMaximaTrechoUrbanoComChuva" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="excessoVelocidadeMaximaTrechoUrbanoSemChuva" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="excessoVelocidadeSensibilidadeInfracao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="faixaAzulLimitSuperior" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="faixaAzulLimiteInferior" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="faixaVerdeLimiteInferior" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="faixaVerdeLimiteSuperior" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="faixaVermelhaLimite" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fimChuvaSensibilidadeInfracao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="freadaBruscaSensibilidadeInfracao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="freadaPeFreio" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="freadaVelocidadeMinima" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ignicaoExessivaSensibilidadeInfracao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="inicioChuvaSensibilidadeInfracao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="marchaLentaExessivaSensibilidadeInfracao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="peEmbreagemSensibilidadeInfracao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pressaoOleoSensibilidadeInfracao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="rotacaoSensibilidadeInfracao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tipoVeiculo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "telemetriaConfiguracao", propOrder = {
    "arrancadaBruscaSensibilidadeInfracao",
    "banguelaSensibilidadeInfracao",
    "banguelaVelocidadeMinima",
    "buzzerEstadoEvento",
    "defeitoAlternadorSensibilidadeInfracao",
    "defeitoAlternadorTensaoMaxima",
    "defeitoAlternadorTensaoMinima",
    "defeitoAlternadorTensaoNormalOperacao",
    "excessoTempoParadoSensibilidadeInfracao",
    "excessoVelocidadeMaximaRodoviarioComChuva",
    "excessoVelocidadeMaximaRodoviarioSemChuva",
    "excessoVelocidadeMaximaTrechoUrbanoComChuva",
    "excessoVelocidadeMaximaTrechoUrbanoSemChuva",
    "excessoVelocidadeSensibilidadeInfracao",
    "faixaAzulLimitSuperior",
    "faixaAzulLimiteInferior",
    "faixaVerdeLimiteInferior",
    "faixaVerdeLimiteSuperior",
    "faixaVermelhaLimite",
    "fimChuvaSensibilidadeInfracao",
    "freadaBruscaSensibilidadeInfracao",
    "freadaPeFreio",
    "freadaVelocidadeMinima",
    "ignicaoExessivaSensibilidadeInfracao",
    "inicioChuvaSensibilidadeInfracao",
    "marchaLentaExessivaSensibilidadeInfracao",
    "peEmbreagemSensibilidadeInfracao",
    "pressaoOleoSensibilidadeInfracao",
    "rotacaoSensibilidadeInfracao",
    "tipoVeiculo"
})
public class TelemetriaConfiguracao {

    protected Integer arrancadaBruscaSensibilidadeInfracao;
    protected Integer banguelaSensibilidadeInfracao;
    protected Integer banguelaVelocidadeMinima;
    protected Integer buzzerEstadoEvento;
    protected Integer defeitoAlternadorSensibilidadeInfracao;
    protected Float defeitoAlternadorTensaoMaxima;
    protected Float defeitoAlternadorTensaoMinima;
    protected Integer defeitoAlternadorTensaoNormalOperacao;
    protected Integer excessoTempoParadoSensibilidadeInfracao;
    protected Integer excessoVelocidadeMaximaRodoviarioComChuva;
    protected Integer excessoVelocidadeMaximaRodoviarioSemChuva;
    protected Integer excessoVelocidadeMaximaTrechoUrbanoComChuva;
    protected Integer excessoVelocidadeMaximaTrechoUrbanoSemChuva;
    protected Integer excessoVelocidadeSensibilidadeInfracao;
    protected Integer faixaAzulLimitSuperior;
    protected Integer faixaAzulLimiteInferior;
    protected Integer faixaVerdeLimiteInferior;
    protected Integer faixaVerdeLimiteSuperior;
    protected Integer faixaVermelhaLimite;
    protected Integer fimChuvaSensibilidadeInfracao;
    protected Integer freadaBruscaSensibilidadeInfracao;
    protected Boolean freadaPeFreio;
    protected Integer freadaVelocidadeMinima;
    protected Integer ignicaoExessivaSensibilidadeInfracao;
    protected Integer inicioChuvaSensibilidadeInfracao;
    protected Integer marchaLentaExessivaSensibilidadeInfracao;
    protected Integer peEmbreagemSensibilidadeInfracao;
    protected Integer pressaoOleoSensibilidadeInfracao;
    protected Integer rotacaoSensibilidadeInfracao;
    protected String tipoVeiculo;

    /**
     * Obtém o valor da propriedade arrancadaBruscaSensibilidadeInfracao.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getArrancadaBruscaSensibilidadeInfracao() {
        return arrancadaBruscaSensibilidadeInfracao;
    }

    /**
     * Define o valor da propriedade arrancadaBruscaSensibilidadeInfracao.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setArrancadaBruscaSensibilidadeInfracao(Integer value) {
        this.arrancadaBruscaSensibilidadeInfracao = value;
    }

    /**
     * Obtém o valor da propriedade banguelaSensibilidadeInfracao.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBanguelaSensibilidadeInfracao() {
        return banguelaSensibilidadeInfracao;
    }

    /**
     * Define o valor da propriedade banguelaSensibilidadeInfracao.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBanguelaSensibilidadeInfracao(Integer value) {
        this.banguelaSensibilidadeInfracao = value;
    }

    /**
     * Obtém o valor da propriedade banguelaVelocidadeMinima.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBanguelaVelocidadeMinima() {
        return banguelaVelocidadeMinima;
    }

    /**
     * Define o valor da propriedade banguelaVelocidadeMinima.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBanguelaVelocidadeMinima(Integer value) {
        this.banguelaVelocidadeMinima = value;
    }

    /**
     * Obtém o valor da propriedade buzzerEstadoEvento.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBuzzerEstadoEvento() {
        return buzzerEstadoEvento;
    }

    /**
     * Define o valor da propriedade buzzerEstadoEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBuzzerEstadoEvento(Integer value) {
        this.buzzerEstadoEvento = value;
    }

    /**
     * Obtém o valor da propriedade defeitoAlternadorSensibilidadeInfracao.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDefeitoAlternadorSensibilidadeInfracao() {
        return defeitoAlternadorSensibilidadeInfracao;
    }

    /**
     * Define o valor da propriedade defeitoAlternadorSensibilidadeInfracao.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDefeitoAlternadorSensibilidadeInfracao(Integer value) {
        this.defeitoAlternadorSensibilidadeInfracao = value;
    }

    /**
     * Obtém o valor da propriedade defeitoAlternadorTensaoMaxima.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDefeitoAlternadorTensaoMaxima() {
        return defeitoAlternadorTensaoMaxima;
    }

    /**
     * Define o valor da propriedade defeitoAlternadorTensaoMaxima.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDefeitoAlternadorTensaoMaxima(Float value) {
        this.defeitoAlternadorTensaoMaxima = value;
    }

    /**
     * Obtém o valor da propriedade defeitoAlternadorTensaoMinima.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDefeitoAlternadorTensaoMinima() {
        return defeitoAlternadorTensaoMinima;
    }

    /**
     * Define o valor da propriedade defeitoAlternadorTensaoMinima.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDefeitoAlternadorTensaoMinima(Float value) {
        this.defeitoAlternadorTensaoMinima = value;
    }

    /**
     * Obtém o valor da propriedade defeitoAlternadorTensaoNormalOperacao.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDefeitoAlternadorTensaoNormalOperacao() {
        return defeitoAlternadorTensaoNormalOperacao;
    }

    /**
     * Define o valor da propriedade defeitoAlternadorTensaoNormalOperacao.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDefeitoAlternadorTensaoNormalOperacao(Integer value) {
        this.defeitoAlternadorTensaoNormalOperacao = value;
    }

    /**
     * Obtém o valor da propriedade excessoTempoParadoSensibilidadeInfracao.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExcessoTempoParadoSensibilidadeInfracao() {
        return excessoTempoParadoSensibilidadeInfracao;
    }

    /**
     * Define o valor da propriedade excessoTempoParadoSensibilidadeInfracao.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExcessoTempoParadoSensibilidadeInfracao(Integer value) {
        this.excessoTempoParadoSensibilidadeInfracao = value;
    }

    /**
     * Obtém o valor da propriedade excessoVelocidadeMaximaRodoviarioComChuva.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExcessoVelocidadeMaximaRodoviarioComChuva() {
        return excessoVelocidadeMaximaRodoviarioComChuva;
    }

    /**
     * Define o valor da propriedade excessoVelocidadeMaximaRodoviarioComChuva.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExcessoVelocidadeMaximaRodoviarioComChuva(Integer value) {
        this.excessoVelocidadeMaximaRodoviarioComChuva = value;
    }

    /**
     * Obtém o valor da propriedade excessoVelocidadeMaximaRodoviarioSemChuva.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExcessoVelocidadeMaximaRodoviarioSemChuva() {
        return excessoVelocidadeMaximaRodoviarioSemChuva;
    }

    /**
     * Define o valor da propriedade excessoVelocidadeMaximaRodoviarioSemChuva.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExcessoVelocidadeMaximaRodoviarioSemChuva(Integer value) {
        this.excessoVelocidadeMaximaRodoviarioSemChuva = value;
    }

    /**
     * Obtém o valor da propriedade excessoVelocidadeMaximaTrechoUrbanoComChuva.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExcessoVelocidadeMaximaTrechoUrbanoComChuva() {
        return excessoVelocidadeMaximaTrechoUrbanoComChuva;
    }

    /**
     * Define o valor da propriedade excessoVelocidadeMaximaTrechoUrbanoComChuva.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExcessoVelocidadeMaximaTrechoUrbanoComChuva(Integer value) {
        this.excessoVelocidadeMaximaTrechoUrbanoComChuva = value;
    }

    /**
     * Obtém o valor da propriedade excessoVelocidadeMaximaTrechoUrbanoSemChuva.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExcessoVelocidadeMaximaTrechoUrbanoSemChuva() {
        return excessoVelocidadeMaximaTrechoUrbanoSemChuva;
    }

    /**
     * Define o valor da propriedade excessoVelocidadeMaximaTrechoUrbanoSemChuva.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExcessoVelocidadeMaximaTrechoUrbanoSemChuva(Integer value) {
        this.excessoVelocidadeMaximaTrechoUrbanoSemChuva = value;
    }

    /**
     * Obtém o valor da propriedade excessoVelocidadeSensibilidadeInfracao.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExcessoVelocidadeSensibilidadeInfracao() {
        return excessoVelocidadeSensibilidadeInfracao;
    }

    /**
     * Define o valor da propriedade excessoVelocidadeSensibilidadeInfracao.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExcessoVelocidadeSensibilidadeInfracao(Integer value) {
        this.excessoVelocidadeSensibilidadeInfracao = value;
    }

    /**
     * Obtém o valor da propriedade faixaAzulLimitSuperior.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFaixaAzulLimitSuperior() {
        return faixaAzulLimitSuperior;
    }

    /**
     * Define o valor da propriedade faixaAzulLimitSuperior.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFaixaAzulLimitSuperior(Integer value) {
        this.faixaAzulLimitSuperior = value;
    }

    /**
     * Obtém o valor da propriedade faixaAzulLimiteInferior.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFaixaAzulLimiteInferior() {
        return faixaAzulLimiteInferior;
    }

    /**
     * Define o valor da propriedade faixaAzulLimiteInferior.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFaixaAzulLimiteInferior(Integer value) {
        this.faixaAzulLimiteInferior = value;
    }

    /**
     * Obtém o valor da propriedade faixaVerdeLimiteInferior.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFaixaVerdeLimiteInferior() {
        return faixaVerdeLimiteInferior;
    }

    /**
     * Define o valor da propriedade faixaVerdeLimiteInferior.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFaixaVerdeLimiteInferior(Integer value) {
        this.faixaVerdeLimiteInferior = value;
    }

    /**
     * Obtém o valor da propriedade faixaVerdeLimiteSuperior.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFaixaVerdeLimiteSuperior() {
        return faixaVerdeLimiteSuperior;
    }

    /**
     * Define o valor da propriedade faixaVerdeLimiteSuperior.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFaixaVerdeLimiteSuperior(Integer value) {
        this.faixaVerdeLimiteSuperior = value;
    }

    /**
     * Obtém o valor da propriedade faixaVermelhaLimite.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFaixaVermelhaLimite() {
        return faixaVermelhaLimite;
    }

    /**
     * Define o valor da propriedade faixaVermelhaLimite.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFaixaVermelhaLimite(Integer value) {
        this.faixaVermelhaLimite = value;
    }

    /**
     * Obtém o valor da propriedade fimChuvaSensibilidadeInfracao.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFimChuvaSensibilidadeInfracao() {
        return fimChuvaSensibilidadeInfracao;
    }

    /**
     * Define o valor da propriedade fimChuvaSensibilidadeInfracao.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFimChuvaSensibilidadeInfracao(Integer value) {
        this.fimChuvaSensibilidadeInfracao = value;
    }

    /**
     * Obtém o valor da propriedade freadaBruscaSensibilidadeInfracao.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFreadaBruscaSensibilidadeInfracao() {
        return freadaBruscaSensibilidadeInfracao;
    }

    /**
     * Define o valor da propriedade freadaBruscaSensibilidadeInfracao.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFreadaBruscaSensibilidadeInfracao(Integer value) {
        this.freadaBruscaSensibilidadeInfracao = value;
    }

    /**
     * Obtém o valor da propriedade freadaPeFreio.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFreadaPeFreio() {
        return freadaPeFreio;
    }

    /**
     * Define o valor da propriedade freadaPeFreio.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFreadaPeFreio(Boolean value) {
        this.freadaPeFreio = value;
    }

    /**
     * Obtém o valor da propriedade freadaVelocidadeMinima.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFreadaVelocidadeMinima() {
        return freadaVelocidadeMinima;
    }

    /**
     * Define o valor da propriedade freadaVelocidadeMinima.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFreadaVelocidadeMinima(Integer value) {
        this.freadaVelocidadeMinima = value;
    }

    /**
     * Obtém o valor da propriedade ignicaoExessivaSensibilidadeInfracao.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIgnicaoExessivaSensibilidadeInfracao() {
        return ignicaoExessivaSensibilidadeInfracao;
    }

    /**
     * Define o valor da propriedade ignicaoExessivaSensibilidadeInfracao.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIgnicaoExessivaSensibilidadeInfracao(Integer value) {
        this.ignicaoExessivaSensibilidadeInfracao = value;
    }

    /**
     * Obtém o valor da propriedade inicioChuvaSensibilidadeInfracao.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInicioChuvaSensibilidadeInfracao() {
        return inicioChuvaSensibilidadeInfracao;
    }

    /**
     * Define o valor da propriedade inicioChuvaSensibilidadeInfracao.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInicioChuvaSensibilidadeInfracao(Integer value) {
        this.inicioChuvaSensibilidadeInfracao = value;
    }

    /**
     * Obtém o valor da propriedade marchaLentaExessivaSensibilidadeInfracao.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMarchaLentaExessivaSensibilidadeInfracao() {
        return marchaLentaExessivaSensibilidadeInfracao;
    }

    /**
     * Define o valor da propriedade marchaLentaExessivaSensibilidadeInfracao.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMarchaLentaExessivaSensibilidadeInfracao(Integer value) {
        this.marchaLentaExessivaSensibilidadeInfracao = value;
    }

    /**
     * Obtém o valor da propriedade peEmbreagemSensibilidadeInfracao.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPeEmbreagemSensibilidadeInfracao() {
        return peEmbreagemSensibilidadeInfracao;
    }

    /**
     * Define o valor da propriedade peEmbreagemSensibilidadeInfracao.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPeEmbreagemSensibilidadeInfracao(Integer value) {
        this.peEmbreagemSensibilidadeInfracao = value;
    }

    /**
     * Obtém o valor da propriedade pressaoOleoSensibilidadeInfracao.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPressaoOleoSensibilidadeInfracao() {
        return pressaoOleoSensibilidadeInfracao;
    }

    /**
     * Define o valor da propriedade pressaoOleoSensibilidadeInfracao.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPressaoOleoSensibilidadeInfracao(Integer value) {
        this.pressaoOleoSensibilidadeInfracao = value;
    }

    /**
     * Obtém o valor da propriedade rotacaoSensibilidadeInfracao.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRotacaoSensibilidadeInfracao() {
        return rotacaoSensibilidadeInfracao;
    }

    /**
     * Define o valor da propriedade rotacaoSensibilidadeInfracao.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRotacaoSensibilidadeInfracao(Integer value) {
        this.rotacaoSensibilidadeInfracao = value;
    }

    /**
     * Obtém o valor da propriedade tipoVeiculo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    /**
     * Define o valor da propriedade tipoVeiculo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoVeiculo(String value) {
        this.tipoVeiculo = value;
    }

}
