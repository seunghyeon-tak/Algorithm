## 데이터 분석

### 문제 요약

- 2차원 정수형 배열로 이루어진 data 배열이 주어진다.
- 해당 배열은 순서대로 ["code", "date", "maximum", "remain"] 값을 가진다.
- ext로 주어진 항목의 값이 val_ext 이하인 데이터만 추출한다.
- 추출된 데이터를 sort_by 기준으로 오름차순 정렬한 결과를 반환한다.

### 접근 방식

- ext와 sort_by의 문자열을 각각 실제 데이터 배열의 인덱스로 변환한다.
- ext에 해당하는 인덱스 값이 val_ext 이하인 행만 필터링한다.
- 필터링된 결과를 sort_by인덱스 기준으로 오름차순 정렬한다.
- 최종적으로 조건을 만족하는 2차원 배열을 반환한다.

### 왜 이런 방식으로 풀었나?

- 해당 문제는 조건에 맞는 데이터 필터링, 특정 컬럼 기준 정렬이라고 생각함.
- 문자열 기반 조건을 인덱스로 변환하면 이후 로직을 단순한 배열 연산으로 처리할 수 있다.
- 필터링과 정렬을 단계별로 나누면 구현이 명확하고 디버깅도 쉬워진다.

### 다른 방식으로 풀었을때 좋은점? (혹은 안좋은점)

- Stream API를 사용하는 방식

```java
return Arrays.stream(data).filter(row -> row[getIndex(ext) <=val_ext])
        .sorted(Comparator.comparingInt(row -> row[getIndex(sort_by)]))
        .toArray(int[][]::new);
```