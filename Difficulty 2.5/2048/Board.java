public class Board{
    protected int[][] tile;
    protected int width, height;

    public Board(int _width, int _height) {
        this.width = _width;
        this.height = _height;
        tile = new int[width][height];
    }

    public void addTile(int x, int y, int value) {
       if(value != 0) {
           tile[x][y] = value;
       } else {}
    }

    public void evalMove(int type, int numOfMoves) {
        for(int i = numOfMoves; i > 0; i--) {
            if(type == 0) {
                this.shiftLeft();
            } else if (type == 1) {
                this.shiftUp();
            } else if (type == 2) {
                this.shiftRight();
            } else if (type == 3) {
                this.shiftDown();
            } else {
                //invalid...
            }
        }
    }

    public void shiftLeft() {
        sumH(1);
        flushH(1);
    }

    public void shiftUp() {
        sumV(1);
        flushV(1);
    }

    public void shiftRight() {
        sumH(-1);
        flushH(-1);
    }

    public void  shiftDown() {
        sumV(-1);
        flushV(-1);
    }

    public void flushH(int direction) {
        int[][] temp = new int[this.width][this.height];
        for(int y = 0; y < this.height; y++) {
            int idx, start, end;
            if (direction == 1) {
                idx = 0;
                start = 0;
                end = this.width -1;
            } else {
                idx = this.width - 1;
                start = idx;
                end = 0;
            }
            for(int i = start; i != end + direction; i += direction) {
                if(tile[i][y] != 0) {
                    temp[idx][y] = tile[i][y];
                    idx += direction;
                } else {}
            }
        }
        tile = temp;
    }

    public void flushV(int direction) {
        for(int x = 0; x < this.width; x++) {
            int idx, start, end;
            if (direction == 1) {
                idx = 0;
                start = 0;
                end = this.height - 1;
            } else {
                idx = this.height - 1;
                start = idx;
                end = 0;
            }
            int[] temp = new int[this.height];
            for (int i = start; i != end + direction; i += direction) {
                if (tile[x][i] != 0) {
                    temp[idx] = tile[x][i];
                    idx += direction;
                } else {}
            }
            tile[x] = temp;
        }
    }

    public void sumH(int direction) {
        int start, end;
        if (direction == 1) { // from left
            start = 0;
            end = this.width - 1;
        } else { // direction -1 // from right
            start = this.width - 1;
            end = 0;
        }
        for (int y = 0; y < this.height; y++) {
            for (int i = start; i != end; i += direction) { // first element
                if (tile[i][y] != 0) {
                    for (int j = i + direction; j != end + direction; j += direction) { // second element
                        if (tile[j][y] == tile[i][y]) {
                            tile[i][y] += tile[j][y];
                            tile[j][y] = 0;
                            break;
                        } else if (tile[j][y] == 0) {
                            //
                        } else {
                            break;
                        }
                    }
                } else {
                }
            }
        }
    }

    public void sumV(int direction) {
        int start, end;
        if (direction == 1) { // from top
            start = 0;
            end = this.height - 1;
        } else { // direction -1 // from bottom
            start = this.height - 1;
            end = 0;
        }
        for (int x = 0; x < this.width; x++) {
            for (int i = start; i != end; i += direction) { // first element
                if (tile[x][i] != 0) {
                    for (int j = i + direction; j != end + direction; j += direction) { // second element
                        if (tile[x][j] == tile[x][i]) {
                            tile[x][i] += tile[x][j];
                            tile[x][j] = 0;
                            break;
                        } else if (tile[x][j] == 0) {
                            //
                        } else {
                            break;
                        }
                    }
                } else { }
            }
        }
    }

    @Override
    public String toString() {
        return String.format(
                     "%d %d %d %d\n" +
                     "%d %d %d %d\n" +
                     "%d %d %d %d\n" +
                     "%d %d %d %d\n",
                tile[0][0], tile[1][0], tile[2][0], tile[3][0],
                tile[0][1], tile[1][1], tile[2][1], tile[3][1],
                tile[0][2], tile[1][2], tile[2][2], tile[3][2],
                tile[0][3], tile[1][3], tile[2][3], tile[3][3]);
    }
}