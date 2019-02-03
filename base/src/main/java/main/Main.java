package main;

import javax.inject.Inject;

import org.company.client.IClientConfig;

public class Main {

   @Inject
   private IClientConfig clientConfig;

   public void run() {
      System.out.println(clientConfig.getName());
   }

}
