package dd2.local.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: KDJ
 * Date: 13. 11. 11
 * Time: 오전 9:49
 * To change this template use File | Settings | File Templates.
 */
@javax.persistence.IdClass(dd2.local.entity.AdProgramEntityPK.class)
@javax.persistence.Table(name = "AD_Program")
@Entity
public class AdProgramEntity {
    private Long adProgramId;
    private Long adCompanyId;
    private Date created;
    private Long createdBy;
    private Date updated;
    private Long updatedBy;
    private String name;
    private String description;
    private String isActive;
    private String url;

    @javax.persistence.Column(name = "AD_Program_ID")
    @Id
    public Long getAdProgramId() {
        return adProgramId;
    }

    public void setAdProgramId(Long adProgramId) {
        this.adProgramId = adProgramId;
    }

    @javax.persistence.Column(name = "AD_Company_ID")
    @Id
    public Long getAdCompanyId() {
        return adCompanyId;
    }

    public void setAdCompanyId(Long adCompanyId) {
        this.adCompanyId = adCompanyId;
    }

    @javax.persistence.Column(name = "Created")
    @Basic
    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @javax.persistence.Column(name = "CreatedBy")
    @Basic
    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    @javax.persistence.Column(name = "Updated")
    @Basic
    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    @javax.persistence.Column(name = "UpdatedBy")
    @Basic
    public Long getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    @javax.persistence.Column(name = "Name")
    @Basic
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @javax.persistence.Column(name = "Description")
    @Basic
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @javax.persistence.Column(name = "isActive", columnDefinition = "CHAR(1)")
    @Basic
    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String active) {
        isActive = active;
    }

    @javax.persistence.Column(name = "Url")
    @Basic
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdProgramEntity that = (AdProgramEntity) o;

        if (adCompanyId != null ? !adCompanyId.equals(that.adCompanyId) : that.adCompanyId != null) return false;
        if (adProgramId != null ? !adProgramId.equals(that.adProgramId) : that.adProgramId != null) return false;
        if (created != null ? !created.equals(that.created) : that.created != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (isActive != null ? !isActive.equals(that.isActive) : that.isActive != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (updated != null ? !updated.equals(that.updated) : that.updated != null) return false;
        if (updatedBy != null ? !updatedBy.equals(that.updatedBy) : that.updatedBy != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = adProgramId != null ? adProgramId.hashCode() : 0;
        result = 31 * result + (adCompanyId != null ? adCompanyId.hashCode() : 0);
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (updated != null ? updated.hashCode() : 0);
        result = 31 * result + (updatedBy != null ? updatedBy.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (isActive != null ? isActive.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        return result;
    }
}
