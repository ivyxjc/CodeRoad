package xyz.ivyxjc.bean;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.time.LocalDate;

public abstract class AbstractComponent {

    private LocalDate createdAt;
    private LocalDate updatedAt;
    private String createdBy;
    private String updatedBy;

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}

