package model;

/**
 * Representation of a 3-dimensional field for the "Game Of Life".
 */
public class Field3D {

    // Variables
    private int[][][] field;
    private int sizeX;
    private int sizeY;
    private int sizeZ;
    private long generation;

    /**
     * Constructor of a new field with a given size.
     * @param x
     * @param y
     * @param z
     */
    public Field3D(int x, int y, int z) {
        sizeX = x;
        sizeY = y;
        sizeZ = z;
        resetField();
    }

    /**
     * Sets each cell in the field to 0.
     */
    public void resetField() {
        field = new int[sizeX][sizeY][sizeZ];
    }

    public void setCell(int x, int y, int z, int value) {
        field[x][y][z] = value;
    }

    public int getCell(int x, int y, int z) {
        return field[x][y][z];
    }

    public int[][][] getField() {
        return field;
    }

    public void setField(int[][][] field) {
        this.field = field;
    }

    public int getSizeX() {
        return sizeX;
    }

    public void setSizeX(int sizeX) {
        this.sizeX = sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public void setSizeY(int sizeY) {
        this.sizeY = sizeY;
    }

    public int getSizeZ() {
        return sizeZ;
    }

    public void setSizeZ(int sizeZ) {
        this.sizeZ = sizeZ;
    }

    public long getGeneration() {
        return generation;
    }

    public void setGeneration(long generation) {
        this.generation = generation;
    }
}
