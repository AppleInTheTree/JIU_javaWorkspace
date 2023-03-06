package ac.jiu.java.grammer.chapter7;

public class SearchingArrays {
    public static void main(String[] args) {

        int[] numLists = {1, 2, 4, 6, 10, 12, 15};

        // 찾고자 하는 숫자의 index print
        System.out.println(linearSearch(numLists, 4));

        System.out.println(binarySearch(numLists, 4));


    }
    public static int linearSearch(int[] linear, int num) {
        // 선형탐색으로 찾고자 하는 아이템 인덱스 반환
        // 배열의 길이가 길어지면 n만큼 시간이 늘어난다
        for (int i = 0; i < linear.length; i++) {
            if (num == linear[i]) {
                return i;
            }
        }
        return -1;

    }

    // 이진탐색은 배열을 반으로 나누고 탐색을 한다 (정열이 되어 있어야 한다!)
    // 찾고자 하는 숫자가 딱 절반이면 그 값을 반환하고 아니면 크고 작음에 따라서 탐색 영역을 좁혀나간다.
    // high, mid, low 정의 필요

    public static int binarySearch(int[] binary, int num) {

        int low = 0;
        int high = binary.length -1;

        while (high >= low) {
            int mid = (low + high) / 2;

            if (num == binary[mid]) {
                return mid;
            }
            else if (num < binary[mid]) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return -low -1;

    }
}
