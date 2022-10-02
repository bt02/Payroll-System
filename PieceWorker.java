// PieceWorker class inherits from Employee
// and accesses the superclass’s private data via inherited
// public methods.
public class PieceWorker extends Employee {
    private int pieces; //pieces made
    private double wage; //wage per piece


    //constructor
    public PieceWorker(String firstName, String lastName,
                       String socialSecurityNumber, int pieces, double wage)
    {
        super(firstName, lastName, socialSecurityNumber);
        //piece and wage validation
        if(pieces <0){
            throw new IllegalArgumentException(
                    "Pieces must be greater than or equal to 0");
        }
        if(wage <0){
            throw new IllegalArgumentException(
                    "Wage must be greater than or equal to 0");
        }
        this.pieces = pieces;
        this.wage = wage;
    }
    //set piece amount
    public void setPieces(int pieces){
        if(pieces <0) {
            throw new IllegalArgumentException(
                    "Pieces must be greater than or equal to 0");
        }
        this.pieces=pieces;
    }
    //set wage per piece amount
    public void setWage(double wage){
        if(wage <0) {
            throw new IllegalArgumentException(
                    "Wage must be greater than or equal to 0");
        }
        this.wage=wage;
    }
    //get piece amount
    public int getPieces(){return pieces;}
    //get piece pay rate
    public double getWage(){return wage;}
    //set new earnings amount
    @Override
    public double earnings(){
        return getPieces() * getWage();
    }
    //return String representation of PieceWorker object
    @Override
    public String toString()
    {
        return String.format("Piece Worker: %s%n%s: $%,.2f; %s: %d",
                super.toString(), "Piece rate", getWage(),
                "Pieces made", getPieces());
    }
}


