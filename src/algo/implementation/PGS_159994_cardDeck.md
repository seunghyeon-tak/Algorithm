## 카드 뭉치

### 문제 요약

- 두 개의 카드 뭉치(cards1, cards2)가 주어진다.
- 각 카드 뭉치에서는 **앞에서부터 한 장씩만** 사용할 수 있다.
- 한 번 사용한 카드는 다시 사용할 수 없다.
- 카드들을 적절히 사용해 goal 배열의 문자열 순서를 만들 수 있는지 판별한다.
- 만들 수 있으면 "Yes", 만들 수 없으면 "No"를 반환한다.

### 접근 방식

- cards1, cards2를 각각 `Queue`로 변환한다.
- goal의 문자열을 앞에서부터 하나씩 확인하면서,
    - cards1의 맨 앞 카드와 일치하면 cards1에서 사용
    - 아니라면 cards2의 맨 앞 카드와 비교
    - 두 카드 뭉치 모두에서 일치하지 않으면 즉시 실패

### 왜 이런 방식으로 풀었나?

- goal을 순회하면서 매 단계마다
    - 두 카드 뭉치의 맨 앞 카드만 비교
    - 어느 쪽에도 없으면 더 이상 진행할 필요 없이 "No" 반환
- 불필요한 연산을 하지 않아 시간 복잡도는 O(n)

### 다른 방식으로 풀었을때 좋은점? (혹은 안좋은점)

- 인덱스 포인터로 푸는 방식

```java
public class PGS159994CardDeckPointer {

    static String solution(String[] cards1, String[] cards2, String[] goal) {
        int i = 0; // cards1 포인터
        int j = 0; // cards2 포인터

        for (String word : goal) {
            if (i < cards1.length && cards1[i].equals(word)) {
                i++;
            } else if (j < cards2.length && cards2[j].equals(word)) {
                j++;
            } else {
                return "No";
            }
        }
        return "Yes";
    }
}
```