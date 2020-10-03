package net.twasi.obsremotejava.requests.ReorderSceneItems;

import net.twasi.obsremotejava.OBSCommunicator;
import net.twasi.obsremotejava.requests.BaseRequest;
import net.twasi.obsremotejava.requests.RequestType;

import java.util.List;

public class ReorderSceneItemsRequest extends BaseRequest {
    public ReorderSceneItemsRequest(OBSCommunicator com, String scene, List<Item> items) {
        super(RequestType.ReorderSceneItems);

        this.scene = scene;
        this.items = items;
    }

    private String scene;
    private List<Item> items;

    public class Item {
        private String id;
        private String name;

        public Item(String id, String name) {
            this.id = id;
            this.name = name;
        }
    }
}
