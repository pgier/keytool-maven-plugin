package org.codehaus.mojo.shared.keytool.requests;

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

/**
 * Request to change the key password of an entry using the KeyTool tool.
 *
 * @author tchemit <chemit@codelutin.com>
 * @since 1.0
 */
public class KeyToolChangeKeyPasswordRequest
    extends AbstractKeyToolRequestWithKeyStoreAndAliasParameters
{

    /**
     * New password.
     * <p/>
     * See <a href="http://java.sun.com/j2se/1.4.2/docs/tooldocs/windows/keytool.html#Commands">options</a>.
     */
    private String newPassword;

    /**
     * Key password.
     * <p/>
     * See <a href="http://java.sun.com/j2se/1.4.2/docs/tooldocs/windows/keytool.html#Commands">options</a>.
     */
    private String keypass;


    public KeyToolChangeKeyPasswordRequest()
    {
        super( "-keypasswd" );
    }

    /**
     * Gets the value of the {@link #newPassword} field.
     *
     * @return the value of the {@link #newPassword} field
     */
    public String getNewPassword()
    {
        return newPassword;
    }

    /**
     * @param newPassword value of the field {@link #newPassword} to set
     */
    public void setNewPassword( String newPassword )
    {
        this.newPassword = newPassword;
    }

    /**
     * Gets the value of the {@code keypass} field.
     *
     * @return the value of the {@code keypass} field.
     */
    public String getKeypass()
    {
        return keypass;
    }

    /**
     * Sets the new given value to the field {@code keypass} of the request.
     *
     * @param keypass the new value of the field {@code keypass}.
     */
    public void setKeypass( String keypass )
    {
        this.keypass = keypass;
    }
}
