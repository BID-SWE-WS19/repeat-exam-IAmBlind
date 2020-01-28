package BID.SWE;

import BID.SWE.EXAM.Interfaces.Exercise5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.LinkedList;

public class Exercise5Impl implements Exercise5
{

    @Override
    public Object Method1(String s, int i) {
        LinkedList<String> l = new LinkedList<>();
        try{
            Socket socket = new Socket(s, i);
            InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String x;
            while((x = bufferedReader.readLine()) != null){
                l.add(x);
            }

        }catch (IOException e){
            e.printStackTrace();
        }

        return l;
    }
}
