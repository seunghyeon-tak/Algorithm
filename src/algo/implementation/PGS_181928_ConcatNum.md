## 이어 붙인 수

### 문제 요약

- 정수 배열의 원소 값이 홀수인지 짝수인지 판별, (문제 잘 읽기)
  - 홀수들만 순서대로 이어붙인 수
  - 짝수들만 순서대로 이어붙은 수
- 두 수의 합을 반환

### 접근 방식

- 처음 풀었을때
  - 배열의 각 인덱스의 값을 홀수인지 짝수인지 체크한 후 문자열 형태로 변환해서 값들을 더하고 최종적으로 구해진 값들을 다시 정수형으로 변환해서 값을 도출
- 수정 후 이해한 내용
  - 배열을 한 번 순회하며 홀수/짝수에 따라 각각 버퍼에 문자열로 이어붙인다
  - 이어붙인 문자열이 비어있으면 "0"으로 간주
  - 두 문자열을 정수로 변환하여 합을 반환

### 왜 이런 방식으로 풀었나?

- 처음 풀었을때
  - 인덱스의 값을 따로 뽑아서 계산하는 방식이 제일 단순하다 생각했으며 타입 변환이 2번정도 있지만 크게 문제될것 같지 않아서 해당 방식을 사용함
- 수정 후
  - 반복 연결 비용을 줄이기 위해 StringBuilder 사용
  - 빈 그룹에서의 예외를 "0"으로 처리

### 다른 방식으로 풀었을때 좋은점? (혹은 안좋은점)

- 처음 풀었던 방식 (비효율적인 방식)
```java
public class PGS_181928_ConcatNum {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{5, 7, 8, 3}));
    }

    static int solution(int[] num_list) {
        String x = "";
        String y = "";

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 != 0) {
                x += num_list[i];
            } else {
                y += num_list[i];
            }
        }

        return Integer.parseInt(x) + Integer.parseInt(y);
    }
}
```

- 위의 방식 문제점 인덱스가 모두 홀수 이거나 짝수이면 ""가 되어 정수형으로 변환이 안됨 `NumberFormatException` 발생함
- String 보단 StringBuilder 사용하는게 효율적
  - String은 불변객체이므로 매번 새로운 인스턴스를 생성하지만, StringBuilder는 가변객체라 기존 객체를 수정하는 형식이라 훨씬 빠르다.

- `다른 방식`으로 풀었을때
```java
String oddStr = Arrays.stream(num_list)
        .filter(x -> (x % 2) != 0)
        .mapToObj(String::valueOf)
        .collect(Collectors.joining());

String evenStr = Arrays.stream(num_list)
        .filter(x -> (x % 2) == 0)
        .mapToObj(String::valueOf)
        .collect(Collectors.joining());
```
- 간단명료하고 표현이 명확함
