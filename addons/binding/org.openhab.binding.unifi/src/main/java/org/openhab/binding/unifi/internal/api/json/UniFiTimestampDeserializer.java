/**
 * Copyright (c) 2010-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.unifi.internal.api.json;

import java.io.IOException;
import java.util.Calendar;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

/**
 *
 * FIXME
 *
 * @author Matthew Bowman - Initial contribution
 */
public class UniFiTimestampDeserializer extends JsonDeserializer<Calendar> {

    @Override
    public Calendar deserialize(JsonParser parser, DeserializationContext context)
            throws IOException, JsonProcessingException {
        String text = parser.getText();
        long millis = Long.valueOf(text) * 1000;
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(millis);
        return cal;
    }

}
