package cn.com.rbac.domain;

public class RolePerm {
    private String roleid;

    private String permid;

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }

    public String getPermid() {
        return permid;
    }

    public void setPermid(String permid) {
        this.permid = permid == null ? null : permid.trim();
    }
}