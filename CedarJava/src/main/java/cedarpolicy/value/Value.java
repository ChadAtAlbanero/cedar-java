/*
 * Copyright 2022-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cedarpolicy.value;

import cedarpolicy.serializer.ValueCedarDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/** A value in the Cedar language model. */
@JsonDeserialize(using = ValueCedarDeserializer.class)
public abstract class Value {
    /**
     * Convert the Value instance into a string containing the Cedar source code for the equivalent
     * Cedar value.
     *
     * @return Cedar source code for the value.
     */
    abstract String toCedarExpr();
}
