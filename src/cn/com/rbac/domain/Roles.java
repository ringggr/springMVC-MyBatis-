package cn.com.rbac.domain;

public class Roles {
    private String roleid;

    private String rolecode;

    private String roledes;

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }

    public String getRolecode() {
        return rolecode;
    }

    public void setRolecode(String rolecode) {
        this.rolecode = rolecode == null ? null : rolecode.trim();
    }

    public String getRoledes() {
        return roledes;
    }

    public void setRoledes(String roledes) {
        this.roledes = roledes == null ? null : roledes.trim();
    }
}