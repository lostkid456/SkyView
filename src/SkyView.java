public class SkyView {
    private double[][] view;

    public SkyView(int numRows,int numCols,double[] scanned) {
        int currPos = 0;
        this.view = new double[numRows][numCols];
        for(int i=0;i<numRows;i++){
            if(i%2==0){
                for(int j=0;j<numCols;j++){
                    scanned[currPos]=view[i][j];
                }
            } else {
                for(int j=numCols;j<0;j--){
                    scanned[currPos]=view[i][j];
                }
            }
        }
    }

    public double getAverage(int startRow,int endRow, int startCol, int endCol) {
        int sum = 0;
        int a=endRow-startRow;
        int b=endCol-startCol;
        for (int i = startRow; i < endRow; i++) {
            for (int j = startCol; j < endCol; j++) {
                sum += view[i][j];
            }
        }
        return sum/(a*b);
    }
}
