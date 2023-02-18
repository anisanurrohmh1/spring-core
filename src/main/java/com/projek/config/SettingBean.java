package com.projek.config;

import com.projek.repository.IInventarisRepo;
import com.projek.repository.InventarisRepoImplemen;
import com.projek.service.IInventaris;
import com.projek.service.InventarisImplemen;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SettingBean {

//  @Bean
//    public IInventaris getServiceInventaris()
//    { return new InventarisImplemen();
//    }

  @Bean
  @Scope("prototype")
  public IInventaris getServiceInventaris()
  { return new InventarisImplemen(getRepoInven());
  }

  @Bean
  @Scope("singleton")
  public IInventarisRepo getRepoInven(){
    return new InventarisRepoImplemen();
  }
}
