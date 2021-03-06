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

/** */
package com.ibm.xmlns.prod.streams.spl.operator.impl;

import com.ibm.xmlns.prod.streams.spl.operator.InputPortOpenSetType;
import com.ibm.xmlns.prod.streams.spl.operator.InputPortSetType;
import com.ibm.xmlns.prod.streams.spl.operator.InputPortsType;
import com.ibm.xmlns.prod.streams.spl.operator.OperatorPackage;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 *
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Ports Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>The following features are implemented:
 *
 * <ul>
 *   <li>{@link com.ibm.xmlns.prod.streams.spl.operator.impl.InputPortsTypeImpl#getInputPortSet
 *       <em>Input Port Set</em>}
 *   <li>{@link com.ibm.xmlns.prod.streams.spl.operator.impl.InputPortsTypeImpl#getInputPortOpenSet
 *       <em>Input Port Open Set</em>}
 * </ul>
 *
 * @generated
 */
public class InputPortsTypeImpl extends MinimalEObjectImpl.Container implements InputPortsType {
  /**
   * The cached value of the '{@link #getInputPortSet() <em>Input Port Set</em>}' containment
   * reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @see #getInputPortSet()
   * @generated
   * @ordered
   */
  protected EList<InputPortSetType> inputPortSet;

  /**
   * The cached value of the '{@link #getInputPortOpenSet() <em>Input Port Open Set</em>}'
   * containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @see #getInputPortOpenSet()
   * @generated
   * @ordered
   */
  protected InputPortOpenSetType inputPortOpenSet;

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  protected InputPortsTypeImpl() {
    super();
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OperatorPackage.Literals.INPUT_PORTS_TYPE;
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public EList<InputPortSetType> getInputPortSet() {
    if (inputPortSet == null) {
      inputPortSet =
          new EObjectContainmentEList<InputPortSetType>(
              InputPortSetType.class, this, OperatorPackage.INPUT_PORTS_TYPE__INPUT_PORT_SET);
    }
    return inputPortSet;
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public InputPortOpenSetType getInputPortOpenSet() {
    return inputPortOpenSet;
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public NotificationChain basicSetInputPortOpenSet(
      InputPortOpenSetType newInputPortOpenSet, NotificationChain msgs) {
    InputPortOpenSetType oldInputPortOpenSet = inputPortOpenSet;
    inputPortOpenSet = newInputPortOpenSet;
    if (eNotificationRequired()) {
      ENotificationImpl notification =
          new ENotificationImpl(
              this,
              Notification.SET,
              OperatorPackage.INPUT_PORTS_TYPE__INPUT_PORT_OPEN_SET,
              oldInputPortOpenSet,
              newInputPortOpenSet);
      if (msgs == null) msgs = notification;
      else msgs.add(notification);
    }
    return msgs;
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public void setInputPortOpenSet(InputPortOpenSetType newInputPortOpenSet) {
    if (newInputPortOpenSet != inputPortOpenSet) {
      NotificationChain msgs = null;
      if (inputPortOpenSet != null)
        msgs =
            ((InternalEObject) inputPortOpenSet)
                .eInverseRemove(
                    this,
                    EOPPOSITE_FEATURE_BASE - OperatorPackage.INPUT_PORTS_TYPE__INPUT_PORT_OPEN_SET,
                    null,
                    msgs);
      if (newInputPortOpenSet != null)
        msgs =
            ((InternalEObject) newInputPortOpenSet)
                .eInverseAdd(
                    this,
                    EOPPOSITE_FEATURE_BASE - OperatorPackage.INPUT_PORTS_TYPE__INPUT_PORT_OPEN_SET,
                    null,
                    msgs);
      msgs = basicSetInputPortOpenSet(newInputPortOpenSet, msgs);
      if (msgs != null) msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(
          new ENotificationImpl(
              this,
              Notification.SET,
              OperatorPackage.INPUT_PORTS_TYPE__INPUT_PORT_OPEN_SET,
              newInputPortOpenSet,
              newInputPortOpenSet));
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(
      InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case OperatorPackage.INPUT_PORTS_TYPE__INPUT_PORT_SET:
        return ((InternalEList<?>) getInputPortSet()).basicRemove(otherEnd, msgs);
      case OperatorPackage.INPUT_PORTS_TYPE__INPUT_PORT_OPEN_SET:
        return basicSetInputPortOpenSet(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case OperatorPackage.INPUT_PORTS_TYPE__INPUT_PORT_SET:
        return getInputPortSet();
      case OperatorPackage.INPUT_PORTS_TYPE__INPUT_PORT_OPEN_SET:
        return getInputPortOpenSet();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case OperatorPackage.INPUT_PORTS_TYPE__INPUT_PORT_SET:
        getInputPortSet().clear();
        getInputPortSet().addAll((Collection<? extends InputPortSetType>) newValue);
        return;
      case OperatorPackage.INPUT_PORTS_TYPE__INPUT_PORT_OPEN_SET:
        setInputPortOpenSet((InputPortOpenSetType) newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public void eUnset(int featureID) {
    switch (featureID) {
      case OperatorPackage.INPUT_PORTS_TYPE__INPUT_PORT_SET:
        getInputPortSet().clear();
        return;
      case OperatorPackage.INPUT_PORTS_TYPE__INPUT_PORT_OPEN_SET:
        setInputPortOpenSet((InputPortOpenSetType) null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   *
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
      case OperatorPackage.INPUT_PORTS_TYPE__INPUT_PORT_SET:
        return inputPortSet != null && !inputPortSet.isEmpty();
      case OperatorPackage.INPUT_PORTS_TYPE__INPUT_PORT_OPEN_SET:
        return inputPortOpenSet != null;
    }
    return super.eIsSet(featureID);
  }
} // InputPortsTypeImpl
