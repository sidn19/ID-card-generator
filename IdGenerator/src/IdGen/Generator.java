package IdGen;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.*;

public class Generator {

    public static void main(String... args) throws Exception {

        System.out.println("Starting to generate IDs for all the students from the database...");

        Connection con = dbconfig.getConnection();
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from students");
        while(rs.next()) {

            //another way - rs.getString(1) that is rs.getString(COLUMN NUMBER)

            String text = rs.getString("name");
            String text2 = rs.getString("admission_no");
            String text3 = rs.getString("year");
            String text4 = rs.getString("branch");
            String text5 = rs.getString("class");
            String text6 = rs.getString("mob_no");

            File input = new File("C:/ID_Cards/template/template.jpg");
            File output = new File("C:/ID_Cards/output_images/"+text2+".jpg");

            File input2 = new File("C:/ID_Cards/output_images/"+text2+".jpg");
            File output2 = new File("C:/ID_Cards/output_images/"+text2+".jpg");

            File input3 = new File("C:/ID_Cards/output_images/"+text2+".jpg");
            File output3 = new File("C:/ID_Cards/output_images/"+text2+".jpg");

            File input4 = new File("C:/ID_Cards/output_images/"+text2+".jpg");
            File output4 = new File("C:/ID_Cards/output_images/"+text2+".jpg");

            File input5 = new File("C:/ID_Cards/output_images/"+text2+".jpg");
            File output5 = new File("C:/ID_Cards/output_images/"+text2+".jpg");

            File input6 = new File("C:/ID_Cards/output_images/"+text2+".jpg");
            File output6 = new File("C:/ID_Cards/output_images/"+text2+".jpg");


            // adding text as overlay to the template image of the id card
            addTextWatermark(text, "jpg", input, output);
            addTextWatermark2(text2, "jpg", input2, output2);
            addTextWatermark3(text3, "jpg", input3, output3);
            addTextWatermark4(text4, "jpg", input4, output4);
            addTextWatermark5(text5, "jpg", input5, output5);
            addTextWatermark6(text6, "jpg", input6, output6);

            System.out.println("\nId for"+text2+" Generated.");


        }

        con.close();

        pdf.convertAllToPdf();

        System.out.println("\nPdf for all Ids Generated.");
        System.out.println("\nTerminating....\nEnd.");



    }

    private static void addTextWatermark(String text, String type, File source, File destination) throws IOException {
        BufferedImage image = ImageIO.read(source);

        // determine image type and handle correct transparency
        int imageType = "png".equalsIgnoreCase(type) ? BufferedImage.TYPE_INT_ARGB : BufferedImage.TYPE_INT_RGB;
        BufferedImage watermarked = new BufferedImage(image.getWidth(), image.getHeight(), imageType);

        // initializes necessary graphic properties
        Graphics2D w = (Graphics2D) watermarked.getGraphics();
        w.drawImage(image, 0, 0, null);
        AlphaComposite alphaChannel = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1f);
        w.setComposite(alphaChannel);
        w.setColor(new Color(0, 0, 0));
        w.setFont(new Font("Nevis Bold", Font.BOLD, 28));
        FontMetrics fontMetrics = w.getFontMetrics();
        Rectangle2D rect = fontMetrics.getStringBounds(text, w);

        // calculate center of the image
        int centerX = (image.getWidth() - (int) rect.getWidth()) / 2;
        int centerY = (image.getHeight() / 2) - 120;

        // add text overlay to the image
        w.drawString(text, centerX, centerY);
        ImageIO.write(watermarked, type, destination);
        w.dispose();
    }

    private static void addTextWatermark2(String text2, String type, File source, File destination) throws IOException {
        BufferedImage image = ImageIO.read(source);

        // determine image type and handle correct transparency
        int imageType = "png".equalsIgnoreCase(type) ? BufferedImage.TYPE_INT_ARGB : BufferedImage.TYPE_INT_RGB;
        BufferedImage watermarked = new BufferedImage(image.getWidth(), image.getHeight(), imageType);

        // initializes necessary graphic properties
        Graphics2D w = (Graphics2D) watermarked.getGraphics();
        w.drawImage(image, 0, 0, null);
        AlphaComposite alphaChannel = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1f);
        w.setComposite(alphaChannel);
        w.setColor(new Color(0, 0, 0));
        w.setFont(new Font("Nevis Bold", Font.BOLD, 20));
        FontMetrics fontMetrics = w.getFontMetrics();
        Rectangle2D rect = fontMetrics.getStringBounds(text2, w);

        // calculate center of the image
        int centerX = ((image.getWidth() - (int) rect.getWidth()) / 2);
        int centerY = (image.getHeight() / 2) - 50;

        // add text overlay to the image
        w.drawString(text2, centerX, centerY);
        ImageIO.write(watermarked, type, destination);
        w.dispose();
    }

    private static void addTextWatermark3(String text3, String type, File source, File destination) throws IOException {
        BufferedImage image = ImageIO.read(source);

        // determine image type and handle correct transparency
        int imageType = "png".equalsIgnoreCase(type) ? BufferedImage.TYPE_INT_ARGB : BufferedImage.TYPE_INT_RGB;
        BufferedImage watermarked = new BufferedImage(image.getWidth(), image.getHeight(), imageType);

        // initializes necessary graphic properties
        Graphics2D w = (Graphics2D) watermarked.getGraphics();
        w.drawImage(image, 0, 0, null);
        AlphaComposite alphaChannel = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1f);
        w.setComposite(alphaChannel);
        w.setColor(new Color(0, 0, 0));
        w.setFont(new Font("Nevis Bold", Font.BOLD, 20));
        FontMetrics fontMetrics = w.getFontMetrics();
        Rectangle2D rect = fontMetrics.getStringBounds(text3, w);

        // calculate center of the image
        int centerX = ((image.getWidth() - (int) rect.getWidth()) / 2);
        int centerY = (image.getHeight() / 2) ;

        // add text overlay to the image
        w.drawString(text3, centerX, centerY);
        ImageIO.write(watermarked, type, destination);
        w.dispose();
    }

    private static void addTextWatermark4(String text4, String type, File source, File destination) throws IOException {
        BufferedImage image = ImageIO.read(source);

        // determine image type and handle correct transparency
        int imageType = "png".equalsIgnoreCase(type) ? BufferedImage.TYPE_INT_ARGB : BufferedImage.TYPE_INT_RGB;
        BufferedImage watermarked = new BufferedImage(image.getWidth(), image.getHeight(), imageType);

        // initializes necessary graphic properties
        Graphics2D w = (Graphics2D) watermarked.getGraphics();
        w.drawImage(image, 0, 0, null);
        AlphaComposite alphaChannel = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1f);
        w.setComposite(alphaChannel);
        w.setColor(new Color(0, 0, 0));
        w.setFont(new Font("Nevis Bold", Font.BOLD, 20));
        FontMetrics fontMetrics = w.getFontMetrics();
        Rectangle2D rect = fontMetrics.getStringBounds(text4, w);

        // calculate center of the image
        int centerX = ((image.getWidth() - (int) rect.getWidth()) / 2);
        int centerY = (image.getHeight() / 2) + 50;

        // add text overlay to the image
        w.drawString(text4, centerX, centerY);
        ImageIO.write(watermarked, type, destination);
        w.dispose();
    }

    private static void addTextWatermark5(String text5, String type, File source, File destination) throws IOException {
        BufferedImage image = ImageIO.read(source);

        // determine image type and handle correct transparency
        int imageType = "png".equalsIgnoreCase(type) ? BufferedImage.TYPE_INT_ARGB : BufferedImage.TYPE_INT_RGB;
        BufferedImage watermarked = new BufferedImage(image.getWidth(), image.getHeight(), imageType);

        // initializes necessary graphic properties
        Graphics2D w = (Graphics2D) watermarked.getGraphics();
        w.drawImage(image, 0, 0, null);
        AlphaComposite alphaChannel = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1f);
        w.setComposite(alphaChannel);
        w.setColor(new Color(0, 0, 0));
        w.setFont(new Font("Nevis Bold", Font.BOLD, 20));
        FontMetrics fontMetrics = w.getFontMetrics();
        Rectangle2D rect = fontMetrics.getStringBounds(text5, w);

        // calculate center of the image
        int centerX = ((image.getWidth() - (int) rect.getWidth()) / 2);
        int centerY = (image.getHeight() / 2) + 100;

        // add text overlay to the image
        w.drawString(text5, centerX, centerY);
        ImageIO.write(watermarked, type, destination);
        w.dispose();
    }

    private static void addTextWatermark6(String text6, String type, File source, File destination) throws IOException {
        BufferedImage image = ImageIO.read(source);

        // determine image type and handle correct transparency
        int imageType = "png".equalsIgnoreCase(type) ? BufferedImage.TYPE_INT_ARGB : BufferedImage.TYPE_INT_RGB;
        BufferedImage watermarked = new BufferedImage(image.getWidth(), image.getHeight(), imageType);

        // initializes necessary graphic properties
        Graphics2D w = (Graphics2D) watermarked.getGraphics();
        w.drawImage(image, 0, 0, null);
        AlphaComposite alphaChannel = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1f);
        w.setComposite(alphaChannel);
        w.setColor(new Color(0, 0, 0));
        w.setFont(new Font("Nevis Bold", Font.BOLD, 20));
        FontMetrics fontMetrics = w.getFontMetrics();
        Rectangle2D rect = fontMetrics.getStringBounds(text6, w);

        // calculate center of the image
        int centerX = ((image.getWidth() - (int) rect.getWidth()) / 2);
        int centerY = (image.getHeight() / 2) + 150;

        // add text overlay to the image
        w.drawString(text6, centerX, centerY);
        ImageIO.write(watermarked, type, destination);
        w.dispose();
    }

}