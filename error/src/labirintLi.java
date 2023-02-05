
import java.util.LinkedList;
import java.util.Queue;

public class labirintLi {
    public static void main(String[] args) {
        
    
    int[][] labirint = new int[10][10];
    labirint[3][0] = -1;
    labirint[5][4] = -1;
    int x = 4;
    int y = 4;

    labirint[x][y] = 0;
    Queue<int[]> queueOfNext = new LinkedList<>();
    

    while (labirint[9][9] == 0) {
        for (int i = 1; i < 5; i++) {
        
            switch (i) {
                case 1:
                    if (labirint[x][y + 1] == 0) {
                        labirint[x][y + 1] = labirint[x][y] + 1;
                        int[] next = new int[] { x, y + 1 };

                        queueOfNext.add(next);
                    }
                    break;
                case 2:
                    if (labirint [x + 1][y] == 0) {
                        labirint[x + 1][y] = labirint[x][y] + 2;
                        int[] next = new int[] { x + 1, y };
                        queueOfNext.add(next);
                    }
                    break;
                case 3:
                    if (labirint[x][y - 1] == 0) {
                        labirint[x][y - 1] = labirint[x][y] + 3;
                        int[] next = new int[] { x, y - 1 };
                        queueOfNext.add(next);
                    }
                    break;
                case 4:
                    if (labirint[x - 1][y] == 0) {
                        labirint[x - 1][y] = labirint[x][y] + 4;
                        int[] next = new int[] { x - 1, y };
                        queueOfNext.add(next);
                    }
                    break;
                default:
                    break;
            }
        }

    }
}
}


