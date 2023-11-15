Feature: 회원 정보 관리

  Scenario: 회원가입
    When "ANDROID" 기기에서 아이디 "pcloud123" 닉네임 "PCloud"로 회원가입을 요청합니다
    Then 회원정보가 저장되었습니다

  Scenario: 로그인
    Given 회원이 존재
      | loginId   | nickname | platform |
      | pcloud123 | PCloud   | ANDROID  |

    When 로그인을 요청합니다
      | loginId  | pcloud |
      | platform | IOS    |

    Then 로그인 인증정보가 저장되었습니다

#  Scenario: 로그인 정보 갱신
#    Given 회원이 존재
#    And 로그인 정보가 존재
#    When 로그인 정보 갱신을 요청합니다.
#    Then 로그인 인증정보가 저장되었습니다
