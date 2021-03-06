/**
 * File generated by the ThingML IDE
 * /!\Do not edit this file/!\
 * In case of a bug in the generated code,
 * please submit an issue on our GitHub
 **/

package org.thingml.generated.messages;

import org.thingml.java.*;
import org.thingml.java.ext.*;

import org.thingml.generated.api.*;
import java.util.*;
import java.nio.*;

public class Set_temperature_rangeMessageType extends EventType {
public Set_temperature_rangeMessageType(short code) {super("set_temperature_range", code);
}

public Set_temperature_rangeMessageType() {
super("set_temperature_range", (short) 0);
}

public Event instantiate(final float range) { return new Set_temperature_rangeMessage(this, range); }
@Override
public Event instantiate(Map<String, Object> params) {return instantiate((Float) params.get("range"));
}

public class Set_temperature_rangeMessage extends Event implements java.io.Serializable {

public final float range;
@Override
public String toString(){
return "set_temperature_range (" + "range: " + range + ")";
}

protected Set_temperature_rangeMessage(EventType type, final float range) {
super(type);
this.range = range;
}
@Override
public Event clone() {
return instantiate(this.range);
}}

}

