//Better approach - TC = O(2mn) & SC = O(n) + O(m)

class Solution {
    void setZeroes(int[][] matrix){
        int[] colMatrix = new int[3];
        int[] rowMatrix = new int[3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(matrix[i][j]==0){
                    colMatrix[j] = 1;
                    rowMatrix[i] = 1;
                }
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(rowMatrix[i] == 1 || colMatrix[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}

class SetMatrixZeroBetter{
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};

        Solution s1 = new Solution();
        s1.setZeroes(matrix);

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
