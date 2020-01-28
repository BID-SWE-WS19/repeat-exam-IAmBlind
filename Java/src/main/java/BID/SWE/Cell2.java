package BID.SWE;

import BID.SWE.EXAM.Interfaces.Cell;

public class Cell2 extends Cell {
    @Override
    public int Grow(){
        _size*=2;
        return _size;
    }

    public Boolean IsAlive(int Neighbours) {
        return Neighbours % 2 == 0;
    }
}
