/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.tomitribe.tribestream.registryng.test.logging;

import org.apache.tomee.embedded.junit.TomEEEmbeddedSingleRunner;

import java.io.Closeable;

public class LoggingSetup implements TomEEEmbeddedSingleRunner.LifecycleTask {
    @Override
    public Closeable beforeContainerStartup() {
        System.setProperty("java.util.logging.SimpleFormatter.format", "[TOMEE  SERVER][%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS,%1$tL][%4$5s][%3$25s] %5$s%6$s%n");
        return () -> {
        };
    }
}
