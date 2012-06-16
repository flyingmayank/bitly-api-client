/*
 * Copyright (c) Patrick Huber (gmail: stackmagic)
 *
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
package net.swisstech.bitly.builder.v3;

import java.lang.reflect.Type;

import net.swisstech.bitly.builder.MetricsRequest;
import net.swisstech.bitly.model.Response;
import net.swisstech.bitly.model.v3.LinkReferrers;

import com.google.gson.reflect.TypeToken;

/**
 * <p>
 * Please see the bit.ly documentation for the <a href="http://dev.bitly.com/link_metrics.html#v3_link_referrers">/v3/link/referrers</a> request.
 * </p>
 * 
 * @author Patrick Huber (gmail: stackmagic)
 */
public class LinkReferrersRequest extends MetricsRequest<LinkReferrersRequest, LinkReferrers> {

	public LinkReferrersRequest(String accessToken) {
		super(accessToken, false);
	}

	@Override
	public String getEndpoint() {
		return "https://api-ssl.bitly.com/v3/link/referrers";
	}

	@Override
	protected Type getTypeForGson() {
		return new TypeToken<Response<LinkReferrers>>() {
		}.getType();
	}
}
