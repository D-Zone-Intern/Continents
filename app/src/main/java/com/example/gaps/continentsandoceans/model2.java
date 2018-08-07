package com.example.gaps.continentsandoceans;

public class model2 {
    private String oname;
    private String odesc;
    private String oimage;

    public model2() {
        super();
    }
    public model2(String oname, String odesc, String oimage) {
        this.oname = oname;
        this.odesc = odesc;
        this.oimage = oimage;
    }

    public String getoName() {
        return oname;
    }

    public void setoName(String name) {
        this.oname = oname;
    }

    public String getoDesc() {
        return odesc;
    }

    public void setoDesc(String desc) {
        this.odesc = odesc;
    }

    public String getoImage() {
        return oimage;
    }

    public void setoImage(String image) {
        this.oimage = oimage;
    }
}

