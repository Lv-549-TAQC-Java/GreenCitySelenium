package com.greencity.ecoNewsTests;

import com.greencity.pages.components.CommentComponent;
import com.greencity.steps.MainPageBL;
import lombok.extern.java.Log;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Log
public class CommentTest extends BaseTest {
    @Test
    public void addComment() {
        MainPageBL mainPageBL = new MainPageBL(driver);

        List<String> comments = mainPageBL
                .getHeaderPageBL()
                .clickOnSignInButton()
                .putEmail()
                .putPassword()
                .clickOnSingIn()
                .clickOnEcoNewsButton()
                .clickOnItemNewsById(0)
                .putComment("Hello!")
                .clickOnCommentButton()
                .getNewsItemPage()
                .getCommentComponents()
                .stream()
                .map(CommentComponent::toString)
                .collect(Collectors.toList());

        log.info(comments.toString());
        SimpleDateFormat formatter = new SimpleDateFormat("MMM dd, yyyy");
        Date date = new Date(System.currentTimeMillis());
        String comment = "CommentComponent{authorName=Lv549TAQC, commentDate=" + formatter.format(date) +
                ", commentText=Hello!}";
        log.info(comment);
        Assert.assertTrue(comments.contains(comment));
    }
}
