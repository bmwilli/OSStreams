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

package com.ibm.streams.instance.sam.model.logical.spl;

import com.ibm.streams.instance.sam.exception.SubmissionParameterError;
import java.math.BigInteger;

public class SubmittableIntegerValue {

  private final transient BigInteger value;
  private transient BigInteger overlayValue;
  private final transient BigInteger submissionTimeIndex;
  private final transient SPLLogicalModel model;

  public SubmittableIntegerValue(
      BigInteger value, BigInteger submissionTimeIndex, SPLLogicalModel model) {
    this.value = value;
    this.submissionTimeIndex = submissionTimeIndex;
    this.model = model;
    this.overlayValue = null;
  }

  public BigInteger value() throws SubmissionParameterError {
    // values provided as job overlays take highest precedence;
    // submission time values take precedence over constant values;
    // constant values have lowest precedence
    if (overlayValue != null) {
      return overlayValue;
    } else if (submissionTimeIndex != null) {
      SubmissionTimeValue v = model.getSubmissionTimeValues().get(submissionTimeIndex);
      try {
        // value will have quotes around it
        String value = v.getValue();
        return new BigInteger(value.substring(1, value.length() - 1));
      } catch (NumberFormatException e) {
        throw new SubmissionParameterError(v.getName());
      }
    }
    assert (value != null);
    return value;
  }

  public void setOverlayValue(BigInteger bi) {
    overlayValue = bi;
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    if (overlayValue != null) {
      sb.append("overlayValue=\"" + overlayValue + "\"");
    } else if (value != null) {
      sb.append(value);
    } else {
      assert (submissionTimeIndex != null);
      sb.append("submissionTimeIndex=\"" + submissionTimeIndex + "\"");
    }
    return sb.toString();
  }
}
