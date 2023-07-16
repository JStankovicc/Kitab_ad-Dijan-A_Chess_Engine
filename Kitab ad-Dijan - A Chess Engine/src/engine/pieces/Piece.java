package engine.pieces;

import engine.Alliance;
import engine.board.Board;
import engine.board.Move;

import java.util.Collection;

public abstract class Piece {

    protected final int piecePosition;
    protected final Alliance pieceAlliance;
    protected final boolean isFirstMove;

    Piece(final int piecePosition, final Alliance pieceAlliance){
        this.piecePosition = piecePosition;
        this.pieceAlliance = pieceAlliance;
        isFirstMove = false;
    }

    public boolean isFirstMove() {
        return isFirstMove;
    }

    public Alliance getPieceAlliance(){
        return this.pieceAlliance;
    }

    public abstract Collection<Move> calculateLegalMoves(final Board board);


}
