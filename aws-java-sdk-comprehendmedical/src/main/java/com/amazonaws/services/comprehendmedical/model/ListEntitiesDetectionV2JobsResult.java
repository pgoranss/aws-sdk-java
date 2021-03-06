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
package com.amazonaws.services.comprehendmedical.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/ListEntitiesDetectionV2Jobs"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEntitiesDetectionV2JobsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list containing the properties of each job returned.
     * </p>
     */
    private java.util.List<ComprehendMedicalAsyncJobProperties> comprehendMedicalAsyncJobPropertiesList;
    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list containing the properties of each job returned.
     * </p>
     * 
     * @return A list containing the properties of each job returned.
     */

    public java.util.List<ComprehendMedicalAsyncJobProperties> getComprehendMedicalAsyncJobPropertiesList() {
        return comprehendMedicalAsyncJobPropertiesList;
    }

    /**
     * <p>
     * A list containing the properties of each job returned.
     * </p>
     * 
     * @param comprehendMedicalAsyncJobPropertiesList
     *        A list containing the properties of each job returned.
     */

    public void setComprehendMedicalAsyncJobPropertiesList(java.util.Collection<ComprehendMedicalAsyncJobProperties> comprehendMedicalAsyncJobPropertiesList) {
        if (comprehendMedicalAsyncJobPropertiesList == null) {
            this.comprehendMedicalAsyncJobPropertiesList = null;
            return;
        }

        this.comprehendMedicalAsyncJobPropertiesList = new java.util.ArrayList<ComprehendMedicalAsyncJobProperties>(comprehendMedicalAsyncJobPropertiesList);
    }

    /**
     * <p>
     * A list containing the properties of each job returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setComprehendMedicalAsyncJobPropertiesList(java.util.Collection)} or
     * {@link #withComprehendMedicalAsyncJobPropertiesList(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param comprehendMedicalAsyncJobPropertiesList
     *        A list containing the properties of each job returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEntitiesDetectionV2JobsResult withComprehendMedicalAsyncJobPropertiesList(
            ComprehendMedicalAsyncJobProperties... comprehendMedicalAsyncJobPropertiesList) {
        if (this.comprehendMedicalAsyncJobPropertiesList == null) {
            setComprehendMedicalAsyncJobPropertiesList(new java.util.ArrayList<ComprehendMedicalAsyncJobProperties>(
                    comprehendMedicalAsyncJobPropertiesList.length));
        }
        for (ComprehendMedicalAsyncJobProperties ele : comprehendMedicalAsyncJobPropertiesList) {
            this.comprehendMedicalAsyncJobPropertiesList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list containing the properties of each job returned.
     * </p>
     * 
     * @param comprehendMedicalAsyncJobPropertiesList
     *        A list containing the properties of each job returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEntitiesDetectionV2JobsResult withComprehendMedicalAsyncJobPropertiesList(
            java.util.Collection<ComprehendMedicalAsyncJobProperties> comprehendMedicalAsyncJobPropertiesList) {
        setComprehendMedicalAsyncJobPropertiesList(comprehendMedicalAsyncJobPropertiesList);
        return this;
    }

    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     * 
     * @param nextToken
     *        Identifies the next page of results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     * 
     * @return Identifies the next page of results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Identifies the next page of results to return.
     * </p>
     * 
     * @param nextToken
     *        Identifies the next page of results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEntitiesDetectionV2JobsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getComprehendMedicalAsyncJobPropertiesList() != null)
            sb.append("ComprehendMedicalAsyncJobPropertiesList: ").append(getComprehendMedicalAsyncJobPropertiesList()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListEntitiesDetectionV2JobsResult == false)
            return false;
        ListEntitiesDetectionV2JobsResult other = (ListEntitiesDetectionV2JobsResult) obj;
        if (other.getComprehendMedicalAsyncJobPropertiesList() == null ^ this.getComprehendMedicalAsyncJobPropertiesList() == null)
            return false;
        if (other.getComprehendMedicalAsyncJobPropertiesList() != null
                && other.getComprehendMedicalAsyncJobPropertiesList().equals(this.getComprehendMedicalAsyncJobPropertiesList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComprehendMedicalAsyncJobPropertiesList() == null) ? 0 : getComprehendMedicalAsyncJobPropertiesList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListEntitiesDetectionV2JobsResult clone() {
        try {
            return (ListEntitiesDetectionV2JobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
