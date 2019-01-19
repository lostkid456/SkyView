public class SkyView {
    private double[][] view;

    public SkyView(int numRows, int numCols, double[] scanned)
    {
        this.view= new double[numRows][numCols];
        int currentPos=0;
        int currentCol=0;

        for(int i=0; i<numRows; i++)
        {
            if(currentCol%2!=0) {
                for (int j = view[i].length-1; j >= 0; j--) {
                    view[i][j] = scanned[currentPos];
                    currentPos++;
                }
            }else{
                for (int j = 0; j < view[i].length; j++) {
                    view[i][j] = scanned[currentPos];
                    currentPos++;
                }
            }
            if(currentPos==scanned.length)
            {
                break;
            }
        }
    }


    public double getAverage(int startRow,int endRow, int startCol, int endCol) {
        double sum = 0;
        int a=endRow-startRow+1;
        int b=endCol-startCol+1;
        for (int i = startRow; i <=endRow; i++) {
            for (int j = startCol; j <=endCol; j++) {
                sum += view[i][j];
            }
        }
        return sum/(a*b);
    }

}
