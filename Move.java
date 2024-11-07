package Pokedex;

public class Move {
    // <Place comments here>
    private String moveName;
    private int movePower;
    private int moveSpeed;

    // <Place comments here>
    public Move(String moveName, int movePower, int moveSpeed) {
        this.moveName = moveName;
        this.movePower = movePower;
        this.moveSpeed = moveSpeed;
    }

    // <Place comments here>
    public String getMoveName() {
        return moveName;
    }

    public int getMovePower() {
        return movePower;
    }

    public int getMoveSpeed() {
        return moveSpeed;
    }

    // <Place comments here>
    @Override
    public String toString() {
        return String.format("Move: %s\n" +
                        "Power: %d\n" +
                        "Speed: %d\n",
                moveName, movePower, moveSpeed);
    }
}

