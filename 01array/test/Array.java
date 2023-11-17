public class Array {
    public static void main(String[] args) {
        /*初始化数组 */
        // int[] arr = new int[5]; //{0,0,0,0,0}
        // int[] nums = {1,2,3,4,5}; //{1,2,3,4,5}
        // System.out.println(arr[0]);
        // System.out.println(nums[0]);
        Array array = new Array();
        int[] arr = {0, 1, 3, 4, 5};
        array.insert(arr, 2, 2);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    /* 访问元素 */
    int randomAccess(int[] arr, int index) {
        return arr[index];
    }

    /* 在数组的索引 index 处插入元素num */
    void insert(int[] arr, int index, int num) {
        // 把index后面的元素都往后挪一位, 数组长度是固定的，插入一个，意味着丢弃一个
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = num;
    }

    /* 删除索引 index 处元素 */
    void remove(int[] nums, int index) {
        // 把索引 index 后面的元素都往前挪一位
        for (int i = index; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
    }

    /* 遍历数组 */
    void traverse(int[]nums) {
        int count = 0;
        // 通过索引遍历数组
        for (int i = 0; i < nums.length; i++) {
            count++;
        }
        // 直接遍历数组
        for (int num: nums) {
            count++;
        }
    }

    /* 查找数组中是否包含某个元素 */
    int find(int [] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) 
                return i;
        }
        return -1;
    }
    
    /* 扩展数组长度 */
    int[] extend(int[] nums, int enlarge) {
        // 创建一个新数组，长度是原数组长度 + enlarge
        int[] newNums = new int[nums.length + enlarge];
        // 把原数组的元素拷贝到新数组中
        for (int i = 0; i < nums.length; i++) {
            newNums[i] = nums[i];
        }
        return newNums;
    }

}
