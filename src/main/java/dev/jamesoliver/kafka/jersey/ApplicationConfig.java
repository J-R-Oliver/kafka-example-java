package dev.jamesoliver.kafka.jersey;

import jakarta.ws.rs.core.Application;

import java.util.HashMap;
import java.util.Map;

public class ApplicationConfig extends Application {

  @Override
  public Map<String, Object> getProperties() {

    var properties = new HashMap<String, Object>();
    properties.put("jersey.config.server.wadl.disableWadl", "true");
    return properties;
  }
}
