package net.twasi.obsremotejava.objects;

import java.util.List;

public class Source {
    private double cx;
    private double cy;
    private Double alignment;
    private String name;
    private Integer id;
    private Boolean render;
    private Boolean muted;
    private Boolean locked;
    private int source_cx;
    private int source_cy;
    private String type;
    private double volume;
    private double x;
    private double y;
    //private List<Source> sources;
    private String parentGroupName;
    private List<Source> groupChildren;

    public String getName() {
        return name;
    }

    public double getCX() { return cx; }
    public double getCY() { return cy; }

    public boolean isRender() {
        return render;
    }

    public int getSourceCX() { return source_cx; }
    public int getSourceCY() { return source_cy; }

    public String getType() { return type; }

    public double getVolume() { return volume; }

    public double getX() { return x; }
    public double getY() { return y; }

    public String getParentGroupName() {
        return parentGroupName;
    }

    public List<Source> getGroupChildren() {
        return groupChildren;
    }

    public Double getAlignment() {
        return alignment;
    }

    public Integer getId() {
        return id;
    }

    public Boolean getMuted() {
        return muted;
    }

    public Boolean getLocked() {
        return locked;
    }

    /* public List<Source> getSources() {
        return sources;
    }*/
}
