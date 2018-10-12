package algorithm;

/**
 * Created with Intellij IDEA.
 *
 * @author potoyang
 * Create: 2018/8/2 11:27
 * Modified By:
 * Description:
 */

class MyMaze {
    private int startPosI;
    private int startPosJ;
    private int endPosI;
    private int endPosJ;

    public void setStart(int startPosI, int startPosJ) {
        this.startPosI = startPosI;
        this.startPosJ = startPosJ;
    }

    public void setEnd(int endPosI, int endPosJ) {
        this.endPosI = endPosI;
        this.endPosJ = endPosJ;
    }

    public void visited(int[][] cell, int i, int j) {
        cell[i][j] = 1;
        String oriention = "";

        if (i == endPosI && j == endPosJ) {
            System.out.println("找到一条通路");
            for (int[] aCell : cell) {
                for (int n = 0; n < cell[i].length; n++) {
                    if (aCell[n] == 2) {
                        System.out.print("2");
                    } else if (aCell[n] == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print("0");
                    }
                }
                System.out.println();
            }
        }

        if (cell[i][j - 1] == 0) {
            oriention = "left";
            visited(cell, i, j - 1);
        }

        if (cell[i][j + 1] == 0) {
            oriention = "right";
            visited(cell, i, j + 1);
        }

        if (cell[i - 1][j] == 0) {
            oriention = "up";
            visited(cell, i - 1, j);
        }

        if (cell[i + 1][j] == 0) {
            oriention = "down";
            visited(cell, i + 1, j);
        }

        oriention = "no";
        cell[i][j] = 0;
    }
}

public class BackTracking {
    public static void main(String[] args) {
        // 初始化一个迷宫地图
        int[][] maze = {
                {2, 2, 2, 2, 2, 2, 2, 2, 2},
                {2, 0, 0, 0, 0, 0, 0, 0, 2},
                {2, 0, 2, 2, 0, 2, 2, 0, 2},
                {2, 0, 2, 0, 0, 2, 0, 0, 2},
                {2, 0, 2, 0, 2, 2, 2, 0, 2},
                {2, 0, 2, 0, 2, 2, 2, 0, 2},
                {2, 2, 2, 0, 2, 0, 0, 2, 2},
                {2, 0, 0, 0, 0, 0, 0, 0, 2},
                {2, 2, 2, 2, 2, 2, 2, 2, 2}
        };

        MyMaze cell = new MyMaze();
        cell.setStart(1, 1);
        cell.setEnd(7, 7);
        cell.visited(maze, 1, 1);
//        int[][] maze2 = { { 2, 2, 2, 2 }, { 2, 0, 0, 2 }, { 2, 0, 0, 2 },
//                { 2, 2, 2, 2 } };
//        MyMaze cell = new MyMaze();
//        cell.setStart(1, 1);
//        cell.setEnd(2, 2);
//        cell.visited(maze2, 1, 1);
    }
}
