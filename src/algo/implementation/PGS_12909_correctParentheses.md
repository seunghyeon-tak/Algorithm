## 올바른 괄호

### 문제 요약

- 문자열 s가 주어질때 괄호의 짝이 올바른지 체크하는 문제이다.
- '(', ')'으로만 이루어진 괄호의 짝이 맞다면 true, 아니면 false를 출력하시오.

### 접근 방식

- stack을 사용하여 괄호의 짝을 확인하였다.
- '('가 나오면 stack에 push
- ')'가 나오면 stack에 pop
- 만약 ')'가 나왔는데 stack이 비어있다면 잘못된 괄호이므로 false 반환
- 반복이 끝난 뒤 stack이 비어있으면 올바른 괄호

### 왜 이런 방식으로 풀었나?

- 괄호 문제는 후입선출 구조가 필요할거 같아서
- 가장 최근에 열린 '('가 먼저 닫혀야 하므로 stack이 직관적이다.

### 다른 방식으로 풀었을때 좋은점? (혹은 안좋은점)

- 공간복잡도 O(1) 풀이
```java
static boolean solution(String s) {
    int count = 0;

    for (char c : s.toCharArray()) {
        if (c == '(') {
            count++;
        } else { // ')'
            count--;
            if (count < 0) return false;
        }
    }

    return count == 0;
}
```
- 객체 생성 없음
- 더 빠름
