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
package org.jooby.internal.undertow;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.jooby.spi.NativeUpload;

import io.undertow.server.handlers.form.FormData.FormValue;
import io.undertow.util.HeaderValues;

public class UndertowUpload implements NativeUpload {

  private FormValue value;

  public UndertowUpload(final FormValue value) {
    this.value = value;
  }

  @Override
  public void close() throws IOException {
    // undertow will delete the file, we don't have to worry about.
    file().delete();
  }

  @Override
  public String name() {
    return value.getFileName();
  }

  @Override
  public List<String> headers(final String name) {
    HeaderValues values = value.getHeaders().get(name);
    return values == null ? Collections.emptyList() : values;
  }

  @Override
  public File file() throws IOException {
    return value.getPath().toFile();
  }

}
