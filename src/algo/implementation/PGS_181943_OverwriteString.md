## 문자열 겹쳐쓰기

### 문제 요약

- 문자열 `my_string`, `overwrite_string`과 정수 s가 주어
- 문자열 `my_string`의 인덱스`s` 부터 `overwrite_string`으로 바꾸고 return하기

### 접근 방식

- my_string을 세 부분으로 나눔
  - 0~s-1 구간 -> 원래 문자열 유지
  - s ~ s+overwrite_string.length()-1 구간 -> 덮어쓰기
  - 나머지 부분 -> 다시 원래 문자열 유지
- 이렇게 세 부분을 합쳐서 원래 문자열 유지

### 왜 이런 방식으로 풀었나?

- 반복문을 사용해 인덱스를 하나씩 비교하며 붙이는 식으로 풀었다. substring()이라는 내장함수에 대한 존재는 알고있었지만 이해도가 조금 부족했던거 같다.

### 다른 방식으로 풀었을때 좋은점? (혹은 안좋은점)

- 현재 풀었던 방식중 StringBuilder를 사용하면 문자열을 한 번만 덮어쓰는 경우에는 오히려 복잡도가 증가한다.

- substring()으로 문자열을 잘라 붙이면 더 간단하고 직관적으로 해결 할 수 있다.
```java
public class PGS_181943_OverwriteString {
    public static void main(String[] args) {
        System.out.println(solution("Program29b8UYP", "merS123", 7));
    }

    static String solution(String my_string, String overwrite_string, int s) {
        return my_string.substring(0, s) + 
                overwrite_string + 
                my_string.substring(s + overwrite_string.length());
    }
}
```