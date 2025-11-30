## 대문자와 소문자

### 문제 요약

- my_string 이라는 문자열 매개변수가 주어짐
- 여기서 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 문제

### 접근 방식

- 문자열을 문자 배열로 순회하며
  - Character.isUpperCase(c)로 대문자 판별
  - 대문자면 -> toLowerCase(c)
  - 소문자면 -> toUpperCase(c)
- StringBuiler를 사용해 변환된 문자열을 효율적으로 이어붙임

### 왜 이런 방식으로 풀었나?

- 조건문으로 처리하는 방식이 가장 직관적이기 때문에
- 각 문자에 대해 대/소문자만 바꿔주면 되므로 복잡한 로직이 필요하지 않음
- StringBuiler 사용으로 문자열 연산 효율을 확보할 수 있음

### 다른 방식으로 풀었을때 좋은점? (혹은 안좋은점)

- chars() + 스트림 활용
- 예시
```java
my_string().chars().map(c -> Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c))
        .forEach(sb::appendCodePoint);
```