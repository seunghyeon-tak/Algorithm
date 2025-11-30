## 인덱스 바꾸기

### 문제 요약

- 문자열 my_string과 정수 num1, num2가 주어짐
- 여기서 num1, num2의 인덱스에 있는 문자를 바꿔서 출력하는 문제

### 접근 방식

- 먼저 my_string.charAt(num1), charAt(num2)로 교환 대상 문자를 변수에 저장
- 문자열을 처음부터 끝까지 순회하며
  - 현재 인덱스가 num1 -> num2 자리 문자 추가
  - 현재 인덱스가 num2 -> num1 자리 문자 추가
- StringBuilder를 사용해 결과 문자열을 생성

### 왜 이런 방식으로 풀었나?

- 가독성이 좋고 직관적인 로직이기 때문에
- 반복문을 통해 인덱스를 직접 비교하면서 값을 바꾸는 방식은 이해하기 쉭고 버그 가능성도 낮기때문에

### 다른 방식으로 풀었을때 좋은점? (혹은 안좋은점)

- char[]로 변환 후 스왑
```java
char[] arr = my_string.toCharArray();
char temp = arr[num1];
arr[num1] = arr[num2];
arr[num2] = temp;

return new String(arr);
```