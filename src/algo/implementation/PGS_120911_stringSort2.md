## 문자열 정렬하기(2)

### 문제 요약

- 문자열 매개변수 my_string이 주어짐,
- my_string이 모두 소문자로 변환하여 정렬한 값을 출력하는 문제

### 접근 방식

- 문자열을 문자 배열로 순회하면서 대문자는 toLowerCase()로 소문자로 변환
- 변환된 문자들을 ArrayList<String>에 담은 뒤 Collections.sort()로 정렬
- 정렬된 리스트를 StringBuilder로 합쳐 최종 문자열 생성

### 왜 이런 방식으로 풀었나?

- 단계별 소문자 변환 -> 리스트 추가 -> 정렬 -> 문자열 조합이라는 구조가 명확해서 로직을 따라가기 쉽고 가독성도 좋기 때문에

### 다른 방식으로 풀었을때 좋은점? (혹은 안좋은점)

- toLowerCase() + 배열 정렬 방식 (더 효율적)
```java
char[] arr = my_string.toLowerCase().toCharArray();
Arrays.sort(arr);
return new String(arr);
```