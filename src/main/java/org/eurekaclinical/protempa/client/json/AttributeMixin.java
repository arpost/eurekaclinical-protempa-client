package org.eurekaclinical.protempa.client.json;

/*
 * #%L
 * Eureka Common
 * %%
 * Copyright (C) 2012 - 2015 Emory University
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonProperty;
import org.protempa.proposition.value.Value;

/**
 *
 * @author Andrew Post
 */
public abstract class AttributeMixin {
	@JsonCreator
    public AttributeMixin(@JsonProperty("name") String name, @JsonProperty("value") Value value) { }
}
