package dev.jamesoliver.kafka.healthcheck;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("/health")
public class HealthCheck {

  @GET
  @Produces("application/json")
  public String getHealth() {
    return "{ \"status\": \"UP\" }";
  }
}
