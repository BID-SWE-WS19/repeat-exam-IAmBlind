package BID.SWE;

import BID.SWE.EXAM.Interfaces.SkiAreaPrinter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

class SkiAreaePrinter implements SkiAreaPrinter{

    @Override
    public String PrintSnowState(boolean b, Date date, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("The snow on the ");

        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        String datum = dateFormat.format(date);

        sb.append(date);
        sb.append("is");

        if(b == true){
            sb.append(i).append("cm high and present");
        }
        return sb.toString();
    }

    @Override
    public String PrintOpenSlops(int i, int i1) {
        StringBuilder sb = new StringBuilder();
        sb.append("From").append(i).append("Slopes are").append(i1).append("open");
        /*if(i1 > i){
            System.out.println("");
        }*/
        return sb.toString();
    }
}

