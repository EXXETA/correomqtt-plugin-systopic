package org;

import javafx.scene.layout.HBox;
import org.controller.SysTopicButtonController;
import org.correomqtt.plugin.spi.MainToolbarHook;
import org.pf4j.Extension;

@Extension
public class SysTopicExtension implements MainToolbarHook {

    @Override
    public void onInstantiateMainToolbar(String connectionId, HBox hBox ) {
        SysTopicButtonController controller = new SysTopicButtonController(connectionId);
        SysTopicPlugin.loadFXML("/controller/pluginSettings.fxml", controller);
        controller.addItems(hBox);
    }
}
