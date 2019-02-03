package org.company.client;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ClientConfig implements IClientConfig {

   @Override
   public String getName() {
      return "Client A";
   }
}
