//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.03 at 01:19:44 PM CDT 
//


package com.example.lachamba;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="empleado" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="apellido_paterno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="apellido_materno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "empleado"
})
@XmlRootElement(name = "EmpleadosRegistradosResponse")
public class EmpleadosRegistradosResponse {

    @XmlElement(required = true)
    protected List<EmpleadosRegistradosResponse.Empleado> empleado;

    /**
     * Gets the value of the empleado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the empleado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmpleado().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmpleadosRegistradosResponse.Empleado }
     * 
     * 
     */
    public List<EmpleadosRegistradosResponse.Empleado> getEmpleado() {
        if (empleado == null) {
            empleado = new ArrayList<EmpleadosRegistradosResponse.Empleado>();
        }
        return this.empleado;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="apellido_paterno" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="apellido_materno" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "id",
        "nombre",
        "apellidoPaterno",
        "apellidoMaterno"
    })
    public static class Empleado {

        protected int id;
        @XmlElement(required = true)
        protected String nombre;
        @XmlElement(name = "apellido_paterno", required = true)
        protected String apellidoPaterno;
        @XmlElement(name = "apellido_materno", required = true)
        protected String apellidoMaterno;

        /**
         * Gets the value of the id property.
         * 
         */
        public int getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         */
        public void setId(int value) {
            this.id = value;
        }

        /**
         * Gets the value of the nombre property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNombre() {
            return nombre;
        }

        /**
         * Sets the value of the nombre property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNombre(String value) {
            this.nombre = value;
        }

        /**
         * Gets the value of the apellidoPaterno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApellidoPaterno() {
            return apellidoPaterno;
        }

        /**
         * Sets the value of the apellidoPaterno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApellidoPaterno(String value) {
            this.apellidoPaterno = value;
        }

        /**
         * Gets the value of the apellidoMaterno property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApellidoMaterno() {
            return apellidoMaterno;
        }

        /**
         * Sets the value of the apellidoMaterno property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApellidoMaterno(String value) {
            this.apellidoMaterno = value;
        }

    }

}
