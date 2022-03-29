package epam.topic_one.codingbat;

public class TasksFromArrayModule {

    public boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }

    public boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }

    public int sum3(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum = sum + num;
        }
        return sum;
    }

    public int sum2(int[] nums) {
        int sum = 0;
        int minNumber = Math.min(nums.length, 2);
        for (int i = 0; i < minNumber; i++) {
            sum = nums[i] + sum;
        }
        return sum;
    }

    public int[] reverse3(int[] nums) {
        int middle = nums.length / 2;
        for (int i = 0; i < middle; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - i - 1] = temp;
        }
        return nums;
    }

    public int[] middleWay(int[] a, int[] b) {
        int[] nums = new int[2];
        nums[0] = a[1];
        nums[1] = b[1];
        return nums;
    }

    public boolean no23(int[] nums) {
        return nums[0] != 2 && nums[1] != 2 && nums[0] != 3 && nums[1] != 3;
    }

    public int[] fix23(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 3) {
                nums[i + 1] = 0;
            }
        }
        return nums;
    }

    public int[] maxEnd3(int[] nums) {
        int maxNumber = Math.max(nums[0], nums[nums.length - 1]);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = maxNumber;
        }
        return nums;
    }

    public int[] makeEnds(int[] nums) {
        int numsEnd[] = new int[2];
        numsEnd[0] = nums[0];
        numsEnd[1] = nums[nums.length - 1];
        return numsEnd;
    }

    public int[] makeLast(int[] nums) {
        int doubledLength = nums.length * 2;
        int myNewArray[] = new int[doubledLength];
        for (int i = 0; i < doubledLength; i++) {
            myNewArray[i] = 0;
        }
        myNewArray[doubledLength - 1] = nums[nums.length - 1];
        return myNewArray;
    }

    public int start1(int[] a, int[] b) {
        int count = 0;
        if (a.length > 0 && a[0] == 1) {
            count++;
        }
        if (b.length > 0 && b[0] == 1) {
            count++;
        }
        return count;
    }

    public int[] plusTwo(int[] a, int[] b) {
        int newLength = a.length + b.length;
        int addTwoArray[] = new int[newLength];
        for (int i = 0; i < a.length; i++) {
            addTwoArray[i] = a[i];
            addTwoArray[newLength - i - 1] = b[b.length - i - 1];
        }
        return addTwoArray;
    }

    public int maxTriple(int[] nums) {
        int maxNumber = Math.max(nums[0], nums[nums.length - 1]);
        int middleIndex = nums.length / 2;
        return Math.max(maxNumber, nums[middleIndex]);

    }

    public boolean has23(int[] nums) {
        boolean result = false;
        for (int num : nums) {
            if (num == 2 || num == 3) {
                result = true;
                break;
            }
        }
        return result;
    }

    public int[] biggerTwo(int[] a, int[] b) {
        int sumA = 0;
        int sumB = 0;
        for (int value : a) {
            sumA = sumA + value;
        }
        for (int value : b) {
            sumB = sumB + value;
        }

        return sumA >= sumB ? a : b;
    }

    public int[] frontPiece(int[] nums) {
        int addFrontPieceArray[] = new int[2];
        if (nums.length < 2) {
            return nums;
        } else {
            addFrontPieceArray[0] = nums[0];
            addFrontPieceArray[1] = nums[1];
            return addFrontPieceArray;
        }
    }

    public int[] makePi() {
        return new int[]{3, 1, 4};
    }

    public int[] swapEnds(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;

        return nums;
    }

    public boolean sameFirstLast(int[] nums) {
        return nums.length >= 1 && nums[0] == nums[nums.length - 1];

    }

    public int[] makeMiddle(int[] nums) {
        int middleOne = nums.length / 2;
        int[] middle = new int[2];
        middle[0] = nums[middleOne - 1];
        middle[1] = nums[middleOne];
        return middle;
    }

    public int[] midThree(int[] nums) {
        int middleOne = nums.length / 2;
        int[] middle = new int[3];
        middle[0] = nums[middleOne - 1];
        middle[1] = nums[middleOne];
        middle[2] = nums[middleOne + 1];
        return middle;
    }

    public boolean unlucky1(int[] nums) {
        if (nums.length < 2)
            return false;
        return (nums[0] == 1 && nums[1] == 3) || (nums[1] == 1 && nums[2] == 3) || (nums[nums.length - 2] == 1
                && nums[nums.length - 1] == 3);
    }

    public int[] make2(int[] a, int[] b) {
        int[] arrayFromTwoArray = new int[2];
        if (a.length > 1) {
            arrayFromTwoArray[0] = a[0];
            arrayFromTwoArray[1] = a[1];
        } else if (a.length < 1) {
            arrayFromTwoArray[0] = b[0];
            arrayFromTwoArray[1] = b[1];
        } else {
            arrayFromTwoArray[0] = a[0];
            arrayFromTwoArray[1] = b[0];
        }
        return arrayFromTwoArray;
    }

    public boolean double23(int[] nums) {
        int count2 = 0;
        int count3 = 0;
        for (int num : nums) {
            if (num == 2) {
                count2++;
            }
            if (num == 3) {
                count3++;
            }
        }
        return count2 == 2 || count3 == 2;
    }

    public int[] rotateLeft3(int[] nums) {
        return new int[]{nums[1], nums[2], nums[0]};
    }

    public int[] front11(int[] a, int[] b) {
        if (a.length > 0 && b.length > 0) {
            return new int[]{a[0], b[0]};
        } else if (a.length < 1 && b.length > 0) {
            return new int[]{b[0]};
        } else if (a.length > 0) {
            return new int[]{a[0]};
        }
        return new int[]{};
    }

}

