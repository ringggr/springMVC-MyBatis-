package cn.com.rbac.domain;

public class Perms {
    private String perid;

    private String percode;

    private String perdes;

    private String url;

    private Integer level;

    private Integer superid;

    public String getPerid() {
        return perid;
    }

    public void setPerid(String perid) {
        this.perid = perid == null ? null : perid.trim();
    }

    public String getPercode() {
        return percode;
    }

    public void setPercode(String percode) {
        this.percode = percode == null ? null : percode.trim();
    }

    public String getPerdes() {
        return perdes;
    }

    public void setPerdes(String perdes) {
        this.perdes = perdes == null ? null : perdes.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getSuperid() {
        return superid;
    }

    public void setSuperid(Integer superid) {
        this.superid = superid;
    }
}