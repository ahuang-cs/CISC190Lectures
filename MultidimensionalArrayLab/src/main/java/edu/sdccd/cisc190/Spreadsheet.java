package edu.sdccd.cisc190;

public class Spreadsheet {
    private int[][] sheet;

    public Spreadsheet(int[][] sheet) {
        this.sheet = sheet;
    }

    public int[][] getSheet() {
        return sheet;
    }

    public void setSheet(int[][] sheet) {
        this.sheet = sheet;
    }

    public int max() {
        Integer max = null;
        //find max value in the sheet
        // i iterates through all the rows
        for (int i = 0; i < sheet.length; i++) {
            // j iterates through all the columns of row i
            for (int j = 0; j < sheet[i].length; j++) {
                try {
                    if(max == null) max = sheet[i][j];
                    else max = Math.max(max, sheet[i][j]);
                } catch(ArrayIndexOutOfBoundsException e) {

                }
            }
        }
        return max;
    }

    public int rowSum(int row) {
        int sum = 0;
        // get the sum of all the ints in the specified row
        for(int i = 0; i < sheet[row].length; i++) {
            sum += sheet[row][i];
        }
        return sum;
    }
    public int colSum(int col) {
        int sum = 0;
        // get the sum of all the ints in the specified col
        // iterate through all the rows
        for(int i = 0; i < sheet.length; i++) {
             try {
                 sum += sheet[i][col];
             } catch(ArrayIndexOutOfBoundsException e) {

             }
        }
        return sum;
    }
    public int[] getRowSums() {
        int[] sums = new int[sheet.length];
        // get the sum of all ints of all rows
        for(int i = 0; i < sheet.length; i++) {
            sums[i] = rowSum(i);
        }
        return sums;
    }

    private void swap(int[] row, int from, int to) {
        int temp = row[to];
        row[to] = row[from];
        row[from] = temp;
    }

    public void sortRowsAscending() {
        // iterate through rows
        for(int i = 0; i < sheet.length; i++) {
            try {
                //iterate through columns
                for (int j = 0; j < sheet[i].length; j++) {
                    int min = sheet[i][j];
                    int minIndex = j;
                    //iterating through columns greater than i
                    for (int k = j + 1; k < sheet[i].length; k++) {
                        if (sheet[i][k] < min) {
                            min = sheet[i][k];
                            minIndex = k;
                        }
                    }
                    if (minIndex != j) swap(sheet[i], j, minIndex);
                }
            } catch(ArrayIndexOutOfBoundsException e) {

            }
        }
    }
}
