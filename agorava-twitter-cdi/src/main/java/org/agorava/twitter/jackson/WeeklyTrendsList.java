/*******************************************************************************
 * Copyright 2012 Agorava
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package org.agorava.twitter.jackson;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import org.agorava.twitter.model.Trend;
import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Holder of a list of weekly trends.
 * 
 * @author Craig Walls
 * @author Antoine Sabot-Durand
 */
@JsonIgnoreProperties(ignoreUnknown = true)
class WeeklyTrendsList extends AbstractTrendsList {

    @JsonCreator
    public WeeklyTrendsList(@JsonProperty("trends") Map<String, List<Trend>> trends) {
        super(trends, new SimpleDateFormat("yyyy-MM-dd"));
    }

}
