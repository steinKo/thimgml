/**
 * File generated by the ThingML IDE
 * /!\Do not edit this file/!\
 * In case of a bug in the generated code,
 * please submit an issue on our GitHub
 **/

package org.thingml.generated;

import org.thingml.java.*;
import org.thingml.java.ext.*;

import org.thingml.generated.api.*;
import org.thingml.generated.messages.*;

import java.util.*;

/**
 * Definition for type : GadgetSim
 **/
public class GadgetSim extends Component implements IGadgetSim_show_gadgets {

private List<AttributeListener> attListener = new ArrayList<AttributeListener>();
public void addAttributeListener(AttributeListener listener){
this.attListener.add(listener);
}

public void removeAttributeListener(AttributeListener listener){
this.attListener.remove(listener);
}

private boolean debug = false;
public boolean isDebug() {return debug;}
public void setDebug(boolean debug) {this.debug = debug;}
@Override
public String toString() {
String result = "instance " + getName() + "\n";
result += "";
return result;
}

@Override
public synchronized void sensorinfo_via_show_gadgets(String GeneralMsg_sensorinfo_model_var, String GeneralMsg_sensorinfo_proto_var, short GeneralMsg_sensorinfo_sid_var, short GeneralMsg_sensorinfo_dataTypes_var, float GeneralMsg_sensorinfo_temperature_var, int GeneralMsg_sensorinfo_humidity_var, int GeneralMsg_sensorinfo_timeStamp_var){
receive(sensorinfoType.instantiate(GeneralMsg_sensorinfo_model_var, GeneralMsg_sensorinfo_proto_var, GeneralMsg_sensorinfo_sid_var, GeneralMsg_sensorinfo_dataTypes_var, GeneralMsg_sensorinfo_temperature_var, GeneralMsg_sensorinfo_humidity_var, GeneralMsg_sensorinfo_timeStamp_var), show_gadgets_port);
}

@Override
public synchronized void deviceinfo_via_show_gadgets(short GeneralMsg_deviceinfo_did_var, String GeneralMsg_deviceinfo_name_var, String GeneralMsg_deviceinfo_model_var, String GeneralMsg_deviceinfo_proto_var, String GeneralMsg_deviceinfo_ttype_var, short GeneralMsg_deviceinfo_meth_var, String GeneralMsg_deviceinfo_lastCmd_var, int GeneralMsg_deviceinfo_lastValue_var){
receive(deviceinfoType.instantiate(GeneralMsg_deviceinfo_did_var, GeneralMsg_deviceinfo_name_var, GeneralMsg_deviceinfo_model_var, GeneralMsg_deviceinfo_proto_var, GeneralMsg_deviceinfo_ttype_var, GeneralMsg_deviceinfo_meth_var, GeneralMsg_deviceinfo_lastCmd_var, GeneralMsg_deviceinfo_lastValue_var), show_gadgets_port);
}

//Attributes
//Ports
private Port show_gadgets_port;
//Message types
protected final SensorinfoMessageType sensorinfoType = new SensorinfoMessageType();
public SensorinfoMessageType getSensorinfoType(){
return sensorinfoType;
}

protected final DeviceinfoMessageType deviceinfoType = new DeviceinfoMessageType();
public DeviceinfoMessageType getDeviceinfoType(){
return deviceinfoType;
}

protected final Set_polling_intervalMessageType set_polling_intervalType = new Set_polling_intervalMessageType();
public Set_polling_intervalMessageType getSet_polling_intervalType(){
return set_polling_intervalType;
}

protected final PromptMessageType promptType = new PromptMessageType();
public PromptMessageType getPromptType(){
return promptType;
}

//CEP Streams
//Empty Constructor
public GadgetSim() {
super();
}

//Constructor (all attributes)
public GadgetSim(String name) {
super(name);
}

//Getters and Setters for non readonly/final attributes
//Getters for Ports
public Port getShow_gadgets_port() {
return show_gadgets_port;
}
public Component buildBehavior(String session, Component root) {
if (root == null) {
//Init ports
show_gadgets_port = new Port(PortType.PROVIDED, "show_gadgets", this);
} else {
show_gadgets_port = ((GadgetSim)root).show_gadgets_port;
}
createCepStreams();if (session == null){
//Init state machine
}
return this;
}

}
