/**
 * Licensed to jclouds, Inc. (jclouds) under one or more
 * contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  jclouds licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.jclouds.tmrk.enterprisecloud.features;

import org.jclouds.concurrent.Timeout;
import org.jclouds.tmrk.enterprisecloud.domain.network.NetworkReference;
import org.jclouds.tmrk.enterprisecloud.domain.network.Networks;

import java.net.URI;
import java.util.concurrent.TimeUnit;

/**
 * Provides synchronous access to various Resources.
 * <p/>
 * 
 * @see org.jclouds.tmrk.enterprisecloud.features.NetworkAsyncClient
 * @see <a href=
 *      "http://support.theenterprisecloud.com/kb/default.asp?id=984&Lang=1&SID="
 *      />
 * @author Jason King
 */
@Timeout(duration = 180, timeUnit = TimeUnit.SECONDS)
public interface NetworkClient {

   /**
    * The Get Networks call returns information regarding networks in an environment.

    * @param uri the uri of the call based upon the environment
    * e.g. /cloudapi/ecloud/networks/environments/{id}
    * @return the Networks
    */
   public Networks getNetworks(URI uri);

   /**
    * The Get Networks by ID call returns information regarding the usage of all
    * IP addresses on a specified network defined in an environment.

    * @param uri the uri of the call based upon the network
    * e.g. /cloudapi/ecloud/networks/{id}
    * @return the NetworkReference
    */
   public NetworkReference getNetwork(URI uri);

}