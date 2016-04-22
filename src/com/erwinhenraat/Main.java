package com.erwinhenraat;

import java.io.IOException;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        Mailer m = new Mailer();
        m.sendMailTo("e.henraat@gmail.com", "e.henraat@ma-web.nl", "hi there", "Congratulations!!!!");
        */
//        ImageLoader image = new ImageLoader();


        Copier c = new Copier();
        try {

            Date d = new Date();
            c.copyFileTo("bike.jpg", ("bike_"+ d.getTime() +".jpg"));
        }
        catch(IOException e){}

    }
}
