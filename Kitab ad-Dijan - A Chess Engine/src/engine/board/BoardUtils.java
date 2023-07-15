package engine.board;

public class BoardUtils {

    private BoardUtils(){
        throw new RuntimeException("You cannot instantiate BoardUtils.");
    }

    public static boolean isValidTileCoordinate(int candidateDestinationCoordinate) {
        return candidateDestinationCoordinate >= 0 && candidateDestinationCoordinate < 64;
    }

    public static final boolean[] FIRST_COLUMN = null;
    public static final boolean[] SECOND_COLUMN = null;
    public static final boolean[] SEVENTH_COLUMN = null;
    public static final boolean[] EIGHT_COLUMN = null;



}
