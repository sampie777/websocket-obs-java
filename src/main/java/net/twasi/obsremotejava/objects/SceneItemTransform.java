package net.twasi.obsremotejava.objects;

import java.util.List;

public class SceneItemTransform {
    private Boolean visible;
    private Boolean muted;
    private String parentGroupName;
    private List<SceneItemTransform> groupChildren;

    public Boolean getVisible() {
        return visible;
    }

    public Boolean getMuted() {
        return muted;
    }

    public String getParentGroupName() {
        return parentGroupName;
    }

    public List<SceneItemTransform> getGroupChildren() {
        return groupChildren;
    }
}
