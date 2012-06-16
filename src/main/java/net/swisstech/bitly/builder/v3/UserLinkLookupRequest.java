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
import java.util.Collection;

import net.swisstech.bitly.builder.Request;
import net.swisstech.bitly.model.Response;
import net.swisstech.bitly.model.v3.UserLinkLookup;

import com.google.gson.reflect.TypeToken;

/**
 * <p>
 * Please see the <a href="http://dev.bitly.com/links.html#v3_user_link_lookup">bit.ly documentation for the /v3/user/link_lookup</a> request.
 * </p>
 * 
 * @author Patrick Huber (gmail: stackmagic)
 */
public class UserLinkLookupRequest extends Request<UserLinkLookup> {

	public UserLinkLookupRequest(String accessToken) {
		super(accessToken);
	}

	@Override
	public String getEndpoint() {
		return "https://api-ssl.bitly.com/v3/user/link_lookup";
	}

	@Override
	protected Type getTypeForGson() {
		return new TypeToken<Response<UserLinkLookup>>() {
		}.getType();
	}

	public UserLinkLookupRequest addUrl(String url) {
		addQueryParameter("url", url);
		return this;
	}

	public UserLinkLookupRequest addUrls(String... urls) {
		for (String url : urls) {
			addUrl(url);
		}
		return this;
	}

	public UserLinkLookupRequest addUrls(Collection<String> urls) {
		for (String url : urls) {
			addUrl(url);
		}
		return this;
	}
}
