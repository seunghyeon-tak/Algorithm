## n개의 최소공배수

### 문제 요약

- n개의 숫자를 담은 arr배열이 담긴 수의 최소공배수를 구하시오.

### 접근 방식

- 특정 수(numDivide)로 배열의 모든 원소가 나누어 떨어지는지 확인하면서
  numDivide를 1씩 증가시키는 방식으로 최소공배수를 찾았다.

### 왜 이런 방식으로 풀었나?

- 직관적으로 이해하기 쉬운 방법이기 때문이다.
- 작은 수부터 하나씩 증가시키면서 모든 수로 나누어 떨어지는 최초의 값을 찾으면 되므로 구현이 단순하다.
- 다만, 이 방식은 다음과 같은 단점이 있다.
- numDivide를 1씩 증가시키면서 계속 나눗셈을 수행해야 하기 때문에 숫자가 커질수록 불필요한 반복 연산이 크게 증가한다.

### 다른 방식으로 풀었을때 좋은점? (혹은 안좋은점)

- 유클리드 호제법
```java
public class Main {

    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 14};

        int result = arr[0];

        for (int i = 1; i < arr.length; i++) {
            result = lcm(result, arr[i]);
        }

        System.out.println(result); // 168
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
```