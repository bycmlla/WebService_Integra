
package br.com.sascar.integracao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de smartCamerasEvento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="smartCamerasEvento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deviceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="driver" type="{http://webservice.web.integracao.sascar.com.br/}smartCamerasMotorista" minOccurs="0"/>
 *         &lt;element name="eventType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="hwType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messageId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ntwkMedium" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payload" type="{http://webservice.web.integracao.sascar.com.br/}smartCamerasPayload" minOccurs="0"/>
 *         &lt;element name="pkDeviceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="plate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shadow" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "smartCamerasEvento", propOrder = {
    "deviceId",
    "driver",
    "eventType",
    "hwType",
    "id",
    "messageId",
    "ntwkMedium",
    "payload",
    "pkDeviceDate",
    "plate",
    "shadow",
    "timestamp"
})
public class SmartCamerasEvento {

    protected String deviceId;
    protected SmartCamerasMotorista driver;
    protected Integer eventType;
    protected String hwType;
    protected String id;
    protected Integer messageId;
    protected String ntwkMedium;
    protected SmartCamerasPayload payload;
    protected String pkDeviceDate;
    protected String plate;
    protected Integer shadow;
    protected String timestamp;

    /**
     * Obtém o valor da propriedade deviceId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * Define o valor da propriedade deviceId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceId(String value) {
        this.deviceId = value;
    }

    /**
     * Obtém o valor da propriedade driver.
     * 
     * @return
     *     possible object is
     *     {@link SmartCamerasMotorista }
     *     
     */
    public SmartCamerasMotorista getDriver() {
        return driver;
    }

    /**
     * Define o valor da propriedade driver.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartCamerasMotorista }
     *     
     */
    public void setDriver(SmartCamerasMotorista value) {
        this.driver = value;
    }

    /**
     * Obtém o valor da propriedade eventType.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEventType() {
        return eventType;
    }

    /**
     * Define o valor da propriedade eventType.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEventType(Integer value) {
        this.eventType = value;
    }

    /**
     * Obtém o valor da propriedade hwType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHwType() {
        return hwType;
    }

    /**
     * Define o valor da propriedade hwType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHwType(String value) {
        this.hwType = value;
    }

    /**
     * Obtém o valor da propriedade id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade messageId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMessageId() {
        return messageId;
    }

    /**
     * Define o valor da propriedade messageId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMessageId(Integer value) {
        this.messageId = value;
    }

    /**
     * Obtém o valor da propriedade ntwkMedium.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtwkMedium() {
        return ntwkMedium;
    }

    /**
     * Define o valor da propriedade ntwkMedium.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtwkMedium(String value) {
        this.ntwkMedium = value;
    }

    /**
     * Obtém o valor da propriedade payload.
     * 
     * @return
     *     possible object is
     *     {@link SmartCamerasPayload }
     *     
     */
    public SmartCamerasPayload getPayload() {
        return payload;
    }

    /**
     * Define o valor da propriedade payload.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartCamerasPayload }
     *     
     */
    public void setPayload(SmartCamerasPayload value) {
        this.payload = value;
    }

    /**
     * Obtém o valor da propriedade pkDeviceDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkDeviceDate() {
        return pkDeviceDate;
    }

    /**
     * Define o valor da propriedade pkDeviceDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkDeviceDate(String value) {
        this.pkDeviceDate = value;
    }

    /**
     * Obtém o valor da propriedade plate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlate() {
        return plate;
    }

    /**
     * Define o valor da propriedade plate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlate(String value) {
        this.plate = value;
    }

    /**
     * Obtém o valor da propriedade shadow.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShadow() {
        return shadow;
    }

    /**
     * Define o valor da propriedade shadow.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShadow(Integer value) {
        this.shadow = value;
    }

    /**
     * Obtém o valor da propriedade timestamp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * Define o valor da propriedade timestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimestamp(String value) {
        this.timestamp = value;
    }

}
