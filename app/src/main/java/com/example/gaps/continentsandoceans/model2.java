package com.example.gaps.continentsandoceans;

public class model2 {
    private String nname;
    private String cnname;
    private String nimage;

    public model2() {
        super();
    }
    public model2(String name, String cname, String image) {
        this.nname = name;
        this.cnname = cname;
        this.nimage = image;
    }
    public String getName() {
        return nname;
    }

    public String getCname() {
        return cnname;
    }

    public String getImage() {
        return nimage;
    }

    public void setName(String name) {
        this.nname = name;
    }

    public void setCname(String cname) {
        this.cnname = cname;
    }

    public void setImage(String image) {
        this.nimage = image;
    }
}
