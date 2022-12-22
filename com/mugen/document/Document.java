package com.mugen.document;

public abstract class Document {

    private static int countDocument = 0;
    private int id ;
    private String typeDocument;



    public Document(String typeDocument) {
        countDocument++;
        this.id = countDocument;
        this.typeDocument = typeDocument;
    }

    public abstract String saveDocument();

    public abstract String closeDocument();

    public abstract String openDocument();

    public int getId() {
        return id;
    }


    public void descDocument(){
        System.out.println("{ ID Document : " + this.id + " | Type Document : " + this.typeDocument + " }");
    }

}
