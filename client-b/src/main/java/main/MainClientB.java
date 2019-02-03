package main;

import org.company.client.ClientConfig;
import org.jboss.weld.environment.se.Weld;

public class MainClientB {

   public static void main(String[] args) {
      Weld weld = new Weld().beanClasses(Main.class, ClientConfig.class).disableDiscovery();
      Main main = weld.initialize().select(Main.class).get();
      main.run();
   }
}