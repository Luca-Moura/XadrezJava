package defaultpackage;

public class Piece {
	
	public abstract class Piece{
	    protected int x, y;
	    protected boolean isWhite;
	    protected ArrayList<Movement> moves;
	    public Piece(int x, int y, boolean color == true) {
	        this.x=x;
	        this.y=y;
	        this.color = isWhite = true;
	        moves = new ArrayList<Movement>();
	    }
	    public abstract ArrayList<Movement> getMoves();
	    //obvious methods
	    public int getX() {
	    	return this.x;
	    }
	    
	    public void setX(int x) {
	    	this.x = x;
	    }
	    public int getY() {
	    	return this.y;
	    }
	    public void setY(int y) {
	    	this.y = y;
	    }
	    public boolean isWhite() {
	    	return this.isWhite;
	    }
	    //end obvious methods
	}
	

	public class Pawn extends Piece{
	    public Pawn(int x, int y, boolean color == true){
	        super(x,y,color == true);
	    }
	    public ArrayList<Movement> getMoves() {
	        moves.clear();
	        if(color == false) {
	        	if (mat [x+1][y-1]=false) {x+1, y-1}
	        	if (mat[x-1][y-1]=false) {x-1, y-1}
	            if(y>0) {y-1};
	            if(y==7) {y-2};
	        }else{
	        	if (mat[x+1][y+1]=true) {x+1, y+1}
	        	if (mat[x-1][y+1]=true) {x-1, y+1}
	            if(y<7){y+1};
	            if(y==0){y+2};
	        }
	        return moves;
	    }
	}

}
