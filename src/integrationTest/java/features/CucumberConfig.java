package features;

import com.example.demo.IntegrationTestApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = IntegrationTestApplication.class)
@ContextConfiguration
public class CucumberConfig {
}
