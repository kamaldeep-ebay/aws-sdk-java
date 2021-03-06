/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudhsm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudhsm.AWSCloudHSM#describeHapg(DescribeHapgRequest) DescribeHapg operation}.
 * <p>
 * Retrieves information about a high-availability partition group.
 * </p>
 *
 * @see com.amazonaws.services.cloudhsm.AWSCloudHSM#describeHapg(DescribeHapgRequest)
 */
public class DescribeHapgRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The ARN of the high-availability partition group to describe.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:cloudhsm:[a-zA-Z0-9\-]*:[0-9]{12}:hapg-[0-9a-f]{8}<br/>
     */
    private String hapgArn;

    /**
     * The ARN of the high-availability partition group to describe.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:cloudhsm:[a-zA-Z0-9\-]*:[0-9]{12}:hapg-[0-9a-f]{8}<br/>
     *
     * @return The ARN of the high-availability partition group to describe.
     */
    public String getHapgArn() {
        return hapgArn;
    }
    
    /**
     * The ARN of the high-availability partition group to describe.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:cloudhsm:[a-zA-Z0-9\-]*:[0-9]{12}:hapg-[0-9a-f]{8}<br/>
     *
     * @param hapgArn The ARN of the high-availability partition group to describe.
     */
    public void setHapgArn(String hapgArn) {
        this.hapgArn = hapgArn;
    }
    
    /**
     * The ARN of the high-availability partition group to describe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws(-iso)?:cloudhsm:[a-zA-Z0-9\-]*:[0-9]{12}:hapg-[0-9a-f]{8}<br/>
     *
     * @param hapgArn The ARN of the high-availability partition group to describe.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeHapgRequest withHapgArn(String hapgArn) {
        this.hapgArn = hapgArn;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getHapgArn() != null) sb.append("HapgArn: " + getHapgArn() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getHapgArn() == null) ? 0 : getHapgArn().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeHapgRequest == false) return false;
        DescribeHapgRequest other = (DescribeHapgRequest)obj;
        
        if (other.getHapgArn() == null ^ this.getHapgArn() == null) return false;
        if (other.getHapgArn() != null && other.getHapgArn().equals(this.getHapgArn()) == false) return false; 
        return true;
    }
    
}
    