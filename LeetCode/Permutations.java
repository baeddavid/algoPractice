import java.util;

class Permutations {
  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> answer = new LinkedList();
    ArrayList<Integer> list = new ArrayList<Integer>();

    for (int num : nums)
      list.add(num);

    int n = nums.length;
    backtrack(n, nums, answer, 0);
    return answer;
  }

  public void backtrack(int n, ArrayList<Integer> nums, List<List<Integer>> answer, int left) {
    if (first == n) answer.add(new ArrayList<Integer>(nums));

    for (int i = left; left < n; i++) {
      Collections.swap(nums, left, i);
      backtrack(n, nums, answer, left + 1);
      Collections.swap(nums, left, i);
    }
  }
}