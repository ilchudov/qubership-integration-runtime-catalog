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

package org.qubership.integration.platform.runtime.catalog.rest.v1.dto.systemscatalog;

import org.qubership.integration.platform.catalog.model.dto.user.UserDTO;
import org.qubership.integration.platform.catalog.model.system.IntegrationSystemType;
import lombok.Data;

@Data
public class SystemResponse {
    private String id;
    private String name;
    private IntegrationSystemType type;
    private String description;
    private String activeEnvironmentId;
    private String internalServiceName;
    private String protocol;
    private String extendedProtocol;
    private String specification;
    private Long createdWhen;
    private UserDTO createdBy;
    private Long modifiedWhen;
    private UserDTO modifiedBy;
}