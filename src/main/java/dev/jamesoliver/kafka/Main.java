package dev.jamesoliver.kafka;

import dev.jamesoliver.kafka.healthcheck.HealthCheck;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.net.URI;

/**
 * Main class for Hello World application.
 */
public class Main {

  private Main() {}

  public static void main(String[] args) {
    var port = System.getProperty("PORT", "8080");
    var uri = URI.create("http://localhost:" + port);

    var resourceConfig = new ResourceConfig(HealthCheck.class);
    var httpServer = GrizzlyHttpServerFactory.createHttpServer(uri, resourceConfig, true);
    Runtime.getRuntime().addShutdownHook(new Thread(httpServer::shutdownNow));

    System.out.printf("Application started.\nTry out %s\nStop the application using CTRL+C%n", uri);

    //    Thread.currentThread().join();
    //  } catch (IOException | InterruptedException ex) {
    //    Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
    //  }
  }
}
