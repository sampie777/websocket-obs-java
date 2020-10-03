package net.twasi.obsremotejava.requests.GetCurrentScene;

import net.twasi.obsremotejava.objects.Source;
import net.twasi.obsremotejava.requests.ResponseBase;

import java.util.List;

public class GetCurrentSceneResponse extends ResponseBase {
    private String name;
    private List<Source> sources;

    public String getName() {
        return name;
    }

    public List<Source> getSources() {
        return sources;
    }
}
