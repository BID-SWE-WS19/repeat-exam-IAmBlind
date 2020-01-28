package BID.SWE;

import BID.SWE.EXAM.Interfaces.Exercise2;

public class Exercise2Impl implements Exercise2
{
    @Override
    public Object Method1() {
        return new Cell2();
    }

    @Override
    public int Method2() {
        Cell2 cell = new Cell2();
        return cell.Grow();
    }

    @Override
    public boolean Method3(int i) {
        Cell2 cell = new Cell2();
        return cell.IsAlive(i);
    }
}


