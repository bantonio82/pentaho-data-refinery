/*! ******************************************************************************
 *
 * Pentaho Community Edition Project: data-refinery-pdi-plugin
 *
 * Copyright (C) 2002-2017 by Hitachi Vantara : http://www.pentaho.com
 *
 * *******************************************************************************
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
 *
 ********************************************************************************/

package org.pentaho.di.core.refinery.publish.model;

/**
 * @author Rowell Belen
 */
public class ResponseStatus {

  private int status;
  private String message;

  public int getStatus() {
    return status;
  }

  public void setStatus( int status ) {
    this.status = status;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage( String message ) {
    this.message = message;
  }
}
