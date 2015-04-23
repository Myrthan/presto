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
<<<<<<< HEAD
    private final ErrorCode errorCode;
=======
    private final int errorCode;
    private final String errorName;
    private final String errorType;
>>>>>>> be6815e2f4239c67011698739055eefff4cf1a75
    private final ErrorLocation errorLocation;
    private final FailureInfo failureInfo;

    @JsonCreator
    public QueryError(
            @JsonProperty("message") String message,
            @JsonProperty("type") String type,
            @JsonProperty("sqlState") String sqlState,
<<<<<<< HEAD
            @JsonProperty("errorCode") ErrorCode errorCode,
=======
            @JsonProperty("errorCode") int errorCode,
            @JsonProperty("errorName") String errorName,
            @JsonProperty("errorType") String errorType,
>>>>>>> be6815e2f4239c67011698739055eefff4cf1a75
            @JsonProperty("errorLocation") ErrorLocation errorLocation,
            @JsonProperty("failureInfo") FailureInfo failureInfo)
    {
        this.message = message;
        this.type = type;
        this.sqlState = sqlState;
        this.errorCode = errorCode;
        this.errorName = errorName;
        this.errorType = errorType;
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

    @NotNull
    @JsonProperty
    public String getErrorName()
    {
        return errorName;
    }

    @NotNull
    @JsonProperty
    public String getErrorType()
    {
        return errorType;
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
                .add("errorName", errorName)
                .add("errorType", errorType)
                .add("errorLocation", errorLocation)
                .add("failureInfo", failureInfo)
                .toString();
    }
}
