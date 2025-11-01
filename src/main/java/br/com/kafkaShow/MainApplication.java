package br.com.kafkaShow;

import br.com.kafkaShow.config.FxmlViewEnum;
import br.com.kafkaShow.config.StageManager;
import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

public class MainApplication extends Application {

    private static Stage stage;
    private ConfigurableApplicationContext applicationContext;
    private StageManager stageManager;

    @Override
    public void init() throws Exception {
        applicationContext = new SpringApplicationBuilder(Main.class).run();
    }

    @Override
    public void stop() throws Exception {
        applicationContext.close();
        stage.close();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        stageManager = applicationContext.getBean(StageManager.class, stage);
        showHomeScene();
    }

    private void showHomeScene() {
        stageManager.switchScene(FxmlViewEnum.HOME);
    }
}
