# JAVA-RACINGCAR

## 패키지 구조
### [Model]
#### Car
- Name과 Position을 담은 객체
#### Cars
- 게임에 참여하는 Car들을 묶은 객체
#### Name
- Car의 이름을 담은 객체
#### Position
- Car의 위치를 담은 객체
#### RandomNumber
- 전진 조건이 되는 수를 생성하는 객체
#### TryCount
- 게임 진행 횟수를 담은 객체

### [View]
#### InputView
- 사용자의 입력을 받음
#### OutputView
- 안내 문구 및 결과 출력
#### ViewMessage(enum)
- 입출력 문구 모음

### [Controller]
#### RacingController
- 게임 진행

### [Util]
#### ErrorMessage(enum)
- 에러 문구 모음
#### Validation
- Model과 View 검증

## 필요 기능
1. 자동차 정보 입력
2. 시도 횟수 입력
3. 실행 결과 출력
4. 우승자 출력