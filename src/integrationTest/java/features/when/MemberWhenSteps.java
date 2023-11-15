package features.when;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;

import java.util.Map;

public class MemberWhenSteps {
    @When("^\"([^\"]*)\" 기기에서 아이디 \"([^\"]*)\" 닉네임 \"([^\"]*)\"로 회원가입을 요청합니다$")
    public void signUpWhenStep(String platform, String loginId, String nickname) {
        System.out.printf("Platform: %s, LoginId: %s, Nickname: %s", platform, loginId, nickname);
    }

    @When("로그인을 요청합니다")
    public void signInWhenStep(DataTable dataTable) {
        Map<String, String> map = dataTable.asMap();
        System.out.printf("loginId: %s\n", map.get("loginId"));
        System.out.printf("platform: %s\n", map.get("platform"));
    }
}
