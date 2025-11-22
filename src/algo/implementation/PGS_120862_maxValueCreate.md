## 최댓값 만들기

### 문제 요약

- 정수 배열 numbers가 매개변수로 존재하는데 여기서 두 원소의 곱한 값중 최댓값을 리턴하기

### 접근 방식

- 이중 반복문으로 완전 탐색을 사용해서 문제 풀이

### 왜 이런 방식으로 풀었나?

- 특정 조건 없이 두 수를 곱해서 최댓 값을 찾는게 우선적인 목표라서

### 다른 방식으로 풀었을때 좋은점? (혹은 안좋은점)

- 정렬 후 양끝 두쌍 비교해서 해결하는 풀이 방법

```java
import java.util.Arrays;

Arrays.sort(numbers);
int n = numbers.length;
return Math.max(numbers[0] * numbers[1], numbers[n - 1] * numbers[n - 2]);
```

이렇게 하면 모든 경우를 계산하지 않아도 결과가 나옴

시간 복잡도는 O(n log n)
