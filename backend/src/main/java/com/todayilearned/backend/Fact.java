package com.todayilearned.backend;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Fact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String text;
    private String source;
    private String category;
    private int votesInteresting = 0;
    private int votesMindblowing = 0;
    private int votesFalse = 0;
    
 
    public Fact(String text, String source, String category, int votesInteresting, int votesMindblowing,
            int votesFalse) {
        this.text = text;
        this.source = source;
        this.category = category;
        this.votesInteresting = votesInteresting;
        this.votesMindblowing = votesMindblowing;
        this.votesFalse = votesFalse;
    }

    public Fact(String text, String source, String category) {
        this.text = text;
        this.source = source;
        this.category = category;
    }

    public Fact() {
    }
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public int getVotesInteresting() {
        return votesInteresting;
    }
    public void setVotesInteresting(int votesInteresting) {
        this.votesInteresting = votesInteresting;
    }
    public int getVotesMindblowing() {
        return votesMindblowing;
    }
    public void setVotesMindblowing(int votesMindblowing) {
        this.votesMindblowing = votesMindblowing;
    }
    public int getVotesFalse() {
        return votesFalse;
    }
    public void setVotesFalse(int votesFalse) {
        this.votesFalse = votesFalse;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((text == null) ? 0 : text.hashCode());
        result = prime * result + ((source == null) ? 0 : source.hashCode());
        result = prime * result + ((category == null) ? 0 : category.hashCode());
        result = prime * result + votesInteresting;
        result = prime * result + votesMindblowing;
        result = prime * result + votesFalse;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Fact other = (Fact) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (text == null) {
            if (other.text != null)
                return false;
        } else if (!text.equals(other.text))
            return false;
        if (source == null) {
            if (other.source != null)
                return false;
        } else if (!source.equals(other.source))
            return false;
        if (category == null) {
            if (other.category != null)
                return false;
        } else if (!category.equals(other.category))
            return false;
        if (votesInteresting != other.votesInteresting)
            return false;
        if (votesMindblowing != other.votesMindblowing)
            return false;
        if (votesFalse != other.votesFalse)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Fact [id=" + id + ", text=" + text + ", source=" + source + ", category=" + category
                + ", votesInteresting=" + votesInteresting + ", votesMindblowing=" + votesMindblowing + ", votesFalse="
                + votesFalse + "]";
    }
}
