package features.given;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

import java.util.Map;

public class MemberGivenSteps {
    @Given("회원이 존재")
    public void givenMembers(final DataTable dataTable) {
        Map<String, String> map = dataTable.transpose().asMap();

        System.out.printf("loginId: %s\n", map.get("loginId"));
        System.out.printf("nickname: %s\n", map.get("nickname"));
        System.out.printf("platform: %s\n", map.get("platform"));
    }
}