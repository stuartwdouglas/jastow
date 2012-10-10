/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */


package org.apache.jasper.runtime;

import static org.apache.jasper.JasperMessages.MESSAGES;

import javax.servlet.ServletConfig;

import org.apache.tomcat.InstanceManager;

/**
 * @version $Rev: 986 $ $Date: 2009-04-06 14:12:17 +0200 (Mon, 06 Apr 2009) $
 */
public class InstanceManagerFactory {

    private InstanceManagerFactory() {
    }

    public static InstanceManager getInstanceManager(ServletConfig config) {
        InstanceManager instanceManager = 
        	(InstanceManager) config.getServletContext().getAttribute(InstanceManager.class.getName());
        if (instanceManager == null) {
            throw MESSAGES.noInstanceManager();
        }
        return instanceManager;
    }

}
