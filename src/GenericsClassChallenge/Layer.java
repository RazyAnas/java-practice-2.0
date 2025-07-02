package GenericsClassChallenge;

import java.util.ArrayList;
import java.util.List;

public class Layer <T extends Mappable> { // this doesn't mean it extends Mappable this means only Mappable type allowed

    private List<T> layerElements;

    public Layer(T[] layerElements) {
        this.layerElements = new ArrayList<>(List.of(layerElements));
    }

    public void addElements(T... elements) {
        layerElements.addAll(List.of(elements));
    }

    public void renderLayer() {
        for (T element : layerElements) {
            if (element != null) {
                element.render();
            }
        }
    }
}
