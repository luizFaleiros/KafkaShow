package br.com.kafkaShow.config;

public enum FxmlViewEnum {
    HOME {
        @Override
        public String getFxmlPath() {
            return "/fxml/home.fxml";
        }
    };

    public abstract String getFxmlPath();
    }
