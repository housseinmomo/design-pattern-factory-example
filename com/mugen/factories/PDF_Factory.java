package com.mugen.factories;

import com.mugen.document.Document;
import com.mugen.document.PDF;

public class PDF_Factory extends DocumentFactory{
    @Override
    public Document createDocument(String typeDocument) {
        if(typeDocument.equals(DocumentFactory.DocumentPDF))
            return new PDF(typeDocument);
        return null;
    }
}
