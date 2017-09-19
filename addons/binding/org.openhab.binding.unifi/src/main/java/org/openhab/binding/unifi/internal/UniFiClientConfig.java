/**
 * Copyright (c) 2010-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.unifi.internal;

import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;

/**
 * The {@link UniFiClientConfig} represents the
 *
 * @author Matthew Bowman - Initial contribution
 *
 */
public class UniFiClientConfig {

    private static final String REGEX_MAC_ADDRESS = "^[a-fA-F0-9]{2}(:[a-fA-F0-9]{2}){5}$";

    private String mac;

    private String site;

    private String contactType;

    public String getMac() {
        return mac;
    }

    public String getSite() {
        return site;
    }

    public String getContactType() {
        return contactType;
    }

    public UniFiClientConfig tidy() {
        mac = StringUtils.lowerCase(StringUtils.strip(mac));
        site = StringUtils.strip(site);
        return this;
    }

    public boolean isValid() {
        return StringUtils.isNotBlank(mac) && Pattern.matches(REGEX_MAC_ADDRESS, mac);
    }

    @Override
    public String toString() {
        return "UniFiClientConfig{mac = " + mac + ", site = " + site + ", contactType = " + contactType + "}";
    }

}