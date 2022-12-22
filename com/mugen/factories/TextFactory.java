package com.mugen.factories;

import com.mugen.document.Document;
import com.mugen.document.DocumentTexte;

public class TextFactory extends DocumentFactory{
    @Override
    public Document createDocument(String typeDocument) {
        if(typeDocument.equals(DocumentFactory.DocumentText))
            return new DocumentTexte(typeDocument);
        return null;
    }
}
