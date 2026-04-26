//Brute Force - TC = O(n^3)

class Solution{
    void setZeroes(int[][] matrix){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(matrix[i][j] == 0){
                    int currRow = i;
                    int currCol = j;

                    for(int a=0;a<3;a++){
                        matrix[currRow][a] = -1;
                    }
                    for(int b=0;b<3;b++){
                        matrix[b][currCol] = -1;
                    }
                }
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(matrix[i][j] == -1){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}

class SetMatrixZero{
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};

        SetMatrixZeroBetter s1 = new SetMatrixZeroBetter();
        s1.setZeroes(matrix);

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}