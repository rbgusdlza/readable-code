package cleancode.minesweeper.tobe.cell;

public interface Cell {

    boolean hasNearbyLandMineCount();

    boolean isLandMine();

    CellSnapshot getSnapshot();

    void open();

    void flag();

    boolean isChecked();

    boolean isOpened();

}
