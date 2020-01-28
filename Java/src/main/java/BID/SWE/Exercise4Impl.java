package BID.SWE;

import BID.SWE.EXAM.Interfaces.Exercise4;

import java.io.*;

public class Exercise4Impl implements Exercise4
{

    @Override
    public ByteArrayInputStream Method1() {
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        DataOutputStream out = new DataOutputStream(byteOut);

        try{
            out.writeBytes("Loard of the Boards");
            out.writeInt(27);
            out.writeBoolean(true);
        }catch (IOException e){
            e.printStackTrace();
        }
        return new ByteArrayInputStream(byteOut.toByteArray());
    }

    @Override
    public Object Method2(Object o) {
        InputStream s = (InputStream) o;
        DataInputStream dis = new DataInputStream(s);

        try{
            dis.readInt();
            dis.readBoolean();
            dis.read();
            return dis.readUTF();
        }catch (IOException e){
            e.printStackTrace();
            return null;
        }
    }
}
