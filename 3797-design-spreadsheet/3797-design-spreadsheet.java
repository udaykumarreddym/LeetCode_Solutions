class Spreadsheet {
    private int[][] grid;
    private int rows;
    private static final int COLS = 26; // 'A' - 'Z'
    
    public Spreadsheet(int rows) {
        this.rows = rows;
        grid = new int[rows][COLS];
    }
    
    public void setCell(String cell, int value) {
        int[] pos = parseCell(cell);
        grid[pos[0]][pos[1]] = value;
    }
    
    public void resetCell(String cell) {
        int[] pos = parseCell(cell);
        grid[pos[0]][pos[1]] = 0;
    }
    
    public int getValue(String formula) {
        // Format is always "=X+Y" where X and Y are either cell refs or ints
        String content = formula.substring(1); // remove '='
        String[] parts = content.split("\\+");
        int val1 = parseValue(parts[0]);
        int val2 = parseValue(parts[1]);
        return val1 + val2;
    }
    
    private int parseValue(String str) {
        // If starts with a capital letter, it's a cell
        if (Character.isUpperCase(str.charAt(0))) {
            int[] pos = parseCell(str);
            return grid[pos[0]][pos[1]];
        }
        return Integer.parseInt(str);
    }
    
    private int[] parseCell(String cell) {
        // "A12", "Z3", etc. First char is col, rest is row (1-indexed)
        char colChar = cell.charAt(0);
        int col = colChar - 'A';
        int row = Integer.parseInt(cell.substring(1)) - 1; // 1-indexed
        return new int[]{row, col};
    }
}
