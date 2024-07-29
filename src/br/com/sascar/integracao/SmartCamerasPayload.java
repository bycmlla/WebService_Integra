
package br.com.sascar.integracao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de smartCamerasPayload complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="smartCamerasPayload">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="camera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="data_size" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="driver_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="event_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="file" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gps_valid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="num_cams" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="num_sats" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perclos_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perclos_value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="request_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resolution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="upload_duration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="video_duration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "smartCamerasPayload", propOrder = {
    "camera",
    "dataSize",
    "direction",
    "driverId",
    "eventId",
    "file",
    "gpsValid",
    "lat",
    "lon",
    "numCams",
    "numSats",
    "perclosId",
    "perclosValue",
    "requestId",
    "resolution",
    "timestamp",
    "uploadDuration",
    "vel",
    "videoDuration"
})
public class SmartCamerasPayload {

    protected String camera;
    @XmlElement(name = "data_size")
    protected String dataSize;
    protected String direction;
    @XmlElement(name = "driver_id")
    protected String driverId;
    @XmlElement(name = "event_id")
    protected String eventId;
    protected String file;
    @XmlElement(name = "gps_valid")
    protected String gpsValid;
    protected String lat;
    protected String lon;
    @XmlElement(name = "num_cams")
    protected String numCams;
    @XmlElement(name = "num_sats")
    protected String numSats;
    @XmlElement(name = "perclos_id")
    protected String perclosId;
    @XmlElement(name = "perclos_value")
    protected String perclosValue;
    @XmlElement(name = "request_id")
    protected String requestId;
    protected String resolution;
    protected String timestamp;
    @XmlElement(name = "upload_duration")
    protected String uploadDuration;
    protected String vel;
    @XmlElement(name = "video_duration")
    protected String videoDuration;

    /**
     * Obtém o valor da propriedade camera.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCamera() {
        return camera;
    }

    /**
     * Define o valor da propriedade camera.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCamera(String value) {
        this.camera = value;
    }

    /**
     * Obtém o valor da propriedade dataSize.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSize() {
        return dataSize;
    }

    /**
     * Define o valor da propriedade dataSize.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSize(String value) {
        this.dataSize = value;
    }

    /**
     * Obtém o valor da propriedade direction.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection() {
        return direction;
    }

    /**
     * Define o valor da propriedade direction.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection(String value) {
        this.direction = value;
    }

    /**
     * Obtém o valor da propriedade driverId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverId() {
        return driverId;
    }

    /**
     * Define o valor da propriedade driverId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverId(String value) {
        this.driverId = value;
    }

    /**
     * Obtém o valor da propriedade eventId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventId() {
        return eventId;
    }

    /**
     * Define o valor da propriedade eventId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventId(String value) {
        this.eventId = value;
    }

    /**
     * Obtém o valor da propriedade file.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFile() {
        return file;
    }

    /**
     * Define o valor da propriedade file.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFile(String value) {
        this.file = value;
    }

    /**
     * Obtém o valor da propriedade gpsValid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpsValid() {
        return gpsValid;
    }

    /**
     * Define o valor da propriedade gpsValid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpsValid(String value) {
        this.gpsValid = value;
    }

    /**
     * Obtém o valor da propriedade lat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLat() {
        return lat;
    }

    /**
     * Define o valor da propriedade lat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLat(String value) {
        this.lat = value;
    }

    /**
     * Obtém o valor da propriedade lon.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLon() {
        return lon;
    }

    /**
     * Define o valor da propriedade lon.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLon(String value) {
        this.lon = value;
    }

    /**
     * Obtém o valor da propriedade numCams.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumCams() {
        return numCams;
    }

    /**
     * Define o valor da propriedade numCams.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumCams(String value) {
        this.numCams = value;
    }

    /**
     * Obtém o valor da propriedade numSats.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumSats() {
        return numSats;
    }

    /**
     * Define o valor da propriedade numSats.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumSats(String value) {
        this.numSats = value;
    }

    /**
     * Obtém o valor da propriedade perclosId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerclosId() {
        return perclosId;
    }

    /**
     * Define o valor da propriedade perclosId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerclosId(String value) {
        this.perclosId = value;
    }

    /**
     * Obtém o valor da propriedade perclosValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerclosValue() {
        return perclosValue;
    }

    /**
     * Define o valor da propriedade perclosValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerclosValue(String value) {
        this.perclosValue = value;
    }

    /**
     * Obtém o valor da propriedade requestId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Define o valor da propriedade requestId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * Obtém o valor da propriedade resolution.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolution() {
        return resolution;
    }

    /**
     * Define o valor da propriedade resolution.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolution(String value) {
        this.resolution = value;
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

    /**
     * Obtém o valor da propriedade uploadDuration.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUploadDuration() {
        return uploadDuration;
    }

    /**
     * Define o valor da propriedade uploadDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUploadDuration(String value) {
        this.uploadDuration = value;
    }

    /**
     * Obtém o valor da propriedade vel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVel() {
        return vel;
    }

    /**
     * Define o valor da propriedade vel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVel(String value) {
        this.vel = value;
    }

    /**
     * Obtém o valor da propriedade videoDuration.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoDuration() {
        return videoDuration;
    }

    /**
     * Define o valor da propriedade videoDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoDuration(String value) {
        this.videoDuration = value;
    }

}
