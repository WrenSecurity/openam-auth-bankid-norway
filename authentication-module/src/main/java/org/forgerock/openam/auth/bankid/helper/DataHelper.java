/**
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2016 ForgeRock AS. All Rights Reserved
 *
 * The contents of this file are subject to the terms
 * of the Common Development and Distribution License
 * (the License). You may not use this file except in
 * compliance with the License.
 *
 * You can obtain a copy of the License at legal/CDDLv1.0.txt.
 * See the License for the specific language governing
 * permission and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL
 * Header Notice in each file and include the License file at legal/CDDLv1.0.txt.
 * If applicable, add the following below the CDDL Header,
 * with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 *
 */

package org.forgerock.openam.auth.bankid.helper;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import no.bbs.server.vos.BIDSessionData;

public class DataHelper {
    @JsonProperty("helperURL")
    private String helperURL;

    @JsonProperty("cid")
    private String clientId;

    @JsonProperty("sid")
    private String sessionId;

    @JsonProperty("tid")
    private String traceId;

    @JsonProperty("marchant")
    private String marchantName;

    @JsonProperty("readSSN")
    private boolean readSSN;

    @JsonIgnore
    private BIDSessionData sessaionData;

    public DataHelper(String sessionid) {
        this.sessionId = sessionid;
    }

    public String toString() {
        try {
            return new ObjectMapper().writer().writeValueAsString(this);
        } catch (Exception ex) {
            return "{}";
        }

    }

    public String getHelperURL() {
        return helperURL;
    }

    public void setHelperURL(String helperURL) {
        this.helperURL = helperURL;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public String getMarchantName() {
        return marchantName;
    }

    public void setMarchantName(String marchantName) {
        this.marchantName = marchantName;
    }
    public BIDSessionData getSessaionData() {
        return sessaionData;
    }

    public void setSessaionData(BIDSessionData sessaionData) {
        this.sessaionData = sessaionData;
    }

    public boolean isReadSSN() {
        return readSSN;
    }

    public void setReadSSN(boolean readSSN) {
        this.readSSN = readSSN;
    }
}
