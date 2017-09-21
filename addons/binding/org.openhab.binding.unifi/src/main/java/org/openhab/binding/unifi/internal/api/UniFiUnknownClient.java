/**
 * Copyright (c) 2010-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.unifi.internal.api;

/**
 *
 * FIXME
 *
 * @author Matthew Bowman - Initial contribution
 */
public class UniFiUnknownClient extends UniFiClient {

    @Override
    public Boolean isWired() {
        return null; // mgb: no is_wired property in the json
    }

    @Override
    public String getDeviceMac() {
        return null; // mgb: no device mac in the json
    }

}
