package net.twasi.obsremotejava.requests.GetSceneItemProperties;

import com.google.gson.annotations.SerializedName;
import net.twasi.obsremotejava.OBSCommunicator;
import net.twasi.obsremotejava.requests.BaseRequest;
import net.twasi.obsremotejava.requests.RequestType;

public class GetSceneItemPropertiesRequest extends BaseRequest {
    @SerializedName("scene-name")
    private String sceneName;
    private Item item;

    private class Item {
        private String id;
        private String name;

        public Item(String id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    public GetSceneItemPropertiesRequest(OBSCommunicator com, String scene, String source) {
        super(RequestType.GetSceneItemProperties);

        sceneName = scene;
        item = new Item(null, source);

        com.messageTypes.put(getMessageId(), GetSceneItemPropertiesResponse.class);
    }
}
