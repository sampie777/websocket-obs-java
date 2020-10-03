package net.twasi.obsremotejava.requests.GetSceneItemProperties;

import net.twasi.obsremotejava.objects.SceneItemTransform;
import net.twasi.obsremotejava.requests.ResponseBase;

import java.util.List;

public class GetSceneItemPropertiesResponse extends ResponseBase {
    private String name;
    private Integer itemId;
    private Boolean visible;
    private Boolean muted;
    private Boolean locked;
    private String parentGroupName;
    private List<SceneItemTransform> groupChildren;

    public String getName() {
        return name;
    }

    public Integer getItemId() {
        return itemId;
    }

    public Boolean getVisible() {
        return visible;
    }

    public Boolean getMuted() {
        return muted;
    }

    public Boolean getLocked() {
        return locked;
    }

    public String getParentGroupName() {
        return parentGroupName;
    }

    public List<SceneItemTransform> getGroupChildren() {
        return groupChildren;
    }
}
