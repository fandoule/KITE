/*
 * Copyright 2017 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.webrtc.kite.exception;

/**
 * The KiteUnsupportedIntervalException is thrown if name of the interval is other than the
 * specified ones.
 */
public class KiteUnsupportedIntervalException extends Exception {

  private final String intervalName;
  
  /**
   * Constructs a KiteUnsupportedIntervalException with the specified interval name.
   *
   * @param intervalName name of the unsupported interval
   */
  public KiteUnsupportedIntervalException(String intervalName) {
    super();
    this.intervalName = intervalName;
  }
  
  /**
   * Gets interval name.
   *
   * @return the interval name
   */
  public String getIntervalName() {
    return intervalName;
  }

}
