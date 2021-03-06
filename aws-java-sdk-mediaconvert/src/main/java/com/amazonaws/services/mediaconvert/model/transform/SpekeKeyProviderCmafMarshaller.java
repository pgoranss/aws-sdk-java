/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.mediaconvert.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediaconvert.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SpekeKeyProviderCmafMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SpekeKeyProviderCmafMarshaller {

    private static final MarshallingInfo<String> CERTIFICATEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("certificateArn").build();
    private static final MarshallingInfo<List> DASHSIGNALEDSYSTEMIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dashSignaledSystemIds").build();
    private static final MarshallingInfo<List> HLSSIGNALEDSYSTEMIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("hlsSignaledSystemIds").build();
    private static final MarshallingInfo<String> RESOURCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceId").build();
    private static final MarshallingInfo<String> URL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("url").build();

    private static final SpekeKeyProviderCmafMarshaller instance = new SpekeKeyProviderCmafMarshaller();

    public static SpekeKeyProviderCmafMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SpekeKeyProviderCmaf spekeKeyProviderCmaf, ProtocolMarshaller protocolMarshaller) {

        if (spekeKeyProviderCmaf == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(spekeKeyProviderCmaf.getCertificateArn(), CERTIFICATEARN_BINDING);
            protocolMarshaller.marshall(spekeKeyProviderCmaf.getDashSignaledSystemIds(), DASHSIGNALEDSYSTEMIDS_BINDING);
            protocolMarshaller.marshall(spekeKeyProviderCmaf.getHlsSignaledSystemIds(), HLSSIGNALEDSYSTEMIDS_BINDING);
            protocolMarshaller.marshall(spekeKeyProviderCmaf.getResourceId(), RESOURCEID_BINDING);
            protocolMarshaller.marshall(spekeKeyProviderCmaf.getUrl(), URL_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
