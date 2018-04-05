package resfreshapp.refresh;


import android.graphics.drawable.Drawable;

public class Meal {
    private String title;
    private Drawable id;

    public Meal(){}

    public  Meal(String title, Drawable id){
        this.title = title;
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String name){
        this.title = name;
    }

    public Drawable getId(){
        return id;
    }

}
