package com.erwinhenraat;

import java.io.*;

/**
 * Created by e.henraat on 21-4-2016.
 */
public class Copier {
    InputStream is = null;
    OutputStream os = null;
    public Copier(){




    }
    public void copyFileTo(String source, String output )throws IOException
    {
        try
        {
            System.out.println("trying to copy "+ source);
            is = new FileInputStream(source);
            os = new FileOutputStream(output);

            int b;
            while((b = is.read()) != -1) {
                os.write(b);
                //System.out.println("copied 8 bits");
            }
        }
        catch(IOException e)
        {
            System.out.println("exception "+e.getMessage());
        }
        finally
        {
            if(is!=null)
            {
                is.close();
            }
            if(os!=null)
            {
                os.close();
                System.out.println("copy done");
            }
        }

    }
}
