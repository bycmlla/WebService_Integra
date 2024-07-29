
package br.com.sascar.integracao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de veiculo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="veiculo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ccid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="esn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idAtuador1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idAtuador2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idAtuador3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idAtuador4" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idAtuador5" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idAtuador6" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idAtuador7" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idAtuador8" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idCliente" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idContratoCliente" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idEquipamento" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="idEquipamentoDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idLayout" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idProjeto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idSensor1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idSensor2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idSensor3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idSensor4" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idSensor5" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idSensor6" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idSensor7" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idSensor8" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idSerial0" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idSerial1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="idVeiculo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="placa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="portaBloqueio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="portaPanico" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="satelital" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sensorUmidadeTemperatura" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="telemetria" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "veiculo", propOrder = {
    "ccid",
    "descricao",
    "esn",
    "idAtuador1",
    "idAtuador2",
    "idAtuador3",
    "idAtuador4",
    "idAtuador5",
    "idAtuador6",
    "idAtuador7",
    "idAtuador8",
    "idCliente",
    "idContratoCliente",
    "idEquipamento",
    "idEquipamentoDesc",
    "idLayout",
    "idProjeto",
    "idSensor1",
    "idSensor2",
    "idSensor3",
    "idSensor4",
    "idSensor5",
    "idSensor6",
    "idSensor7",
    "idSensor8",
    "idSerial0",
    "idSerial1",
    "idVeiculo",
    "placa",
    "portaBloqueio",
    "portaPanico",
    "satelital",
    "sensorUmidadeTemperatura",
    "telemetria"
})
public class Veiculo {

    protected String ccid;
    protected String descricao;
    protected String esn;
    protected Integer idAtuador1;
    protected Integer idAtuador2;
    protected Integer idAtuador3;
    protected Integer idAtuador4;
    protected Integer idAtuador5;
    protected Integer idAtuador6;
    protected Integer idAtuador7;
    protected Integer idAtuador8;
    protected Integer idCliente;
    protected Integer idContratoCliente;
    protected Long idEquipamento;
    protected String idEquipamentoDesc;
    protected Integer idLayout;
    protected Integer idProjeto;
    protected Integer idSensor1;
    protected Integer idSensor2;
    protected Integer idSensor3;
    protected Integer idSensor4;
    protected Integer idSensor5;
    protected Integer idSensor6;
    protected Integer idSensor7;
    protected Integer idSensor8;
    protected Integer idSerial0;
    protected Integer idSerial1;
    protected Integer idVeiculo;
    protected String placa;
    protected Integer portaBloqueio;
    protected Integer portaPanico;
    protected boolean satelital;
    protected Boolean sensorUmidadeTemperatura;
    protected boolean telemetria;

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
     * Obtém o valor da propriedade descricao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define o valor da propriedade descricao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

    /**
     * Obtém o valor da propriedade esn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsn() {
        return esn;
    }

    /**
     * Define o valor da propriedade esn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsn(String value) {
        this.esn = value;
    }

    /**
     * Obtém o valor da propriedade idAtuador1.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdAtuador1() {
        return idAtuador1;
    }

    /**
     * Define o valor da propriedade idAtuador1.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdAtuador1(Integer value) {
        this.idAtuador1 = value;
    }

    /**
     * Obtém o valor da propriedade idAtuador2.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdAtuador2() {
        return idAtuador2;
    }

    /**
     * Define o valor da propriedade idAtuador2.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdAtuador2(Integer value) {
        this.idAtuador2 = value;
    }

    /**
     * Obtém o valor da propriedade idAtuador3.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdAtuador3() {
        return idAtuador3;
    }

    /**
     * Define o valor da propriedade idAtuador3.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdAtuador3(Integer value) {
        this.idAtuador3 = value;
    }

    /**
     * Obtém o valor da propriedade idAtuador4.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdAtuador4() {
        return idAtuador4;
    }

    /**
     * Define o valor da propriedade idAtuador4.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdAtuador4(Integer value) {
        this.idAtuador4 = value;
    }

    /**
     * Obtém o valor da propriedade idAtuador5.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdAtuador5() {
        return idAtuador5;
    }

    /**
     * Define o valor da propriedade idAtuador5.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdAtuador5(Integer value) {
        this.idAtuador5 = value;
    }

    /**
     * Obtém o valor da propriedade idAtuador6.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdAtuador6() {
        return idAtuador6;
    }

    /**
     * Define o valor da propriedade idAtuador6.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdAtuador6(Integer value) {
        this.idAtuador6 = value;
    }

    /**
     * Obtém o valor da propriedade idAtuador7.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdAtuador7() {
        return idAtuador7;
    }

    /**
     * Define o valor da propriedade idAtuador7.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdAtuador7(Integer value) {
        this.idAtuador7 = value;
    }

    /**
     * Obtém o valor da propriedade idAtuador8.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdAtuador8() {
        return idAtuador8;
    }

    /**
     * Define o valor da propriedade idAtuador8.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdAtuador8(Integer value) {
        this.idAtuador8 = value;
    }

    /**
     * Obtém o valor da propriedade idCliente.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdCliente() {
        return idCliente;
    }

    /**
     * Define o valor da propriedade idCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdCliente(Integer value) {
        this.idCliente = value;
    }

    /**
     * Obtém o valor da propriedade idContratoCliente.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdContratoCliente() {
        return idContratoCliente;
    }

    /**
     * Define o valor da propriedade idContratoCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdContratoCliente(Integer value) {
        this.idContratoCliente = value;
    }

    /**
     * Obtém o valor da propriedade idEquipamento.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdEquipamento() {
        return idEquipamento;
    }

    /**
     * Define o valor da propriedade idEquipamento.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdEquipamento(Long value) {
        this.idEquipamento = value;
    }

    /**
     * Obtém o valor da propriedade idEquipamentoDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdEquipamentoDesc() {
        return idEquipamentoDesc;
    }

    /**
     * Define o valor da propriedade idEquipamentoDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdEquipamentoDesc(String value) {
        this.idEquipamentoDesc = value;
    }

    /**
     * Obtém o valor da propriedade idLayout.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdLayout() {
        return idLayout;
    }

    /**
     * Define o valor da propriedade idLayout.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdLayout(Integer value) {
        this.idLayout = value;
    }

    /**
     * Obtém o valor da propriedade idProjeto.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdProjeto() {
        return idProjeto;
    }

    /**
     * Define o valor da propriedade idProjeto.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdProjeto(Integer value) {
        this.idProjeto = value;
    }

    /**
     * Obtém o valor da propriedade idSensor1.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdSensor1() {
        return idSensor1;
    }

    /**
     * Define o valor da propriedade idSensor1.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdSensor1(Integer value) {
        this.idSensor1 = value;
    }

    /**
     * Obtém o valor da propriedade idSensor2.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdSensor2() {
        return idSensor2;
    }

    /**
     * Define o valor da propriedade idSensor2.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdSensor2(Integer value) {
        this.idSensor2 = value;
    }

    /**
     * Obtém o valor da propriedade idSensor3.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdSensor3() {
        return idSensor3;
    }

    /**
     * Define o valor da propriedade idSensor3.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdSensor3(Integer value) {
        this.idSensor3 = value;
    }

    /**
     * Obtém o valor da propriedade idSensor4.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdSensor4() {
        return idSensor4;
    }

    /**
     * Define o valor da propriedade idSensor4.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdSensor4(Integer value) {
        this.idSensor4 = value;
    }

    /**
     * Obtém o valor da propriedade idSensor5.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdSensor5() {
        return idSensor5;
    }

    /**
     * Define o valor da propriedade idSensor5.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdSensor5(Integer value) {
        this.idSensor5 = value;
    }

    /**
     * Obtém o valor da propriedade idSensor6.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdSensor6() {
        return idSensor6;
    }

    /**
     * Define o valor da propriedade idSensor6.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdSensor6(Integer value) {
        this.idSensor6 = value;
    }

    /**
     * Obtém o valor da propriedade idSensor7.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdSensor7() {
        return idSensor7;
    }

    /**
     * Define o valor da propriedade idSensor7.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdSensor7(Integer value) {
        this.idSensor7 = value;
    }

    /**
     * Obtém o valor da propriedade idSensor8.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdSensor8() {
        return idSensor8;
    }

    /**
     * Define o valor da propriedade idSensor8.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdSensor8(Integer value) {
        this.idSensor8 = value;
    }

    /**
     * Obtém o valor da propriedade idSerial0.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdSerial0() {
        return idSerial0;
    }

    /**
     * Define o valor da propriedade idSerial0.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdSerial0(Integer value) {
        this.idSerial0 = value;
    }

    /**
     * Obtém o valor da propriedade idSerial1.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdSerial1() {
        return idSerial1;
    }

    /**
     * Define o valor da propriedade idSerial1.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdSerial1(Integer value) {
        this.idSerial1 = value;
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
     * Obtém o valor da propriedade portaBloqueio.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPortaBloqueio() {
        return portaBloqueio;
    }

    /**
     * Define o valor da propriedade portaBloqueio.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPortaBloqueio(Integer value) {
        this.portaBloqueio = value;
    }

    /**
     * Obtém o valor da propriedade portaPanico.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPortaPanico() {
        return portaPanico;
    }

    /**
     * Define o valor da propriedade portaPanico.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPortaPanico(Integer value) {
        this.portaPanico = value;
    }

    /**
     * Obtém o valor da propriedade satelital.
     * 
     */
    public boolean isSatelital() {
        return satelital;
    }

    /**
     * Define o valor da propriedade satelital.
     * 
     */
    public void setSatelital(boolean value) {
        this.satelital = value;
    }

    /**
     * Obtém o valor da propriedade sensorUmidadeTemperatura.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSensorUmidadeTemperatura() {
        return sensorUmidadeTemperatura;
    }

    /**
     * Define o valor da propriedade sensorUmidadeTemperatura.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSensorUmidadeTemperatura(Boolean value) {
        this.sensorUmidadeTemperatura = value;
    }

    /**
     * Obtém o valor da propriedade telemetria.
     * 
     */
    public boolean isTelemetria() {
        return telemetria;
    }

    /**
     * Define o valor da propriedade telemetria.
     * 
     */
    public void setTelemetria(boolean value) {
        this.telemetria = value;
    }

}
