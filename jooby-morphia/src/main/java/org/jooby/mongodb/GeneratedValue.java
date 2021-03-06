/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
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
package org.jooby.mongodb;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.mongodb.morphia.annotations.PrePersist;

/**
 * <p>
 * Make an ID autoincrement on {@link PrePersist} events.
 * </p>
 *
 * Usage:
 * <pre>
 * {
 *   use(new Monphia().idGen(IdGen.GLOBAL);
 * }
 * </pre>
 * <p>
 * ID must be of type: {@link Long} and annotated with {@link GeneratedValue}:
 * </p>
 * <pre>
 * &#64;Entity
 * public class MyEntity {
 *   &#64;Id &#64;GeneratedValue Long id;
 * }
 * </pre>
 *
 * @author edgar
 * @since 0.13.0
 */
@Target({METHOD, FIELD })
@Retention(RUNTIME)
public @interface GeneratedValue {
}
