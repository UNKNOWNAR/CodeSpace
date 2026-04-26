public class MinimumNuberofOperationstoMoveAllBalltoEachBox {
    public int[] minOperations(String boxes) {
        int[] res = new int[boxes.length()];
        for (int i = 0, ops = 0, cnt = 0; i < boxes.length(); ++i) {
            res[i] += ops;
            cnt += boxes.charAt(i) == '1' ? 1 : 0;
            ops += cnt;
        }
        for (int i = boxes.length() - 1, ops = 0, cnt = 0; i >= 0; --i) {
            res[i] += ops;
            cnt += boxes.charAt(i) == '1' ? 1 : 0;
            ops += cnt;
        }
        return res;
    }

    public static void main(String[] args) {
        MinimumNuberofOperationstoMoveAllBalltoEachBox obj = new MinimumNuberofOperationstoMoveAllBalltoEachBox();
        obj.minOperations("001011");
    }
}
