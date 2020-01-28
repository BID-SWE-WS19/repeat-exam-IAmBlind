package BID.SWE;

import BID.SWE.EXAM.Interfaces.Exercise3;

public class Exercise3Impl implements Exercise3
{

    @Override
    public Object Method1() {
        return new Lifts2();
    }

    @Override
    public Schneesportgeräte[] Method2() {
        Snowboard snowboard = new Snowboard();
        Ski ski = new Ski();

        Schneesportgeräte[] array = {snowboard, ski};
        return array;
    }
}
