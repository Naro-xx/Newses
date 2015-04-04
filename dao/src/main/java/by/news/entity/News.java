package by.news.entity;

import org.hibernate.annotations.LazyToOne;
import org.hibernate.annotations.LazyToOneOption;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Narek on 20.02.2015.
 */

    @Entity
    @Table(name = "news")
    public class News {
     private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
        private Integer id;
    @Column(name = "title")
        private String title;
    @Column(name = "text")
        private String text;
    @Column(name = "dateOfPublic")
        private Date dateOfPublic;

    public NewsCategory getNewsCategory() {
        return newsCategory;
    }

    public void setNewsCategory(NewsCategory newsCategory) {
        this.newsCategory = newsCategory;
    }



    @JoinColumn(name = "categoryId" )
    @LazyToOne(LazyToOneOption.PROXY)
    @ManyToOne(cascade =CascadeType.ALL,fetch = FetchType.LAZY)
    private NewsCategory newsCategory;



    public Integer getId() {
        return id;
    }

        public void setId(Integer id) {
        this.id = id;
    }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public Date getDatePublic() {
            return dateOfPublic;
        }

        public void setDatePublic(Date datePublic) {
            this.dateOfPublic = datePublic;
        }
    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", dateOfPublic=" + dateOfPublic ;
    }

    }

