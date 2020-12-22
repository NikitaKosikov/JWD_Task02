package by.epam_training.homework02.entity;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ApplianceDataParser {
    private static final String COLON;
    private static final String COMMA;
    private static final String EQUAL;
    private static final String NAME;

    static {
        COLON = " : ";
        EQUAL = "=";
        COMMA = ", ";
        NAME = "Name";
    }

    private String device;

    public ApplianceDataParser(){}

    public ApplianceDataParser(String device) {
        this.device = device;
    }

    public String getDevice() {
        return device;
    }

    public void setDevices(String device) {
        this.device = device;
    }

    public Map<String, Object> parserString(String device){
        Map<String, Object> deviceInfo = new HashMap<>();
        String[] info, parameters;
        String deviceName;
        info = device.split(COLON);
        deviceName = info[0];
        parameters = info[1].split(COMMA);
        deviceInfo.put(NAME,deviceName);
        for (String parameter : parameters) {
            parameters = parameter.split(EQUAL);
            deviceInfo.put(parameters[0], parameters[1]);
        }
        return deviceInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApplianceDataParser that = (ApplianceDataParser) o;
        return Objects.equals(device, that.device);
    }

    @Override
    public int hashCode() {
        return Objects.hash(device);
    }
}
