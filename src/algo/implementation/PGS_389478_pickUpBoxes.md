## 택배 상자 꺼내기

### 문제 요약

- 1번부터 n번까지의 상자를 가로 w개씩 채워 쌓는다.
- 한 줄은 왼쪽 → 오른쪽, 다음 줄은 오른쪽 → 왼쪽으로 채운다. (지그재그)
- 특정 상자 num을 꺼내기 위해 위에 쌓인 상자의 개수를 구하는 문제이다.
- 즉, num 위에 몇 개의 상자가 있는지를 구하면 된다.

### 접근 방식

- 각 열을 하나의 스택(Deque)으로 관리하였다.
- w개의 열이 있으므로 List<Deque<Integer>> 구조를 사용하였다.
- 상자를 1부터 n까지 증가시키며 줄 단위로 채운다.
- 짝수 줄 → 왼쪽 → 오른쪽
- 홀수 줄 → 오른쪽 → 왼쪽
- num이 들어있는 열을 찾은 뒤,
- 해당 열에서 pop을 하면서 num이 나올 때까지 개수를 센다.

### 왜 이런 방식으로 풀었나?

- 이 문제는 상자가 아래에서 위로 쌓이는 구조이기 때문에
- 스택(LIFO 구조)이 가장 직관적이라 생각하였다.
  - push → 상자 쌓기
  - pop → 위에서 꺼내기

### 다른 방식으로 풀었을때 좋은점? (혹은 안좋은점)

- 수학적으로 계산하는 방식
  - num이 몇번째 줄에 있는지 계산
  - 해당 중이 정방향인지 역방향인지 판단
  - 같은 열에서 num보다 위에 있는 줄 개수 계산

```java
static int solution(int n, int w, int num) {

    // num이 위치한 줄
    int row = (num - 1) / w;
    int pos = (num - 1) % w;

    // num이 위치한 열 계산
    int col;
    if (row % 2 == 0) {
        col = pos;
    } else {
        col = w - 1 - pos;
    }

    int totalRow = (n - 1) / w;

    int count = 1; // 자기 자신 포함

    // num보다 위에 있는 줄만 검사
    for (int r = row + 1; r <= totalRow; r++) {

        int start = r * w + 1;
        int end = Math.min(start + w - 1, n);

        int targetNum;

        if (r % 2 == 0) {
            targetNum = start + col;
        } else {
            targetNum = end - col;
        }

        if (targetNum >= start && targetNum <= end) {
            count++;
        }
    }

    return count;
}
```