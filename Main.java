import com.mugen.document.Document;
import com.mugen.factories.DocumentFactory;
import com.mugen.factories.PDF_Factory;
import com.mugen.factories.TextFactory;

public class Main {
    public static void main(String[] args) {

        // creation des factories

        PDF_Factory pdf_factory = new PDF_Factory();
        TextFactory textFactory = new TextFactory();

        // creation des documents

        Document pdf = pdf_factory.createDocument(DocumentFactory.DocumentPDF);
        Document pdf2 = pdf_factory.createDocument(DocumentFactory.DocumentPDF);
        Document text = textFactory.createDocument(DocumentFactory.DocumentText);
        Document text2 = textFactory.createDocument(DocumentFactory.DocumentText);

        // Verification des documents

        pdf.descDocument();
        pdf2.descDocument();
        text.descDocument();
        text2.descDocument();
    }

}
