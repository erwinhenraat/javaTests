package com.erwinhenraat;

import java.awt.image.BufferedImage;


/**
 * Created by e.henraat on 21-4-2016.
 */
public class ImageLoader{
    private BufferedImage img;
    public ImageLoader()
    {
        System.out.println("imageLoader");
        /*
        ImageIcon image = new ImageIcon("bike.jpg");
        JLabel label = new JLabel(image);

        JFrame frame = new JFrame("test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(label);
*/
        //Canvas version
       /*
        try {
            img = ImageIO.read(new File("bike.jpg"));


        }
        catch (IOException e) {
            System.out.println("file not found");
        }

        */




        //Applet version
        /*

        System.out.println("Applet constructor");
        try{

            URL codeBase = getCodeBase();
            System.out.println(codeBase);

            URL url = new URL(codeBase, "bike.jpg");
            img = ImageIO.read(url);
        }
        catch(IOException e)
        {
            System.out.println("file not found");
        }
        */

    }
    /*
    public void paint(Graphics g)
    {
        System.out.println("draw");
        Graphics2D g2 = (Graphics2D)g;
        g2.drawImage(img, 0,0,null);


    }
*/
}
