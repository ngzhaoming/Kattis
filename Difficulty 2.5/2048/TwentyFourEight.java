import java.util.*;

public class TwentyFourEight{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // create board
        Board game1 = new Board(4, 4);
        // populate board
        for(int y = 0; y < 4; y++) {
            for(int x = 0; x < 4; x++) {
                game1.addTile(x, y, sc.nextInt());
            }
        }
        // evaluate action
        game1.evalMove(sc.nextInt(), 1);
        // print board after
        System.out.print(game1);
    }
}


