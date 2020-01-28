package BID.SWE;

import BID.SWE.EXAM.Interfaces.Lifts;

public class Lifts2 extends Lifts {

    @Override
    public String GetLiftName() {
        return "Skilift";
    }

    @Override
    public float GetLiftSize(float v) {
        return v+v;
    }

    @Override
    public int AddNewLiftRide(int i) {
        return i;
    }
}
