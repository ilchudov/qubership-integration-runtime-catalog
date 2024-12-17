/*
 * Copyright 2024-2025 NetCracker Technology Corporation
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

package org.qubership.integration.platform.runtime.catalog.rest.v1.dto.deployment;

import org.qubership.integration.platform.catalog.model.dto.deployment.RuntimeDeploymentState;
import lombok.Data;

@Data
public class RuntimeDeploymentUpdate {

    private String id;
    private String engineHost;
    private RuntimeDeploymentState state;
    private String snapshotId;
    private String chainId;
    private String chainName;
    private String domain;
    private Long createdWhen;
    private String serviceName;
    private String chainStatusCode;
}
