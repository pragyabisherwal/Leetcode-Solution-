class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        
        int[] numberOfStudentsThatPreferEitherOneOrZero = new int[2];

        for (int student : students) {
            numberOfStudentsThatPreferEitherOneOrZero[student]++;
        }

        for (int sandwich : sandwiches) {
            if (numberOfStudentsThatPreferEitherOneOrZero[sandwich] == 0) {
                return numberOfStudentsThatPreferEitherOneOrZero[1-sandwich];
            }
            numberOfStudentsThatPreferEitherOneOrZero[sandwich]--;
        }

        return 0;
    }
}