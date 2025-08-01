/*
 * Copyright contributors to Besu.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.besu.util.io;

import java.io.BufferedInputStream;
import java.io.InputStream;

/** Factory for constructing InputStreams */
public class InputStreamFactory {

  /** Constructs an InputStreamFactory */
  public InputStreamFactory() {}

  /**
   * Create a BufferedInputStream wrapping the supplied inputStream
   *
   * @param inputStream The InputStream to be wrapped by the constructed BufferedInputStream
   * @return a BufferedInputStream wrapping the supplied inputStream
   */
  public BufferedInputStream wrapInBufferedInputStream(final InputStream inputStream) {
    return new BufferedInputStream(inputStream);
  }
}
