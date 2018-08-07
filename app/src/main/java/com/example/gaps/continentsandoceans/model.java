package com.example.gaps.continentsandoceans;

import android.support.annotation.Keep;

import com.google.firebase.database.IgnoreExtraProperties;

import java.io.Serializable;

@IgnoreExtraProperties
@Keep
public class model implements Serializable {
    public String name;
    public String desc;
    public String image;

    public model() {
        super();
    }
<<<<<<< HEAD
<<<<<<< HEAD

=======
>>>>>>> vikash
    public model(String name, String cname, String image) {
=======
    public model(String name, String desc, String image) {
>>>>>>> vikash
        this.name = name;
        this.desc = desc;
        this.image = image;
    }
<<<<<<< HEAD
<<<<<<< HEAD

=======
>>>>>>> vikash
=======

>>>>>>> vikash
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
