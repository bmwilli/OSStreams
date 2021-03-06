/*
 * Copyright 2021 IBM Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation,
// v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2017.05.17 at 12:18:58 PM EDT
//

package com.ibm.streams.spl.model.tupletype;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for listOrSetType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="listOrSetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice minOccurs="0">
 *         &lt;element name="list" type="{http://www.ibm.com/xmlns/prod/streams/spl/tupleType}listOrSetType"/>
 *         &lt;element name="set" type="{http://www.ibm.com/xmlns/prod/streams/spl/tupleType}listOrSetType"/>
 *         &lt;element name="map" type="{http://www.ibm.com/xmlns/prod/streams/spl/tupleType}mapType"/>
 *         &lt;element name="tuple" type="{http://www.ibm.com/xmlns/prod/streams/spl/tupleType}tupleType"/>
 *         &lt;element name="optional" type="{http://www.ibm.com/xmlns/prod/streams/spl/tupleType}optionalType"/>
 *       &lt;/choice>
 *       &lt;attribute name="bound" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="elementType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "listOrSetType",
    propOrder = {"list", "set", "map", "tuple", "optional"})
public class ListOrSetType {

  protected ListOrSetType list;
  protected ListOrSetType set;
  protected MapType map;
  protected TupleType tuple;
  protected OptionalType optional;

  @XmlAttribute(name = "bound")
  protected Long bound;

  @XmlAttribute(name = "elementType")
  protected String elementType;

  /**
   * Gets the value of the list property.
   *
   * @return possible object is {@link ListOrSetType }
   */
  public ListOrSetType getList() {
    return list;
  }

  /**
   * Sets the value of the list property.
   *
   * @param value allowed object is {@link ListOrSetType }
   */
  public void setList(ListOrSetType value) {
    this.list = value;
  }

  /**
   * Gets the value of the set property.
   *
   * @return possible object is {@link ListOrSetType }
   */
  public ListOrSetType getSet() {
    return set;
  }

  /**
   * Sets the value of the set property.
   *
   * @param value allowed object is {@link ListOrSetType }
   */
  public void setSet(ListOrSetType value) {
    this.set = value;
  }

  /**
   * Gets the value of the map property.
   *
   * @return possible object is {@link MapType }
   */
  public MapType getMap() {
    return map;
  }

  /**
   * Sets the value of the map property.
   *
   * @param value allowed object is {@link MapType }
   */
  public void setMap(MapType value) {
    this.map = value;
  }

  /**
   * Gets the value of the tuple property.
   *
   * @return possible object is {@link TupleType }
   */
  public TupleType getTuple() {
    return tuple;
  }

  /**
   * Sets the value of the tuple property.
   *
   * @param value allowed object is {@link TupleType }
   */
  public void setTuple(TupleType value) {
    this.tuple = value;
  }

  /**
   * Gets the value of the optional property.
   *
   * @return possible object is {@link OptionalType }
   */
  public OptionalType getOptional() {
    return optional;
  }

  /**
   * Sets the value of the optional property.
   *
   * @param value allowed object is {@link OptionalType }
   */
  public void setOptional(OptionalType value) {
    this.optional = value;
  }

  /**
   * Gets the value of the bound property.
   *
   * @return possible object is {@link Long }
   */
  public Long getBound() {
    return bound;
  }

  /**
   * Sets the value of the bound property.
   *
   * @param value allowed object is {@link Long }
   */
  public void setBound(Long value) {
    this.bound = value;
  }

  /**
   * Gets the value of the elementType property.
   *
   * @return possible object is {@link String }
   */
  public String getElementType() {
    return elementType;
  }

  /**
   * Sets the value of the elementType property.
   *
   * @param value allowed object is {@link String }
   */
  public void setElementType(String value) {
    this.elementType = value;
  }
}
