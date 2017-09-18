/**
 * Copyright (c) 2010-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.unifi.internal.api;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * FIXME
 *
 * @author Matthew Bowman - Initial contribution
 */
public class UniFiWiredClient extends UniFiClient {

    @JsonProperty("sw_mac")
    private String swMac;

    public UniFiWiredClient() {
        super(true); // mgb: true = wired
    }

    @Override
    public String getDeviceMac() {
        return swMac;
    }

}
