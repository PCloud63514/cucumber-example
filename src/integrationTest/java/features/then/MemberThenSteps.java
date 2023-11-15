package features.then;

import io.cucumber.java.en.Then;

public class MemberThenSteps {
    @Then("회원정보가 저장되었습니다")
    public void memberSavedThenStep() {
        System.out.println("회원정보 저장~");
    }

    @Then("로그인 인증정보가 저장되었습니다")
    public void memberSignInfoSavedThenStep() {
        System.out.println("로그인 인증정보 저장~");
    }
}
