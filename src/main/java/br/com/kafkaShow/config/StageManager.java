package br.com.kafkaShow.config;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class StageManager {
    private final Stage primaryStage;
    private final FxmlLoader fxmlLoader;
    private final String applicationTitle;

    public StageManager(FxmlLoader fxmlLoader, Stage stage, String applicationTitle) {
        this.primaryStage = stage;
        this.fxmlLoader = fxmlLoader;
        this.applicationTitle = applicationTitle;
    }

    public void switchScene(final FxmlViewEnum viewEnum) {
        primaryStage.setTitle(applicationTitle);
        Parent rootNode = loadRootNode(viewEnum.getFxmlPath());
        Scene scene = new Scene(rootNode);
        String styleSheet = Objects.requireNonNull(String.valueOf(getClass().getResource("/styles/styles.css")));
        scene.getStylesheets().add(styleSheet);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void switchToNextScene(final FxmlViewEnum view) {
        Parent rootNode = loadRootNode(view.getFxmlPath());
        primaryStage.getScene().setRoot(rootNode);

        primaryStage.show();
    }

    private Parent loadRootNode(String fxmlPath) {
        Parent rootNode;
        try {
            rootNode = fxmlLoader.load(fxmlPath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return rootNode;
    }
}
