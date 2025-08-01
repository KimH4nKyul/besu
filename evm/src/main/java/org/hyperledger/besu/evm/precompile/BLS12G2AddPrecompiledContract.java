/*
 * Copyright ConsenSys AG.
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
package org.hyperledger.besu.evm.precompile;

import org.hyperledger.besu.nativelib.gnark.LibGnarkEIP2537;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import org.apache.tuweni.bytes.Bytes;

/** The BLS12_G2 Add precompiled contract. */
public class BLS12G2AddPrecompiledContract extends AbstractBLS12PrecompiledContract {

  private static final int PARAMETER_LENGTH = 512;
  private static final Cache<Integer, PrecompileInputResultTuple> g2AddCache =
      Caffeine.newBuilder().maximumSize(1000).build();

  /** Instantiates a new BLS12_G2 Add precompiled contract. */
  BLS12G2AddPrecompiledContract() {
    super("BLS12_G2ADD", LibGnarkEIP2537.BLS12_G2ADD_OPERATION_SHIM_VALUE, PARAMETER_LENGTH);
  }

  @Override
  public long gasRequirement(final Bytes input) {
    return 600L;
  }

  @Override
  protected Cache<Integer, PrecompileInputResultTuple> getCache() {
    return g2AddCache;
  }
}
