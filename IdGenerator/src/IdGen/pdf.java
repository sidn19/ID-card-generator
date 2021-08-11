package IdGen;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfWriter;

public class pdf {

    public static void convertAllToPdf() throws Exception {
        File root = new File("C:/ID_Cards/output_images/");
        String outputFile = "All_Generated_IDs.pdf";

        List<String> files = new ArrayList<String>();

        File[] imgs = new File("C:/ID_Cards/output_images").listFiles();

        for (File file : imgs) {
            if (file.isFile()) {
                files.add(file.getName());
            }
        }

        Rectangle pgsiz = new Rectangle(160, 250);
        Document document = new Document(pgsiz);
        PdfWriter.getInstance(document, new FileOutputStream(new File("C:/ID_Cards/output_pdf/", outputFile)));
        document.open();
        for (String f : files) {
            document.newPage();
            Image image = Image.getInstance(new File(root, f).getAbsolutePath());
            image.setAbsolutePosition(0, 0);
            image.setBorderWidth(25);
            image.scaleAbsoluteHeight(250);
            image.scaleAbsoluteWidth(160);
            document.add(image);
        }
        document.close();
    }
}