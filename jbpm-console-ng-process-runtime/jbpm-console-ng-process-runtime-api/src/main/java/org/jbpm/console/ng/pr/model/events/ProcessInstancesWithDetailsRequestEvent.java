/*
 * Copyright 2012 JBoss by Red Hat.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jbpm.console.ng.pr.model.events;

import org.jboss.errai.common.client.api.annotations.Portable;

@Portable
public class ProcessInstancesWithDetailsRequestEvent {
    private long processInstanceId;
    private String processDefId;
    private String deploymentId;
    

    public ProcessInstancesWithDetailsRequestEvent() {
    }

    public ProcessInstancesWithDetailsRequestEvent(String deploymentId, long processInstanceId, String processDefId) {
        this.processInstanceId = processInstanceId;
        this.processDefId = processDefId;
        this.deploymentId = deploymentId;
    }
    

    public long getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceId(long processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    public String getProcessDefId() {
        return processDefId;
    }

    public void setProcessDefId(String processDefId) {
        this.processDefId = processDefId;
    }

    public String getDeploymentId() {
        return deploymentId;
    }

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }





}
