package com.github.nishadnijam.springwebfluxtaskorganizerapi;

import com.github.nishadnijam.springwebfluxtaskorganizerapi.configuration.BaseIntegrationTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("tests")
@SpringBootTest
@ExtendWith(BaseIntegrationTest.class)
class SpringWebfluxTaskOrganizerApiApplicationTests {

  @Test
  void contextLoads() {}
}
