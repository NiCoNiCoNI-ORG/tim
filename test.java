import org.junit.Test;

import java.util.*;

public class test {

  /**
   * @param nums
   * @param k
   * @return {@link int[] }
   * @annotation
   */
  public int[] topKFrequent(int[] nums, int k) {
    if (nums.length == 0) {
      return null;
    }
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      map.put(nums[i], !(map.containsKey(nums[i])) ? 1 : map.get(nums[i]) + 1);
    }

    Collection<Integer> list = new ArrayList<>();
    list = map.values();
    Integer[] result = new Integer[list.size()];
    int i1 = 0;
    for (Integer i : list) {
      result[i1] = i;
      i1++;
    }
    // 堆
    Arrays.sort(result);
    System.out.println(result[0]);

    return null;
  }

  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode result = new ListNode();
    ListNode tmp = null;
    while (true) {
      if (list1.val <= list2.val) {
        result.next = list1;
        tmp = list1;

      } else {
      }
      if (list1.next == null) {
        break;
      } else {
        break;
      }
    }
    return result.next;
  }

  public ListNode deleteDuplicates1(ListNode head) {
    if (head.next == null) {
      return head;
    }
    ListNode curr = new ListNode();
    HashSet<Integer> set = new HashSet<>();
    curr = head;
    while (curr.next != null) {
      if (!set.contains(curr.val)) {
        set.add(curr.val);
        curr = curr.next;
      } else {

        if (!(curr.next.next == null)) {
          curr.next = curr.next.next;
        }
        curr.next = null;
      }
    }

    return head;
  }

  public boolean isUnique(String astr) {
    if (astr == null) {
      return true;
    }
    char[] c = astr.toCharArray();
    HashSet<Character> set = new HashSet<>();
    for (int i = 0; i < c.length; i++) {
      if (!(set.contains(c[i]))) {
        set.add(c[i]);
      } else {
        return false;
      }
    }
    return true;
  }

  public boolean CheckPermutation(String s1, String s2) {
    if (s1.length() != s2.length()) {
      return false;
    }
    if (s1.length() == 0) {
      return true;
    }
    char[] c1 = s1.toCharArray();
    char[] c2 = s2.toCharArray();
    HashMap<Character, Integer> map1 = new HashMap<>();
    HashMap<Character, Integer> map2 = new HashMap<>();
    for (int i = 0; i < c1.length; i++) {
      map1.put(c1[i], map1.containsKey(c1[i]) ? map1.get(c1[i]) + 1 : 1);
      map2.put(c2[i], map2.containsKey(c2[i]) ? map2.get(c2[i]) + 1 : 1);
    }
    Set<Character> set = map1.keySet();
    for (Character c : set) {
      if (map1.get(c) != map2.get(c)) {
        return false;
      }
    }
    return true;
  }

  public boolean canPermutePalindrome(String s) {
    if (s.length() == 0) {
      return true;
    }
    char[] c = s.toCharArray();
    HashMap<Character, Integer> map = new HashMap<>();
    for (char c1 : c) {
      map.put(c1, map.containsKey(c1) ? map.get(c1) + 1 : 1);
    }
    for (char c1 : c) {
      map.put(c1, map.get(c1) % 2);
    }
    Collection<Integer> list = map.values();
    int count = 0;
    for (Integer i : list) {
      if (i == 1) {
        count++;
      }
      if (count == 2) {
        return false;
      }
    }

    return true;
  }

  public boolean oneEditAway(String first, String second) {
    if (Math.abs(first.length() - second.length()) >= 2) {
      return false;
    }
    if (first.length() == 0 || second.length() == 0) {
      return true;
    }
    int len = first.length() >= second.length() ? first.length() : second.length();

    return false;
  }

  public boolean containsNearbyDuplicate(int[] nums, int k) {
    if (nums.length <= 1) {
      return false;
    }
    int left = 0;
    int right = 0;
    int offset = 0;
    for (int i = 0; i < nums.length; i++) {
      while (left >= 0 || right < nums.length) {}
    }

    return false;
  }

  public int kthToLast(ListNode head, int k) {
    if (head.next == null) {
      return head.val;
    }
    ListNode pre = head;
    ListNode curr = head;
    for (int i = 0; i <= k; i++) {
      pre = pre.next;
    }

    while (true) {
      pre = pre.next;
      curr = curr.next;
      if (pre.next == null) {

        return curr.val;
      }
    }
  }

  public ListNode deleteDuplicates(ListNode head) {
    if (head.next == null) {
      return head;
    }
    HashSet<Integer> set = new HashSet<>();

    ListNode curr;
    curr = head;

    while (curr.next != null) {
      if (set.contains(curr.next.val)) {
        if (curr.next.next == null) {
          curr.next = null;
        } else {
          curr.next = curr.next.next;
        }
      } else {
        set.add(curr.val);
        curr = curr.next;
      }
    }
    return curr;
  }
  // 顺序查找
  public boolean search01(int[] nums, int target) {
    Arrays.sort(nums);
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == target) {
        return true;
      }
    }
    return false;
  }
  //二分查找非递归
  public boolean search02(int[] nums ,int target){
    Arrays.sort(nums);
    int left=0;
    int right=nums.length;
    int mid=0;
    while(left<right){
      mid=(left+right)/2;
      if(target > nums[mid]){
        left=mid+1;
      }
      if(target < nums[mid]){
        right=mid-1;
      }

      if(target == nums[mid]){
        return true;
      }
    }
    return false;
  }
  //二分查找递归
  public boolean search03(int[] nums,int target,int left,int right){
    return false;
  }

}
