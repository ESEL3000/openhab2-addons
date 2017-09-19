/**
 * Copyright (c) 2010-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.unifi.internal;

import java.util.Set;

import org.eclipse.smarthome.core.thing.Bridge;
import org.eclipse.smarthome.core.thing.Thing;
import org.eclipse.smarthome.core.thing.ThingTypeUID;
import org.eclipse.smarthome.core.thing.binding.BaseThingHandlerFactory;
import org.eclipse.smarthome.core.thing.binding.ThingHandler;
import org.openhab.binding.unifi.handler.UniFiClientHandler;
import org.openhab.binding.unifi.handler.UniFiControllerHandler;

import com.google.common.collect.Sets;

/**
 * The {@link UniFiHandlerFactory} is responsible for creating things and thing
 * handlers.
 *
 * @author Matthew Bowman - Initial contribution
 */
public class UniFiHandlerFactory extends BaseThingHandlerFactory {

    private static final Set<ThingTypeUID> SUPPORTED_THING_TYPES_UIDS = Sets
            .union(UniFiControllerHandler.SUPPORTED_THING_TYPES_UIDS, UniFiClientHandler.SUPPORTED_THING_TYPES_UIDS);

    @Override
    public boolean supportsThingType(ThingTypeUID thingTypeUID) {
        return SUPPORTED_THING_TYPES_UIDS.contains(thingTypeUID);
    }

    @Override
    protected ThingHandler createHandler(Thing thing) {
        ThingTypeUID thingTypeUID = thing.getThingTypeUID();
        if (UniFiControllerHandler.SUPPORTED_THING_TYPES_UIDS.contains(thingTypeUID)) {
            return new UniFiControllerHandler((Bridge) thing);
        } else if (UniFiClientHandler.SUPPORTED_THING_TYPES_UIDS.contains(thingTypeUID)) {
            return new UniFiClientHandler(thing);
        }
        return null;
    }

}