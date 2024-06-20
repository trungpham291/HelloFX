package org.example.hellofx.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import org.example.hellofx.entity.Article;
import org.example.hellofx.repository.ArticleRepository;

public class ArticleForm {
    public TextField txtTitle;
    public TextField txtDescripotion;
    public TextField txtContent;
    private ArticleRepository articleRepository = new ArticleRepository();

    public void processSave(ActionEvent actionEvent) {
//        validate
        Article article = new Article();
        article.setTitle(txtTitle.getText());
        article.setDescription(txtDescripotion.getText());
        article.setContent(txtContent.getText());
        articleRepository.save(article);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Action Successful");
        alert.setHeaderText("Action Successful");
        alert.show();

    }

    public void processReset(ActionEvent actionEvent) {
        reset();
    }
    public void reset() {
        txtTitle.clear();
        txtDescripotion.clear();
        txtContent.clear();
    }
}
