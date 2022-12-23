package com.mugen.document;

public class DocumentTexte extends Document{


    public DocumentTexte(String typeDocument) {
        super(typeDocument);
    }

    @Override
    public String saveDocument() {
        return "Sauvegarde";
    }

    @Override
    public String closeDocument() {
        return "Fermeture";
    }

    @Override
    public String openDocument() {
        return "Ouverture";
    }
}
