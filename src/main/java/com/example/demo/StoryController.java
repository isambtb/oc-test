package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashSet;
import java.util.Set;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stories")
public class StoryController {

  @GetMapping("/data.json")
  public Story getStories(){

    Story story = new Story();

    StoryMainObject story1 = new StoryMainObject();
    story1.setImage("https://imgshare.io/images/2020/04/04/rabit.jpg");
    story1.setNumberOfReads(2);
    story1.setTitle("جحا و الأرنب");
    story1.setTimestamp(" 2hours");


    StoryMainObject story3 = new StoryMainObject();
    story3.setImage("https://imgshare.io/images/2020/04/04/jo7a.jpg");
    story3.setNumberOfReads(2);
    story3.setTitle(" جحا والحمار");
    story3.setTimestamp(" 2hours");

    StoryMainObject story2 = new StoryMainObject();
    story2.setImage("https://imgshare.io/images/2020/04/04/nail.jpg");
    story2.setNumberOfReads(2);
    story2.setTitle("مسمار جحا");
    story2.setTimestamp(" 2hours");

    story.getStory().add(story1);
    story.getStory().add(story2);
    story.getStory().add(story3);

    return story;
  }

  class Story {
    @JsonProperty("story")
    private Set<StoryMainObject> story;

    Story() {
      story = new HashSet<>();
    }

    @JsonProperty("story")
    public Set<StoryMainObject> getStory() {
      return story;
    }

    public void setStories(Set<StoryMainObject> story) {
      this.story = story;
    }
  }

  class StoryMainObject {
    private String image;
    private String title;
    private String timestamp;
    private int numberOfReads;

    public StoryMainObject(){

    }

    public String getTimestamp() {
      return timestamp;
    }

    public void setTimestamp(String timestamp) {
      this.timestamp = timestamp;
    }

    public String getImage() {
      return image;
    }

    public void setImage(String image) {
      this.image = image;
    }

    public String getTitle() {
      return title;
    }

    public void setTitle(String title) {
      this.title = title;
    }

    public int getNumberOfReads() {
      return numberOfReads;
    }

    public void setNumberOfReads(int numberOfReads) {
      this.numberOfReads = numberOfReads;
    }
  }

}
