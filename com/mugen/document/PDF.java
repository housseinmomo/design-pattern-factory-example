package com.mugen.document;

public class PDF extends Document{


    public PDF( String typeDocument) {
        super(typeDocument);
    }

    @Override
    public String saveDocument() {
        return "Sauvegarde";
    }

    @Override
    public String closeDocument() {
        return null;
    }

    @Override
    public String openDocument() {
        return null;
    }
}
