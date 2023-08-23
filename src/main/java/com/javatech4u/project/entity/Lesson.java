package com.javatech4u.project.entity;

import jakarta.persistence.*;

@Entity
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String content;
    private String videoUrl;
    private Integer orderNumber;

    @ManyToOne
    @JoinColumn(name = "section_id")
    private Section section;

    public Lesson() {
    }

    public Lesson(String title, String content, String videoUrl, Integer orderNumber, Section section) {
        this.title = title;
        this.content = content;
        this.videoUrl = videoUrl;
        this.orderNumber = orderNumber;
        this.section = section;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;

    }

    @Override
    public String toString() {
        return "Lesson{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", videoUrl='" + videoUrl + '\'' +
                ", orderNumber=" + orderNumber +
                ", section=" + section +
                '}';
    }
}

