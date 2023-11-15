package features;

import com.example.demo.DatabaseHelper;
import io.cucumber.java.Before;
import org.springframework.beans.factory.annotation.Autowired;

public class IntegrationTestHook {
    @Autowired
    private DatabaseHelper databaseHelper;
    @Before
    void before() {
        databaseHelper.truncateAll();
    }
}
