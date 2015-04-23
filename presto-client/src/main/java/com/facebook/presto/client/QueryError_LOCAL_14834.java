/*
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
 */
package com.facebook.presto.client;

import com.facebook.presto.spi.ErrorCode;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;
import javax.validation.constraints.NotNull;

import static com.google.common.base.MoreObjects.toStringHelper;

@Immutable
public class QueryError
{
    private final String message;
    private final String type;
    private final String sqlState;
    private final ErrorCode errorCode;
    private final ErrorLocation errorLocation;
    private final FailureInfo failureInfo;

    @JsonCreator
    public QueryError(
            @JsonProperty("message") String message,
            @JsonProperty("type") String type,
            @JsonProperty("sqlState") String sqlState,
            @JsonProperty("errorCode") ErrorCode errorCode,
            @JsonProperty("errorLocation") ErrorLocation errorLocation,
            @JsonProperty("failureInfo") FailureInfo failureInfo)
    {
        this.message = message;
        this.type = type;
        this.sqlState = sqlState;
        this.errorCode = errorCode;
        this.errorLocation = errorLocation;
        this.failureInfo = failureInfo;
    }

    @NotNull
    @JsonProperty
    public String getMessage() { return message; }

    @NotNull
    @JsonProperty
    public String getType()
    {
        return type;
    }

    @Nullable
    @JsonProperty
    public String getSqlState()
    {
        return sqlState;
    }

    @Nullable
    @JsonProperty
    public ErrorCode getErrorCode()
    {
        return errorCode;
    }

    @Nullable
    @JsonProperty
    public ErrorLocation getErrorLocation()
    {
        return errorLocation;
    }

    @Nullable
    @JsonProperty
    public FailureInfo getFailureInfo()
    {
        return failureInfo;
    }

    @Override
    public String toString()
    {
        return toStringHelper(this)
                .add("message", message)
                .add("type", type)
                .add("sqlState", sqlState)
                .add("errorCode", errorCode)
                .add("errorLocation", errorLocation)
                .add("failureInfo", failureInfo)
                .toString();
    }
}
