## 전국 대회 선발 고사

### 문제 요약

- 0번부터 n-1번 까지 n명의 학생중에 3명을 선발해야함
- 다만, attendance[i] == true 인 학생 중 등수 상위 3명의 인덱스를 a,b,c라 할때
- 결과는 `10000 * a + 100 * b + c`

### 접근 방식

- 배열의 인덱스를 기억하고 있어야하기에 hashmap을 사용함
- 배열의 등수를 오름차순으로 정렬해 참가 가능한 학생을 분별할 수 있었다.

### 왜 이런 방식으로 풀었나?

- 일단 내 생각엔 학생의 등수, 참가가능여부, 인덱스 값이 필요했기때문에 등수와 인덱스 값을 map에 저장시켜 기억한다음 정렬을 통해 상위 3명을 도출해내는 방식으로 접근 하면 좋을것 같아서 해당 방법을 선택했다.

### 다른 방식으로 풀었을때 좋은점? (혹은 안좋은점)

- 다른 풀이로 했을때
```java
static int solution(int[] rank, boolean[] attendance) {
    int n = rank.length;

    int[] indexByRank = new int[n + 1];

    for (int i = 0; i < n; i++) {
        indexByRank[rank[i]] = i;
    }

    int[] top = new int[3];
    int found = 0;

    for (int i = 1; i <= n && found < 3; i++) {
        int idx = indexByRank[i];
        if (attendance[idx]) {
            top[found++] = idx;
        }
    }

    return 10000 * top[0] + 100 * top[1] + top[2];
}
```

- 기존 풀이와 위의 풀이의 차이점
  - 정렬 없이 한번씩만 순회하므로 O(n)으로 가능함
  - int[]만 사용하여 오토박싱/언박싱 비용 제거 불필요한 List, Map 제거
  - 등수 -> 인덱스 역매핑 후 등수 1부터 순서대로 확인

- 현재 풀이 회고
  - 구현이 직관적이며, 실수가 적으나 시간 복잡도가 O(n log n)으로 길고 + 오토박싱 비용이 듦