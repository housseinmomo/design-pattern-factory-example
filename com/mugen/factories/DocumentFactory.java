package com.mugen.factories;

import com.mugen.document.Document;

public  abstract  class DocumentFactory {

    public static String DocumentText = "DocumentText";
    public static String DocumentPDF = "DocumentPDF";

    public abstract Document createDocument(String typeDocument);

}
