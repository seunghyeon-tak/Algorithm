## 성격 유형 검사하기

### 문제 요약

- 총 4개의 성격 지표(RT, CF, JM, AN)가 있다.
- 각 지표는 두 가지 성격 유형 중 하나를 선택한다.
- 질문마다 7개의 선택지가 있으며, 선택에 따라 점수가 부여된다.
- 각 지표별 점수를 비교하여 최종 성격 유형을 결정한다.

### 접근 방식

- 성격 유형(R, T, C, F, J, M, A, N)을 key로 하는 Map을 생성하고 점수를 0으로 초기화한다.
- 각 질문에 대해 선택지 점수를 계산한다.
    - 1~3: 앞 문자 점수 증가
    - 5~7: 뒤 문자 점수 증가
    - 4: 중립 (점수 없음)
- 점수를 해당 성격 유형에 누적한다.
- RT → CF → JM → AN 순서로 점수를 비교한다.
    - 점수가 높은 성격을 선택
    - 점수가 같다면 사전순으로 선택
- 선택된 성격들을 문자열로 이어서 반환한다.

### 왜 이런 방식으로 풀었나?

- 문제에서 출력 순서가 고정된 성격 지표 축으로 정해져 있기 때문에  
  점수 정렬 방식이 아닌 축 단위 비교 방식이 필요했다.
- Map을 사용하면 성격 유형별 점수를 직관적으로 관리할 수 있어  
  구현과 디버깅이 쉬웠다.

### 다른 방식으로 풀었을때 좋은점? (혹은 안좋은점)

- 배열 + 인덱스 방식
```java
static String solution(String[] survey, int[] choices) {
    int[] score = new int[8];

    String types = "RTCFJMAN";

    for (int i = 0; i < choices.length; i++) {
        if (choices[i] == 4) continue;

        int point = Math.abs(choices[i] - 4);
        char targetType = (choices[i] < 4) ? survey[i].charAt(0) : survey[i].charAt(1);

        score[types.indexOf(targetType)] += point;
    }

    StringBuilder answer = new StringBuilder();

    for (int i = 0; i < 8; i += 2) {
        if (score[i] > score[i + 1]) answer.append(types.charAt(i));
        else if (score[i] < score[i + 1]) answer.append(types.charAt(i + 1));
        else answer.append(types.charAt(i));
    }
    
    return answer.toString();
}
```
